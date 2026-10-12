# Avi API SDK and Utilities (Python)

Python client for the NSX Advanced Load Balancer (Avi) Controller REST API. `ApiSession` extends
`requests.Session`, handling session auth/caching, CSRF token refresh, and `X-Avi-Tenant` header
handling; multi-process/multi-thread safe. Part of the [`alb-sdk`](../../../README.md) monorepo —
see the root README for how this fits with the Go/Java SDKs and the upstream Swagger spec, and for
the codegen model. Published to PyPI as **`avisdk`**.

## Directory map

| Path | Contents | Generated? |
|------|----------|------------|
| `avi_api.py` (1183 lines) | Core `ApiSession` — the primary entry point most integrations use | Hand-maintained |
| `csp_avi_api.py` | VMware Cloud (CSP) token-based auth variant | Hand-maintained |
| `saml_avi_api.py` | SAML auth variants: `OktaSAMLApiSession`, `OneloginSAMLApiSession`, `WS1loginSAMLApiSession` | Hand-maintained |
| `avi_sdk.py` | Thin/legacy wrapper | Hand-maintained |
| `utils/api_utils.py`, `utils/ansible_utils.py` | Devops automation helpers | Hand-maintained |
| `utils/httppolicyset_templates.py` | Ready-made HTTP request/redirect policy templates | Hand-maintained |
| `utils/waf_policy/vdi_waf_policy.py` | WAF policy helper | Hand-maintained |
| `samples/` | `autoscale/`, `heat/`, `virtualservice_examples_api/`, `apic/`, `gcp/`, `vra/`, `init_system/`, `cust_scripts/`, `certs/` | Hand-maintained |
| `test/test_avi_api.py`, `test/test_saml_api.py` (+ `conftest.py`, `fixtures/`, `*.cfg`) | pytest suite | Hand-maintained |
| `setup.py` / `setup.cfg` | Packaging for the `avisdk` PyPI distribution (excludes `migrationtools`, `sdk.samples.autoscale`, `sdk.test`) | Hand-maintained |

Unlike `go/models` and `java/.../model`, this SDK doesn't ship a large generated-models tree —
object payloads are plain `dict`s passed to `session.post/get/put/delete`, so there's very little
here that's mechanically regenerated per Avi release. When behavior differs from the API spec,
check `../../../swagger/<Object>.yaml` (source of truth) rather than assuming a bug in this
package.

## Installation

```sh
pip install avisdk
```

## Test

```sh
cd python/avi/sdk
pytest test/test_avi_api.py       # config in test/test_api.cfg (jenkins_test_api.cfg for CI)
pytest test/test_saml_api.py      # config in test/test_saml_api.cfg
```

## Usage examples

### Basic controller session

```python
from avi.sdk.avi_api import ApiSession

session = ApiSession.get_session("10.10.10.42", "controller_username", "controller_password", tenant="admin")

# create pool with one server
pool_obj = {'name': 'sample_pool', 'servers': [{'ip': {'addr': '192.0.0.1', 'type': 'V4'}}]}
pool_resp = session.post('pool', data=pool_obj)
print(pool_resp.json())

# create vsvip
vsvip_obj = {'name': 'sample_vsvip', 'vip': [{'vip_id': '1', 'ip_address': {'addr': '11.11.11.42', 'type': 'V4'}}]}
vsvip_resp = session.post('vsvip', data=vsvip_obj)
print(vsvip_resp.json())

# create virtualservice using sample_vsvip and sample_pool
pool_ref = '/api/pool?name={}'.format(pool_obj.get('name'))
vsvip_ref = '/api/vsvip?name={}'.format(vsvip_obj.get('name'))
services_obj = [{'port': 80, 'enable_ssl': False}]
vs_obj = {'name': 'sample_vs', 'services': services_obj, 'vsvip_ref': vsvip_ref, 'pool_ref': pool_ref}
resp = session.post('virtualservice', data=vs_obj)
print(resp.json())

# list all virtualservices
resp = session.get('virtualservice')
for vs in resp.json()['results']:
    print(vs['name'])

# delete
resp = session.delete_by_name('virtualservice', 'sample_vs')
```

### SAML authentication

Requires a SAML-configured/enabled Controller. Supported IdPs: Okta, OneLogin, WS1.

```python
from avi.sdk.saml_avi_api import OktaSAMLApiSession
api = OktaSAMLApiSession("10.10.10.42", "okta_username", "okta_password")
```
```python
from avi.sdk.saml_avi_api import OneloginSAMLApiSession
api = OneloginSAMLApiSession("10.10.10.42", "onelogin_username", "onelogin_password")
```
```python
from avi.sdk.saml_avi_api import WS1loginSAMLApiSession
session = WS1loginSAMLApiSession("10.10.10.42", "ws1_username", "ws1_password")
```

Each behaves like `ApiSession` for subsequent `post`/`get`/`delete_by_name` calls. SAML sessions
can also be created via the generic factory:

```python
api = ApiSession.get_session("10.10.10.42", "onelogin_username", "onelogin_password", idp_class=OneloginSAMLApiSession)
api = ApiSession.get_session("10.10.10.42", "okta_username", "okta_password", idp_class=OktaSAMLApiSession)
api = ApiSession.get_session("10.10.10.42", "ws1_username", "ws1_password", idp_class=WS1loginSAMLApiSession)
```

### Control-script usage (token-based auth)

When `ApiSession` runs inside a control script, use a token plus env-provided identity:

```python
token = os.environ.get('API_TOKEN')
user = os.environ.get('USER')
tenant = os.environ.get('TENANT')
api = ApiSession.get_session("localhost", user, token=token, tenant=tenant)
```

### Sample script: create a basic VirtualService

```sh
python samples/virtualservice_examples_api/virtualservice_examples_api.py -h
python samples/virtualservice_examples_api/virtualservice_examples_api.py \
  -c 10.10.25.42 -i 10.90.64.141 -o create-basic-vs -s 10.90.64.12
```

## Debugging checklist

- Request/response shape mismatch → check `../../../swagger/<Object>.yaml` first; payloads here
  are plain dicts, so a wrong field name fails silently as an ignored/extra key rather than a type
  error — verify against the spec, not just against this SDK's code.
- Auth failures → confirm which module is in play: `avi_api.py` (basic), `csp_avi_api.py` (VMware
  Cloud CSP), `saml_avi_api.py` (SAML/Okta/OneLogin/WS1) — each has separate session-refresh logic.
- CI test config lives in `test/*.cfg`; `jenkins_test_api.cfg` is the CI-specific variant of
  `test_api.cfg` — check which one a failing pipeline actually used before assuming a code bug.
