# alb-sdk — Context Reference

This file is written as durable context (à la `CLAUDE.md`) so a future session can get oriented
here immediately without re-deriving the repo structure from scratch.

## What this repo is

`vmware/alb-sdk` is the multi-language SDK + API surface for the **NSX Advanced Load Balancer
(Avi Vantage) Controller REST API**. It ships four independent, mostly-generated deliverables from
one underlying API spec:

| Dir       | Language / artifact                | Package                          |
|-----------|-------------------------------------|-----------------------------------|
| `go/`     | Go SDK                              | `github.com/vmware/alb-sdk`       |
| `python/` | Python SDK (`avisdk` on PyPI)       | `python/avi/sdk`                  |
| `java/`   | Java SDK (Maven, `pom.xml`)         | `com.vmware.avi.sdk`              |
| `swagger/`| Per-object OpenAPI/Swagger specs + bundled Swagger-UI viewer | one `.json`+`.yaml` pair per API object |
| `docs/`   | Per-object API reference (167+ object dirs) | plain docs, mirrors `swagger/`  |
| `mibs/`   | SNMP MIBs for controller monitoring | —                                  |

**This is upstream of `vmware/terraform-provider-avi`** — the Terraform provider's `go.mod` pins
an exact commit of this repo and imports `go/clients`, `go/models`, `go/session` directly. If a
Terraform-provider bug looks like "the API client is misbehaving," the root cause is usually here,
not in the provider.

## Codegen model — read this before editing generated dirs

Git history is dominated by paired commits: `Updated assets for swagger` → `Updated assets for
python` / `...for go` / `...for java`, each followed by a `jenkins_sync_<version>_<lang>` merge
(e.g. `3f4dbd39e` → `7eb21fc32` → `c09f6bad4` → merges `#3506`/`#3507`/`#3508` in that order for
32.1.2). That ordering is the actual pipeline:

```
Avi Controller API spec  →  swagger/*.json,*.yaml  →  go/clients+models, python bindings, java bindings, docs/
```

**Practical implication:** `swagger/`, `go/clients/*_client.go`, `go/models/*.go`, most of
`python/avi/sdk/` model-ish code, `java/src/com/vmware/avi/sdk/model/`, and `docs/**` are
regenerated per Avi Controller release from an internal Jenkins job — there is no generator script
checked into this repo itself. Treat hand-edits to those as **temporary** unless mirrored upstream
in the spec; they're the first suspect when something "reverts itself" between releases. The
genuinely hand-maintained logic lives in:
- `go/session/avisession.go` (+ its `_test.go`) — auth/session/transport, not object-specific.
- `python/avi/sdk/avi_api.py`, `csp_avi_api.py`, `saml_avi_api.py`, `avi_sdk.py` — session/auth
  layers (basic, VMware Cloud CSP, SAML) and the legacy `avi_sdk.py` shim.
- `java/src/com/vmware/avi/sdk/` non-`model` code (session/client plumbing).
- `python/avi/sdk/utils/`, `python/avi/sdk/samples/`, `go/examples/`, `java/examples/` — hand-written helpers/samples.

## Go SDK (`go/`)

- `go/session/avisession.go` — `AviSession`: connection/auth/session-cache/CSRF handling. Auth
  modes are composed via functional options: `SetPassword`, `SetAuthToken`,
  `SetRefreshAuthTokenCallback(V2)`, `SetTenant`, `SetVersion`, `SetProxyURL`, `SetInsecure`,
  `SetTransport`, `SetClient`, `SetControllerStatusCheckLimits`,
  `DisableControllerStatusCheckOnFailure`. Also handles CSP access-token fetch
  (`getCSPAccessToken`) and multipart file upload (`PostMultipartFileObjectRequest`,
  `PostMultipartWafAppSignatureObjectRequest`).
- `go/clients/avi_client.go` — `AviClient` struct: one field + one generated `*<Object>Client` per
  API object (169 client files in `go/clients/`), all wrapping the shared `AviSession`.
- `go/models/` — 1524 generated Go structs, one (or a few) per API object/sub-object, used to
  (un)marshal REST payloads.
- `go/examples/` — runnable samples (`create_vs.go`, `metrics_collection.go`); `go/examples/test/`
  has the Go integration tests driven by the root `Makefile`.
- `go/fmt_lint_check.sh` — formatting/lint check for the Go tree.

Build/test (from repo root, via `Makefile`):
```sh
make compile   # go build clients+models+examples, go vet
make fmt       # go fmt clients, models, examples
make test_clients      # requires AVI_CONTROLLER/AVI_USERNAME/AVI_PASSWORD/AVI_TENANT/AVI_VERSION env vars
make test_avisession   # go test ./go/session/.
```
`AVI_CONTROLLER` defaults to `localhost:8080//` in the Makefile, in which case it auto-starts
`go/examples/web_service.py` as a mock backend for `test_clients`.

