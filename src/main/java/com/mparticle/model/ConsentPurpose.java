package com.mparticle.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * ConsentPurpose
 */

public class ConsentPurpose {
  public static final String SERIALIZED_NAME_REGULATION = "regulation";
  @SerializedName(SERIALIZED_NAME_REGULATION)
  private String regulation;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private String document;

  public static final String SERIALIZED_NAME_CONSENTED = "consented";
  @SerializedName(SERIALIZED_NAME_CONSENTED)
  private Boolean consented;

  public static final String SERIALIZED_NAME_TIMESTAMP_UNIXTIME_MS = "timestamp_unixtime_ms";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP_UNIXTIME_MS)
  private Long timestampUnixtimeMs;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_HARDWARE_ID = "hardware_id";
  @SerializedName(SERIALIZED_NAME_HARDWARE_ID)
  private String hardwareId;

  public ConsentPurpose regulation(String regulation) {
    this.regulation = regulation;
    return this;
  }

   /**
   * Get regulation
   * @return regulation
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRegulation() {
    return regulation;
  }

  public void setRegulation(String regulation) {
    this.regulation = regulation;
  }

  public ConsentPurpose document(String document) {
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public ConsentPurpose consented(Boolean consented) {
    this.consented = consented;
    return this;
  }

   /**
   * Get consented
   * @return consented
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getConsented() {
    return consented;
  }

  public void setConsented(Boolean consented) {
    this.consented = consented;
  }

  public ConsentPurpose timestampUnixtimeMs(Long timestampUnixtimeMs) {
    this.timestampUnixtimeMs = timestampUnixtimeMs;
    return this;
  }

   /**
   * Get timestampUnixtimeMs
   * @return timestampUnixtimeMs
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getTimestampUnixtimeMs() {
    return timestampUnixtimeMs;
  }

  public void setTimestampUnixtimeMs(Long timestampUnixtimeMs) {
    this.timestampUnixtimeMs = timestampUnixtimeMs;
  }

  public ConsentPurpose location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public ConsentPurpose hardwareId(String hardwareId) {
    this.hardwareId = hardwareId;
    return this;
  }

   /**
   * Get hardwareId
   * @return hardwareId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getHardwareId() {
    return hardwareId;
  }

  public void setHardwareId(String hardwareId) {
    this.hardwareId = hardwareId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentPurpose purpose = (ConsentPurpose) o;
    return Objects.equals(this.regulation, purpose.regulation) &&
        Objects.equals(this.document, purpose.document) &&
        Objects.equals(this.consented, purpose.consented) &&
        Objects.equals(this.timestampUnixtimeMs, purpose.timestampUnixtimeMs) &&
        Objects.equals(this.location, purpose.location) &&
        Objects.equals(this.hardwareId, purpose.hardwareId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regulation, document, consented, timestampUnixtimeMs, location, hardwareId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentPurpose {\n");
    sb.append("    regulation: ").append(toIndentedString(regulation)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    consented: ").append(toIndentedString(consented)).append("\n");
    sb.append("    timestampUnixtimeMs: ").append(toIndentedString(timestampUnixtimeMs)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    hardwareId: ").append(toIndentedString(hardwareId)).append("\n");
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

