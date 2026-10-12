# Avi Go SDK and Utilities

Go client for the NSX Advanced Load Balancer (Avi) Controller REST API. Handles session
auth/caching, CSRF token refresh, tenant headers, and provides typed clients/models for Avi
objects. Part of the [`alb-sdk`](../README.md) monorepo — see the root README for how this fits
with the Python/Java SDKs and the upstream Swagger spec, and for the codegen model.

Module path: `github.com/vmware/alb-sdk` (import subpackages as `github.com/vmware/alb-sdk/go/...`).

## Directory map

| Path | Contents | Generated? |
|------|----------|------------|
| `session/avisession.go` (+ `_test.go`) | `AviSession`: connect/auth/session-cache/CSRF/multipart-upload/CSP-token logic | Hand-maintained |
| `clients/avi_client.go` | `AviClient` struct aggregating every per-object client | Generated (169 files in `clients/`) |
| `clients/<object>_client.go` | Typed CRUD client per Avi API object (e.g. `pool_client.go`) | Generated |
| `models/*.go` | 1524 generated structs (one+ per API object/sub-object) for (un)marshaling REST payloads | Generated |
| `examples/*.go` | Runnable samples: `create_vs.go`, `metrics_collection.go`, `api_reads.go`, `session.go`, `cspsession.go` | Hand-maintained |
| `examples/test/*.go` | Go integration tests (cloud/tenant/profile/healthmonitor/virtualservice creation, api filters, TLS, etc.) | Hand-maintained |
| `examples/test/tests_go_clients.py`, `conftest.py` (this dir) | pytest wrapper around the Go integration tests for the internal CI harness | Hand-maintained |
| `fmt_lint_check.sh` | Runs `go fmt` + `golint` over `session`, `models`, `clients`, `examples` | Hand-maintained |

