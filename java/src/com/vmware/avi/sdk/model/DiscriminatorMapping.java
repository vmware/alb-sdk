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
 * The DiscriminatorMapping is a POJO class extends AviRestResource that used for creating
 * DiscriminatorMapping.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DiscriminatorMapping  {
    @JsonProperty("discriminator_key")
    private String discriminatorKey;

    @JsonProperty("schema_ref")
    private String schemaRef;



    /**
     * This is the getter method this will return the attribute value.
     * Discriminator property value that maps to the referenced schema.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return discriminatorKey
     */
    public String getDiscriminatorKey() {
        return discriminatorKey;
    }

    /**
     * This is the setter method to the attribute.
     * Discriminator property value that maps to the referenced schema.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param discriminatorKey set the discriminatorKey.
     */
    public void setDiscriminatorKey(String  discriminatorKey) {
        this.discriminatorKey = discriminatorKey;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reference to the schema to which the discriminator value maps.
     * It is a reference to an object of type apischema.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return schemaRef
     */
    public String getSchemaRef() {
        return schemaRef;
    }

    /**
     * This is the setter method to the attribute.
     * Reference to the schema to which the discriminator value maps.
     * It is a reference to an object of type apischema.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param schemaRef set the schemaRef.
     */
    public void setSchemaRef(String  schemaRef) {
        this.schemaRef = schemaRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DiscriminatorMapping objDiscriminatorMapping = (DiscriminatorMapping) o;
      return   Objects.equals(this.discriminatorKey, objDiscriminatorMapping.discriminatorKey)&&
  Objects.equals(this.schemaRef, objDiscriminatorMapping.schemaRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DiscriminatorMapping {\n");
                  sb.append("    discriminatorKey: ").append(toIndentedString(discriminatorKey)).append("\n");
                        sb.append("    schemaRef: ").append(toIndentedString(schemaRef)).append("\n");
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
