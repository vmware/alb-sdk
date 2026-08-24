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
 * The SessionKeyForwarder is a POJO class extends AviRestResource that used for creating
 * SessionKeyForwarder.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SessionKeyForwarder extends AviRestResource  {
    @JsonProperty("enable")
    private Boolean enable = true;

    @JsonProperty("ip_ports")
    private List<IpAddrPort> ipPorts;

    @JsonProperty("name")
    private String name;

    @JsonProperty("pki_profile_ref")
    private String pkiProfileRef;

    @JsonProperty("ssl_key_and_certificate_ref")
    private String sslKeyAndCertificateRef;

    @JsonProperty("ssl_profile_ref")
    private String sslProfileRef;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("use_mgmt")
    private Boolean useMgmt = true;

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Enable or disable session key forwarder.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * This is the setter method to the attribute.
     * Enable or disable session key forwarder.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param enable set the enable.
     */
    public void setEnable(Boolean  enable) {
        this.enable = enable;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Ip addresses and ports to be used for connection with session key forwarder.
     * At least one entry required; maximum 16 (matches the per-core stats slot limit).
     * Field introduced in 32.1.4.
     * Minimum of 1 items required.
     * Maximum of 16 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipPorts
     */
    public List<IpAddrPort> getIpPorts() {
        return ipPorts;
    }

    /**
     * This is the setter method. this will set the ipPorts
     * Ip addresses and ports to be used for connection with session key forwarder.
     * At least one entry required; maximum 16 (matches the per-core stats slot limit).
     * Field introduced in 32.1.4.
     * Minimum of 1 items required.
     * Maximum of 16 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipPorts
     */
    public void setIpPorts(List<IpAddrPort>  ipPorts) {
        this.ipPorts = ipPorts;
    }

    /**
     * This is the setter method this will set the ipPorts
     * Ip addresses and ports to be used for connection with session key forwarder.
     * At least one entry required; maximum 16 (matches the per-core stats slot limit).
     * Field introduced in 32.1.4.
     * Minimum of 1 items required.
     * Maximum of 16 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipPorts
     */
    public SessionKeyForwarder addIpPortsItem(IpAddrPort ipPortsItem) {
      if (this.ipPorts == null) {
        this.ipPorts = new ArrayList<IpAddrPort>();
      }
      this.ipPorts.add(ipPortsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the session key forwarder profile.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the session key forwarder profile.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Pki profile used to validate the ssl certificate presented by a server.
     * It is a reference to an object of type pkiprofile.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pkiProfileRef
     */
    public String getPkiProfileRef() {
        return pkiProfileRef;
    }

    /**
     * This is the setter method to the attribute.
     * Pki profile used to validate the ssl certificate presented by a server.
     * It is a reference to an object of type pkiprofile.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param pkiProfileRef set the pkiProfileRef.
     */
    public void setPkiProfileRef(String  pkiProfileRef) {
        this.pkiProfileRef = pkiProfileRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Service engines will present this ssl certificate to the server.
     * It is a reference to an object of type sslkeyandcertificate.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sslKeyAndCertificateRef
     */
    public String getSslKeyAndCertificateRef() {
        return sslKeyAndCertificateRef;
    }

    /**
     * This is the setter method to the attribute.
     * Service engines will present this ssl certificate to the server.
     * It is a reference to an object of type sslkeyandcertificate.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sslKeyAndCertificateRef set the sslKeyAndCertificateRef.
     */
    public void setSslKeyAndCertificateRef(String  sslKeyAndCertificateRef) {
        this.sslKeyAndCertificateRef = sslKeyAndCertificateRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ssl profile defines ciphers and ssl versions to be used for session key forwarder.
     * It is a reference to an object of type sslprofile.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sslProfileRef
     */
    public String getSslProfileRef() {
        return sslProfileRef;
    }

    /**
     * This is the setter method to the attribute.
     * Ssl profile defines ciphers and ssl versions to be used for session key forwarder.
     * It is a reference to an object of type sslprofile.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sslProfileRef set the sslProfileRef.
     */
    public void setSslProfileRef(String  sslProfileRef) {
        this.sslProfileRef = sslProfileRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tenant reference for the session key forwarder object.
     * It is a reference to an object of type tenant.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * Tenant reference for the session key forwarder object.
     * It is a reference to an object of type tenant.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantRef set the tenantRef.
     */
    public void setTenantRef(String  tenantRef) {
        this.tenantRef = tenantRef;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Avi controller URL of the object.
     * @return url
     */
    public String getUrl() {
        return url;
    }

   /**
    * This is the setter method. this will set the url
    * Avi controller URL of the object.
    * @return url
    */
   public void setUrl(String  url) {
     this.url = url;
   }

    /**
     * This is the getter method this will return the attribute value.
     * If enabled, connection with session key forwarder will use the management network.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return useMgmt
     */
    public Boolean getUseMgmt() {
        return useMgmt;
    }

    /**
     * This is the setter method to the attribute.
     * If enabled, connection with session key forwarder will use the management network.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param useMgmt set the useMgmt.
     */
    public void setUseMgmt(Boolean  useMgmt) {
        this.useMgmt = useMgmt;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the session key forwarder profile.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the session key forwarder profile.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SessionKeyForwarder objSessionKeyForwarder = (SessionKeyForwarder) o;
      return   Objects.equals(this.uuid, objSessionKeyForwarder.uuid)&&
  Objects.equals(this.name, objSessionKeyForwarder.name)&&
  Objects.equals(this.sslProfileRef, objSessionKeyForwarder.sslProfileRef)&&
  Objects.equals(this.pkiProfileRef, objSessionKeyForwarder.pkiProfileRef)&&
  Objects.equals(this.sslKeyAndCertificateRef, objSessionKeyForwarder.sslKeyAndCertificateRef)&&
  Objects.equals(this.ipPorts, objSessionKeyForwarder.ipPorts)&&
  Objects.equals(this.useMgmt, objSessionKeyForwarder.useMgmt)&&
  Objects.equals(this.enable, objSessionKeyForwarder.enable)&&
  Objects.equals(this.tenantRef, objSessionKeyForwarder.tenantRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SessionKeyForwarder {\n");
                  sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
                        sb.append("    ipPorts: ").append(toIndentedString(ipPorts)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    pkiProfileRef: ").append(toIndentedString(pkiProfileRef)).append("\n");
                        sb.append("    sslKeyAndCertificateRef: ").append(toIndentedString(sslKeyAndCertificateRef)).append("\n");
                        sb.append("    sslProfileRef: ").append(toIndentedString(sslProfileRef)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                                    sb.append("    useMgmt: ").append(toIndentedString(useMgmt)).append("\n");
                        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
