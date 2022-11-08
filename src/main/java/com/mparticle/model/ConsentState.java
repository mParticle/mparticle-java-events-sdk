package com.mparticle.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ConsentState
 */

public class ConsentState {
  public static final String SERIALIZED_NAME_GDPR = "gdpr";
  @SerializedName(SERIALIZED_NAME_GDPR)
  private Map gdprPurposes;

  static final String CCPA_PURPOSE_NAME = "data_sale_opt_out";
  public static final String SERIALIZED_NAME_CCPA = "ccpa";
  @SerializedName(SERIALIZED_NAME_CCPA)
  private Map ccpaPurposes;

  public ConsentState gdpr(String purposeName, ConsentPurpose gdprPurpose) {
    this.gdprPurposes.put(purposeName, gdprPurpose);
    return this;
  }

  /**
   * Get gdpr
   * @return gdprPurposes
   **/
  @ApiModelProperty(required = true, value = "")
  public Map getGdpr() {
    return gdprPurposes;
  }

  public void setGdpr(Map gdprPurposes) {
    this.gdprPurposes = gdprPurposes;
  }

  /**
   * Get ccpa
   * @return ccpaPurposes
   **/
  @ApiModelProperty(required = true, value = "")
  public Map getCcpa() {
    return ccpaPurposes;
  }

  public void setCcpa(ConsentPurpose ccpaPurpose) {
    Map ccpa = new HashMap<>();
    ccpa.put(CCPA_PURPOSE_NAME, ccpaPurpose);
    this.ccpaPurposes = ccpa;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentState consentState = (ConsentState) o;
    return Objects.equals(this.gdprPurposes, consentState.gdprPurposes)
            && Objects.equals(this.ccpaPurposes, consentState.ccpaPurposes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gdprPurposes, ccpaPurposes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentState {\n");
    sb.append("    gdpr: ").append(toIndentedString(gdprPurposes)).append("\n");
    sb.append("    ccpa: ").append(toIndentedString(ccpaPurposes)).append("\n");
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

