package com.mparticle.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserIdentities
 */

public class UserIdentities {
  public static final String SERIALIZED_NAME_OTHER = "other";
  @SerializedName(SERIALIZED_NAME_OTHER)
  private String other;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_FACEBOOK = "facebook";
  @SerializedName(SERIALIZED_NAME_FACEBOOK)
  private String facebook;

  public static final String SERIALIZED_NAME_TWITTER = "twitter";
  @SerializedName(SERIALIZED_NAME_TWITTER)
  private String twitter;

  public static final String SERIALIZED_NAME_GOOGLE = "google";
  @SerializedName(SERIALIZED_NAME_GOOGLE)
  private String google;

  public static final String SERIALIZED_NAME_MICROSOFT = "microsoft";
  @SerializedName(SERIALIZED_NAME_MICROSOFT)
  private String microsoft;

  public static final String SERIALIZED_NAME_YAHOO = "yahoo";
  @SerializedName(SERIALIZED_NAME_YAHOO)
  private String yahoo;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_FACEBOOK_CUSTOM_AUDIENCE_ID = "facebook_custom_audience_id";
  @SerializedName(SERIALIZED_NAME_FACEBOOK_CUSTOM_AUDIENCE_ID)
  private String facebookCustomAudienceId;

  public static final String SERIALIZED_NAME_OTHER_ID2 = "other_id_2";
  @SerializedName(SERIALIZED_NAME_OTHER_ID2)
  private String otherId2;

  public static final String SERIALIZED_NAME_OTHER_ID3 = "other_id_3";
  @SerializedName(SERIALIZED_NAME_OTHER_ID3)
  private String otherId3;

  public static final String SERIALIZED_NAME_OTHER_ID4 = "other_id_4";
  @SerializedName(SERIALIZED_NAME_OTHER_ID4)
  private String otherId4;

  public static final String SERIALIZED_NAME_OTHER_ID5 = "other_id_5";
  @SerializedName(SERIALIZED_NAME_OTHER_ID5)
  private String otherId5;

  public static final String SERIALIZED_NAME_OTHER_ID6 = "other_id_6";
  @SerializedName(SERIALIZED_NAME_OTHER_ID6)
  private String otherId6;

  public static final String SERIALIZED_NAME_OTHER_ID7 = "other_id_7";
  @SerializedName(SERIALIZED_NAME_OTHER_ID7)
  private String otherId7;

  public static final String SERIALIZED_NAME_OTHER_ID8 = "other_id_8";
  @SerializedName(SERIALIZED_NAME_OTHER_ID8)
  private String otherId8;

  public static final String SERIALIZED_NAME_OTHER_ID9 = "other_id_9";
  @SerializedName(SERIALIZED_NAME_OTHER_ID9)
  private String otherId9;

  public static final String SERIALIZED_NAME_OTHER_ID10 = "other_id_10";
  @SerializedName(SERIALIZED_NAME_OTHER_ID10)
  private String otherId10;

