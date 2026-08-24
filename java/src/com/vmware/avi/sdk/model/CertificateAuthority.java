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
 * The CertificateAuthority is a POJO class extends AviRestResource that used for creating
 * CertificateAuthority.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CertificateAuthority  {
    @JsonProperty("ca_ref")
    private String caRef;

    @JsonProperty("issuer")
    private String issuer;

    @JsonProperty("name")
    private String name;

    @JsonProperty("not_after")
    private String notAfter;

    @JsonProperty("subject")
    private String subject;



    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type sslkeyandcertificate.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return caRef
     */
    public String getCaRef() {
        return caRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type sslkeyandcertificate.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param caRef set the caRef.
     */
    public void setCaRef(String  caRef) {
        this.caRef = caRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Common name of the ca certificate issuer.
     * Field introduced in 32.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return issuer
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * This is the setter method to the attribute.
     * Common name of the ca certificate issuer.
     * Field introduced in 32.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param issuer set the issuer.
     */
    public void setIssuer(String  issuer) {
        this.issuer = issuer;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Expiry date of the ca certificate in utc string form.
     * Field introduced in 32.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return notAfter
     */
    public String getNotAfter() {
        return notAfter;
    }

    /**
     * This is the setter method to the attribute.
     * Expiry date of the ca certificate in utc string form.
     * Field introduced in 32.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param notAfter set the notAfter.
     */
    public void setNotAfter(String  notAfter) {
        this.notAfter = notAfter;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Common name of the ca certificate subject.
     * Field introduced in 32.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * This is the setter method to the attribute.
     * Common name of the ca certificate subject.
     * Field introduced in 32.1.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param subject set the subject.
     */
    public void setSubject(String  subject) {
        this.subject = subject;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      CertificateAuthority objCertificateAuthority = (CertificateAuthority) o;
      return   Objects.equals(this.name, objCertificateAuthority.name)&&
  Objects.equals(this.caRef, objCertificateAuthority.caRef)&&
  Objects.equals(this.subject, objCertificateAuthority.subject)&&
  Objects.equals(this.issuer, objCertificateAuthority.issuer)&&
  Objects.equals(this.notAfter, objCertificateAuthority.notAfter);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CertificateAuthority {\n");
                  sb.append("    caRef: ").append(toIndentedString(caRef)).append("\n");
                        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
                        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
