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
 * The LeaderChangeInfo is a POJO class extends AviRestResource that used for creating
 * LeaderChangeInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LeaderChangeInfo  {
    @JsonProperty("enabled")
    private Boolean enabled = true;

    @JsonProperty("leader_candidates")
    private List<SiteInfo> leaderCandidates;

    @JsonProperty("leader_change_mode")
    private String leaderChangeMode = "GSLB_LC_MODE_MANUAL";

    @JsonProperty("max_unsuccessful_probes")
    private Integer maxUnsuccessfulProbes = 15;



    /**
     * This is the getter method this will return the attribute value.
     * Leader change mechanism can be disabled in the federation for administration purposes.
     * This would effectively disable gslb disaster recovery possibilities.
     * The best practice is to change the mode (auto to manual or vice-versa) rather than disabling the leader change mechanism.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This is the setter method to the attribute.
     * Leader change mechanism can be disabled in the federation for administration purposes.
     * This would effectively disable gslb disaster recovery possibilities.
     * The best practice is to change the mode (auto to manual or vice-versa) rather than disabling the leader change mechanism.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param enabled set the enabled.
     */
    public void setEnabled(Boolean  enabled) {
        this.enabled = enabled;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Sites that can be the future gslb leader in federation.
     * These sites should be enabled active follower sites.a site that is deactivated or passive or a third-party site cannot be a leader candidate.
     * Field introduced in 31.2.1.
     * Maximum of 1 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return leaderCandidates
     */
    public List<SiteInfo> getLeaderCandidates() {
        return leaderCandidates;
    }

    /**
     * This is the setter method. this will set the leaderCandidates
     * Sites that can be the future gslb leader in federation.
     * These sites should be enabled active follower sites.a site that is deactivated or passive or a third-party site cannot be a leader candidate.
     * Field introduced in 31.2.1.
     * Maximum of 1 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return leaderCandidates
     */
    public void setLeaderCandidates(List<SiteInfo>  leaderCandidates) {
        this.leaderCandidates = leaderCandidates;
    }

    /**
     * This is the setter method this will set the leaderCandidates
     * Sites that can be the future gslb leader in federation.
     * These sites should be enabled active follower sites.a site that is deactivated or passive or a third-party site cannot be a leader candidate.
     * Field introduced in 31.2.1.
     * Maximum of 1 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return leaderCandidates
     */
    public LeaderChangeInfo addLeaderCandidatesItem(SiteInfo leaderCandidatesItem) {
      if (this.leaderCandidates == null) {
        this.leaderCandidates = new ArrayList<SiteInfo>();
      }
      this.leaderCandidates.add(leaderCandidatesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Leader change mode, can be auto or manual.
     * Enum options - GSLB_LC_MODE_MANUAL, GSLB_LC_MODE_AUTO.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "GSLB_LC_MODE_MANUAL".
     * @return leaderChangeMode
     */
    public String getLeaderChangeMode() {
        return leaderChangeMode;
    }

    /**
     * This is the setter method to the attribute.
     * Leader change mode, can be auto or manual.
     * Enum options - GSLB_LC_MODE_MANUAL, GSLB_LC_MODE_AUTO.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "GSLB_LC_MODE_MANUAL".
     * @param leaderChangeMode set the leaderChangeMode.
     */
    public void setLeaderChangeMode(String  leaderChangeMode) {
        this.leaderChangeMode = leaderChangeMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of probe failures before considering other site as down for auto leader change.
     * Allowed values are 1-3600.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 15.
     * @return maxUnsuccessfulProbes
     */
    public Integer getMaxUnsuccessfulProbes() {
        return maxUnsuccessfulProbes;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of probe failures before considering other site as down for auto leader change.
     * Allowed values are 1-3600.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 15.
     * @param maxUnsuccessfulProbes set the maxUnsuccessfulProbes.
     */
    public void setMaxUnsuccessfulProbes(Integer  maxUnsuccessfulProbes) {
        this.maxUnsuccessfulProbes = maxUnsuccessfulProbes;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      LeaderChangeInfo objLeaderChangeInfo = (LeaderChangeInfo) o;
      return   Objects.equals(this.leaderCandidates, objLeaderChangeInfo.leaderCandidates)&&
  Objects.equals(this.leaderChangeMode, objLeaderChangeInfo.leaderChangeMode)&&
  Objects.equals(this.enabled, objLeaderChangeInfo.enabled)&&
  Objects.equals(this.maxUnsuccessfulProbes, objLeaderChangeInfo.maxUnsuccessfulProbes);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LeaderChangeInfo {\n");
                  sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
                        sb.append("    leaderCandidates: ").append(toIndentedString(leaderCandidates)).append("\n");
                        sb.append("    leaderChangeMode: ").append(toIndentedString(leaderChangeMode)).append("\n");
                        sb.append("    maxUnsuccessfulProbes: ").append(toIndentedString(maxUnsuccessfulProbes)).append("\n");
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
