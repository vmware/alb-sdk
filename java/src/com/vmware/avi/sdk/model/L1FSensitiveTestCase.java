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
 * The L1FSensitiveTestCase is a POJO class extends AviRestResource that used for creating
 * L1FSensitiveTestCase.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class L1FSensitiveTestCase  {
    @JsonProperty("sensitive_message")
    private L2FSensitiveTestCase sensitiveMessage;

    @JsonProperty("sensitive_messages")
    private List<L2FSensitiveTestCase> sensitiveMessages;

    @JsonProperty("sensitive_string")
    private String sensitiveString;



    /**
     * This is the getter method this will return the attribute value.
     * F_sensitive message for nested f_sensitive test cases-level2.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sensitiveMessage
     */
    public L2FSensitiveTestCase getSensitiveMessage() {
        return sensitiveMessage;
    }

    /**
     * This is the setter method to the attribute.
     * F_sensitive message for nested f_sensitive test cases-level2.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sensitiveMessage set the sensitiveMessage.
     */
    public void setSensitiveMessage(L2FSensitiveTestCase sensitiveMessage) {
        this.sensitiveMessage = sensitiveMessage;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Repeated f_sensitive_message for nested f_sensitive test cases-level2.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sensitiveMessages
     */
    public List<L2FSensitiveTestCase> getSensitiveMessages() {
        return sensitiveMessages;
    }

    /**
     * This is the setter method. this will set the sensitiveMessages
     * Repeated f_sensitive_message for nested f_sensitive test cases-level2.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sensitiveMessages
     */
    public void setSensitiveMessages(List<L2FSensitiveTestCase>  sensitiveMessages) {
        this.sensitiveMessages = sensitiveMessages;
    }

    /**
     * This is the setter method this will set the sensitiveMessages
     * Repeated f_sensitive_message for nested f_sensitive test cases-level2.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sensitiveMessages
     */
    public L1FSensitiveTestCase addSensitiveMessagesItem(L2FSensitiveTestCase sensitiveMessagesItem) {
      if (this.sensitiveMessages == null) {
        this.sensitiveMessages = new ArrayList<L2FSensitiveTestCase>();
      }
      this.sensitiveMessages.add(sensitiveMessagesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * F_sensitive string field for nested f_sensitive test cases-level1.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sensitiveString
     */
    public String getSensitiveString() {
        return sensitiveString;
    }

    /**
     * This is the setter method to the attribute.
     * F_sensitive string field for nested f_sensitive test cases-level1.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sensitiveString set the sensitiveString.
     */
    public void setSensitiveString(String  sensitiveString) {
        this.sensitiveString = sensitiveString;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      L1FSensitiveTestCase objL1FSensitiveTestCase = (L1FSensitiveTestCase) o;
      return   Objects.equals(this.sensitiveString, objL1FSensitiveTestCase.sensitiveString)&&
  Objects.equals(this.sensitiveMessage, objL1FSensitiveTestCase.sensitiveMessage)&&
  Objects.equals(this.sensitiveMessages, objL1FSensitiveTestCase.sensitiveMessages);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class L1FSensitiveTestCase {\n");
                  sb.append("    sensitiveMessage: ").append(toIndentedString(sensitiveMessage)).append("\n");
                        sb.append("    sensitiveMessages: ").append(toIndentedString(sensitiveMessages)).append("\n");
                        sb.append("    sensitiveString: ").append(toIndentedString(sensitiveString)).append("\n");
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
