# Avi SDK

Avi SDK is a Java API which creates a session with controller and perform CRUD operations.

## Prerequisites
jdk 1.8

Maven
## Installation



Download the jar from https://github.com/vmware/alb-sdk/blob/java_sdk/java/target/avisdk-18.2.7-SNAPSHOT.jar

add the jar into the classpath of your project.

for documentation please refer https://github.com/vmware/alb-sdk/blob/java_sdk/java/target/avisdk-18.2.7-SNAPSHOT-javadoc.jar.

## Usage Examples

AviApi is a pilot class of the API.

- **Create Avi API Session :**
```java
AviCredentials creds= new AviCredentials("controller_ip", "controller_username", "controller_password");
creds.setTenant("admin");
creds.setVersion("21.1.4");
AviApi apiInstance = AviApi.getSession(creds);
```

- **Creating health monitor :**
```java
HealthMonitor monitorObj = new HealthMonitor();
monitorObj.setName("sample_hm");
monitorObj.setType("HEALTH_MONITOR_PING");
monitorObj.setSendInterval(20);
apiInstance.post(monitorObj);
```

- **Creating pool with one server and health monitor reference :**
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

- **Creating vsvip :**
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

- **Creating virtual service using pool and vsvip reference :**
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

- **Fetching object by uuid :**
```java
apiInstance.getForObject(VirtualService.class, "virtualservice_uuid");
```

- **Deleting object by uuid :**
```java
apiInstance.delete(VirtualService.class, "virtualservice_uuid");
```
- **Uploading file :**
```java
apiInstance.fileUpload("fileservice/hsmpackages?hsmtype=safenet", "/mnt/files/hsmpackages/safenet.tar","controller://hsmpackages");
```

- **Downloading file :**
```java
Map<String, String> param = new HashMap<String, String>();
param.put("full_system", "true");
param.put("passphrase", "abc1234");
apiInstance.fileDownload("/configuration/export", "filepath", param);
```



