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
 * The L1StringLengthTestCase is a POJO class extends AviRestResource that used for creating
 * L1StringLengthTestCase.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class L1StringLengthTestCase  {
    @JsonProperty("string_length_message")
    private L2StringLengthTestCase stringLengthMessage = null;

    @JsonProperty("string_length_messages")
    private List<L2StringLengthTestCase> stringLengthMessages = null;

    @JsonProperty("test_string")
    private String testString = null;

    @JsonProperty("test_strings")
    private List<String> testStrings = null;



    /**
     * This is the getter method this will return the attribute value.
     * String length message for nested string length test cases.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return stringLengthMessage
     */
    public L2StringLengthTestCase getStringLengthMessage() {
        return stringLengthMessage;
    }

    /**
     * This is the setter method to the attribute.
     * String length message for nested string length test cases.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param stringLengthMessage set the stringLengthMessage.
     */
    public void setStringLengthMessage(L2StringLengthTestCase stringLengthMessage) {
        this.stringLengthMessage = stringLengthMessage;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Repeated string length message for nested string length test cases.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return stringLengthMessages
     */
    public List<L2StringLengthTestCase> getStringLengthMessages() {
        return stringLengthMessages;
    }

    /**
     * This is the setter method. this will set the stringLengthMessages
     * Repeated string length message for nested string length test cases.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return stringLengthMessages
     */
    public void setStringLengthMessages(List<L2StringLengthTestCase>  stringLengthMessages) {
        this.stringLengthMessages = stringLengthMessages;
    }

    /**
     * This is the setter method this will set the stringLengthMessages
     * Repeated string length message for nested string length test cases.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return stringLengthMessages
     */
    public L1StringLengthTestCase addStringLengthMessagesItem(L2StringLengthTestCase stringLengthMessagesItem) {
      if (this.stringLengthMessages == null) {
        this.stringLengthMessages = new ArrayList<L2StringLengthTestCase>();
      }
      this.stringLengthMessages.add(stringLengthMessagesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * String field for nested string length test cases.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return testString
     */
    public String getTestString() {
        return testString;
    }

    /**
     * This is the setter method to the attribute.
     * String field for nested string length test cases.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param testString set the testString.
     */
    public void setTestString(String  testString) {
        this.testString = testString;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Repeated field for nested string length test cases.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return testStrings
     */
    public List<String> getTestStrings() {
        return testStrings;
    }

    /**
     * This is the setter method. this will set the testStrings
     * Repeated field for nested string length test cases.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return testStrings
     */
    public void setTestStrings(List<String>  testStrings) {
        this.testStrings = testStrings;
    }

    /**
     * This is the setter method this will set the testStrings
     * Repeated field for nested string length test cases.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return testStrings
     */
    public L1StringLengthTestCase addTestStringsItem(String testStringsItem) {
      if (this.testStrings == null) {
        this.testStrings = new ArrayList<String>();
      }
      this.testStrings.add(testStringsItem);
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
      L1StringLengthTestCase objL1StringLengthTestCase = (L1StringLengthTestCase) o;
      return   Objects.equals(this.testString, objL1StringLengthTestCase.testString)&&
  Objects.equals(this.testStrings, objL1StringLengthTestCase.testStrings)&&
  Objects.equals(this.stringLengthMessage, objL1StringLengthTestCase.stringLengthMessage)&&
  Objects.equals(this.stringLengthMessages, objL1StringLengthTestCase.stringLengthMessages);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class L1StringLengthTestCase {\n");
                  sb.append("    stringLengthMessage: ").append(toIndentedString(stringLengthMessage)).append("\n");
                        sb.append("    stringLengthMessages: ").append(toIndentedString(stringLengthMessages)).append("\n");
                        sb.append("    testString: ").append(toIndentedString(testString)).append("\n");
                        sb.append("    testStrings: ").append(toIndentedString(testStrings)).append("\n");
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
