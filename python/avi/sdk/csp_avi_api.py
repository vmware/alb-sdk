# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

from __future__ import (absolute_import, division, print_function)

__metaclass__ = type

from avi.sdk.avi_api import ApiSession, \
    sessionDict, APIError, AviCredentials
import sys
import logging
import time

from requests import ConnectionError
from requests.exceptions import ChunkedEncodingError
from ssl import SSLError

logger = logging.getLogger(__name__)

global sessionDict
sessionDict = {}


class CSPApiSession(ApiSession):
    CSP_HOST = 'console.cloud.vmware.com'

    def __init__(self, controller_ip=None, username=None, password=None,
                 token=None, tenant=None, tenant_uuid=None, verify=False,
                 port=None, timeout=60, api_version=None,
                 retry_conxn_errors=True, data_log=False,
                 avi_credentials=None, session_id=None, csrftoken=None,
                 lazy_authentication=False, max_api_retries=None, csp_host=CSP_HOST, csp_token=None, user_hdrs={}):

        super(CSPApiSession, self).__init__(
            controller_ip, username, password, token,
            tenant, tenant_uuid, verify,
            port, timeout, api_version,
            retry_conxn_errors, data_log,
            avi_credentials, session_id, csrftoken,
            lazy_authentication, max_api_retries, csp_host, csp_token, user_hdrs)
        return

    def generate_access_token(self):
        """
        Generate authentication token from CSP Token
        """
        body = {}
        headers = {
            'Content-Type': 'application/x-www-form-urlencoded'
        }
        if self.avi_credentials.csp_token:
            body["api_token"] = self.avi_credentials.csp_token
        else:
            raise APIError("CSP API Token is not provided for csp login %s" % self.csp_prefix)
        logger.debug('authenticating using api token %s prefix %s',
                     self.avi_credentials.csp_token, self.csp_prefix)
        self.cookies.clear()
        err = None
        try:
            rsp = super(ApiSession, self).post(
                self.csp_prefix + "/am/api/auth/api-tokens/authorize", body, headers=headers,
                verify=self.verify)

            if rsp.status_code == 200:
                self.num_session_retries = 0
                authorization_token = {"Authorization": "Bearer %s" % (rsp.json().get('access_token'))}
                self.headers.update(authorization_token)
                logger.debug("authentication success for user %s",
                             self.avi_credentials.csp_token)
                return
            # Check for bad request and invalid credentials response code
            elif rsp.status_code in [401, 403]:
                logger.error('Status Code %s msg %s' % (
                    rsp.status_code, rsp.text))
                err = APIError('Failed: %s Status Code %s msg %s' % (
                    rsp.url, rsp.status_code, rsp.text), rsp)
                raise err
            else:
                logger.error("Error status code %s msg %s", rsp.status_code,
                             rsp.text)
                err = APIError('Failed: %s Status Code %s msg %s' % (
                    rsp.url, rsp.status_code, rsp.text), rsp)
                raise err
        except (ConnectionError, SSLError, ChunkedEncodingError) as e:
            if not self.retry_conxn_errors:
                raise
            logger.warning('Connection error retrying %s', e)
            err = e
        # comes here only if there was either exception or login was not
        # successful
        if self.retry_wait_time:
            time.sleep(self.retry_wait_time)
        self.num_session_retries += 1
        if self.num_session_retries > self.max_session_retries:
            self.num_session_retries = 0
            logger.error("giving up after %d retries connection failure %s" % (
                self.max_session_retries, True))
            raise err
        self.generate_access_token()
        return
