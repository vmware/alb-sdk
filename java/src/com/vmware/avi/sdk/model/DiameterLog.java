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
 * The DiameterLog is a POJO class extends AviRestResource that used for creating
 * DiameterLog.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DiameterLog  {
    @JsonProperty("application_id")
    private Integer applicationId;

    @JsonProperty("avp_key_type")
    private String avpKeyType;

    @JsonProperty("command_code")
    private Integer commandCode;

    @JsonProperty("destination_host")
    private String destinationHost;

    @JsonProperty("destination_realm")
    private String destinationRealm;

    @JsonProperty("end_to_end_identifier")
    private Integer endToEndIdentifier;

    @JsonProperty("hop_by_hop_identifier")
    private Integer hopByHopIdentifier;

    @JsonProperty("origin_host")
    private String originHost;

    @JsonProperty("origin_realm")
    private String originRealm;



    /**
     * This is the getter method this will return the attribute value.
     * Field to identify which application the message is applicable for.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return applicationId
     */
    public Integer getApplicationId() {
        return applicationId;
    }

    /**
     * This is the setter method to the attribute.
     * Field to identify which application the message is applicable for.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param applicationId set the applicationId.
     */
    public void setApplicationId(Integer  applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Avpkey type.
     * Enum options - SESSION_ID, ORIGIN_HOST, ORIGIN_REALM, DESTINATION_HOST, DESTINATION_REALM, APPLICATION_ID.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return avpKeyType
     */
    public String getAvpKeyType() {
        return avpKeyType;
    }

    /**
     * This is the setter method to the attribute.
     * Avpkey type.
     * Enum options - SESSION_ID, ORIGIN_HOST, ORIGIN_REALM, DESTINATION_HOST, DESTINATION_REALM, APPLICATION_ID.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param avpKeyType set the avpKeyType.
     */
    public void setAvpKeyType(String  avpKeyType) {
        this.avpKeyType = avpKeyType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field to indicate command associated with message.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return commandCode
     */
    public Integer getCommandCode() {
        return commandCode;
    }

    /**
     * This is the setter method to the attribute.
     * Field to indicate command associated with message.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param commandCode set the commandCode.
     */
    public void setCommandCode(Integer  commandCode) {
        this.commandCode = commandCode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field to identify the target server for the message.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return destinationHost
     */
    public String getDestinationHost() {
        return destinationHost;
    }

    /**
     * This is the setter method to the attribute.
     * Field to identify the target server for the message.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param destinationHost set the destinationHost.
     */
    public void setDestinationHost(String  destinationHost) {
        this.destinationHost = destinationHost;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field to identify the realm where receiving server resides.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return destinationRealm
     */
    public String getDestinationRealm() {
        return destinationRealm;
    }

    /**
     * This is the setter method to the attribute.
     * Field to identify the realm where receiving server resides.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param destinationRealm set the destinationRealm.
     */
    public void setDestinationRealm(String  destinationRealm) {
        this.destinationRealm = destinationRealm;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field to detect duplicate messages.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return endToEndIdentifier
     */
    public Integer getEndToEndIdentifier() {
        return endToEndIdentifier;
    }

    /**
     * This is the setter method to the attribute.
     * Field to detect duplicate messages.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param endToEndIdentifier set the endToEndIdentifier.
     */
    public void setEndToEndIdentifier(Integer  endToEndIdentifier) {
        this.endToEndIdentifier = endToEndIdentifier;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field to match requests and responses.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hopByHopIdentifier
     */
    public Integer getHopByHopIdentifier() {
        return hopByHopIdentifier;
    }

    /**
     * This is the setter method to the attribute.
     * Field to match requests and responses.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hopByHopIdentifier set the hopByHopIdentifier.
     */
    public void setHopByHopIdentifier(Integer  hopByHopIdentifier) {
        this.hopByHopIdentifier = hopByHopIdentifier;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field to identify endpoint that originated the message.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return originHost
     */
    public String getOriginHost() {
        return originHost;
    }

    /**
     * This is the setter method to the attribute.
     * Field to identify endpoint that originated the message.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param originHost set the originHost.
     */
    public void setOriginHost(String  originHost) {
        this.originHost = originHost;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field to identify realm that originated the message.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return originRealm
     */
    public String getOriginRealm() {
        return originRealm;
    }

    /**
     * This is the setter method to the attribute.
     * Field to identify realm that originated the message.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param originRealm set the originRealm.
     */
    public void setOriginRealm(String  originRealm) {
        this.originRealm = originRealm;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DiameterLog objDiameterLog = (DiameterLog) o;
      return   Objects.equals(this.commandCode, objDiameterLog.commandCode)&&
  Objects.equals(this.applicationId, objDiameterLog.applicationId)&&
  Objects.equals(this.hopByHopIdentifier, objDiameterLog.hopByHopIdentifier)&&
  Objects.equals(this.endToEndIdentifier, objDiameterLog.endToEndIdentifier)&&
  Objects.equals(this.originHost, objDiameterLog.originHost)&&
  Objects.equals(this.originRealm, objDiameterLog.originRealm)&&
  Objects.equals(this.destinationHost, objDiameterLog.destinationHost)&&
  Objects.equals(this.destinationRealm, objDiameterLog.destinationRealm)&&
  Objects.equals(this.avpKeyType, objDiameterLog.avpKeyType);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DiameterLog {\n");
                  sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
                        sb.append("    avpKeyType: ").append(toIndentedString(avpKeyType)).append("\n");
                        sb.append("    commandCode: ").append(toIndentedString(commandCode)).append("\n");
                        sb.append("    destinationHost: ").append(toIndentedString(destinationHost)).append("\n");
                        sb.append("    destinationRealm: ").append(toIndentedString(destinationRealm)).append("\n");
                        sb.append("    endToEndIdentifier: ").append(toIndentedString(endToEndIdentifier)).append("\n");
                        sb.append("    hopByHopIdentifier: ").append(toIndentedString(hopByHopIdentifier)).append("\n");
                        sb.append("    originHost: ").append(toIndentedString(originHost)).append("\n");
                        sb.append("    originRealm: ").append(toIndentedString(originRealm)).append("\n");
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
