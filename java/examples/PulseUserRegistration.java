/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */
package avisdk;

import java.io.IOException;
import java.util.logging.Logger;
import org.json.JSONObject;
import com.vmware.avi.sdk.AviApi;
import com.vmware.avi.sdk.AviCredentials;

/**
 * This class can be used for registering and deregistering the controller with
 * pulse.
 * 
 * @author: Mayur Khachane
 *
 */
public class PulseUserRegistration {
    static final Logger LOGGER = Logger.getLogger(PulseUserRegistration.class.getName());

    private static final String HOST = "<controller_ip>";
    private static final String USERNAME = "<controller_username>";
    private static final String PASSWORD = "<controller_password>";

    /**
     * Main method to Register and Deregister pulse user.
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            PulseUserRegistration pulseUserRegistration = new PulseUserRegistration();
            pulseUserRegistration.userRegistration();
            pulseUserRegistration.userDeregistration();
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
     * This method for pulse user registration.
     * Token which is used to login to pulse from controller for the specific user.
     * For generation of the jwt_token paste the related link
     * in Incognito window to prevent IdP from considering any existing valid login session
     * If your controller is running >= 21.1.3 and is in ENTERPRISE tier then visit URL
     * :https://portal.avipulse.vmware.com/portal/controller/auth/ctrllogin
     * If your controller is running >= 21.1.3 and is in SAAS tier then visit URL
     * :https://portal.avipulse.vmware.com/portal/controller/auth/ccctrllogin
     * jwt_token is valid for 365 days.
     *
     */
    public void userRegistration() {
        try {
            AviApi apiInstance = this.getSession();
            JSONObject resp = apiInstance.get("albservices/status", null);

            if (resp.get("connectivity_status").equals("ALBSERVICES_DISCONNECTED")) {
                JSONObject obj = new JSONObject();
                String jwtToken = "<jwt_token>";
                obj.put("jwt_token", jwtToken);
                apiInstance.post("portal/refresh-access-token", obj);
            }

            if (resp.get("registration_status").equals("ALBSERVICES_DEREGISTERED")) {
                JSONObject data = new JSONObject();
                data.put("name", "AviPulse");
                data.put("email", "user@gmail.com");
                data.put("account_id", "123456789");
                apiInstance.post("albservices/register", data);
            }

            JSONObject albServiceConfigObj = apiInstance.get("/albservicesconfig", null);
            albServiceConfigObj.put("portal_url", "<portal_url>");

            JSONObject caseConfigData = albServiceConfigObj.getJSONObject("case_config");
            caseConfigData.put("enable_auto_case_creation_on_controller_failure", false);
            caseConfigData.put("enable_auto_case_creation_on_se_failure", false);

            JSONObject wafConfigData = albServiceConfigObj.getJSONObject("waf_config");
            wafConfigData.put("enable_auto_download_waf_signatures", false);
            wafConfigData.put("enable_waf_signatures_notifications", true);

            albServiceConfigObj.remove("_last_modified");
            apiInstance.put("/albservicesconfig", albServiceConfigObj);

            LOGGER.info("Registered successfully");
        } catch (Exception e) {
            LOGGER.info("User registration failed cause of :: " + e.getCause());
            e.printStackTrace();
        }
    }

    /**
     * This method for Deregister pulse user
     */
    public void userDeregistration() {
        try {
            AviApi api = this.getSession();
            JSONObject resp = api.get("albservices/status", null);

            if (resp.get("registration_status").equals("ALBSERVICES_REGISTERED")) {
                JSONObject albServiceConfigObj = new JSONObject();
                albServiceConfigObj.put("status", "Obsolete");
                albServiceConfigObj.put("albservices/register", albServiceConfigObj);
            }
            LOGGER.info("Deregistered successfully");

        } catch (Exception e) {
            LOGGER.info("User deregistration failed cause of :: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