  public static final String SERIALIZED_NAME_MOBILE_NUMBER = "mobile_number";
  @SerializedName(SERIALIZED_NAME_MOBILE_NUMBER)
  private String mobileNumber;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_2 = "phone_number_2";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_2)
  private String phoneNumber2;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_3 = "phone_number_3";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_3)
  private String phoneNumber3;

  public UserIdentities other(String other) {
    this.other = other;
    return this;
  }

   /**
   * Get other
   * @return other
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getOther() {
    return other;
  }

  public void setOther(String other) {
    this.other = other;
  }

  public UserIdentities customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public UserIdentities facebook(String facebook) {
    this.facebook = facebook;
    return this;
  }

   /**
   * Get facebook
   * @return facebook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getFacebook() {
    return facebook;
  }

  public void setFacebook(String facebook) {
    this.facebook = facebook;
  }

  public UserIdentities twitter(String twitter) {
    this.twitter = twitter;
    return this;
  }

   /**
   * Get twitter
   * @return twitter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getTwitter() {
    return twitter;
  }

  public void setTwitter(String twitter) {
    this.twitter = twitter;
  }

  public UserIdentities google(String google) {
    this.google = google;
    return this;
  }

   /**
   * Get google
   * @return google
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getGoogle() {
    return google;
  }

  public void setGoogle(String google) {
    this.google = google;
  }

  public UserIdentities microsoft(String microsoft) {
    this.microsoft = microsoft;
    return this;
  }

   /**
   * Get microsoft
   * @return microsoft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getMicrosoft() {
    return microsoft;
  }

  public void setMicrosoft(String microsoft) {
    this.microsoft = microsoft;
  }

  public UserIdentities yahoo(String yahoo) {
    this.yahoo = yahoo;
    return this;
  }

   /**
   * Get yahoo
   * @return yahoo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getYahoo() {
    return yahoo;
  }

  public void setYahoo(String yahoo) {
    this.yahoo = yahoo;
  }

  public UserIdentities email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserIdentities alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Get alias
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public UserIdentities facebookCustomAudienceId(String facebookCustomAudienceId) {
    this.facebookCustomAudienceId = facebookCustomAudienceId;
    return this;
  }

   /**
   * Get facebookCustomAudienceId
   * @return facebookCustomAudienceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getFacebookCustomAudienceId() {
    return facebookCustomAudienceId;
  }

  public void setFacebookCustomAudienceId(String facebookCustomAudienceId) {
    this.facebookCustomAudienceId = facebookCustomAudienceId;
  }

  public UserIdentities otherId2(String otherId2) {
    this.otherId2 = otherId2;
    return this;
  }

   /**
   * Get otherId2
   * @return otherId2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getOtherId2() {
    return otherId2;
  }

  public void setOtherId2(String otherId2) {
    this.otherId2 = otherId2;
  }

  public UserIdentities otherId3(String otherId3) {
    this.otherId3 = otherId3;
    return this;
  }

   /**
   * Get otherId3
   * @return otherId3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getOtherId3() {
    return otherId3;
  }

  public void setOtherId3(String otherId3) {
    this.otherId3 = otherId3;
  }

  public UserIdentities otherId4(String otherId4) {
    this.otherId4 = otherId4;
    return this;
  }

  /**
   * Get otherId4
   * @return otherId4
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getOtherId4() {
    return otherId4;
  }

  public void setOtherId4(String otherId4) {
    this.otherId4 = otherId4;
  }

  public UserIdentities otherId5(String otherId5) {
    this.otherId5 = otherId5;
    return this;
  }

  /**
   * Get otherId5
   * @return otherId5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getOtherId5() {
    return otherId5;
  }

  public void setOtherId5(String otherId5) {
    this.otherId5 = otherId5;
  }

  public UserIdentities otherId6(String otherId6) {
    this.otherId6 = otherId6;
    return this;
  }

  /**
   * Get otherId6
   * @return otherId6
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getOtherId6() {
    return otherId6;
  }

  public void setOtherId6(String otherId6) {
    this.otherId6 = otherId6;
  }

  public UserIdentities otherId7(String otherId7) {
    this.otherId7 = otherId7;
    return this;
  }

  /**
   * Get otherId7
   * @return otherId7
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getOtherId7() {
    return otherId7;
  }

  public void setOtherId7(String otherId7) {
    this.otherId7 = otherId7;
  }

  public UserIdentities otherId8(String otherId8) {
    this.otherId8 = otherId8;
    return this;
  }

  /**
   * Get otherId8
   * @return otherId8
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getOtherId8() {
    return otherId8;
  }

  public void setOtherId8(String otherId8) {
    this.otherId8 = otherId8;
  }

  public UserIdentities otherId9(String otherId9) {
    this.otherId9 = otherId9;
    return this;
  }

  /**
   * Get otherId9
   * @return otherId9
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getOtherId9() {
    return otherId9;
  }

  public void setOtherId9(String otherId9) {
    this.otherId9 = otherId9;
  }

  public UserIdentities otherId10(String otherId10) {
    this.otherId10 = otherId10;
    return this;
  }

  /**
   * Get otherId10
   * @return otherId10
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getOtherId10() {
    return otherId10;
  }

  public void setOtherId10(String otherId10) {
    this.otherId10 = otherId10;
  }

  public UserIdentities phoneNumber2(String phoneNumber2) {
    this.phoneNumber2 = phoneNumber2;
    return this;
  }

  /**
   * Get phoneNumber2
   * @return phoneNumber2
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getPhoneNumber2() {
    return phoneNumber2;
  }

  public void setPhoneNumber2(String phoneNumber2) {
    this.phoneNumber2 = phoneNumber2;
  }

  public UserIdentities phoneNumber3(String phoneNumber3) {
    this.phoneNumber3 = phoneNumber3;
    return this;
  }

  /**
   * Get phoneNumber3
   * @return phoneNumber3
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getPhoneNumber3() {
    return phoneNumber3;
  }

  public void setPhoneNumber3(String phoneNumber3) {
    this.phoneNumber3 = phoneNumber3;
  }

  public UserIdentities mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * Get mobileNumber
   * @return mobileNumber
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserIdentities userIdentities = (UserIdentities) o;
    return Objects.equals(this.other, userIdentities.other) &&
        Objects.equals(this.customerId, userIdentities.customerId) &&
        Objects.equals(this.facebook, userIdentities.facebook) &&
        Objects.equals(this.twitter, userIdentities.twitter) &&
        Objects.equals(this.google, userIdentities.google) &&
        Objects.equals(this.microsoft, userIdentities.microsoft) &&
        Objects.equals(this.yahoo, userIdentities.yahoo) &&
        Objects.equals(this.email, userIdentities.email) &&
        Objects.equals(this.alias, userIdentities.alias) &&
        Objects.equals(this.facebookCustomAudienceId, userIdentities.facebookCustomAudienceId) &&
        Objects.equals(this.otherId2, userIdentities.otherId2) &&
        Objects.equals(this.otherId3, userIdentities.otherId3) &&
        Objects.equals(this.otherId4, userIdentities.otherId4) &&
        Objects.equals(this.otherId5, userIdentities.otherId5) &&
        Objects.equals(this.otherId6, userIdentities.otherId6) &&
        Objects.equals(this.otherId7, userIdentities.otherId7) &&
        Objects.equals(this.otherId8, userIdentities.otherId8) &&
        Objects.equals(this.otherId9, userIdentities.otherId9) &&
        Objects.equals(this.otherId10, userIdentities.otherId10) &&
        Objects.equals(this.phoneNumber2, userIdentities.phoneNumber2) &&
        Objects.equals(this.phoneNumber3, userIdentities.phoneNumber3) &&
        Objects.equals(this.mobileNumber, userIdentities.mobileNumber);

  }

  @Override
  public int hashCode() {
    return Objects.hash(other, customerId, facebook, twitter, google, microsoft, yahoo, email, alias, facebookCustomAudienceId, otherId2, otherId3, otherId4, otherId5, otherId6, otherId7, otherId8, otherId9, otherId10, phoneNumber2, phoneNumber3, mobileNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserIdentities {\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    facebook: ").append(toIndentedString(facebook)).append("\n");
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
    sb.append("    google: ").append(toIndentedString(google)).append("\n");
    sb.append("    microsoft: ").append(toIndentedString(microsoft)).append("\n");
    sb.append("    yahoo: ").append(toIndentedString(yahoo)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    facebookCustomAudienceId: ").append(toIndentedString(facebookCustomAudienceId)).append("\n");
    sb.append("    otherId2: ").append(toIndentedString(otherId2)).append("\n");
    sb.append("    otherId3: ").append(toIndentedString(otherId3)).append("\n");
    sb.append("    otherId4: ").append(toIndentedString(otherId4)).append("\n");
    sb.append("    otherId5: ").append(toIndentedString(otherId5)).append("\n");
    sb.append("    otherId6: ").append(toIndentedString(otherId6)).append("\n");
    sb.append("    otherId7: ").append(toIndentedString(otherId7)).append("\n");
    sb.append("    otherId8: ").append(toIndentedString(otherId8)).append("\n");
    sb.append("    otherId9: ").append(toIndentedString(otherId9)).append("\n");
    sb.append("    otherId10: ").append(toIndentedString(otherId10)).append("\n");
    sb.append("    phoneNumber2: ").append(toIndentedString(phoneNumber2)).append("\n");
    sb.append("    phoneNumber3: ").append(toIndentedString(phoneNumber3)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
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

