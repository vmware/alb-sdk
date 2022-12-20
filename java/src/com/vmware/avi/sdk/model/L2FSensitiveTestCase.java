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
 * The L2FSensitiveTestCase is a POJO class extends AviRestResource that used for creating
 * L2FSensitiveTestCase.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class L2FSensitiveTestCase  {
    @JsonProperty("sensitive_message")
    private SingleOptionalSensitiveFieldMessage sensitiveMessage = null;

    @JsonProperty("sensitive_messages")
    private List<SingleOptionalSensitiveFieldMessage> sensitiveMessages = null;

    @JsonProperty("sensitive_string")
    private String sensitiveString = null;



    /**
     * This is the getter method this will return the attribute value.
     * F_sensitive message for nested f_sensitive test cases-level3.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sensitiveMessage
     */
    public SingleOptionalSensitiveFieldMessage getSensitiveMessage() {
        return sensitiveMessage;
    }

    /**
     * This is the setter method to the attribute.
     * F_sensitive message for nested f_sensitive test cases-level3.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sensitiveMessage set the sensitiveMessage.
     */
    public void setSensitiveMessage(SingleOptionalSensitiveFieldMessage sensitiveMessage) {
        this.sensitiveMessage = sensitiveMessage;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Repeated f_sensitive_message for nested f_sensitive test cases-level3.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sensitiveMessages
     */
    public List<SingleOptionalSensitiveFieldMessage> getSensitiveMessages() {
        return sensitiveMessages;
    }

    /**
     * This is the setter method. this will set the sensitiveMessages
     * Repeated f_sensitive_message for nested f_sensitive test cases-level3.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sensitiveMessages
     */
    public void setSensitiveMessages(List<SingleOptionalSensitiveFieldMessage>  sensitiveMessages) {
        this.sensitiveMessages = sensitiveMessages;
    }

    /**
     * This is the setter method this will set the sensitiveMessages
     * Repeated f_sensitive_message for nested f_sensitive test cases-level3.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sensitiveMessages
     */
    public L2FSensitiveTestCase addSensitiveMessagesItem(SingleOptionalSensitiveFieldMessage sensitiveMessagesItem) {
      if (this.sensitiveMessages == null) {
        this.sensitiveMessages = new ArrayList<SingleOptionalSensitiveFieldMessage>();
      }
      this.sensitiveMessages.add(sensitiveMessagesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * F_sensitive string field for nested f_sensitive test cases-level2.
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
     * F_sensitive string field for nested f_sensitive test cases-level2.
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
      L2FSensitiveTestCase objL2FSensitiveTestCase = (L2FSensitiveTestCase) o;
      return   Objects.equals(this.sensitiveString, objL2FSensitiveTestCase.sensitiveString)&&
  Objects.equals(this.sensitiveMessage, objL2FSensitiveTestCase.sensitiveMessage)&&
  Objects.equals(this.sensitiveMessages, objL2FSensitiveTestCase.sensitiveMessages);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class L2FSensitiveTestCase {\n");
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
