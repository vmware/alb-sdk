/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */
package avisdk;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;
import org.springframework.http.ResponseEntity;
import com.vmware.avi.sdk.AviApi;
import com.vmware.avi.sdk.AviCredentials;
import com.vmware.avi.sdk.model.HealthMonitor;
import com.vmware.avi.sdk.model.IpAddr;
import com.vmware.avi.sdk.model.Pool;
import com.vmware.avi.sdk.model.Server;
import com.vmware.avi.sdk.model.Service;
import com.vmware.avi.sdk.model.Vip;
import com.vmware.avi.sdk.model.VirtualService;
import com.vmware.avi.sdk.model.VsVip;

/**
 * This class can be used for create virtual service on the controller with pool
 * and vsvip.
 * 
 * @author: Mayur Khachane
 *
 */
public class VirtualServiceExample {
	static final Logger LOGGER = Logger.getLogger(PulseUserRegistration.class.getName());

	private static final String HOST = "<controller_ip>";
	private static final String USERNAME = "<controller_username>";
	private static final String PASSWORD = "<controller_password>";

	/**
	 * Main method to create virtual service using sample_pool and sample_vsvip.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			VirtualServiceExample virtualServiceExample = new VirtualServiceExample();
			virtualServiceExample.createVirtualServiceWithPool();
			virtualServiceExample.deleteVirtualServiceByUuid("<virtualservice_uuid>");
		} catch (Exception e) {
			LOGGER.info("Error while executing main thread cause of :: " + e.getCause());
			e.printStackTrace();
		}
	}

	/**
	 * This method creates a session with the AVI controller.
	 *
	 * @return
	 */
	private AviApi getSession() {
		AviCredentials aviCredentials = new AviCredentials();
		aviCredentials.setController(HOST);
		aviCredentials.setUsername(USERNAME);
		aviCredentials.setPassword(PASSWORD);
		aviCredentials.setVersion("21.1.4");
		aviCredentials.setTenant("admin");
		AviApi session = null;
		try {
			session = AviApi.getSession(aviCredentials);
		} catch (IOException e) {
			LOGGER.info("Failed to get session cause of :: " + e.getCause());
			e.printStackTrace();
		}
		return session;
	}

	/**
	 * This method for create VirtualService object using sample pool and vsvip
	 */
	public void createVirtualServiceWithPool() {
		try {
			AviApi apiInstance = this.getSession();

			// Create HealthMonitor.
			HealthMonitor healthMonitorObj = new HealthMonitor();
			healthMonitorObj.setName("sample_hm");
			healthMonitorObj.setType("HEALTH_MONITOR_PING");
			healthMonitorObj.setSendInterval(20);
			apiInstance.post(healthMonitorObj);
			LOGGER.info(healthMonitorObj.getName() + " healthmonitor is created.");

			// create pool with one server
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
			LOGGER.info(poolObj.getName() + " pool is created.");

			// create vsvip
			VsVip vsVipObj = new VsVip();
			vsVipObj.setName("sample_vsvip");
			IpAddr vsVipAddr = new IpAddr();
			vsVipAddr.setAddr("192.0.0.1");
			vsVipAddr.setType("V4");
			Vip vipObj = new Vip();
			vipObj.setVipId("1");
			vipObj.setIpAddress(vsVipAddr);
			vsVipObj.setVip(Arrays.asList(vipObj));
			apiInstance.post(vsVipObj);
			LOGGER.info(vsVipObj.getName() + " vsvip is created.");

			// create VirtualService using sample_pool and sample_vsvip
			VirtualService virtualServiceObj = new VirtualService();
			virtualServiceObj.setName("sample_vs");
			Service serviceObj = new Service();
			serviceObj.setPort(80);
			serviceObj.setEnableSsl(false);
			virtualServiceObj.setServices(Arrays.asList(serviceObj));
			virtualServiceObj.setPoolRef("/api/pool?name=sample_pool");
			virtualServiceObj.setVsvipRef("/api/vsvip?name=sample_vsvip");
			apiInstance.post(virtualServiceObj);
			LOGGER.info("VirtualService created successfully");

		} catch (Exception e) {
			LOGGER.info("Virtual Service creation failed cause of :: " + e.getMessage());
			e.printStackTrace();
		}

	}

	/**
	 * This method for delete virtual service using uuid
	 * 
	 * @param virtualServiceUuid uuid of the virtual service
	 */
	public void deleteVirtualServiceByUuid(String virtualServiceUuid) {
		try {
			AviApi apiInstance = this.getSession();

			ResponseEntity<VirtualService> virtualService = apiInstance.delete(VirtualService.class,
					virtualServiceUuid);
			LOGGER.info(
					"VirtualService deleted successfully with the status code :: " + virtualService.getStatusCode());

		} catch (Exception e) {
			LOGGER.info("VirtualService deletion is failed cause of :: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
