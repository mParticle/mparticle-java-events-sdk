package com.mparticle.model;

/**
 * Gets or Sets IdentityType
 */
public enum IdentityType {
  
  OTHER("other"),
  
  CUSTOMER_ID("customer_id"),
  
  FACEBOOK("facebook"),
  
  TWITTER("twitter"),
  
  GOOGLE("google"),
  
  MICROSOFT("microsoft"),
  
  YAHOO("yahoo"),
  
  EMAIL("email"),
  
  ALIAS("alias"),
  
  FACEBOOK_CUSTOM_AUDIENCE_ID("facebook_custom_audience_id"),
  
  OTHER_ID_2("other_id_2"),
  
  OTHER_ID_3("other_id_3"),
  
  OTHER_ID_4("other_id_4"),

  OTHER_ID_5("other_id_5"),

  OTHER_ID_6("other_id_6"),

  OTHER_ID_7("other_id_7"),

  OTHER_ID_8("other_id_8"),

  OTHER_ID_9("other_id_9"),

  OTHER_ID_10("other_id_10"),

  MOBILE_NUMBER("mobile_number"),

  PHONE_NUMBER_2("phone_number_2"),

  PHONE_NUMBER_3("phone_number_3");

  private String value;

  IdentityType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IdentityType fromValue(String value) {
    for (IdentityType b : IdentityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