As with the rest of `alb-sdk`, `clients/` and `models/` are regenerated from the upstream Swagger
spec — don't hand-patch a generated client/model for a bug that's really in the spec; fix
`../swagger/<Object>.yaml` upstream instead (see root README's codegen section). `session/` is the
one package that's safe to patch directly for auth/transport/retry bugs.

## Prerequisites

- [Go](https://golang.org/doc/install) (see `../go.mod` for the pinned version)

## Installation

```sh
mkdir -p src/github.com/vmware/
cd src/github.com/vmware/
git clone https://github.com/vmware/alb-sdk.git
# GOPATH will be the path up to src/
export GOPATH=~/src
```

To vendor into third-party Go code (e.g. a Terraform provider), pin `github.com/vmware/alb-sdk/go/clients`
and `.../go/session` at a specific revision in your module's `go.mod`/vendor manifest, then:

```go
import (
	"github.com/vmware/alb-sdk/go/clients"
	"github.com/vmware/alb-sdk/go/session"
)
```

## Build / test / lint

From the **repo root** (`alb-sdk/`), via the root `Makefile`:

```sh
make compile            # go build ./go/clients ./go/models + example binaries, go vet
make fmt                # go fmt ./go/clients ./go/models ./go/examples
make test_avisession    # go test ./go/session/. -v
make test_clients       # go test ./go/examples/test/*.go -v
```

`test_clients` needs `AVI_USERNAME`, `AVI_PASSWORD`, `AVI_CONTROLLER`, `AVI_TENANT`, `AVI_VERSION`
env vars (see root `Makefile` for defaults). If `AVI_CONTROLLER` is left at its default
(`localhost:8080//`), the target auto-starts `go/examples/web_service.py` as a mock backend.

From within `go/`, `fmt_lint_check.sh` runs `go fmt` + `golint` across `session/`, `models/`,
`clients/`, `examples/` — run this before submitting a PR that touches this directory.

## Usage examples

Create a session and a generic client:

```go
package main

import (
	"github.com/vmware/alb-sdk/go/clients"
	"github.com/vmware/alb-sdk/go/models"
	"github.com/vmware/alb-sdk/go/session"
)

aviClient, err := clients.NewAviClient("10.10.25.25", "admin",
	session.SetPassword("something"),
	session.SetTenant("admin"),
	session.SetInsecure)
```

IPv6 controller address:

```go
aviClient, err := clients.NewAviClient("2610:124:6020:c703::12e", "admin",
	session.SetPassword("something"), session.SetTenant("admin"), session.SetInsecure)

aviClient, err := clients.NewAviClient("https://[2610:124:6020:c703::12e]", "admin",
	session.SetPassword("something"), session.SetTenant("admin"), session.SetInsecure)
```

Custom retry count / interval (seconds) while polling controller status:

```go
aviClient, err := clients.NewAviClient("10.10.25.25", "admin",
	session.SetPassword("something"),
	session.SetTenant("admin"),
	session.SetControllerStatusCheckLimits(5, 10), // retryCount, timeIntervalSeconds
	session.SetInsecure)
```

Create a pool with one server:

```go
pobj := models.Pool{}
pname := "my-test-pool"
pobj.Name = &pname
serverobj := models.Server{}
enabled := true
serverobj.Enabled = &enabled
ipType := "V4"
addr := "10.90.20.12"
serverobj.IP = &models.IPAddr{Type: &ipType, Addr: &addr}
pobj.Servers = append(pobj.Servers, &serverobj)

npobj, err := aviClient.Pool.Create(&pobj)
if err != nil {
	fmt.Println("Pool creation failed: ", err)
	return
}
```

Create a VsVip:

```go
vsVip := models.VsVip{}
vipAddr := "10.90.20.51"
vipip := models.IPAddr{Type: &ipType, Addr: &vipAddr}
vipId := "1"
vipObj := models.Vip{VipID: &vipId, IPAddress: &vipip}

vipName := "test-vip"
vsVip.Name = &vipName
vsVip.Vip = append(vsVip.Vip, &vipObj)

vsVipObj, err := aviClient.VsVip.Create(&vsVip)
if err != nil {
	fmt.Println("VIP creation failed: ", err)
}
```

Create a VirtualService using that pool and VIP:

```go
vsobj := models.VirtualService{}
vname := "my-test-vs"
vsobj.Name = &vname
vsobj.VsvipRef = vsVipObj.UUID
vsobj.PoolRef = npobj.UUID
port := int32(80)
vsobj.Services = append(vsobj.Services, &models.Service{Port: &port})

nvsobj, err := aviClient.VirtualService.Create(&vsobj)
if err != nil {
	fmt.Println("VS creation failed: ", err)
	return
}
fmt.Printf("VS obj: %+v", *nvsobj)
```

Fetch an object by name:

```go
var obj interface{}
err = aviClient.AviSession.GetObjectByName("virtualservice", "my-test-vs", &obj)
fmt.Printf("VS obj: %v\n", obj)

err = aviClient.AviSession.GetObject(
	"virtualservice", session.SetName("my-test-vs"), session.SetResult(&obj),
	session.SetCloudUUID("cloud-f39f950a-e6ca-442d-b546-fc31520991bb"))
fmt.Printf("VS with CLOUD_UUID obj: %v", obj)
```

Get all VirtualServices (pagination handled internally):

```go
vss, err := aviClient.VirtualService.GetAll()
if err != nil {
	fmt.Println("Error fetching VirtualServices:", err)
	return
}
fmt.Printf("Fetched %d VirtualServices\n", len(vss))
for _, vs := range vss {
	fmt.Printf("VS: %s UUID: %s\n", *vs.Name, *vs.UUID)
}
```

Generic collection fetch for objects without a typed client yet:

```go
var pools []*models.Pool
err = aviClient.AviSession.GetCollection("api/pool", &pools)
if err != nil {
	fmt.Println("Error fetching pools:", err)
}
fmt.Printf("Fetched %d Pools\n", len(pools))
for _, pool := range pools {
	fmt.Printf("POOL: %s UUID: %s\n", *pool.Name, *pool.UUID)
}
```

Delete:

```go
aviClient.VirtualService.Delete(nvsobj.UUID)
aviClient.Pool.Delete(npobj.UUID)
```

Lazy authentication (session established on first use, not at construction):

```go
avisess, err := session.NewAviSession(AVI_CONTROLLER, "admin",
	session.SetPassword(AVI_PASSWORD), session.SetLazyAuthentication(true))
```

Run the bundled example (creates VS `my-test-vs` — edit controller IP/creds in the file first):

```sh
go run examples/create_vs.go
```

Metrics/analytics collection example:

```go
package main

import (
	"fmt"
	"github.com/vmware/alb-sdk/go/clients"
	"github.com/vmware/alb-sdk/go/session"
)

type MetricRequest struct {
	Step           int    `json:"step"`
	Limit          int    `json:"limit"`
	EntityUUID     string `json:"entity_uuid"`
	MetricID       string `json:"metric_id"`
	IncludeName    string `json:"include_name"`
	IncludeRefs    string `json:"include_refs"`
	PadMissingData string `json:"pad_missing_data"`
}

type Metrics struct {
	MetricRequests []MetricRequest `json:"metric_requests"`
}

func main() {
	aviClient, err := clients.NewAviClient("10.10.25.42", "admin",
		session.SetPassword(""), session.SetTenant("admin"), session.SetInsecure)
	if err != nil {
		fmt.Println("Couldn't create session: ", err)
		return
	}
	mr := MetricRequest{Step: 1, Limit: 1, EntityUUID: "*", MetricID: "l7_server.max_concurrent_sessions",
		IncludeName: "True", IncludeRefs: "True", PadMissingData: "False"}
	req := Metrics{MetricRequests: []MetricRequest{mr}}
	var rsp interface{}
	aviClient.AviSession.Post("/api/analytics/metrics/collection", req, &rsp)
	fmt.Printf("response %v\n", rsp)
}
```

Compile a standalone binary:

```sh
go build -o /usr/bin/create_vs examples/create_vs.go
```

## Debugging checklist

- Object schema/field mismatch (e.g. "unknown field" / marshal errors) → check
  `../swagger/<Object>.yaml` and cross-check `models/<object>.go`; if they disagree, a codegen sync
  is incomplete — see root README.
- Auth/session/CSRF/proxy/retry issues → `session/avisession.go` (hand-maintained, safe to fix
  directly); check `session_test.go` for existing coverage before changing behavior.
- A downstream consumer (e.g. `terraform-provider-avi`) breaks after bumping this module → check
  its pinned commit/version against the Avi Controller version it targets (see root README's
  versioning section).
