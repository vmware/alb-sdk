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
 * The SCTPProxyProfile is a POJO class extends AviRestResource that used for creating
 * SCTPProxyProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SCTPProxyProfile  {
    @JsonProperty("cookie_expiration_timeout")
    private Integer cookieExpirationTimeout = 60;

    @JsonProperty("heartbeat_interval")
    private Integer heartbeatInterval = 30;

    @JsonProperty("idle_timeout")
    private Integer idleTimeout = 0;

    @JsonProperty("max_retransmissions_association")
    private Integer maxRetransmissionsAssociation = 10;

    @JsonProperty("max_retransmissions_init_chunks")
    private Integer maxRetransmissionsInitChunks = 8;

    @JsonProperty("number_of_streams")
    private Integer numberOfStreams = 10;

    @JsonProperty("receive_window")
    private Integer receiveWindow = 1024;

    @JsonProperty("reset_timeout")
    private Integer resetTimeout = 0;



    /**
     * This is the getter method this will return the attribute value.
     * Sctp cookie expiration timeout.
     * Allowed values are 60-3600.
     * Field introduced in 22.1.3.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @return cookieExpirationTimeout
     */
    public Integer getCookieExpirationTimeout() {
        return cookieExpirationTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Sctp cookie expiration timeout.
     * Allowed values are 60-3600.
     * Field introduced in 22.1.3.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @param cookieExpirationTimeout set the cookieExpirationTimeout.
     */
    public void setCookieExpirationTimeout(Integer  cookieExpirationTimeout) {
        this.cookieExpirationTimeout = cookieExpirationTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Sctp heartbeat interval.
     * Allowed values are 30-247483647.
     * Field introduced in 22.1.3.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @return heartbeatInterval
     */
    public Integer getHeartbeatInterval() {
        return heartbeatInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Sctp heartbeat interval.
     * Allowed values are 30-247483647.
     * Field introduced in 22.1.3.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 30.
     * @param heartbeatInterval set the heartbeatInterval.
     */
    public void setHeartbeatInterval(Integer  heartbeatInterval) {
        this.heartbeatInterval = heartbeatInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Sctp autoclose timeout.
     * 0 means autoclose deactivated.
     * Allowed values are 0-247483647.
     * Field introduced in 22.1.3.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return idleTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Sctp autoclose timeout.
     * 0 means autoclose deactivated.
     * Allowed values are 0-247483647.
     * Field introduced in 22.1.3.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param idleTimeout set the idleTimeout.
     */
    public void setIdleTimeout(Integer  idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Sctp maximum retransmissions for association.
     * Allowed values are 1-247483647.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return maxRetransmissionsAssociation
     */
    public Integer getMaxRetransmissionsAssociation() {
        return maxRetransmissionsAssociation;
    }

    /**
     * This is the setter method to the attribute.
     * Sctp maximum retransmissions for association.
     * Allowed values are 1-247483647.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param maxRetransmissionsAssociation set the maxRetransmissionsAssociation.
     */
    public void setMaxRetransmissionsAssociation(Integer  maxRetransmissionsAssociation) {
        this.maxRetransmissionsAssociation = maxRetransmissionsAssociation;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Sctp maximum retransmissions for init chunks.
     * Allowed values are 1-247483647.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @return maxRetransmissionsInitChunks
     */
    public Integer getMaxRetransmissionsInitChunks() {
        return maxRetransmissionsInitChunks;
    }

    /**
     * This is the setter method to the attribute.
     * Sctp maximum retransmissions for init chunks.
     * Allowed values are 1-247483647.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @param maxRetransmissionsInitChunks set the maxRetransmissionsInitChunks.
     */
    public void setMaxRetransmissionsInitChunks(Integer  maxRetransmissionsInitChunks) {
        this.maxRetransmissionsInitChunks = maxRetransmissionsInitChunks;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of incoming sctp streams.
     * Allowed values are 1-100.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return numberOfStreams
     */
    public Integer getNumberOfStreams() {
        return numberOfStreams;
    }

    /**
     * This is the setter method to the attribute.
     * Number of incoming sctp streams.
     * Allowed values are 1-100.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param numberOfStreams set the numberOfStreams.
     */
    public void setNumberOfStreams(Integer  numberOfStreams) {
        this.numberOfStreams = numberOfStreams;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Sctp send and receive buffer size.
     * Allowed values are 2-65536.
     * Field introduced in 22.1.3.
     * Unit is kb.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
     * @return receiveWindow
     */
    public Integer getReceiveWindow() {
        return receiveWindow;
    }

    /**
     * This is the setter method to the attribute.
     * Sctp send and receive buffer size.
     * Allowed values are 2-65536.
     * Field introduced in 22.1.3.
     * Unit is kb.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1024.
     * @param receiveWindow set the receiveWindow.
     */
    public void setReceiveWindow(Integer  receiveWindow) {
        this.receiveWindow = receiveWindow;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Sctp reset/shutdown guard timeout.
     * 0 means 5 times rto max.
     * Allowed values are 0-247483647.
     * Field introduced in 22.1.3.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return resetTimeout
     */
    public Integer getResetTimeout() {
        return resetTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Sctp reset/shutdown guard timeout.
     * 0 means 5 times rto max.
     * Allowed values are 0-247483647.
     * Field introduced in 22.1.3.
     * Unit is sec.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param resetTimeout set the resetTimeout.
     */
    public void setResetTimeout(Integer  resetTimeout) {
        this.resetTimeout = resetTimeout;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SCTPProxyProfile objSCTPProxyProfile = (SCTPProxyProfile) o;
      return   Objects.equals(this.numberOfStreams, objSCTPProxyProfile.numberOfStreams)&&
  Objects.equals(this.resetTimeout, objSCTPProxyProfile.resetTimeout)&&
  Objects.equals(this.receiveWindow, objSCTPProxyProfile.receiveWindow)&&
  Objects.equals(this.cookieExpirationTimeout, objSCTPProxyProfile.cookieExpirationTimeout)&&
  Objects.equals(this.heartbeatInterval, objSCTPProxyProfile.heartbeatInterval)&&
  Objects.equals(this.idleTimeout, objSCTPProxyProfile.idleTimeout)&&
  Objects.equals(this.maxRetransmissionsInitChunks, objSCTPProxyProfile.maxRetransmissionsInitChunks)&&
  Objects.equals(this.maxRetransmissionsAssociation, objSCTPProxyProfile.maxRetransmissionsAssociation);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SCTPProxyProfile {\n");
                  sb.append("    cookieExpirationTimeout: ").append(toIndentedString(cookieExpirationTimeout)).append("\n");
                        sb.append("    heartbeatInterval: ").append(toIndentedString(heartbeatInterval)).append("\n");
                        sb.append("    idleTimeout: ").append(toIndentedString(idleTimeout)).append("\n");
                        sb.append("    maxRetransmissionsAssociation: ").append(toIndentedString(maxRetransmissionsAssociation)).append("\n");
                        sb.append("    maxRetransmissionsInitChunks: ").append(toIndentedString(maxRetransmissionsInitChunks)).append("\n");
                        sb.append("    numberOfStreams: ").append(toIndentedString(numberOfStreams)).append("\n");
                        sb.append("    receiveWindow: ").append(toIndentedString(receiveWindow)).append("\n");
                        sb.append("    resetTimeout: ").append(toIndentedString(resetTimeout)).append("\n");
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
