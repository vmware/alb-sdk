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
 * The Tier1LogicalRouterInfo is a POJO class extends AviRestResource that used for creating
 * Tier1LogicalRouterInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tier1LogicalRouterInfo  {
    @JsonProperty("locale_service")
    private String localeService = null;

    @JsonProperty("segment_id")
    private String segmentId = null;

    @JsonProperty("tier1_lr_id")
    private String tier1LrId = null;



    /**
     * This is the getter method this will return the attribute value.
     * Locale-services configuration, holds t1 edge-cluster information.
     * When virtualservice is enabled with preserve client ip, serviceinsertion virtualendpoint will be created in this locale-service.
     * By default avi controller picks default locale-service on t1.
     * If more than one locale-services are present, this will be used for resolving the same.
     * Example locale-service path - /infra/tier-1s/london_tier1gateway1/locale-services/london_tier1localservices-1.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return localeService
     */
    public String getLocaleService() {
        return localeService;
    }

    /**
     * This is the setter method to the attribute.
     * Locale-services configuration, holds t1 edge-cluster information.
     * When virtualservice is enabled with preserve client ip, serviceinsertion virtualendpoint will be created in this locale-service.
     * By default avi controller picks default locale-service on t1.
     * If more than one locale-services are present, this will be used for resolving the same.
     * Example locale-service path - /infra/tier-1s/london_tier1gateway1/locale-services/london_tier1localservices-1.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param localeService set the localeService.
     */
    public void setLocaleService(String  localeService) {
        this.localeService = localeService;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Overlay segment path.
     * Example- /infra/segments/seg-web-t1-01.
     * Field introduced in 20.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return segmentId
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * This is the setter method to the attribute.
     * Overlay segment path.
     * Example- /infra/segments/seg-web-t1-01.
     * Field introduced in 20.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param segmentId set the segmentId.
     */
    public void setSegmentId(String  segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tier1 logical router path.
     * Example- /infra/tier-1s/t1-01.
     * Field introduced in 20.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tier1LrId
     */
    public String getTier1LrId() {
        return tier1LrId;
    }

    /**
     * This is the setter method to the attribute.
     * Tier1 logical router path.
     * Example- /infra/tier-1s/t1-01.
     * Field introduced in 20.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tier1LrId set the tier1LrId.
     */
    public void setTier1LrId(String  tier1LrId) {
        this.tier1LrId = tier1LrId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      Tier1LogicalRouterInfo objTier1LogicalRouterInfo = (Tier1LogicalRouterInfo) o;
      return   Objects.equals(this.tier1LrId, objTier1LogicalRouterInfo.tier1LrId)&&
  Objects.equals(this.segmentId, objTier1LogicalRouterInfo.segmentId)&&
  Objects.equals(this.localeService, objTier1LogicalRouterInfo.localeService);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class Tier1LogicalRouterInfo {\n");
                  sb.append("    localeService: ").append(toIndentedString(localeService)).append("\n");
                        sb.append("    segmentId: ").append(toIndentedString(segmentId)).append("\n");
                        sb.append("    tier1LrId: ").append(toIndentedString(tier1LrId)).append("\n");
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
