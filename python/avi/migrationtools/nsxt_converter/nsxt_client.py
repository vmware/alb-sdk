#!/usr/bin/env python

# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

import requests

from com.vmware import nsx_policy_client
from vmware.vapi.bindings.stub import ApiClient
from vmware.vapi.bindings.stub import StubFactory
from vmware.vapi.lib import connect
from vmware.vapi.security.user_password import \
    create_user_password_security_context
from vmware.vapi.stdlib.client.factories import StubConfigurationFactory

BASIC_AUTH = 1
SESSION_AUTH = 2


def get_basic_auth_stub_config(user, password, nsx_host, tcp_port=443):
    """
    Create a stub configuration that uses HTTP basic authentication.
    """
    session = requests.session()

    # Since the NSX manager default certificate is self-signed,
    # we deactivate verification. This is dangerous and real code
    # should verify that it is talking to a valid server.
    session.verify = False

    nsx_url = 'https://%s:%s' % (nsx_host, tcp_port)
    connector = connect.get_requests_connector(
        session=session, msg_protocol='rest', url=nsx_url)
    stub_config = StubConfigurationFactory.new_runtime_configuration(
        connector, response_extractor=True)
    security_context = create_user_password_security_context(
        user, password)
    connector.set_security_context(security_context)
    return stub_config


def get_basic_auth_api_client(user, password, nsx_host, tcp_port=443):
    stub_config = get_basic_auth_stub_config(
        user, password, nsx_host, tcp_port)
    stub_factory = nsx_policy_client.StubFactory(stub_config)
    return ApiClient(stub_factory)


def get_session_auth_stub_config(user, password, nsx_host, tcp_port=443):
    """
    Create a stub configuration that uses session-based authentication.
    Session authentication is more efficient, since the server only
    needs to perform authentication of the username/password one time.
    """
    session = requests.session()

    # Since the NSX manager default certificate is self-signed,
    # we deactivate verification. This is dangerous and real code
    # should verify that it is talking to a valid server.
    session.verify = False
    nsx_url = 'https://%s:%s' % (nsx_host, tcp_port)
    resp = session.post(nsx_url + "/api/session/create",
                        data={"j_username": user, "j_password": password})
    if resp.status_code != requests.codes.ok:
        resp.raise_for_status()

    # Set the Cookie and X-XSRF-TOKEN headers
    session.headers["Cookie"] = resp.headers.get("Set-Cookie")
    session.headers["X-XSRF-TOKEN"] = resp.headers.get("X-XSRF-TOKEN")

    connector = connect.get_requests_connector(
        session=session, msg_protocol='rest', url=nsx_url)
    stub_config = StubConfigurationFactory.new_runtime_configuration(
        connector, response_extractor=True)
    return stub_config


def get_session_auth_api_client(user, password, nsx_host, tcp_port=443):
    stub_config = get_session_auth_stub_config(
        user, password, nsx_host, tcp_port)
    stub_factory = nsx_policy_client.StubFactory(stub_config)
    return ApiClient(stub_factory)


def create_api_client(stub_factory_class, user, password, nsx_host,
                      tcp_port=443, auth_type=BASIC_AUTH):
    if auth_type == BASIC_AUTH:
        stub_config = get_basic_auth_stub_config(
            user, password, nsx_host, tcp_port)
    elif auth_type == SESSION_AUTH:
        stub_config = get_session_auth_stub_config(
            user, password, nsx_host, tcp_port)
    stub_factory = stub_factory_class.StubFactory(stub_config)
    return ApiClient(stub_factory)


def create_nsx_api_client(user, password, nsx_host, tcp_port=443,
                          auth_type=BASIC_AUTH):
    return create_api_client(nsx_policy_client, user, password, nsx_host,
                             tcp_port, auth_type)


def create_nsx_policy_api_client(
        user, password, nsx_host, tcp_port=443, auth_type=BASIC_AUTH):
    return create_api_client(
        nsx_policy_client, user, password, nsx_host, tcp_port, auth_type)
