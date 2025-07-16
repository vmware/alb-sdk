/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */

package com.vmware.avi.sdk.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The TechSupportParams is a POJO class extends AviRestResource that used for creating
 * TechSupportParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TechSupportParams extends AviRestResource  {
    @JsonProperty("case_number")
    private String caseNumber;

    @JsonProperty("description")
    private String description;

    @JsonProperty("duration")
    private String duration;

    @JsonProperty("event_params")
    private TechSupportEventParams eventParams;

    @JsonIgnore
    private String level;

    @JsonIgnore
    private String name;

    @JsonIgnore
    private String pattern;

    @JsonProperty("skip_warnings")
    private Boolean skipWarnings;

    @JsonIgnore
    private String slug;

    @JsonIgnore
    private String startTimestamp;

    @JsonProperty("tenant")
    private String tenant;

    @JsonIgnore
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * 'customer case number for which this tech-support is generated.
     * ''useful for connected portal and other use-cases.'.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return caseNumber
     */
    public String getCaseNumber() {
        return caseNumber;
    }

    /**
     * This is the setter method to the attribute.
     * 'customer case number for which this tech-support is generated.
     * ''useful for connected portal and other use-cases.'.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param caseNumber set the caseNumber.
     */
    public void setCaseNumber(String  caseNumber) {
        this.caseNumber = caseNumber;
    }

    /**
     * This is the getter method this will return the attribute value.
     * User provided description to capture additional details and context regarding the tech-support invocation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * User provided description to capture additional details and context regarding the tech-support invocation.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Collect events based on duration, specify one from choices [m, h, d, w].i.e.
     * Minutes, hours, days, weeks.
     * E.g.
     * 10m, 5h, 2d, 1we.g.
     * Show tech-support debuglogs duration 30m.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * This is the setter method to the attribute.
     * Collect events based on duration, specify one from choices [m, h, d, w].i.e.
     * Minutes, hours, days, weeks.
     * E.g.
     * 10m, 5h, 2d, 1we.g.
     * Show tech-support debuglogs duration 30m.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param duration set the duration.
     */
    public void setDuration(String  duration) {
        this.duration = duration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Specify this params to set threshold for all event files.user provided parameters will take precedence over the profile parameters.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return eventParams
     */
    public TechSupportEventParams getEventParams() {
        return eventParams;
    }

    /**
     * This is the setter method to the attribute.
     * Specify this params to set threshold for all event files.user provided parameters will take precedence over the profile parameters.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param eventParams set the eventParams.
     */
    public void setEventParams(TechSupportEventParams eventParams) {
        this.eventParams = eventParams;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tech-support collection level.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return level
     */
    public String getLevel() {
        return level;
    }

    /**
     * This is the setter method to the attribute.
     * Tech-support collection level.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param level set the level.
     */
    public void setLevel(String  level) {
        this.level = level;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the objects like service engine, vs, pool etc.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the objects like service engine, vs, pool etc.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Specify pattern to collect specific info in tech-support.user can specify error patterns to filter files based on pattern only.
     * This way will reduce unnecessary collection.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pattern
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * This is the setter method to the attribute.
     * Specify pattern to collect specific info in tech-support.user can specify error patterns to filter files based on pattern only.
     * This way will reduce unnecessary collection.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param pattern set the pattern.
     */
    public void setPattern(String  pattern) {
        this.pattern = pattern;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Use this flag for skippable warnings.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return skipWarnings
     */
    public Boolean getSkipWarnings() {
        return skipWarnings;
    }

    /**
     * This is the setter method to the attribute.
     * Use this flag for skippable warnings.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param skipWarnings set the skipWarnings.
     */
    public void setSkipWarnings(Boolean  skipWarnings) {
        this.skipWarnings = skipWarnings;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tech-support collection slug; typically uuid of a vs, gslb etc.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * This is the setter method to the attribute.
     * Tech-support collection slug; typically uuid of a vs, gslb etc.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param slug set the slug.
     */
    public void setSlug(String  slug) {
        this.slug = slug;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Start timestamp of tech-support collection.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return startTimestamp
     */
    public String getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * This is the setter method to the attribute.
     * Start timestamp of tech-support collection.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param startTimestamp set the startTimestamp.
     */
    public void setStartTimestamp(String  startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * X-avi-tenant of http post request for authentication.always admin for now, can be override in the future.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenant
     */
    public String getTenant() {
        return tenant;
    }

    /**
     * This is the setter method to the attribute.
     * X-avi-tenant of http post request for authentication.always admin for now, can be override in the future.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenant set the tenant.
     */
    public void setTenant(String  tenant) {
        this.tenant = tenant;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Techsupport uuid for rpc related requirements.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Techsupport uuid for rpc related requirements.
     * Field introduced in 18.2.3.
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
      TechSupportParams objTechSupportParams = (TechSupportParams) o;
      return   Objects.equals(this.uuid, objTechSupportParams.uuid)&&
  Objects.equals(this.level, objTechSupportParams.level)&&
  Objects.equals(this.slug, objTechSupportParams.slug)&&
  Objects.equals(this.startTimestamp, objTechSupportParams.startTimestamp)&&
  Objects.equals(this.caseNumber, objTechSupportParams.caseNumber)&&
  Objects.equals(this.duration, objTechSupportParams.duration)&&
  Objects.equals(this.description, objTechSupportParams.description)&&
  Objects.equals(this.skipWarnings, objTechSupportParams.skipWarnings)&&
  Objects.equals(this.pattern, objTechSupportParams.pattern)&&
  Objects.equals(this.eventParams, objTechSupportParams.eventParams)&&
  Objects.equals(this.name, objTechSupportParams.name)&&
  Objects.equals(this.tenant, objTechSupportParams.tenant);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class TechSupportParams {\n");
                  sb.append("    caseNumber: ").append(toIndentedString(caseNumber)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
                        sb.append("    eventParams: ").append(toIndentedString(eventParams)).append("\n");
                        sb.append("    level: ").append(toIndentedString(level)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
                        sb.append("    skipWarnings: ").append(toIndentedString(skipWarnings)).append("\n");
                        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
                        sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
                        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
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
