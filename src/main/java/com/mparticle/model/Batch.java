package com.mparticle.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.*;

/**
 * Batch
 */

public class Batch {
  public static final String SERIALIZED_NAME_SOURCE_REQUEST_ID = "source_request_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_REQUEST_ID)
  private String sourceRequestId;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private Context context;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<Object> events = new ArrayList<Object>();

  public static final String SERIALIZED_NAME_DEVICE_INFO = "device_info";
  @SerializedName(SERIALIZED_NAME_DEVICE_INFO)
  private DeviceInformation deviceInfo = null;

  public static final String SERIALIZED_NAME_APPLICATION_INFO = "application_info";
  @SerializedName(SERIALIZED_NAME_APPLICATION_INFO)
  private ApplicationInformation applicationInfo = null;

  public static final String SERIALIZED_NAME_USER_ATTRIBUTES = "user_attributes";
  @SerializedName(SERIALIZED_NAME_USER_ATTRIBUTES)
  private Map<String, Object> userAttributes = new HashMap<String, Object>();

  public static final String SERIALIZED_NAME_DELETED_USER_ATTRIBUTES = "deleted_user_attributes";
  @SerializedName(SERIALIZED_NAME_DELETED_USER_ATTRIBUTES)
  private List<String> deletedUserAttributes = new ArrayList<String>();

  public static final String SERIALIZED_NAME_USER_IDENTITIES = "user_identities";
  @SerializedName(SERIALIZED_NAME_USER_IDENTITIES)
  private UserIdentities userIdentities = null;

  /**
   * Gets or Sets environment
   */
  public enum Environment {
    UNKNOWN("unknown"),
    
    DEVELOPMENT("development"),
    
    PRODUCTION("production");

    private String value;

    Environment(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Environment fromValue(String value) {
      for (Environment b : Environment.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private Environment environment = Environment.PRODUCTION;

  public static final String SERIALIZED_NAME_API_KEY = "api_key";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_API_KEYS = "api_keys";
  @SerializedName(SERIALIZED_NAME_API_KEYS)
  private List<String> apiKeys = new ArrayList<String>();

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_INTEGRATION_ATTRIBUTES = "integration_attributes";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_ATTRIBUTES)
  private Map<String, Map<String, String>> integrationAttributes = new HashMap<String, Map<String, String>>();

  public static final String SERIALIZED_NAME_PARTNER_IDENTITY = "partner_identity";
  @SerializedName(SERIALIZED_NAME_PARTNER_IDENTITY)
  private String partnerIdentity;

  public static final String SERIALIZED_NAME_PARTNER_IDENTITIES = "partner_identities";
  @SerializedName(SERIALIZED_NAME_PARTNER_IDENTITIES)
  private Map<String, String> partnerIdentities = new HashMap<>();

  public static final String SERIALIZED_NAME_SOURCE_INFO = "source_info";
  @SerializedName(SERIALIZED_NAME_SOURCE_INFO)
  private SourceInformation sourceInfo = null;

  public static final String SERIALIZED_NAME_MP_DEVICEID = "mp_deviceid";
  @SerializedName(SERIALIZED_NAME_MP_DEVICEID)
  private String mpDeviceid;

  public static final String SERIALIZED_NAME_ATTRIBUTION_INFO = "attribution_info";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTION_INFO)
  private AttributionInfo attributionInfo = null;

  public static final String SERIALIZED_NAME_TIMESTAMP_UNIXTIME_MS = "timestamp_unixtime_ms";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP_UNIXTIME_MS)
  private Long timestampUnixtimeMs;

  public static final String SERIALIZED_NAME_BATCH_ID = "batch_id";
  @SerializedName(SERIALIZED_NAME_BATCH_ID)
  private Long batchId;

  public static final String SERIALIZED_NAME_MPID = "mpid";
  @SerializedName(SERIALIZED_NAME_MPID)
  private Long mpid;

  public static final String SERIALIZED_NAME_SDK_VERSION = "sdk_version";
  @SerializedName(SERIALIZED_NAME_SDK_VERSION)
  private String sdkVersion;

  public static final String SERIALIZED_NAME_CONSENT_STATE = "consent_state";
  @SerializedName(SERIALIZED_NAME_CONSENT_STATE)
  private ConsentState consentState = null;

