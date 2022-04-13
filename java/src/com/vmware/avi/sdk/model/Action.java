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
 * The Action is a POJO class extends AviRestResource that used for creating
 * Action.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Action  {
    @JsonProperty("data")
    private String data = null;

    @JsonProperty("url_ref")
    private String urlRef = null;



    /**
     * This is the getter method this will return the attribute value.
     * A description of the change to this object.
     * This field is opaque to the caller, it should not be interpreted or modified.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return data
     */
    public String getData() {
        return data;
    }

    /**
     * This is the setter method to the attribute.
     * A description of the change to this object.
     * This field is opaque to the caller, it should not be interpreted or modified.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param data set the data.
     */
    public void setData(String  data) {
        this.data = data;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The referenced object on which this action will be applied.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return urlRef
     */
    public String getUrlRef() {
        return urlRef;
    }

    /**
     * This is the setter method to the attribute.
     * The referenced object on which this action will be applied.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param urlRef set the urlRef.
     */
    public void setUrlRef(String  urlRef) {
        this.urlRef = urlRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      Action objAction = (Action) o;
      return   Objects.equals(this.urlRef, objAction.urlRef)&&
  Objects.equals(this.data, objAction.data);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class Action {\n");
                  sb.append("    data: ").append(toIndentedString(data)).append("\n");
                        sb.append("    urlRef: ").append(toIndentedString(urlRef)).append("\n");
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
