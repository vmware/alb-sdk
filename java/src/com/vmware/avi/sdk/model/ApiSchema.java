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
 * The ApiSchema is a POJO class extends AviRestResource that used for creating
 * ApiSchema.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiSchema extends AviRestResource  {
    @JsonProperty("additional_object_key_action")
    private String additionalObjectKeyAction = "API_ACTION_INHERIT_FROM_API_POLICY";

    @JsonProperty("additional_properties_schema")
    private ApiSimpleSchemaDescription additionalPropertiesSchema;

    @JsonProperty("allow_additional_properties")
    private Boolean allowAdditionalProperties;

    @JsonProperty("array_item_type")
    private ApiSimpleSchemaDescription arrayItemType;

    @JsonProperty("composite_types")
    private List<ApiSimpleSchemaDescription> compositeTypes;

    @JsonProperty("description")
    private String description;

    @JsonProperty("discriminator")
    private DiscriminatorDescription discriminator;

    @JsonProperty("max_items")
    private Integer maxItems;

    @JsonProperty("min_items")
    private Integer minItems;

    @JsonProperty("name")
    private String name;

    @JsonProperty("object_properties")
    private List<ApiObjectProperties> objectProperties;

    @JsonProperty("source")
    private String source;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("type")
    private String type;

    @JsonProperty("unique_items")
    private Boolean uniqueItems;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Action to take on unspecified keys in an object.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_INHERIT_FROM_API_POLICY".
     * @return additionalObjectKeyAction
     */
    public String getAdditionalObjectKeyAction() {
        return additionalObjectKeyAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action to take on unspecified keys in an object.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_INHERIT_FROM_API_POLICY".
     * @param additionalObjectKeyAction set the additionalObjectKeyAction.
     */
    public void setAdditionalObjectKeyAction(String  additionalObjectKeyAction) {
        this.additionalObjectKeyAction = additionalObjectKeyAction;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Schema for the additional properties.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return additionalPropertiesSchema
     */
    public ApiSimpleSchemaDescription getAdditionalPropertiesSchema() {
        return additionalPropertiesSchema;
    }

    /**
     * This is the setter method to the attribute.
     * Schema for the additional properties.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param additionalPropertiesSchema set the additionalPropertiesSchema.
     */
    public void setAdditionalPropertiesSchema(ApiSimpleSchemaDescription additionalPropertiesSchema) {
        this.additionalPropertiesSchema = additionalPropertiesSchema;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Whether this schema allows additional properties.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return allowAdditionalProperties
     */
    public Boolean getAllowAdditionalProperties() {
        return allowAdditionalProperties;
    }

    /**
     * This is the setter method to the attribute.
     * Whether this schema allows additional properties.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param allowAdditionalProperties set the allowAdditionalProperties.
     */
    public void setAllowAdditionalProperties(Boolean  allowAdditionalProperties) {
        this.allowAdditionalProperties = allowAdditionalProperties;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If the type is array, this is the type of the array items.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return arrayItemType
     */
    public ApiSimpleSchemaDescription getArrayItemType() {
        return arrayItemType;
    }

    /**
     * This is the setter method to the attribute.
     * If the type is array, this is the type of the array items.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param arrayItemType set the arrayItemType.
     */
    public void setArrayItemType(ApiSimpleSchemaDescription arrayItemType) {
        this.arrayItemType = arrayItemType;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of types that are part of the oneof, any_of or all_of.
     * Field introduced in 32.2.1.
     * Maximum of 32 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return compositeTypes
     */
    public List<ApiSimpleSchemaDescription> getCompositeTypes() {
        return compositeTypes;
    }

    /**
     * This is the setter method. this will set the compositeTypes
     * List of types that are part of the oneof, any_of or all_of.
     * Field introduced in 32.2.1.
     * Maximum of 32 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return compositeTypes
     */
    public void setCompositeTypes(List<ApiSimpleSchemaDescription>  compositeTypes) {
        this.compositeTypes = compositeTypes;
    }

    /**
     * This is the setter method this will set the compositeTypes
     * List of types that are part of the oneof, any_of or all_of.
     * Field introduced in 32.2.1.
     * Maximum of 32 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return compositeTypes
     */
    public ApiSchema addCompositeTypesItem(ApiSimpleSchemaDescription compositeTypesItem) {
      if (this.compositeTypes == null) {
        this.compositeTypes = new ArrayList<ApiSimpleSchemaDescription>();
      }
      this.compositeTypes.add(compositeTypesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Description of this api schema.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Description of this api schema.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Discriminator for the composite types.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return discriminator
     */
    public DiscriminatorDescription getDiscriminator() {
        return discriminator;
    }

    /**
     * This is the setter method to the attribute.
     * Discriminator for the composite types.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param discriminator set the discriminator.
     */
    public void setDiscriminator(DiscriminatorDescription discriminator) {
        this.discriminator = discriminator;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of items allowed in an array.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return maxItems
     */
    public Integer getMaxItems() {
        return maxItems;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of items allowed in an array.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param maxItems set the maxItems.
     */
    public void setMaxItems(Integer  maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum number of items allowed in an array.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return minItems
     */
    public Integer getMinItems() {
        return minItems;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum number of items allowed in an array.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param minItems set the minItems.
     */
    public void setMinItems(Integer  minItems) {
        this.minItems = minItems;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of this object, unique per tenant.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of this object, unique per tenant.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of properties for this object schema.
     * Field introduced in 32.2.1.
     * Maximum of 256 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objectProperties
     */
    public List<ApiObjectProperties> getObjectProperties() {
        return objectProperties;
    }

    /**
     * This is the setter method. this will set the objectProperties
     * List of properties for this object schema.
     * Field introduced in 32.2.1.
     * Maximum of 256 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objectProperties
     */
    public void setObjectProperties(List<ApiObjectProperties>  objectProperties) {
        this.objectProperties = objectProperties;
    }

    /**
     * This is the setter method this will set the objectProperties
     * List of properties for this object schema.
     * Field introduced in 32.2.1.
     * Maximum of 256 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objectProperties
     */
    public ApiSchema addObjectPropertiesItem(ApiObjectProperties objectPropertiesItem) {
      if (this.objectProperties == null) {
        this.objectProperties = new ArrayList<ApiObjectProperties>();
      }
      this.objectProperties.add(objectPropertiesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Source of the api schema.
     * Enum options - SOURCE_USER_DEFINED, SOURCE_API_SPEC, SOURCE_DISCOVERED.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return source
     */
    public String getSource() {
        return source;
    }

    /**
     * This is the setter method to the attribute.
     * Source of the api schema.
     * Enum options - SOURCE_USER_DEFINED, SOURCE_API_SPEC, SOURCE_DISCOVERED.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param source set the source.
     */
    public void setSource(String  source) {
        this.source = source;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type tenant.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type tenant.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantRef set the tenantRef.
     */
    public void setTenantRef(String  tenantRef) {
        this.tenantRef = tenantRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The data type of this schema.
     * Can be object, array, or a composite type (oneof, anyof, allof).
     * Enum options - SCHEMA_TYPE_UNDEFINED, SCHEMA_TYPE_STRING, SCHEMA_TYPE_INTEGER, SCHEMA_TYPE_NUMBER, SCHEMA_TYPE_BOOLEAN, SCHEMA_TYPE_NULL,
     * SCHEMA_TYPE_ARRAY, SCHEMA_TYPE_OBJECT, SCHEMA_TYPE_REFERENCE, SCHEMA_TYPE_ONE_OF, SCHEMA_TYPE_ALL_OF, SCHEMA_TYPE_ANY_OF.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * The data type of this schema.
     * Can be object, array, or a composite type (oneof, anyof, allof).
     * Enum options - SCHEMA_TYPE_UNDEFINED, SCHEMA_TYPE_STRING, SCHEMA_TYPE_INTEGER, SCHEMA_TYPE_NUMBER, SCHEMA_TYPE_BOOLEAN, SCHEMA_TYPE_NULL,
     * SCHEMA_TYPE_ARRAY, SCHEMA_TYPE_OBJECT, SCHEMA_TYPE_REFERENCE, SCHEMA_TYPE_ONE_OF, SCHEMA_TYPE_ALL_OF, SCHEMA_TYPE_ANY_OF.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param type set the type.
     */
    public void setType(String  type) {
        this.type = type;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If true, all items in the array must be unique.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uniqueItems
     */
    public Boolean getUniqueItems() {
        return uniqueItems;
    }

    /**
     * This is the setter method to the attribute.
     * If true, all items in the array must be unique.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uniqueItems set the uniqueItems.
     */
    public void setUniqueItems(Boolean  uniqueItems) {
        this.uniqueItems = uniqueItems;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Avi controller URL of the object.
     * @return url
     */
    public String getUrl() {
        return url;
    }

   /**
    * This is the setter method. this will set the url
    * Avi controller URL of the object.
    * @return url
    */
   public void setUrl(String  url) {
     this.url = url;
   }

    /**
     * This is the getter method this will return the attribute value.
     * The object uuid.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * The object uuid.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApiSchema objApiSchema = (ApiSchema) o;
      return   Objects.equals(this.uuid, objApiSchema.uuid)&&
  Objects.equals(this.name, objApiSchema.name)&&
  Objects.equals(this.description, objApiSchema.description)&&
  Objects.equals(this.source, objApiSchema.source)&&
  Objects.equals(this.type, objApiSchema.type)&&
  Objects.equals(this.objectProperties, objApiSchema.objectProperties)&&
  Objects.equals(this.additionalObjectKeyAction, objApiSchema.additionalObjectKeyAction)&&
  Objects.equals(this.arrayItemType, objApiSchema.arrayItemType)&&
  Objects.equals(this.discriminator, objApiSchema.discriminator)&&
  Objects.equals(this.compositeTypes, objApiSchema.compositeTypes)&&
  Objects.equals(this.allowAdditionalProperties, objApiSchema.allowAdditionalProperties)&&
  Objects.equals(this.additionalPropertiesSchema, objApiSchema.additionalPropertiesSchema)&&
  Objects.equals(this.minItems, objApiSchema.minItems)&&
  Objects.equals(this.maxItems, objApiSchema.maxItems)&&
  Objects.equals(this.uniqueItems, objApiSchema.uniqueItems)&&
  Objects.equals(this.tenantRef, objApiSchema.tenantRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApiSchema {\n");
                  sb.append("    additionalObjectKeyAction: ").append(toIndentedString(additionalObjectKeyAction)).append("\n");
                        sb.append("    additionalPropertiesSchema: ").append(toIndentedString(additionalPropertiesSchema)).append("\n");
                        sb.append("    allowAdditionalProperties: ").append(toIndentedString(allowAdditionalProperties)).append("\n");
                        sb.append("    arrayItemType: ").append(toIndentedString(arrayItemType)).append("\n");
                        sb.append("    compositeTypes: ").append(toIndentedString(compositeTypes)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    discriminator: ").append(toIndentedString(discriminator)).append("\n");
                        sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
                        sb.append("    minItems: ").append(toIndentedString(minItems)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    objectProperties: ").append(toIndentedString(objectProperties)).append("\n");
                        sb.append("    source: ").append(toIndentedString(source)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                        sb.append("    type: ").append(toIndentedString(type)).append("\n");
                        sb.append("    uniqueItems: ").append(toIndentedString(uniqueItems)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
