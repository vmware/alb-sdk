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
 * The DiscriminatorDescription is a POJO class extends AviRestResource that used for creating
 * DiscriminatorDescription.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DiscriminatorDescription  {
    @JsonProperty("mapping")
    private List<DiscriminatorMapping> mapping;

    @JsonProperty("property_name")
    private String propertyName;


    /**
     * This is the getter method this will return the attribute value.
     * Mapping of discriminator values to their corresponding schema descriptions.
     * Field introduced in 32.2.1.
     * Maximum of 32 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mapping
     */
    public List<DiscriminatorMapping> getMapping() {
        return mapping;
    }

    /**
     * This is the setter method. this will set the mapping
     * Mapping of discriminator values to their corresponding schema descriptions.
     * Field introduced in 32.2.1.
     * Maximum of 32 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mapping
     */
    public void setMapping(List<DiscriminatorMapping>  mapping) {
        this.mapping = mapping;
    }

    /**
     * This is the setter method this will set the mapping
     * Mapping of discriminator values to their corresponding schema descriptions.
     * Field introduced in 32.2.1.
     * Maximum of 32 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mapping
     */
    public DiscriminatorDescription addMappingItem(DiscriminatorMapping mappingItem) {
      if (this.mapping == null) {
        this.mapping = new ArrayList<DiscriminatorMapping>();
      }
      this.mapping.add(mappingItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Property name of the discriminator.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return propertyName
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * This is the setter method to the attribute.
     * Property name of the discriminator.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param propertyName set the propertyName.
     */
    public void setPropertyName(String  propertyName) {
        this.propertyName = propertyName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DiscriminatorDescription objDiscriminatorDescription = (DiscriminatorDescription) o;
      return   Objects.equals(this.propertyName, objDiscriminatorDescription.propertyName)&&
  Objects.equals(this.mapping, objDiscriminatorDescription.mapping);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DiscriminatorDescription {\n");
                  sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
                        sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
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
