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
 * The LogMgrUberEventDetails is a POJO class extends AviRestResource that used for creating
 * LogMgrUberEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogMgrUberEventDetails  {
    @JsonProperty("x_enum")
    private String xEnum;

    @JsonProperty("x_float")
    private Float xFloat;

    @JsonProperty("x_hex")
    private Integer xHex;

    @JsonProperty("x_int")
    private Integer xInt;

    @JsonProperty("x_msg")
    private UberEnumMessage1 xMsg;

    @JsonProperty("x_rmsg")
    private List<UberEnumMessage1> xRmsg;

    @JsonProperty("x_str")
    private String xStr;

    @JsonProperty("x_x")
    private List<Integer> xX;



    /**
     * This is the getter method this will return the attribute value.
     * Enum options - X_ENUM_1, X_ENUM_2, X_ENUM_3, X_ENUM_4.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return xEnum
     */
    public String getXEnum() {
        return xEnum;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - X_ENUM_1, X_ENUM_2, X_ENUM_3, X_ENUM_4.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param xEnum set the xEnum.
     */
    public void setXEnum(String  xEnum) {
        this.xEnum = xEnum;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return xFloat
     */
    public Float getXFloat() {
        return xFloat;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param xFloat set the xFloat.
     */
    public void setXFloat(Float  xFloat) {
        this.xFloat = xFloat;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return xHex
     */
    public Integer getXHex() {
        return xHex;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param xHex set the xHex.
     */
    public void setXHex(Integer  xHex) {
        this.xHex = xHex;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return xInt
     */
    public Integer getXInt() {
        return xInt;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param xInt set the xInt.
     */
    public void setXInt(Integer  xInt) {
        this.xInt = xInt;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return xMsg
     */
    public UberEnumMessage1 getXMsg() {
        return xMsg;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param xMsg set the xMsg.
     */
    public void setXMsg(UberEnumMessage1 xMsg) {
        this.xMsg = xMsg;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return xRmsg
     */
    public List<UberEnumMessage1> getXRmsg() {
        return xRmsg;
    }

    /**
     * This is the setter method. this will set the xRmsg
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return xRmsg
     */
    public void setXRmsg(List<UberEnumMessage1>  xRmsg) {
        this.xRmsg = xRmsg;
    }

    /**
     * This is the setter method this will set the xRmsg
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return xRmsg
     */
    public LogMgrUberEventDetails addXRmsgItem(UberEnumMessage1 xRmsgItem) {
      if (this.xRmsg == null) {
        this.xRmsg = new ArrayList<UberEnumMessage1>();
      }
      this.xRmsg.add(xRmsgItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return xStr
     */
    public String getXStr() {
        return xStr;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param xStr set the xStr.
     */
    public void setXStr(String  xStr) {
        this.xStr = xStr;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return xX
     */
    public List<Integer> getXX() {
        return xX;
    }

    /**
     * This is the setter method. this will set the xX
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return xX
     */
    public void setXX(List<Integer>  xX) {
        this.xX = xX;
    }

    /**
     * This is the setter method this will set the xX
     * Field introduced in 30.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return xX
     */
    public LogMgrUberEventDetails addXXItem(Integer xXItem) {
      if (this.xX == null) {
        this.xX = new ArrayList<Integer>();
      }
      this.xX.add(xXItem);
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
      LogMgrUberEventDetails objLogMgrUberEventDetails = (LogMgrUberEventDetails) o;
      return   Objects.equals(this.xStr, objLogMgrUberEventDetails.xStr)&&
  Objects.equals(this.xInt, objLogMgrUberEventDetails.xInt)&&
  Objects.equals(this.xHex, objLogMgrUberEventDetails.xHex)&&
  Objects.equals(this.xFloat, objLogMgrUberEventDetails.xFloat)&&
  Objects.equals(this.xEnum, objLogMgrUberEventDetails.xEnum)&&
  Objects.equals(this.xX, objLogMgrUberEventDetails.xX)&&
  Objects.equals(this.xMsg, objLogMgrUberEventDetails.xMsg)&&
  Objects.equals(this.xRmsg, objLogMgrUberEventDetails.xRmsg);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LogMgrUberEventDetails {\n");
                  sb.append("    xEnum: ").append(toIndentedString(xEnum)).append("\n");
                        sb.append("    xFloat: ").append(toIndentedString(xFloat)).append("\n");
                        sb.append("    xHex: ").append(toIndentedString(xHex)).append("\n");
                        sb.append("    xInt: ").append(toIndentedString(xInt)).append("\n");
                        sb.append("    xMsg: ").append(toIndentedString(xMsg)).append("\n");
                        sb.append("    xRmsg: ").append(toIndentedString(xRmsg)).append("\n");
                        sb.append("    xStr: ").append(toIndentedString(xStr)).append("\n");
                        sb.append("    xX: ").append(toIndentedString(xX)).append("\n");
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
