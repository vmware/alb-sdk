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
 * The BotMappingRule is a POJO class extends AviRestResource that used for creating
 * BotMappingRule.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BotMappingRule  {
    @JsonProperty("classification")
    private BotClassification classification;

    @JsonProperty("index")
    private Integer index;

    @JsonProperty("match")
    private BotMappingRuleMatchTarget match;

    @JsonProperty("name")
    private String name;



    /**
     * This is the getter method this will return the attribute value.
     * The assigned classification for this client.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return classification
     */
    public BotClassification getClassification() {
        return classification;
    }

    /**
     * This is the setter method to the attribute.
     * The assigned classification for this client.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param classification set the classification.
     */
    public void setClassification(BotClassification classification) {
        this.classification = classification;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Rules are processed in order of this index field.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * This is the setter method to the attribute.
     * Rules are processed in order of this index field.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param index set the index.
     */
    public void setIndex(Integer  index) {
        this.index = index;
    }

    /**
     * This is the getter method this will return the attribute value.
     * How to match the request  all the specified properties must be fulfilled.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return match
     */
    public BotMappingRuleMatchTarget getMatch() {
        return match;
    }

    /**
     * This is the setter method to the attribute.
     * How to match the request  all the specified properties must be fulfilled.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param match set the match.
     */
    public void setMatch(BotMappingRuleMatchTarget match) {
        this.match = match;
    }

    /**
     * This is the getter method this will return the attribute value.
     * A name describing the rule in a short form.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * A name describing the rule in a short form.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      BotMappingRule objBotMappingRule = (BotMappingRule) o;
      return   Objects.equals(this.index, objBotMappingRule.index)&&
  Objects.equals(this.name, objBotMappingRule.name)&&
  Objects.equals(this.classification, objBotMappingRule.classification)&&
  Objects.equals(this.match, objBotMappingRule.match);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BotMappingRule {\n");
                  sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
                        sb.append("    index: ").append(toIndentedString(index)).append("\n");
                        sb.append("    match: ").append(toIndentedString(match)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
