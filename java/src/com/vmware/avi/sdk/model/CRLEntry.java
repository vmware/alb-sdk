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
 * The CRLEntry is a POJO class extends AviRestResource that used for creating
 * CRLEntry.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CRLEntry  {
    @JsonProperty("crl_number")
    private String crlNumber;

    @JsonProperty("issuer_cn")
    private String issuerCn;

    @JsonProperty("issuer_dn")
    private String issuerDn;

    @JsonProperty("next_update")
    private String nextUpdate;

    @JsonProperty("serial_numbers")
    private List<String> serialNumbers;

    @JsonProperty("this_update")
    private String thisUpdate;



    /**
     * This is the getter method this will return the attribute value.
     * Crl sequence number from the crl number extension (rfc 5280 §5.2.3).
     * Empty when the extension is absent.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return crlNumber
     */
    public String getCrlNumber() {
        return crlNumber;
    }

    /**
     * This is the setter method to the attribute.
     * Crl sequence number from the crl number extension (rfc 5280 §5.2.3).
     * Empty when the extension is absent.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param crlNumber set the crlNumber.
     */
    public void setCrlNumber(String  crlNumber) {
        this.crlNumber = crlNumber;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Common name extracted from the crl issuer dn.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return issuerCn
     */
    public String getIssuerCn() {
        return issuerCn;
    }

    /**
     * This is the setter method to the attribute.
     * Common name extracted from the crl issuer dn.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param issuerCn set the issuerCn.
     */
    public void setIssuerCn(String  issuerCn) {
        this.issuerCn = issuerCn;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Full distinguished name of the crl issuer (rfc 5280 issuer field).
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return issuerDn
     */
    public String getIssuerDn() {
        return issuerDn;
    }

    /**
     * This is the setter method to the attribute.
     * Full distinguished name of the crl issuer (rfc 5280 issuer field).
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param issuerDn set the issuerDn.
     */
    public void setIssuerDn(String  issuerDn) {
        this.issuerDn = issuerDn;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Milliseconds since the unix epoch (1970-01-01 00 00 00 utc) when the next crl is expected (nextupdate field, rfc 5280 §5.1.2.5).
     * Empty when the extension is absent.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nextUpdate
     */
    public String getNextUpdate() {
        return nextUpdate;
    }

    /**
     * This is the setter method to the attribute.
     * Milliseconds since the unix epoch (1970-01-01 00 00 00 utc) when the next crl is expected (nextupdate field, rfc 5280 §5.1.2.5).
     * Empty when the extension is absent.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nextUpdate set the nextUpdate.
     */
    public void setNextUpdate(String  nextUpdate) {
        this.nextUpdate = nextUpdate;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Decimal serial numbers of all certificates revoked in this crl block.
     * Used for revocation status checks against a certificate's serial number.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serialNumbers
     */
    public List<String> getSerialNumbers() {
        return serialNumbers;
    }

    /**
     * This is the setter method. this will set the serialNumbers
     * Decimal serial numbers of all certificates revoked in this crl block.
     * Used for revocation status checks against a certificate's serial number.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serialNumbers
     */
    public void setSerialNumbers(List<String>  serialNumbers) {
        this.serialNumbers = serialNumbers;
    }

    /**
     * This is the setter method this will set the serialNumbers
     * Decimal serial numbers of all certificates revoked in this crl block.
     * Used for revocation status checks against a certificate's serial number.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serialNumbers
     */
    public CRLEntry addSerialNumbersItem(String serialNumbersItem) {
      if (this.serialNumbers == null) {
        this.serialNumbers = new ArrayList<String>();
      }
      this.serialNumbers.add(serialNumbersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Milliseconds since the unix epoch (1970-01-01 00 00 00 utc) when this crl was issued (thisupdate field, rfc 5280 §5.1.2.4).
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return thisUpdate
     */
    public String getThisUpdate() {
        return thisUpdate;
    }

    /**
     * This is the setter method to the attribute.
     * Milliseconds since the unix epoch (1970-01-01 00 00 00 utc) when this crl was issued (thisupdate field, rfc 5280 §5.1.2.4).
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param thisUpdate set the thisUpdate.
     */
    public void setThisUpdate(String  thisUpdate) {
        this.thisUpdate = thisUpdate;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      CRLEntry objCRLEntry = (CRLEntry) o;
      return   Objects.equals(this.issuerDn, objCRLEntry.issuerDn)&&
  Objects.equals(this.issuerCn, objCRLEntry.issuerCn)&&
  Objects.equals(this.crlNumber, objCRLEntry.crlNumber)&&
  Objects.equals(this.thisUpdate, objCRLEntry.thisUpdate)&&
  Objects.equals(this.nextUpdate, objCRLEntry.nextUpdate)&&
  Objects.equals(this.serialNumbers, objCRLEntry.serialNumbers);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CRLEntry {\n");
                  sb.append("    crlNumber: ").append(toIndentedString(crlNumber)).append("\n");
                        sb.append("    issuerCn: ").append(toIndentedString(issuerCn)).append("\n");
                        sb.append("    issuerDn: ").append(toIndentedString(issuerDn)).append("\n");
                        sb.append("    nextUpdate: ").append(toIndentedString(nextUpdate)).append("\n");
                        sb.append("    serialNumbers: ").append(toIndentedString(serialNumbers)).append("\n");
                        sb.append("    thisUpdate: ").append(toIndentedString(thisUpdate)).append("\n");
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
