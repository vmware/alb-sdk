# Avi Java SDK

Java client for the NSX Advanced Load Balancer (Avi) Controller REST API. `AviApi` creates a
session with the controller and performs CRUD operations using generated model classes. Part of
the [`alb-sdk`](../README.md) monorepo — see the root README for how this fits with the Go/Python
SDKs and the upstream Swagger spec, and for the codegen model. Maven artifact:
`com.vmware.avi.sdk:avisdk` (see `pom.xml`, currently version `32.1.2`).

## Directory map

| Path | Contents | Generated? |
|------|----------|------------|
| `src/com/vmware/avi/sdk/AviApi.java` | Entry point / pilot class: session + CRUD (`post`, `getForObject`, `delete`, `fileUpload`, `fileDownload`, ...) | Hand-maintained |
| `src/com/vmware/avi/sdk/AviCredentials.java` | Controller connection/credential/version/tenant config | Hand-maintained |
| `src/com/vmware/avi/sdk/AviAuthorizationInterceptor.java` | Auth header/session interceptor | Hand-maintained |
| `src/com/vmware/avi/sdk/AviApiException.java` | SDK exception type | Hand-maintained |
| `src/com/vmware/avi/sdk/AviRestUtils.java` | REST helper utilities | Hand-maintained |
| `src/com/vmware/avi/sdk/model/*.java` | Generated model classes (mirrors `go/models` / `../swagger/`) | Generated |
| `test/com/vmware/avi/sdk/AviSDKTest.java`, `AviSDKMockTest.java`, `MockAviSDKTest.java` | JUnit tests | Hand-maintained |
| `examples/VirtualServiceExample.java`, `PulseUserRegistration.java` | Runnable samples | Hand-maintained |
| `resources/config.properties` | Test/example configuration | Hand-maintained |
| `pom.xml` | Maven build (`sourceDirectory=src`, `testSourceDirectory=test`, `resources/` as resources dir) | Hand-maintained |

As with the rest of `alb-sdk`, `model/` is regenerated from the upstream Swagger spec per Avi
release — for a field/schema bug, check `../swagger/<Object>.yaml` first (see root README's
codegen section) rather than hand-patching a generated model class. Everything else in `src/`
(non-`model`) is safe to fix directly.

**JDK note:** the SDK moved from Java 8 to **Java 17** (`pom.xml` `<release>17</release>`) — if a
build fails locally, check your JDK toolchain first.

## Prerequisites

- JDK 17
- Maven

## Installation

Prebuilt jars are published per release, e.g.:

```
https://github.com/vmware/alb-sdk/blob/java_sdk/java/target/avisdk-<version>.jar
https://github.com/vmware/alb-sdk/blob/java_sdk/java/target/avisdk-<version>-javadoc.jar
```

Add the jar to your project's classpath, or build from source with Maven (`mvn package` from
`java/`).

## Usage examples

Create a session:

```java
AviCredentials creds = new AviCredentials("controller_ip", "controller_username", "controller_password");
creds.setTenant("admin");
creds.setVersion("21.1.4");
AviApi apiInstance = AviApi.getSession(creds);
```

Create a health monitor:

```java
HealthMonitor monitorObj = new HealthMonitor();
monitorObj.setName("sample_hm");
monitorObj.setType("HEALTH_MONITOR_PING");
monitorObj.setSendInterval(20);
apiInstance.post(monitorObj);
```

Create a pool with one server and a health monitor reference:

```java
Pool poolObj = new Pool();
poolObj.setName("sample_pool");
poolObj.setEnabled(true);
IpAddr addr = new IpAddr();
addr.setAddr("192.0.0.1");
addr.setType("V4");
Server serverObj = new Server();
serverObj.setPort(90);
serverObj.setIp(addr);
poolObj.setServers(Arrays.asList(serverObj));
poolObj.setHealthMonitorRefs(Arrays.asList("/api/healthmonitor?name=sample_hm"));
apiInstance.post(poolObj);
```

Create a VsVip:

```java
VsVip vsVipObj = new VsVip();
vsVipObj.setName("sample_vip");
IpAddr addr = new IpAddr();
addr.setAddr("192.0.0.1");
addr.setType("V4");
Vip vipObj = new Vip();
vipObj.setVipId("1");
vipObj.setIpAddress(addr);
vsVipObj.setVip(Arrays.asList(vipObj));
apiInstance.post(vsVipObj);
```

Create a VirtualService referencing that pool and VIP:

```java
VirtualService virtualServiceObj = new VirtualService();
virtualServiceObj.setName("sample_vs");
Service serviceObj = new Service();
serviceObj.setPort(80);
serviceObj.setEnableSsl(false);
virtualServiceObj.setServices(Arrays.asList(serviceObj));
virtualServiceObj.setPoolRef("/api/pool?name=sample_pool");
virtualServiceObj.setVsvipRef("/api/vsvip?name=sample_vip");
apiInstance.post(virtualServiceObj);
```

Fetch / delete by UUID:

```java
apiInstance.getForObject(VirtualService.class, "virtualservice_uuid");
apiInstance.delete(VirtualService.class, "virtualservice_uuid");
```

Upload / download files:

```java
apiInstance.fileUpload("fileservice?uri=controller://hsmpackages&hsmtype=safenet", "/mnt/files/hsmpackages/safenet.tar");

Map<String, String> param = new HashMap<String, String>();
param.put("full_system", "true");
param.put("passphrase", "abc1234");
apiInstance.fileDownload("/configuration/export", "filepath", param);
```

## Test

```sh
cd java
mvn test    # runs test/com/vmware/avi/sdk/{AviSDKTest,AviSDKMockTest,MockAviSDKTest}.java
```

`resources/config.properties` holds controller/credential config consumed by the tests/examples —
check it (or the equivalent env-specific override used in CI) before assuming a test failure is a
code bug.

## Debugging checklist

- Model/field mismatch → check `../swagger/<Object>.yaml` first, then `src/.../model/<Object>.java`
  — disagreement usually means an incomplete codegen sync (see root README).
- Build failure → confirm JDK 17 is active (`mvn -v`); this SDK no longer supports Java 8.
- Auth/session issues → `AviCredentials.java` / `AviAuthorizationInterceptor.java` (hand-maintained).