  public static final String SERIALIZED_NAME_JOB_ID = "job_id";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  /**
   * Set the source request ID. This ID is used for server-side deduplication.
   *
   * @param sourceRequestId
   * @return
   */
  public Batch sourceRequestId(String sourceRequestId) {
    this.sourceRequestId = sourceRequestId;
    return this;
  }

   /**
   * Get sourceRequestId
   * @return sourceRequestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getSourceRequestId() {
    return sourceRequestId;
  }
  
  public void setSourceRequestId(String sourceRequestId) {
    this.sourceRequestId = sourceRequestId;
  }

  public Batch context(Context context) {
    this.context = context;
    return this;
  }

  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Context getContext() {
    return context;
  }

  public void setContext(Context context) {
    this.context = context;
  }

  public Batch events(List<Object> events) {
    this.events = events;
    return this;
  }

  public Batch addEventsItem(Object eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<Object>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Provide a list of event objects - such as CustomEvent, ScreenViewEvent, or CommerceEvent
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Provide a list of event objects - such as CustomEvent, ScreenViewEvent, or CommerceEvent")
  public List<Object> getEvents() {
    return events;
  }

  public void setEvents(List<Object> events) {
    this.events = events;
  }

  public Batch deviceInfo(DeviceInformation deviceInfo) {
    this.deviceInfo = deviceInfo;
    return this;
  }

   /**
   * Get deviceInfo
   * @return deviceInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public DeviceInformation getDeviceInfo() {
    return deviceInfo;
  }

  public void setDeviceInfo(DeviceInformation deviceInfo) {
    this.deviceInfo = deviceInfo;
  }

  public Batch applicationInfo(ApplicationInformation applicationInfo) {
    this.applicationInfo = applicationInfo;
    return this;
  }

   /**
   * Get applicationInfo
   * @return applicationInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public ApplicationInformation getApplicationInfo() {
    return applicationInfo;
  }

  public void setApplicationInfo(ApplicationInformation applicationInfo) {
    this.applicationInfo = applicationInfo;
  }

  public Batch userAttributes(Map<String, Object> userAttributes) {
    this.userAttributes = userAttributes;
    return this;
  }

  public Batch putUserAttributesItem(String key, Object userAttributesItem) {
    if (this.userAttributes == null) {
      this.userAttributes = new HashMap<String, Object>();
    }
    this.userAttributes.put(key, userAttributesItem);
    return this;
  }

   /**
   * Get userAttributes
   * @return userAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Map<String, Object> getUserAttributes() {
    return userAttributes;
  }

  public void setUserAttributes(Map<String, Object> userAttributes) {
    this.userAttributes = userAttributes;
  }

  public Batch deletedUserAttributes(List<String> deletedUserAttributes) {
    this.deletedUserAttributes = deletedUserAttributes;
    return this;
  }

  public Batch addDeletedUserAttributesItem(String deletedUserAttributesItem) {
    if (this.deletedUserAttributes == null) {
      this.deletedUserAttributes = new ArrayList<String>();
    }
    this.deletedUserAttributes.add(deletedUserAttributesItem);
    return this;
  }

   /**
   * Get deletedUserAttributes
   * @return deletedUserAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<String> getDeletedUserAttributes() {
    return deletedUserAttributes;
  }

  public void setDeletedUserAttributes(List<String> deletedUserAttributes) {
    this.deletedUserAttributes = deletedUserAttributes;
  }

  public Batch userIdentities(UserIdentities userIdentities) {
    this.userIdentities = userIdentities;
    return this;
  }

   /**
   * Get userIdentities
   * @return userIdentities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public UserIdentities getUserIdentities() {
    return userIdentities;
  }

  public void setUserIdentities(UserIdentities userIdentities) {
    this.userIdentities = userIdentities;
  }

  public Batch environment(Environment environment) {
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "")
  public Environment getEnvironment() {
    return environment;
  }

  public void setEnvironment(Environment environment) {
    this.environment = environment;
  }

  public Batch apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public Batch apiKeys(List<String> apiKeys) {
    this.apiKeys = apiKeys;
    return this;
  }

  public Batch addApiKeysItem(String apiKeysItem) {
    if (this.apiKeys == null) {
      this.apiKeys = new ArrayList<String>();
    }
    this.apiKeys.add(apiKeysItem);
    return this;
  }

   /**
   * Get apiKeys
   * @return apiKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<String> getApiKeys() {
    return apiKeys;
  }

  public void setApiKeys(List<String> apiKeys) {
    this.apiKeys = apiKeys;
  }

  public Batch ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public Batch integrationAttributes(Map<String, Map<String, String>> integrationAttributes) {
    this.integrationAttributes = integrationAttributes;
    return this;
  }

  public Batch putIntegrationAttributesItem(String key, Map<String, String> integrationAttributesItem) {
    if (this.integrationAttributes == null) {
      this.integrationAttributes = new HashMap<String, Map<String, String>>();
    }
    this.integrationAttributes.put(key, integrationAttributesItem);
    return this;
  }

   /**
   * Get integrationAttributes
   * @return integrationAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Map<String, Map<String, String>> getIntegrationAttributes() {
    return integrationAttributes;
  }

  public void setIntegrationAttributes(Map<String, Map<String, String>> integrationAttributes) {
    this.integrationAttributes = integrationAttributes;
  }

  public Batch partnerIdentity(String partnerIdentity) {
    this.partnerIdentity = partnerIdentity;
    return this;
  }

   /**
   * Get partnerIdentity
   * @return partnerIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getPartnerIdentity() {
    return partnerIdentity;
  }

  public void setPartnerIdentity(String partnerIdentity) {
    this.partnerIdentity = partnerIdentity;
  }

  public Batch partnerIdentities(Map<String, String> partnerIdentities) {
    this.partnerIdentities = partnerIdentities;
    return this;
  }

  /**
   * Get partnerIdentities
   * @return partnerIdentities
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Map<String, String> getPartnerIdentities() {
    return partnerIdentities;
  }

  public void setPartnerIdentities(Map<String, String> partnerIdentities) {
    this.partnerIdentities = partnerIdentities;
  }

  public Batch sourceInfo(SourceInformation sourceInfo) {
    this.sourceInfo = sourceInfo;
    return this;
  }

   /**
   * Get sourceInfo
   * @return sourceInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public SourceInformation getSourceInfo() {
    return sourceInfo;
  }

  public void setSourceInfo(SourceInformation sourceInfo) {
    this.sourceInfo = sourceInfo;
  }

  public Batch mpDeviceid(String mpDeviceid) {
    this.mpDeviceid = mpDeviceid;
    return this;
  }

   /**
   * Get mpDeviceid
   * @return mpDeviceid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getMpDeviceid() {
    return mpDeviceid;
  }

  public void setMpDeviceid(String mpDeviceid) {
    this.mpDeviceid = mpDeviceid;
  }

  public Batch attributionInfo(AttributionInfo attributionInfo) {
    this.attributionInfo = attributionInfo;
    return this;
  }

   /**
   * Get attributionInfo
   * @return attributionInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public AttributionInfo getAttributionInfo() {
    return attributionInfo;
  }

  public void setAttributionInfo(AttributionInfo attributionInfo) {
    this.attributionInfo = attributionInfo;
  }

  public Batch timestampUnixtimeMs(Long timestampUnixtimeMs) {
    this.timestampUnixtimeMs = timestampUnixtimeMs;
    return this;
  }

   /**
   * Get timestampUnixtimeMs
   * @return timestampUnixtimeMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Long getTimestampUnixtimeMs() {
    return timestampUnixtimeMs;
  }

  public void setTimestampUnixtimeMs(Long timestampUnixtimeMs) {
    this.timestampUnixtimeMs = timestampUnixtimeMs;
  }

  public Batch batchId(Long batchId) {
    this.batchId = batchId;
    return this;
  }

   /**
   * Get batchId
   * @return batchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Long getBatchId() {
    return batchId;
  }

  public void setBatchId(Long batchId) {
    this.batchId = batchId;
  }

  public Batch mpid(Long mpid) {
    this.mpid = mpid;
    return this;
  }

   /**
   * Get mpid
   * @return mpid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Long getMpid() {
    return mpid;
  }

  public void setMpid(Long mpid) {
    this.mpid = mpid;
  }

  public Batch sdkVersion(String sdkVersion) {
    this.sdkVersion = sdkVersion;
    return this;
  }

   /**
   * Get sdkVersion
   * @return sdkVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getSdkVersion() {
    return sdkVersion;
  }

  public void setSdkVersion(String sdkVersion) {
    this.sdkVersion = sdkVersion;
  }

  public Batch consentState(ConsentState consentState) {
    this.consentState = consentState;
    return this;
  }

   /**
   * Get consentState
   * @return consentState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public ConsentState getConsentState() {
    return consentState;
  }

  public void setConsentState(ConsentState consentState) {
    this.consentState = consentState;
  }

  public Batch jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Batch batch = (Batch) o;
    return Objects.equals(this.sourceRequestId, batch.sourceRequestId) &&
        Objects.equals(this.context, batch.context) &&
        Objects.equals(this.events, batch.events) &&
        Objects.equals(this.deviceInfo, batch.deviceInfo) &&
        Objects.equals(this.applicationInfo, batch.applicationInfo) &&
        Objects.equals(this.userAttributes, batch.userAttributes) &&
        Objects.equals(this.deletedUserAttributes, batch.deletedUserAttributes) &&
        Objects.equals(this.userIdentities, batch.userIdentities) &&
        Objects.equals(this.environment, batch.environment) &&
        Objects.equals(this.apiKey, batch.apiKey) &&
        Objects.equals(this.apiKeys, batch.apiKeys) &&
        Objects.equals(this.ip, batch.ip) &&
        Objects.equals(this.integrationAttributes, batch.integrationAttributes) &&
        Objects.equals(this.partnerIdentity, batch.partnerIdentity) &&
        Objects.equals(this.partnerIdentities, batch.partnerIdentities) &&
        Objects.equals(this.sourceInfo, batch.sourceInfo) &&
        Objects.equals(this.mpDeviceid, batch.mpDeviceid) &&
        Objects.equals(this.attributionInfo, batch.attributionInfo) &&
        Objects.equals(this.timestampUnixtimeMs, batch.timestampUnixtimeMs) &&
        Objects.equals(this.batchId, batch.batchId) &&
        Objects.equals(this.mpid, batch.mpid) &&
        Objects.equals(this.sdkVersion, batch.sdkVersion) &&
        Objects.equals(this.consentState, batch.consentState) &&
        Objects.equals(this.jobId, batch.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceRequestId, context, events, deviceInfo, applicationInfo, userAttributes, deletedUserAttributes, userIdentities, environment, apiKey, apiKeys, ip, integrationAttributes, partnerIdentity, partnerIdentities, sourceInfo, mpDeviceid, attributionInfo, timestampUnixtimeMs, batchId, mpid, sdkVersion, consentState, jobId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Batch {\n");
    sb.append("    sourceRequestId: ").append(toIndentedString(sourceRequestId)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    deviceInfo: ").append(toIndentedString(deviceInfo)).append("\n");
    sb.append("    applicationInfo: ").append(toIndentedString(applicationInfo)).append("\n");
    sb.append("    userAttributes: ").append(toIndentedString(userAttributes)).append("\n");
    sb.append("    deletedUserAttributes: ").append(toIndentedString(deletedUserAttributes)).append("\n");
    sb.append("    userIdentities: ").append(toIndentedString(userIdentities)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    apiKeys: ").append(toIndentedString(apiKeys)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    integrationAttributes: ").append(toIndentedString(integrationAttributes)).append("\n");
    sb.append("    partnerIdentity: ").append(toIndentedString(partnerIdentity)).append("\n");
    sb.append("    partnerIdentities: ").append(toIndentedString(partnerIdentities)).append("\n");
    sb.append("    sourceInfo: ").append(toIndentedString(sourceInfo)).append("\n");
    sb.append("    mpDeviceid: ").append(toIndentedString(mpDeviceid)).append("\n");
    sb.append("    attributionInfo: ").append(toIndentedString(attributionInfo)).append("\n");
    sb.append("    timestampUnixtimeMs: ").append(toIndentedString(timestampUnixtimeMs)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    mpid: ").append(toIndentedString(mpid)).append("\n");
    sb.append("    sdkVersion: ").append(toIndentedString(sdkVersion)).append("\n");
    sb.append("    consentState: ").append(toIndentedString(consentState)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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

