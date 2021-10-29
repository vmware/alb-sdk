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
 * The BotMappingRuleMatchTarget is a POJO class extends AviRestResource that used for creating
 * BotMappingRuleMatchTarget.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BotMappingRuleMatchTarget  {
    @JsonProperty("class_matcher")
    private BotClassMatcher classMatcher = null;

    @JsonProperty("client_ip")
    private IpAddrMatch clientIp = null;

    @JsonProperty("component_matcher")
    private String componentMatcher = null;

    @JsonProperty("hdrs")
    private List<HdrMatch> hdrs = null;

    @JsonProperty("host_hdr")
    private HostHdrMatch hostHdr = null;

    @JsonProperty("identifier_matcher")
    private StringMatch identifierMatcher = null;

    @JsonProperty("method")
    private MethodMatch method = null;

    @JsonProperty("path")
    private PathMatch path = null;

    @JsonProperty("type_matcher")
    private BotTypeMatcher typeMatcher = null;



    /**
     * This is the getter method this will return the attribute value.
     * How to match the botclientclass.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return classMatcher
     */
    public BotClassMatcher getClassMatcher() {
        return classMatcher;
    }

    /**
     * This is the setter method to the attribute.
     * How to match the botclientclass.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param classMatcher set the classMatcher.
     */
    public void setClassMatcher(BotClassMatcher classMatcher) {
        this.classMatcher = classMatcher;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure client ip addresses.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientIp
     */
    public IpAddrMatch getClientIp() {
        return clientIp;
    }

    /**
     * This is the setter method to the attribute.
     * Configure client ip addresses.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientIp set the clientIp.
     */
    public void setClientIp(IpAddrMatch clientIp) {
        this.clientIp = clientIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The component for which this mapping is used.
     * Enum options - BOT_DECIDER_CONSOLIDATION, BOT_DECIDER_USER_AGENT, BOT_DECIDER_IP_REPUTATION, BOT_DECIDER_IP_NETWORK_LOCATION.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return componentMatcher
     */
    public String getComponentMatcher() {
        return componentMatcher;
    }

    /**
     * This is the setter method to the attribute.
     * The component for which this mapping is used.
     * Enum options - BOT_DECIDER_CONSOLIDATION, BOT_DECIDER_USER_AGENT, BOT_DECIDER_IP_REPUTATION, BOT_DECIDER_IP_NETWORK_LOCATION.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param componentMatcher set the componentMatcher.
     */
    public void setComponentMatcher(String  componentMatcher) {
        this.componentMatcher = componentMatcher;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Configure http header(s).
     * All configured headers must match.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hdrs
     */
    public List<HdrMatch> getHdrs() {
        return hdrs;
    }

    /**
     * This is the setter method. this will set the hdrs
     * Configure http header(s).
     * All configured headers must match.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hdrs
     */
    public void setHdrs(List<HdrMatch>  hdrs) {
        this.hdrs = hdrs;
    }

    /**
     * This is the setter method this will set the hdrs
     * Configure http header(s).
     * All configured headers must match.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hdrs
     */
    public BotMappingRuleMatchTarget addHdrsItem(HdrMatch hdrsItem) {
      if (this.hdrs == null) {
        this.hdrs = new ArrayList<HdrMatch>();
      }
      this.hdrs.add(hdrsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure the host header.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hostHdr
     */
    public HostHdrMatch getHostHdr() {
        return hostHdr;
    }

    /**
     * This is the setter method to the attribute.
     * Configure the host header.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hostHdr set the hostHdr.
     */
    public void setHostHdr(HostHdrMatch hostHdr) {
        this.hostHdr = hostHdr;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The list of bot identifier names and how they're matched.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return identifierMatcher
     */
    public StringMatch getIdentifierMatcher() {
        return identifierMatcher;
    }

    /**
     * This is the setter method to the attribute.
     * The list of bot identifier names and how they're matched.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param identifierMatcher set the identifierMatcher.
     */
    public void setIdentifierMatcher(StringMatch identifierMatcher) {
        this.identifierMatcher = identifierMatcher;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure http methods.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return method
     */
    public MethodMatch getMethod() {
        return method;
    }

    /**
     * This is the setter method to the attribute.
     * Configure http methods.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param method set the method.
     */
    public void setMethod(MethodMatch method) {
        this.method = method;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure request paths.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return path
     */
    public PathMatch getPath() {
        return path;
    }

    /**
     * This is the setter method to the attribute.
     * Configure request paths.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param path set the path.
     */
    public void setPath(PathMatch path) {
        this.path = path;
    }

    /**
     * This is the getter method this will return the attribute value.
     * How to match the botclienttype.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return typeMatcher
     */
    public BotTypeMatcher getTypeMatcher() {
        return typeMatcher;
    }

    /**
     * This is the setter method to the attribute.
     * How to match the botclienttype.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param typeMatcher set the typeMatcher.
     */
    public void setTypeMatcher(BotTypeMatcher typeMatcher) {
        this.typeMatcher = typeMatcher;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      BotMappingRuleMatchTarget objBotMappingRuleMatchTarget = (BotMappingRuleMatchTarget) o;
      return   Objects.equals(this.componentMatcher, objBotMappingRuleMatchTarget.componentMatcher)&&
  Objects.equals(this.classMatcher, objBotMappingRuleMatchTarget.classMatcher)&&
  Objects.equals(this.typeMatcher, objBotMappingRuleMatchTarget.typeMatcher)&&
  Objects.equals(this.identifierMatcher, objBotMappingRuleMatchTarget.identifierMatcher)&&
  Objects.equals(this.clientIp, objBotMappingRuleMatchTarget.clientIp)&&
  Objects.equals(this.method, objBotMappingRuleMatchTarget.method)&&
  Objects.equals(this.path, objBotMappingRuleMatchTarget.path)&&
  Objects.equals(this.hdrs, objBotMappingRuleMatchTarget.hdrs)&&
  Objects.equals(this.hostHdr, objBotMappingRuleMatchTarget.hostHdr);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BotMappingRuleMatchTarget {\n");
                  sb.append("    classMatcher: ").append(toIndentedString(classMatcher)).append("\n");
                        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
                        sb.append("    componentMatcher: ").append(toIndentedString(componentMatcher)).append("\n");
                        sb.append("    hdrs: ").append(toIndentedString(hdrs)).append("\n");
                        sb.append("    hostHdr: ").append(toIndentedString(hostHdr)).append("\n");
                        sb.append("    identifierMatcher: ").append(toIndentedString(identifierMatcher)).append("\n");
                        sb.append("    method: ").append(toIndentedString(method)).append("\n");
                        sb.append("    path: ").append(toIndentedString(path)).append("\n");
                        sb.append("    typeMatcher: ").append(toIndentedString(typeMatcher)).append("\n");
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
