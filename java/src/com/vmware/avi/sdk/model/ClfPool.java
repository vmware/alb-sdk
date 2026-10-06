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
 * The ClfPool is a POJO class extends AviRestResource that used for creating
 * ClfPool.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClfPool  {
    @JsonProperty("health_monitor_refs")
    private List<String> healthMonitorRefs;

    @JsonProperty("lb_algorithm")
    private String lbAlgorithm = "LB_ALGORITHM_ROUND_ROBIN";

    @JsonProperty("log_format")
    private String logFormat = "CLF_LOG_FORMAT_SYSLOG_OCTET";

    @JsonProperty("name")
    private String name;

    @JsonProperty("pki_profile_ref")
    private String pkiProfileRef;

    @JsonProperty("priority")
    private Integer priority;

    @JsonProperty("servers")
    private List<ClfServer> servers;

    @JsonProperty("ssl_key_and_certificate_ref")
    private String sslKeyAndCertificateRef;

    @JsonProperty("ssl_profile_ref")
    private String sslProfileRef;

    @JsonProperty("transport")
    private String transport = "CLF_TRANSPORT_TCP";


    /**
     * This is the getter method this will return the attribute value.
     * Reference to at most one health monitor for collectors in this pool.
     * It is a reference to an object of type healthmonitor.
     * Field introduced in 32.1.5.
     * Maximum of 1 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return healthMonitorRefs
     */
    public List<String> getHealthMonitorRefs() {
        return healthMonitorRefs;
    }

    /**
     * This is the setter method. this will set the healthMonitorRefs
     * Reference to at most one health monitor for collectors in this pool.
     * It is a reference to an object of type healthmonitor.
     * Field introduced in 32.1.5.
     * Maximum of 1 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return healthMonitorRefs
     */
    public void setHealthMonitorRefs(List<String>  healthMonitorRefs) {
        this.healthMonitorRefs = healthMonitorRefs;
    }

    /**
     * This is the setter method this will set the healthMonitorRefs
     * Reference to at most one health monitor for collectors in this pool.
     * It is a reference to an object of type healthmonitor.
     * Field introduced in 32.1.5.
     * Maximum of 1 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return healthMonitorRefs
     */
    public ClfPool addHealthMonitorRefsItem(String healthMonitorRefsItem) {
      if (this.healthMonitorRefs == null) {
        this.healthMonitorRefs = new ArrayList<String>();
      }
      this.healthMonitorRefs.add(healthMonitorRefsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Load balancing algorithm for distributing logs across servers.
     * Only lb_algorithm_round_robin and lb_algorithm_consistent_hash are supported; consistent-hash always hashes on the uuid of the virtualservice
     * invoking the datascript log forwarding call, not a per-request client ip/uri/header, so all of one vs's log records land on the same collector.
     * Enum options - LB_ALGORITHM_LEAST_CONNECTIONS, LB_ALGORITHM_ROUND_ROBIN, LB_ALGORITHM_FASTEST_RESPONSE, LB_ALGORITHM_CONSISTENT_HASH,
     * LB_ALGORITHM_LEAST_LOAD, LB_ALGORITHM_FEWEST_SERVERS, LB_ALGORITHM_RANDOM, LB_ALGORITHM_FEWEST_TASKS, LB_ALGORITHM_NEAREST_SERVER,
     * LB_ALGORITHM_CORE_AFFINITY, LB_ALGORITHM_TOPOLOGY.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "LB_ALGORITHM_ROUND_ROBIN".
     * @return lbAlgorithm
     */
    public String getLbAlgorithm() {
        return lbAlgorithm;
    }

    /**
     * This is the setter method to the attribute.
     * Load balancing algorithm for distributing logs across servers.
     * Only lb_algorithm_round_robin and lb_algorithm_consistent_hash are supported; consistent-hash always hashes on the uuid of the virtualservice
     * invoking the datascript log forwarding call, not a per-request client ip/uri/header, so all of one vs's log records land on the same collector.
     * Enum options - LB_ALGORITHM_LEAST_CONNECTIONS, LB_ALGORITHM_ROUND_ROBIN, LB_ALGORITHM_FASTEST_RESPONSE, LB_ALGORITHM_CONSISTENT_HASH,
     * LB_ALGORITHM_LEAST_LOAD, LB_ALGORITHM_FEWEST_SERVERS, LB_ALGORITHM_RANDOM, LB_ALGORITHM_FEWEST_TASKS, LB_ALGORITHM_NEAREST_SERVER,
     * LB_ALGORITHM_CORE_AFFINITY, LB_ALGORITHM_TOPOLOGY.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "LB_ALGORITHM_ROUND_ROBIN".
     * @param lbAlgorithm set the lbAlgorithm.
     */
    public void setLbAlgorithm(String  lbAlgorithm) {
        this.lbAlgorithm = lbAlgorithm;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Wire format for log records delivered to this pool's collectors.
     * Each pool independently configures its format.
     * Enum options - CLF_LOG_FORMAT_SYSLOG_LEGACY, CLF_LOG_FORMAT_SYSLOG_OCTET, CLF_LOG_FORMAT_CUSTOM.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "CLF_LOG_FORMAT_SYSLOG_OCTET".
     * @return logFormat
     */
    public String getLogFormat() {
        return logFormat;
    }

    /**
     * This is the setter method to the attribute.
     * Wire format for log records delivered to this pool's collectors.
     * Each pool independently configures its format.
     * Enum options - CLF_LOG_FORMAT_SYSLOG_LEGACY, CLF_LOG_FORMAT_SYSLOG_OCTET, CLF_LOG_FORMAT_CUSTOM.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "CLF_LOG_FORMAT_SYSLOG_OCTET".
     * @param logFormat set the logFormat.
     */
    public void setLogFormat(String  logFormat) {
        this.logFormat = logFormat;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Unique name for this pool within the clfprofile.
     * Used as part of the composite key for the backing se_pool_t on the se.
     * The controller rejects profiles where two pools share the same name.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Unique name for this pool within the clfprofile.
     * Used as part of the composite key for the backing se_pool_t on the se.
     * The controller rejects profiles where two pools share the same name.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Pki profile whose ca certificates validate the collector's server certificate.
     * Required when transport is clf_transport_tcp_tls.
     * It is a reference to an object of type pkiprofile.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pkiProfileRef
     */
    public String getPkiProfileRef() {
        return pkiProfileRef;
    }

    /**
     * This is the setter method to the attribute.
     * Pki profile whose ca certificates validate the collector's server certificate.
     * Required when transport is clf_transport_tcp_tls.
     * It is a reference to an object of type pkiprofile.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param pkiProfileRef set the pkiProfileRef.
     */
    public void setPkiProfileRef(String  pkiProfileRef) {
        this.pkiProfileRef = pkiProfileRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Pool priority within the clfprofile.
     * Higher value = higher priority.
     * Must be unique across all pools in the same profile.
     * When replicate=false, the highest-priority pool with an up member receives all log records; lower-priority pools act as fallback.
     * Allowed values are 1-255.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * This is the setter method to the attribute.
     * Pool priority within the clfprofile.
     * Higher value = higher priority.
     * Must be unique across all pools in the same profile.
     * When replicate=false, the highest-priority pool with an up member receives all log records; lower-priority pools act as fallback.
     * Allowed values are 1-255.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param priority set the priority.
     */
    public void setPriority(Integer  priority) {
        this.priority = priority;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of log collector endpoints for this pool.
     * Field introduced in 32.1.5.
     * Maximum of 32 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return servers
     */
    public List<ClfServer> getServers() {
        return servers;
    }

    /**
     * This is the setter method. this will set the servers
     * List of log collector endpoints for this pool.
     * Field introduced in 32.1.5.
     * Maximum of 32 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return servers
     */
    public void setServers(List<ClfServer>  servers) {
        this.servers = servers;
    }

    /**
     * This is the setter method this will set the servers
     * List of log collector endpoints for this pool.
     * Field introduced in 32.1.5.
     * Maximum of 32 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return servers
     */
    public ClfPool addServersItem(ClfServer serversItem) {
      if (this.servers == null) {
        this.servers = new ArrayList<ClfServer>();
      }
      this.servers.add(serversItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Client certificate and key the se presents to the collector for mutual tls.
     * Optional even when transport is clf_transport_tcp_tls; server-authentication-only tls is used when this is not set.
     * It is a reference to an object of type sslkeyandcertificate.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sslKeyAndCertificateRef
     */
    public String getSslKeyAndCertificateRef() {
        return sslKeyAndCertificateRef;
    }

    /**
     * This is the setter method to the attribute.
     * Client certificate and key the se presents to the collector for mutual tls.
     * Optional even when transport is clf_transport_tcp_tls; server-authentication-only tls is used when this is not set.
     * It is a reference to an object of type sslkeyandcertificate.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sslKeyAndCertificateRef set the sslKeyAndCertificateRef.
     */
    public void setSslKeyAndCertificateRef(String  sslKeyAndCertificateRef) {
        this.sslKeyAndCertificateRef = sslKeyAndCertificateRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ssl profile controlling the tls version and cipher policy used for this pool's collector connections.
     * Required when transport is clf_transport_tcp_tls.
     * It is a reference to an object of type sslprofile.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sslProfileRef
     */
    public String getSslProfileRef() {
        return sslProfileRef;
    }

    /**
     * This is the setter method to the attribute.
     * Ssl profile controlling the tls version and cipher policy used for this pool's collector connections.
     * Required when transport is clf_transport_tcp_tls.
     * It is a reference to an object of type sslprofile.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sslProfileRef set the sslProfileRef.
     */
    public void setSslProfileRef(String  sslProfileRef) {
        this.sslProfileRef = sslProfileRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Transport protocol for log delivery.
     * Enum options - CLF_TRANSPORT_TCP, CLF_TRANSPORT_UDP, CLF_TRANSPORT_TCP_TLS.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "CLF_TRANSPORT_TCP".
     * @return transport
     */
    public String getTransport() {
        return transport;
    }

    /**
     * This is the setter method to the attribute.
     * Transport protocol for log delivery.
     * Enum options - CLF_TRANSPORT_TCP, CLF_TRANSPORT_UDP, CLF_TRANSPORT_TCP_TLS.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "CLF_TRANSPORT_TCP".
     * @param transport set the transport.
     */
    public void setTransport(String  transport) {
        this.transport = transport;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ClfPool objClfPool = (ClfPool) o;
      return   Objects.equals(this.transport, objClfPool.transport)&&
  Objects.equals(this.lbAlgorithm, objClfPool.lbAlgorithm)&&
  Objects.equals(this.servers, objClfPool.servers)&&
  Objects.equals(this.healthMonitorRefs, objClfPool.healthMonitorRefs)&&
  Objects.equals(this.priority, objClfPool.priority)&&
  Objects.equals(this.logFormat, objClfPool.logFormat)&&
  Objects.equals(this.name, objClfPool.name)&&
  Objects.equals(this.sslProfileRef, objClfPool.sslProfileRef)&&
  Objects.equals(this.pkiProfileRef, objClfPool.pkiProfileRef)&&
  Objects.equals(this.sslKeyAndCertificateRef, objClfPool.sslKeyAndCertificateRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ClfPool {\n");
                  sb.append("    healthMonitorRefs: ").append(toIndentedString(healthMonitorRefs)).append("\n");
                        sb.append("    lbAlgorithm: ").append(toIndentedString(lbAlgorithm)).append("\n");
                        sb.append("    logFormat: ").append(toIndentedString(logFormat)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    pkiProfileRef: ").append(toIndentedString(pkiProfileRef)).append("\n");
                        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
                        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
                        sb.append("    sslKeyAndCertificateRef: ").append(toIndentedString(sslKeyAndCertificateRef)).append("\n");
                        sb.append("    sslProfileRef: ").append(toIndentedString(sslProfileRef)).append("\n");
                        sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
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