## Python SDK (`python/avi/sdk/`)

- `avi_api.py` (1183 lines) — core `ApiSession` (extends `requests.Session`), the primary
  hand-maintained entry point most integrations use.
- `csp_avi_api.py` — VMware Cloud CSP-token auth variant.
- `saml_avi_api.py` — SAML auth variant.
- `avi_sdk.py` — thin/legacy wrapper.
- `utils/` — helper utilities (includes `waf_policy/` helpers).
- `samples/` — per-integration examples: `aws`, `gcp`, `apic`, `heat`, `vra`, `autoscale`,
  `init_system`, `cust_scripts`, `certs`.
- `test/` — pytest suite (`test/fixtures/` for fixtures).
- Packaged via `setup.py` as `avisdk` (version injected at release time via `create_release.sh`,
  excludes `migrationtools`, `sdk.samples.autoscale`, `sdk.test` from the built package).

## Java SDK (`java/`)

- `java/pom.xml` — Maven project, `com.vmware.avi.sdk`.
- `java/src/com/vmware/avi/sdk/model/` — generated model classes (mirrors `go/models` /
  `swagger/`).
- `java/src/com/vmware/avi/sdk/` (non-`model`) — hand-maintained session/client code.
- `java/test/com/vmware/...` — JUnit tests.
- `java/examples/` — runnable samples.
- Recently migrated from Java 8 → Java 17 (see commit `457c08c86`, "Upgraded java version in java
  sdk from java 8 to 17") — if a Java build breaks, check the JDK version first.

## Swagger / API specs (`swagger/`) and docs (`docs/`)

- `swagger/*.json` + `swagger/*.yaml` — one OpenAPI/Swagger definition pair per Avi API object
  (e.g. `Pool.json`/`Pool.yaml`, `ActionGroupConfig.json`/`.yaml`, ...). These are the actual
  upstream source-of-truth artifacts that `go/`, `python/`, `java/`, and `docs/` all get generated
  from/kept in sync with.
- `swagger/{js,css,lib,img}` etc. — a bundled Swagger-UI distribution for browsing the spec
  locally (open `swagger/index.html`).
- `docs/<ObjectName>/` — 167+ per-object reference doc directories, kept in lockstep with
  `swagger/`.

## Versioning / release

- `AVI_VERSION` (Makefile default `18.2.9`) selects the controller API version the SDK targets;
  `go/session.SetVersion` / provider-side `avi_version` do the same at runtime. **Version skew
  between the SDK build, the Avi Controller, and the `alb-sdk` commit pinned by a downstream
  consumer (e.g. terraform-provider-avi's `go.mod`) is a common root cause for "field not found" /
  "unexpected API response" bugs** — check all three before assuming a code bug.
- `create_release.sh` — cuts a release (injects the Python package version, etc.).
- `.github/workflows/release.yml` is the only workflow in this repo; Go/Python/Java/Swagger sync
  and test runs otherwise happen through the internal Jenkins pipeline referenced by the
  `jenkins_sync_*` merge commits, driven by the root `Makefile` for Go.
- Per the original `README.md`: **AVI migration tools (ACT)** are released as a separate,
  standalone artifact starting 30.2.x — not bundled in this SDK's package anymore.

## Ownership / contributing

- `CODEOWNERS`: `@apalsule @parimanur @shardullatkar` own the whole repo by default.
- `CONTRIBUTING.md` requires a signed Developer Certificate of Origin (DCO), separate from
  terraform-provider-avi's CLA process.
- License: root `LICENSE` file, but individual Go/Python/Java source headers say
  "SPDX-License-Identifier: Apache License 2.0" — check file headers rather than assuming one
  license for the whole tree.

## Debugging checklist

1. Bug in a specific object's fields/behavior → check `swagger/<Object>.{json,yaml}` first (source
   of truth), then confirm `go/models/`, `python`, `java`, `docs/<Object>/` all agree with it —
   disagreement across languages usually means a sync job partially ran.
2. Bug in auth/session/retry/proxy handling → `go/session/avisession.go` (Go) or
   `avi_api.py`/`csp_avi_api.py`/`saml_avi_api.py` (Python) — these are hand-maintained, not
   generated, so fixes here are durable.
3. Downstream consumer (e.g. terraform-provider-avi) misbehaving after a bump → diff the pinned
   `alb-sdk` commit/version against the Avi Controller version actually being targeted.
4. Java-specific build failures → confirm JDK 17 toolchain (recent migration from Java 8).

## Original per-component pointers

(kept for quick navigation — see each for installation/usage specifics)
- [Python SDK usage](./python/avi/sdk/README.md)
- [Go SDK usage](./go/README.md)
- [Java SDK usage](./java/README.md)
- [SNMP MIBs](./mibs/README.txt)
- [Swagger UI dist](./swagger/README.md)
