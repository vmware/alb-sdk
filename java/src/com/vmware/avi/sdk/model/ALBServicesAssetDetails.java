/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */

package com.vmware.avi.sdk.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The ALBServicesAssetDetails is a POJO class extends AviRestResource that used for creating
 * ALBServicesAssetDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ALBServicesAssetDetails  {
    @JsonProperty("asset_id")
    private String assetId;

    @JsonProperty("email")
    private String email;

    @JsonProperty("keyless_license")
    private KeylessLicense keylessLicense;

    @JsonProperty("site")
    private ALBServicesSiteInfo site;

    @JsonProperty("user_name")
    private String userName;



    /**
     * This is the getter method this will return the attribute value.
     * Asset id corresponding to this controller cluster, returned on a successful registration.
     * Field introduced in 22.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * This is the setter method to the attribute.
     * Asset id corresponding to this controller cluster, returned on a successful registration.
     * Field introduced in 22.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param assetId set the assetId.
     */
    public void setAssetId(String  assetId) {
        this.assetId = assetId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Email id of the portal user.
     * Field introduced in 22.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * This is the setter method to the attribute.
     * Email id of the portal user.
     * Field introduced in 22.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param email set the email.
     */
    public void setEmail(String  email) {
        this.email = email;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Keyless license subscription details for the controller.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return keylessLicense
     */
    public KeylessLicense getKeylessLicense() {
        return keylessLicense;
    }

    /**
     * This is the setter method to the attribute.
     * Keyless license subscription details for the controller.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param keylessLicense set the keylessLicense.
     */
    public void setKeylessLicense(KeylessLicense keylessLicense) {
        this.keylessLicense = keylessLicense;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Site information for the controller registration.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return site
     */
    public ALBServicesSiteInfo getSite() {
        return site;
    }

    /**
     * This is the setter method to the attribute.
     * Site information for the controller registration.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param site set the site.
     */
    public void setSite(ALBServicesSiteInfo site) {
        this.site = site;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the portal user.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the portal user.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param userName set the userName.
     */
    public void setUserName(String  userName) {
        this.userName = userName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ALBServicesAssetDetails objALBServicesAssetDetails = (ALBServicesAssetDetails) o;
      return   Objects.equals(this.assetId, objALBServicesAssetDetails.assetId)&&
  Objects.equals(this.email, objALBServicesAssetDetails.email)&&
  Objects.equals(this.userName, objALBServicesAssetDetails.userName)&&
  Objects.equals(this.site, objALBServicesAssetDetails.site)&&
  Objects.equals(this.keylessLicense, objALBServicesAssetDetails.keylessLicense);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ALBServicesAssetDetails {\n");
                  sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
                        sb.append("    email: ").append(toIndentedString(email)).append("\n");
                        sb.append("    keylessLicense: ").append(toIndentedString(keylessLicense)).append("\n");
                        sb.append("    site: ").append(toIndentedString(site)).append("\n");
                        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
                  sb.append("}");
      return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
      if (o == null) {
          return "null";
      }
      return o.toString().replace("\n", "\n    ");
    }
}
