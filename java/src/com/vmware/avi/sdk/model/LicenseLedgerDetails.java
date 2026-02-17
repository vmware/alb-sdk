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
 * The LicenseLedgerDetails is a POJO class extends AviRestResource that used for creating
 * LicenseLedgerDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LicenseLedgerDetails extends AviRestResource  {
    @JsonProperty("escrow_infos")
    private List<LicenseInfo> escrowInfos;

    @JsonProperty("se_group_infos")
    private List<SeGroupInfo> seGroupInfos;

    @JsonProperty("se_infos")
    private List<LicenseInfo> seInfos;

    @JsonProperty("tenant_infos")
    private List<LicenseReservationInfo> tenantInfos;

    @JsonProperty("tier_usages")
    private List<LicenseTierUsage> tierUsages;

    @JsonProperty("total_licenses_reserved")
    private Integer totalLicensesReserved;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;


    /**
     * This is the getter method this will return the attribute value.
     * Maintain information about reservation against cookie.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return escrowInfos
     */
    public List<LicenseInfo> getEscrowInfos() {
        return escrowInfos;
    }

    /**
     * This is the setter method. this will set the escrowInfos
     * Maintain information about reservation against cookie.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return escrowInfos
     */
    public void setEscrowInfos(List<LicenseInfo>  escrowInfos) {
        this.escrowInfos = escrowInfos;
    }

    /**
     * This is the setter method this will set the escrowInfos
     * Maintain information about reservation against cookie.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return escrowInfos
     */
    public LicenseLedgerDetails addEscrowInfosItem(LicenseInfo escrowInfosItem) {
      if (this.escrowInfos == null) {
        this.escrowInfos = new ArrayList<LicenseInfo>();
      }
      this.escrowInfos.add(escrowInfosItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Maintain information about se group.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGroupInfos
     */
    public List<SeGroupInfo> getSeGroupInfos() {
        return seGroupInfos;
    }

    /**
     * This is the setter method. this will set the seGroupInfos
     * Maintain information about se group.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGroupInfos
     */
    public void setSeGroupInfos(List<SeGroupInfo>  seGroupInfos) {
        this.seGroupInfos = seGroupInfos;
    }

    /**
     * This is the setter method this will set the seGroupInfos
     * Maintain information about se group.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGroupInfos
     */
    public LicenseLedgerDetails addSeGroupInfosItem(SeGroupInfo seGroupInfosItem) {
      if (this.seGroupInfos == null) {
        this.seGroupInfos = new ArrayList<SeGroupInfo>();
      }
      this.seGroupInfos.add(seGroupInfosItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Maintain information about consumed licenses against se_uuid.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seInfos
     */
    public List<LicenseInfo> getSeInfos() {
        return seInfos;
    }

    /**
     * This is the setter method. this will set the seInfos
     * Maintain information about consumed licenses against se_uuid.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seInfos
     */
    public void setSeInfos(List<LicenseInfo>  seInfos) {
        this.seInfos = seInfos;
    }

    /**
     * This is the setter method this will set the seInfos
     * Maintain information about consumed licenses against se_uuid.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seInfos
     */
    public LicenseLedgerDetails addSeInfosItem(LicenseInfo seInfosItem) {
      if (this.seInfos == null) {
        this.seInfos = new ArrayList<LicenseInfo>();
      }
      this.seInfos.add(seInfosItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Maintain information about tenant.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantInfos
     */
    public List<LicenseReservationInfo> getTenantInfos() {
        return tenantInfos;
    }

    /**
     * This is the setter method. this will set the tenantInfos
     * Maintain information about tenant.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantInfos
     */
    public void setTenantInfos(List<LicenseReservationInfo>  tenantInfos) {
        this.tenantInfos = tenantInfos;
    }

    /**
     * This is the setter method this will set the tenantInfos
     * Maintain information about tenant.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantInfos
     */
    public LicenseLedgerDetails addTenantInfosItem(LicenseReservationInfo tenantInfosItem) {
      if (this.tenantInfos == null) {
        this.tenantInfos = new ArrayList<LicenseReservationInfo>();
      }
      this.tenantInfos.add(tenantInfosItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * License usage per tier.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tierUsages
     */
    public List<LicenseTierUsage> getTierUsages() {
        return tierUsages;
    }

    /**
     * This is the setter method. this will set the tierUsages
     * License usage per tier.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tierUsages
     */
    public void setTierUsages(List<LicenseTierUsage>  tierUsages) {
        this.tierUsages = tierUsages;
    }

    /**
     * This is the setter method this will set the tierUsages
     * License usage per tier.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tierUsages
     */
    public LicenseLedgerDetails addTierUsagesItem(LicenseTierUsage tierUsagesItem) {
      if (this.tierUsages == null) {
        this.tierUsages = new ArrayList<LicenseTierUsage>();
      }
      this.tierUsages.add(tierUsagesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Total of max licenses reserved as per quota config of tenant/segroup.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return totalLicensesReserved
     */
    public Integer getTotalLicensesReserved() {
        return totalLicensesReserved;
    }

    /**
     * This is the setter method to the attribute.
     * Total of max licenses reserved as per quota config of tenant/segroup.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param totalLicensesReserved set the totalLicensesReserved.
     */
    public void setTotalLicensesReserved(Integer  totalLicensesReserved) {
        this.totalLicensesReserved = totalLicensesReserved;
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
     * Uuid for reference.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid for reference.
     * Field introduced in 20.1.1.
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
      LicenseLedgerDetails objLicenseLedgerDetails = (LicenseLedgerDetails) o;
      return   Objects.equals(this.uuid, objLicenseLedgerDetails.uuid)&&
  Objects.equals(this.tierUsages, objLicenseLedgerDetails.tierUsages)&&
  Objects.equals(this.escrowInfos, objLicenseLedgerDetails.escrowInfos)&&
  Objects.equals(this.seInfos, objLicenseLedgerDetails.seInfos)&&
  Objects.equals(this.seGroupInfos, objLicenseLedgerDetails.seGroupInfos)&&
  Objects.equals(this.tenantInfos, objLicenseLedgerDetails.tenantInfos)&&
  Objects.equals(this.totalLicensesReserved, objLicenseLedgerDetails.totalLicensesReserved);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LicenseLedgerDetails {\n");
                  sb.append("    escrowInfos: ").append(toIndentedString(escrowInfos)).append("\n");
                        sb.append("    seGroupInfos: ").append(toIndentedString(seGroupInfos)).append("\n");
                        sb.append("    seInfos: ").append(toIndentedString(seInfos)).append("\n");
                        sb.append("    tenantInfos: ").append(toIndentedString(tenantInfos)).append("\n");
                        sb.append("    tierUsages: ").append(toIndentedString(tierUsages)).append("\n");
                        sb.append("    totalLicensesReserved: ").append(toIndentedString(totalLicensesReserved)).append("\n");
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
