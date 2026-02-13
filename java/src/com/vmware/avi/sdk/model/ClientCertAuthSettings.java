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
 * The ClientCertAuthSettings is a POJO class extends AviRestResource that used for creating
 * ClientCertAuthSettings.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClientCertAuthSettings  {
    @JsonProperty("client_cert_refs")
    private List<String> clientCertRefs;


    /**
     * This is the getter method this will return the attribute value.
     * Client certs to be used for authentication.
     * It is a reference to an object of type sslkeyandcertificate.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientCertRefs
     */
    public List<String> getClientCertRefs() {
        return clientCertRefs;
    }

    /**
     * This is the setter method. this will set the clientCertRefs
     * Client certs to be used for authentication.
     * It is a reference to an object of type sslkeyandcertificate.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientCertRefs
     */
    public void setClientCertRefs(List<String>  clientCertRefs) {
        this.clientCertRefs = clientCertRefs;
    }

    /**
     * This is the setter method this will set the clientCertRefs
     * Client certs to be used for authentication.
     * It is a reference to an object of type sslkeyandcertificate.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientCertRefs
     */
    public ClientCertAuthSettings addClientCertRefsItem(String clientCertRefsItem) {
      if (this.clientCertRefs == null) {
        this.clientCertRefs = new ArrayList<String>();
      }
      this.clientCertRefs.add(clientCertRefsItem);
      return this;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ClientCertAuthSettings objClientCertAuthSettings = (ClientCertAuthSettings) o;
      return   Objects.equals(this.clientCertRefs, objClientCertAuthSettings.clientCertRefs);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ClientCertAuthSettings {\n");
                  sb.append("    clientCertRefs: ").append(toIndentedString(clientCertRefs)).append("\n");
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
