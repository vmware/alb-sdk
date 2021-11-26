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
 * The RspContentRewriteRule is a POJO class extends AviRestResource that used for creating
 * RspContentRewriteRule.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RspContentRewriteRule  {
    @JsonProperty("enable")
    private Boolean enable = null;

    @JsonProperty("index")
    private Integer index = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("pairs")
    private List<SearchReplacePair> pairs = null;



    /**
     * This is the getter method this will return the attribute value.
     * Enable rewrite rule on response body.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * This is the setter method to the attribute.
     * Enable rewrite rule on response body.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param enable set the enable.
     */
    public void setEnable(Boolean  enable) {
        this.enable = enable;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Index of the response rewrite rule.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * This is the setter method to the attribute.
     * Index of the response rewrite rule.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param index set the index.
     */
    public void setIndex(Integer  index) {
        this.index = index;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the response rewrite rule.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the response rewrite rule.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of search-and-replace string pairs for the response body.
     * For eg.
     * Strings 'foo' and 'bar', where all searches of 'foo' in the response body will be replaced with 'bar'.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pairs
     */
    public List<SearchReplacePair> getPairs() {
        return pairs;
    }

    /**
     * This is the setter method. this will set the pairs
     * List of search-and-replace string pairs for the response body.
     * For eg.
     * Strings 'foo' and 'bar', where all searches of 'foo' in the response body will be replaced with 'bar'.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pairs
     */
    public void setPairs(List<SearchReplacePair>  pairs) {
        this.pairs = pairs;
    }

    /**
     * This is the setter method this will set the pairs
     * List of search-and-replace string pairs for the response body.
     * For eg.
     * Strings 'foo' and 'bar', where all searches of 'foo' in the response body will be replaced with 'bar'.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pairs
     */
    public RspContentRewriteRule addPairsItem(SearchReplacePair pairsItem) {
      if (this.pairs == null) {
        this.pairs = new ArrayList<SearchReplacePair>();
      }
      this.pairs.add(pairsItem);
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
      RspContentRewriteRule objRspContentRewriteRule = (RspContentRewriteRule) o;
      return   Objects.equals(this.name, objRspContentRewriteRule.name)&&
  Objects.equals(this.enable, objRspContentRewriteRule.enable)&&
  Objects.equals(this.index, objRspContentRewriteRule.index)&&
  Objects.equals(this.pairs, objRspContentRewriteRule.pairs);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RspContentRewriteRule {\n");
                  sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
                        sb.append("    index: ").append(toIndentedString(index)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    pairs: ").append(toIndentedString(pairs)).append("\n");
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
