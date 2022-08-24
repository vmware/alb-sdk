# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import base64

import json
import re
import requests
import logging
from requests.packages.urllib3.exceptions import InsecureRequestWarning
from requests.adapters import HTTPAdapter
from requests.packages.urllib3.util.retry import Retry

LOG = logging.getLogger(__name__)


class DetailedHttpError(requests.exceptions.HTTPError):
    def __init__(self, response):
        self.err_code = 0
        # MC concatenates messages with newlines
        reason = response.text.replace("\n", "")
        try:
            # Handle both NSX-T and NSX-V error messages
            # extract brief string reason if present
            reason_json = response.json()
            if 'error_message' in reason_json:
                reason = reason_json['error_message']
            elif 'details' in reason_json:
                reason = reason_json['details']
            if 'error_code' in reason_json:
                self.err_code = reason_json['error_code']
            elif 'errorCode' in reason_json:
                self.err_code = reason_json['errorCode']
        except Exception:
            pass

        http_error_msg = u'%s: %s for url: %s' % (response.status_code, reason, response.url)
        super(DetailedHttpError, self).__init__(http_error_msg, response=response)


class NSXClient(object):
    """Base NSX REST client"""

    ALLOWED_GET_STATUS = [requests.codes.OK]
    ALLOWED_POST_STATUS = [requests.codes.OK,
                           requests.codes.CREATED,
                           requests.codes.ACCEPTED,
                           requests.codes.NO_CONTENT]
    ALLOWED_PUT_STATUS = [requests.codes.OK,
                          requests.codes.CREATED,
                          requests.codes.ACCEPTED,
                          requests.codes.NO_CONTENT]
    ALLOWED_DEL_STATUS = [requests.codes.OK,
                          requests.codes.ACCEPTED,
                          requests.codes.NO_CONTENT,
                          requests.codes.NOT_FOUND]

    def __init__(self, host, prefix, username=None, password=None, auth_token=None,
                 timeout=720, retries=5, logger=None):
        self.host = host
        self.username = username
        self.password = password
        self.auth_token = auth_token
        self.timeout = timeout
        self.retries = retries
        self.version = None
        self.content_type = "application/json"
        self.accept_type = "application/json"
        self.verify = False
        if "localhost" in self.host:
            self.secure = False
        else:
            self.secure = True
        self.interface = "json"
        self.logger = LOG if logger is None else logger
        self.prefix = prefix
        self._session_hdrs = None
        self.session = None
        self.set_session_headers()

    def set_content_type(self, content_type):
        self.content_type = content_type

    def get_content_type(self):
        return self.content_type

    def set_accept_type(self, accept_type):
        self.accept_type = accept_type

    def get_accept_type(self):
        return self.accept_type

    def customize_session(self):
        if self.session:
            return self.session

        session = requests.Session()
        retry = Retry(total=self.retries,
                      read=self.retries,
                      connect=self.retries)
        adapter = HTTPAdapter(max_retries=retry)
        session.mount('http://', adapter)
        session.mount('https://', adapter)

        session.headers.update(self._session_hdrs)

        self.session = session
        return self.session

    def _get_url(self, endpoint):
        http_type = 'https' if self.secure else 'http'
        url = '%s/%s/%s' % (self.host, self.prefix, endpoint)
        # remove possible double/triple slashes
        url = re.sub('/+', '/', url)
        url = '%s://%s' % (http_type, url)
        return url

    def is_localhost(self):
        return bool("localhost" in self.host)

    def set_session_headers(self, content=None, accept=None):
        content_type = self.content_type if content is None else content
        accept_type = self.accept_type if accept is None else accept
        headers = {}
        if self.username is not None and self.password is not None:
            auth_cred = self.username + ":" + self.password
            auth = base64.b64encode(auth_cred.encode())
            headers['Authorization'] = "Basic %s" % auth.decode()

        if self.auth_token is not None:
            headers['Authorization'] = "AUTHTOKEN %s" % self.auth_token

        headers['Content-Type'] = content_type
        headers['Accept'] = accept_type
        # In case manager API forces to PUT policy created object.
        headers['X-Allow-Overwrite'] = 'true'
        if self.username is None:
            # This header is needed for communication over http
            # Value is set to be same with as policy, to avoid identity conflict
            headers['X-NSX-Username'] = 'admin'

        self._session_hdrs = headers
        if self.session:
            self.session.headers.update(self._session_hdrs)

    def add_session_header(self, key, value):
        if self.session:
            self.session.headers[key] = value
        else:
            self._session_hdrs[key] = value

    def remove_session_header(self, key):
        if self.session:
            if key in self.session.headers:
                del self.session.headers[key]
        elif key in self._session_hdrs:
            del self._session_hdrs[key]

    def _is_sensitive(self, url, data=None):
        url_keywords = ['certificate']
        for keyword in url_keywords:
            if keyword in url:
                return True

        if data and 'password' in str(data):
            return True

        return False

    def _log_api_call(self, method, url, data=None, params=None, headers=None):
        # Avoid exposing sensitive data - data for certain URLs should
        # not be logged

        sensitive = self._is_sensitive(url, data)
        if data and sensitive:
            data = "<SENSITIVE>"

        self.logger.debug("API tracker: REQUEST method=%s, url=%s, "
                          "non-session-headers=%s, params=%s, data=%s",
                          method, url, str(headers), str(params), str(data))

    def _mask_psk(self, resp_text):
        masked_text = re.sub(r"\"psk\"+\s*:\s*\"(.*?)\"", "\"psk\":\"****\"", resp_text)
        return masked_text

    def _log_api_call_response(self, response):
        if response:
            resp_text = response.text
            if resp_text and len(resp_text) > 1000:
                resp_text = resp_text[:1000] + " ..."
            if resp_text and "psk" in resp_text:
                resp_text = self._mask_psk(resp_text)

            self.logger.debug("API tracker: RESPONSE status=%s, text=%s",
                              response.status_code, resp_text)

    def _session_call(self, session, method, url, data=None, params=None, non_session_headers=None):

        method = method.lower()
        response = None
        if data:
            response = getattr(session, method)(url, headers=non_session_headers,
                                                verify=self.verify,
                                                data=data,
                                                params=params,
                                                timeout=self.timeout)
        else:
            response = getattr(session, method)(url, headers=non_session_headers,
                                                verify=self.verify,
                                                params=params,
                                                timeout=self.timeout)

        if response.status_code == requests.codes.TOO_MANY_REQUESTS:
            raise Exception()

        return response

    def _rest_call(self, method, endpoint, data, allowed_statuses, raise_ex=True,
                   log_on_fail=True, return_failure=False, params=None, headers=None):
        session = self.customize_session()
        url = self._get_url(endpoint)
        self._log_api_call(method, url, data, params, headers)
        response = self._session_call(session, method, url, data, params, headers)
        self._log_api_call_response(response)
        if response.status_code in allowed_statuses:
            return response
        else:
            if log_on_fail:
                self.logger.error("Failed to %s %s with status: %s and reason: %s",
                                  method, url, response.status_code, response.text)
            if response.status_code == requests.codes.FORBIDDEN:
                self.logger.error("Failed to %s %s with status: %s and reason: %s",
                                  method, url, response.status_code, response.text)
                if self.auth_token:
                    msg = "Authtoken may be invalid/expired. Please generate a new one "\
                          "and continue with migration"
                    print(msg)
                if self.username is not None and self.password is not None:
                    msg = "Invalid username/password used for migration. Please check " \
                          "and continue with migration"
                    print(msg)
            if raise_ex:
                raise DetailedHttpError(response)
            if return_failure:
                return response

    def get(self, endpoint, params=None, allowed_status=None,
            return_failure=False, non_session_headers=None):
        """
        Basic query method for json API request
        """
        allowed_get_status = (allowed_status if allowed_status else
                              self.ALLOWED_GET_STATUS)
        return self._rest_call('GET', endpoint, data=None,
                               allowed_statuses=allowed_get_status,
                               raise_ex=False,
                               return_failure=return_failure,
                               params=params, headers=non_session_headers)

    def put(self, endpoint, body=None, params=None, non_session_headers=None):
        """
        Basic put API method on endpoint
        """
        put_data = body
        if self.content_type == "application/json":
            put_data = json.dumps(body)
        return self._rest_call('PUT', endpoint, data=put_data,
                               allowed_statuses=self.ALLOWED_PUT_STATUS,
                               params=params, headers=non_session_headers)

    def delete(self, endpoint, params=None, log_on_fail=True, non_session_headers=None):
        """
        Basic delete API method on endpoint
        """
        return self._rest_call('DELETE', endpoint, data=None,
                               allowed_statuses=self.ALLOWED_DEL_STATUS,
                               log_on_fail=log_on_fail, params=params, headers=non_session_headers)

    def post(self, endpoint, body=None, raise_ex=True, params=None, non_session_headers=None):
        """
        Basic post API method on endpoint
        """
        post_data = body
        if self.content_type == "application/json":
            post_data = json.dumps(body)
        return self._rest_call('POST', endpoint, data=post_data,
                               allowed_statuses=self.ALLOWED_POST_STATUS,
                               raise_ex=raise_ex, return_failure=(not raise_ex),
                               params=params, headers=non_session_headers)
