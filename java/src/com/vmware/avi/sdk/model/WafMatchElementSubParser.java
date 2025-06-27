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
 * The WafMatchElementSubParser is a POJO class extends AviRestResource that used for creating
 * WafMatchElementSubParser.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WafMatchElementSubParser  {
    @JsonProperty("index")
    private Integer index;

    @JsonProperty("match_case")
    private String matchCase = "SENSITIVE";

    @JsonProperty("match_element")
    private String matchElement;

    @JsonProperty("match_op")
    private String matchOp = "EQUALS";

    @JsonProperty("sub_parser")
    private String subParser = "WAF_REQUEST_PARSER_AUTO_DETECT";



    /**
     * This is the getter method this will return the attribute value.
     * Determine the order of the rules.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * This is the setter method to the attribute.
     * Determine the order of the rules.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param index set the index.
     */
    public void setIndex(Integer  index) {
        this.index = index;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Case sensitivity to use for the matching.
     * Enum options - SENSITIVE, INSENSITIVE.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SENSITIVE".
     * @return matchCase
     */
    public String getMatchCase() {
        return matchCase;
    }

    /**
     * This is the setter method to the attribute.
     * Case sensitivity to use for the matching.
     * Enum options - SENSITIVE, INSENSITIVE.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SENSITIVE".
     * @param matchCase set the matchCase.
     */
    public void setMatchCase(String  matchCase) {
        this.matchCase = matchCase;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The match element for which a subparser can be specified.
     * Allowed values are of the form 'args name' where name can be any string or a regular expression.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return matchElement
     */
    public String getMatchElement() {
        return matchElement;
    }

    /**
     * This is the setter method to the attribute.
     * The match element for which a subparser can be specified.
     * Allowed values are of the form 'args name' where name can be any string or a regular expression.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param matchElement set the matchElement.
     */
    public void setMatchElement(String  matchElement) {
        this.matchElement = matchElement;
    }

    /**
     * This is the getter method this will return the attribute value.
     * String operation to use for matching the match element name.
     * Allowed values are equals and regex_match.
     * Enum options - BEGINS_WITH, DOES_NOT_BEGIN_WITH, CONTAINS, DOES_NOT_CONTAIN, ENDS_WITH, DOES_NOT_END_WITH, EQUALS, DOES_NOT_EQUAL, REGEX_MATCH,
     * REGEX_DOES_NOT_MATCH.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "EQUALS".
     * @return matchOp
     */
    public String getMatchOp() {
        return matchOp;
    }

    /**
     * This is the setter method to the attribute.
     * String operation to use for matching the match element name.
     * Allowed values are equals and regex_match.
     * Enum options - BEGINS_WITH, DOES_NOT_BEGIN_WITH, CONTAINS, DOES_NOT_CONTAIN, ENDS_WITH, DOES_NOT_END_WITH, EQUALS, DOES_NOT_EQUAL, REGEX_MATCH,
     * REGEX_DOES_NOT_MATCH.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "EQUALS".
     * @param matchOp set the matchOp.
     */
    public void setMatchOp(String  matchOp) {
        this.matchOp = matchOp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Select the parser for this element.
     * Allowed values are json, xml and auto_detect.
     * Enum options - WAF_REQUEST_PARSER_URLENCODED, WAF_REQUEST_PARSER_MULTIPART, WAF_REQUEST_PARSER_JSON, WAF_REQUEST_PARSER_XML,
     * WAF_REQUEST_PARSER_HANDLE_AS_STRING, WAF_REQUEST_PARSER_DO_NOT_PARSE, WAF_REQUEST_PARSER_AUTO_DETECT.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "WAF_REQUEST_PARSER_AUTO_DETECT".
     * @return subParser
     */
    public String getSubParser() {
        return subParser;
    }

    /**
     * This is the setter method to the attribute.
     * Select the parser for this element.
     * Allowed values are json, xml and auto_detect.
     * Enum options - WAF_REQUEST_PARSER_URLENCODED, WAF_REQUEST_PARSER_MULTIPART, WAF_REQUEST_PARSER_JSON, WAF_REQUEST_PARSER_XML,
     * WAF_REQUEST_PARSER_HANDLE_AS_STRING, WAF_REQUEST_PARSER_DO_NOT_PARSE, WAF_REQUEST_PARSER_AUTO_DETECT.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "WAF_REQUEST_PARSER_AUTO_DETECT".
     * @param subParser set the subParser.
     */
    public void setSubParser(String  subParser) {
        this.subParser = subParser;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      WafMatchElementSubParser objWafMatchElementSubParser = (WafMatchElementSubParser) o;
      return   Objects.equals(this.index, objWafMatchElementSubParser.index)&&
  Objects.equals(this.matchElement, objWafMatchElementSubParser.matchElement)&&
  Objects.equals(this.matchOp, objWafMatchElementSubParser.matchOp)&&
  Objects.equals(this.matchCase, objWafMatchElementSubParser.matchCase)&&
  Objects.equals(this.subParser, objWafMatchElementSubParser.subParser);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WafMatchElementSubParser {\n");
                  sb.append("    index: ").append(toIndentedString(index)).append("\n");
                        sb.append("    matchCase: ").append(toIndentedString(matchCase)).append("\n");
                        sb.append("    matchElement: ").append(toIndentedString(matchElement)).append("\n");
                        sb.append("    matchOp: ").append(toIndentedString(matchOp)).append("\n");
                        sb.append("    subParser: ").append(toIndentedString(subParser)).append("\n");
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
