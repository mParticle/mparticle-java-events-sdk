package com.mparticle.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeviceInformation
 */

public class DeviceInformation {
  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private String product;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private String device;

  public static final String SERIALIZED_NAME_ANDROID_UUID = "android_uuid";
  @SerializedName(SERIALIZED_NAME_ANDROID_UUID)
  private String androidUuid;

  public static final String SERIALIZED_NAME_DEVICE_MANUFACTURER = "device_manufacturer";
  @SerializedName(SERIALIZED_NAME_DEVICE_MANUFACTURER)
  private String deviceManufacturer;

  /**
   * Gets or Sets platform
   */
  public enum PlatformEnum {
    IOS("iOS"),
    
    ANDROID("Android"),
    
    WEB("web"),
    
    DESKTOP("desktop"),
    
    TVOS("tvOS"),
    
    ROKU("roku"),
    
    OUT_OF_BAND("out_of_band"),
    
    SMART_TV("smart_tv"),
    
    XBOX("xbox");

    private String value;

    PlatformEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlatformEnum fromValue(String value) {
      for (PlatformEnum b : PlatformEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private PlatformEnum platform;

  public static final String SERIALIZED_NAME_OS_VERSION = "os_version";
  @SerializedName(SERIALIZED_NAME_OS_VERSION)
  private String osVersion;

  public static final String SERIALIZED_NAME_DEVICE_MODEL = "device_model";
  @SerializedName(SERIALIZED_NAME_DEVICE_MODEL)
  private String deviceModel;

  public static final String SERIALIZED_NAME_SCREEN_HEIGHT = "screen_height";
  @SerializedName(SERIALIZED_NAME_SCREEN_HEIGHT)
  private Integer screenHeight;

  public static final String SERIALIZED_NAME_SCREEN_WIDTH = "screen_width";
  @SerializedName(SERIALIZED_NAME_SCREEN_WIDTH)
  private Integer screenWidth;

  public static final String SERIALIZED_NAME_SCREEN_DPI = "screen_dpi";
  @SerializedName(SERIALIZED_NAME_SCREEN_DPI)
  private Integer screenDpi;

  public static final String SERIALIZED_NAME_DEVICE_COUNTRY = "device_country";
  @SerializedName(SERIALIZED_NAME_DEVICE_COUNTRY)
  private String deviceCountry;

  public static final String SERIALIZED_NAME_LOCALE_LANGUAGE = "locale_language";
  @SerializedName(SERIALIZED_NAME_LOCALE_LANGUAGE)
  private String localeLanguage;

  public static final String SERIALIZED_NAME_LOCALE_COUNTRY = "locale_country";
  @SerializedName(SERIALIZED_NAME_LOCALE_COUNTRY)
  private String localeCountry;

  public static final String SERIALIZED_NAME_NETWORK_COUNTRY = "network_country";
  @SerializedName(SERIALIZED_NAME_NETWORK_COUNTRY)
  private String networkCountry;

  public static final String SERIALIZED_NAME_NETWORK_CARRIER = "network_carrier";
  @SerializedName(SERIALIZED_NAME_NETWORK_CARRIER)
  private String networkCarrier;

  public static final String SERIALIZED_NAME_NETWORK_CODE = "network_code";
  @SerializedName(SERIALIZED_NAME_NETWORK_CODE)
  private String networkCode;

  public static final String SERIALIZED_NAME_NETWORK_MOBILE_COUNTRY_CODE = "network_mobile_country_code";
  @SerializedName(SERIALIZED_NAME_NETWORK_MOBILE_COUNTRY_CODE)
  private String networkMobileCountryCode;

  public static final String SERIALIZED_NAME_TIMEZONE_OFFSET = "timezone_offset";
  @SerializedName(SERIALIZED_NAME_TIMEZONE_OFFSET)
  private Integer timezoneOffset;

  public static final String SERIALIZED_NAME_BUILD_IDENTIFIER = "build_identifier";
  @SerializedName(SERIALIZED_NAME_BUILD_IDENTIFIER)
  private String buildIdentifier;

  public static final String SERIALIZED_NAME_HTTP_HEADER_USER_AGENT = "http_header_user_agent";
  @SerializedName(SERIALIZED_NAME_HTTP_HEADER_USER_AGENT)
  private String httpHeaderUserAgent;

  public static final String SERIALIZED_NAME_IOS_ADVERTISING_ID = "ios_advertising_id";
  @SerializedName(SERIALIZED_NAME_IOS_ADVERTISING_ID)
  private String iosAdvertisingId;

  public static final String SERIALIZED_NAME_PUSH_TOKEN = "push_token";
  @SerializedName(SERIALIZED_NAME_PUSH_TOKEN)
  private String pushToken;

  public static final String SERIALIZED_NAME_CPU_ARCHITECTURE = "cpu_architecture";
  @SerializedName(SERIALIZED_NAME_CPU_ARCHITECTURE)
  private String cpuArchitecture;

  public static final String SERIALIZED_NAME_IS_TABLET = "is_tablet";
  @SerializedName(SERIALIZED_NAME_IS_TABLET)
  private Boolean isTablet;

  public static final String SERIALIZED_NAME_PUSH_NOTIFICATION_SOUND_ENABLED = "push_notification_sound_enabled";
  @SerializedName(SERIALIZED_NAME_PUSH_NOTIFICATION_SOUND_ENABLED)
  private Boolean pushNotificationSoundEnabled;

  public static final String SERIALIZED_NAME_PUSH_NOTIFICATION_VIBRATE_ENABLED = "push_notification_vibrate_enabled";
  @SerializedName(SERIALIZED_NAME_PUSH_NOTIFICATION_VIBRATE_ENABLED)
  private Boolean pushNotificationVibrateEnabled;

  public static final String SERIALIZED_NAME_RADIO_ACCESS_TECHNOLOGY = "radio_access_technology";
  @SerializedName(SERIALIZED_NAME_RADIO_ACCESS_TECHNOLOGY)
  private String radioAccessTechnology;

  public static final String SERIALIZED_NAME_SUPPORTS_TELEPHONY = "supports_telephony";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_TELEPHONY)
  private Boolean supportsTelephony;

  public static final String SERIALIZED_NAME_HAS_NFC = "has_nfc";
  @SerializedName(SERIALIZED_NAME_HAS_NFC)
  private Boolean hasNfc;

  public static final String SERIALIZED_NAME_BLUETOOTH_ENABLED = "bluetooth_enabled";
  @SerializedName(SERIALIZED_NAME_BLUETOOTH_ENABLED)
  private Boolean bluetoothEnabled;

  public static final String SERIALIZED_NAME_BLUETOOTH_VERSION = "bluetooth_version";
  @SerializedName(SERIALIZED_NAME_BLUETOOTH_VERSION)
  private String bluetoothVersion;

  public static final String SERIALIZED_NAME_ATT_TIMESTAMP_UNIXTIME_MS = "att_timestamp_unixtime_ms";
  @SerializedName(SERIALIZED_NAME_ATT_TIMESTAMP_UNIXTIME_MS)
  private Long attTimestampUnixtimeMs;

  /**
   * Gets or Sets attAuthorizationStatus
   */
  public enum ATTStatusEnum {
    AUTHORIZED("authorized"),
    
    DENIED("denied"),
    
    NOT_DETERMINED("not_determined"),
    
    RESTRICTED("restricted");

    private String value;

    ATTStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ATTStatusEnum fromValue(String value) {
      for (ATTStatusEnum b : ATTStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String SERIALIZED_NAME_ATT_AUTHORIZATION_STATUS = "att_authorization_status";
  @SerializedName(SERIALIZED_NAME_ATT_AUTHORIZATION_STATUS)
  private ATTStatusEnum attAuthorizationStatus;

  public static final String SERIALIZED_NAME_IOS_IDFV = "ios_idfv";
  @SerializedName(SERIALIZED_NAME_IOS_IDFV)
  private String iosIdfv;

  public static final String SERIALIZED_NAME_ANDROID_ADVERTISING_ID = "android_advertising_id";
  @SerializedName(SERIALIZED_NAME_ANDROID_ADVERTISING_ID)
  private String androidAdvertisingId;

  public static final String SERIALIZED_NAME_BUILD_VERSION_RELEASE = "build_version_release";
  @SerializedName(SERIALIZED_NAME_BUILD_VERSION_RELEASE)
  private String buildVersionRelease;

  public static final String SERIALIZED_NAME_LIMIT_AD_TRACKING = "limit_ad_tracking";
  @SerializedName(SERIALIZED_NAME_LIMIT_AD_TRACKING)
  private Boolean limitAdTracking;

  public static final String SERIALIZED_NAME_AMP_ID = "amp_id";
  @SerializedName(SERIALIZED_NAME_AMP_ID)
  private String ampId;

  public static final String SERIALIZED_NAME_IS_DST = "is_dst";
  @SerializedName(SERIALIZED_NAME_IS_DST)
  private Boolean isDst;

  public static final String SERIALIZED_NAME_ROKU_ADVERTISING_ID = "roku_advertising_id";
  @SerializedName(SERIALIZED_NAME_ROKU_ADVERTISING_ID)
  private String rokuAdvertisingId;

  public static final String SERIALIZED_NAME_ROKU_PUBLISHER_ID = "roku_publisher_id";
  @SerializedName(SERIALIZED_NAME_ROKU_PUBLISHER_ID)
  private String rokuPublisherId;

  public static final String SERIALIZED_NAME_MICROSOFT_ADVERTISING_ID = "microsoft_advertising_id";
  @SerializedName(SERIALIZED_NAME_MICROSOFT_ADVERTISING_ID)
  private String microsoftAdvertisingId;

  public static final String SERIALIZED_NAME_MICROSOFT_PUBLISHER_ID = "microsoft_publisher_id";
  @SerializedName(SERIALIZED_NAME_MICROSOFT_PUBLISHER_ID)
  private String microsoftPublisherId;

  public static final String SERIALIZED_NAME_FIRE_ADVERTISING_ID = "fire_advertising_id";
  @SerializedName(SERIALIZED_NAME_FIRE_ADVERTISING_ID)
  private String fireAdvertisingId;

  public DeviceInformation brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public DeviceInformation product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public DeviceInformation device(String device) {
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getDevice() {
    return device;
  }

  public void setDevice(String device) {
    this.device = device;
  }

  public DeviceInformation androidUuid(String androidUuid) {
    this.androidUuid = androidUuid;
    return this;
  }

   /**
   * Get androidUuid
   * @return androidUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getAndroidUuid() {
    return androidUuid;
  }

  public void setAndroidUuid(String androidUuid) {
    this.androidUuid = androidUuid;
  }

  public DeviceInformation deviceManufacturer(String deviceManufacturer) {
    this.deviceManufacturer = deviceManufacturer;
    return this;
  }

   /**
   * Get deviceManufacturer
   * @return deviceManufacturer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getDeviceManufacturer() {
    return deviceManufacturer;
  }

  public void setDeviceManufacturer(String deviceManufacturer) {
    this.deviceManufacturer = deviceManufacturer;
  }

  public DeviceInformation platform(PlatformEnum platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public PlatformEnum getPlatform() {
    return platform;
  }

  public void setPlatform(PlatformEnum platform) {
    this.platform = platform;
  }

  public DeviceInformation osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

   /**
   * Get osVersion
   * @return osVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public DeviceInformation deviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
    return this;
  }

   /**
   * Get deviceModel
   * @return deviceModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  public DeviceInformation screenHeight(Integer screenHeight) {
    this.screenHeight = screenHeight;
    return this;
  }

   /**
   * Get screenHeight
   * @return screenHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getScreenHeight() {
    return screenHeight;
  }

  public void setScreenHeight(Integer screenHeight) {
    this.screenHeight = screenHeight;
  }

  public DeviceInformation screenWidth(Integer screenWidth) {
    this.screenWidth = screenWidth;
    return this;
  }

   /**
   * Get screenWidth
   * @return screenWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getScreenWidth() {
    return screenWidth;
  }

  public void setScreenWidth(Integer screenWidth) {
    this.screenWidth = screenWidth;
  }

  public DeviceInformation screenDpi(Integer screenDpi) {
    this.screenDpi = screenDpi;
    return this;
  }

   /**
   * Get screenDpi
   * @return screenDpi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getScreenDpi() {
    return screenDpi;
  }

  public void setScreenDpi(Integer screenDpi) {
    this.screenDpi = screenDpi;
  }

  public DeviceInformation deviceCountry(String deviceCountry) {
    this.deviceCountry = deviceCountry;
    return this;
  }

   /**
   * Get deviceCountry
   * @return deviceCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getDeviceCountry() {
    return deviceCountry;
  }

  public void setDeviceCountry(String deviceCountry) {
    this.deviceCountry = deviceCountry;
  }

  public DeviceInformation localeLanguage(String localeLanguage) {
    this.localeLanguage = localeLanguage;
    return this;
  }

   /**
   * Get localeLanguage
   * @return localeLanguage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getLocaleLanguage() {
    return localeLanguage;
  }

  public void setLocaleLanguage(String localeLanguage) {
    this.localeLanguage = localeLanguage;
  }

  public DeviceInformation localeCountry(String localeCountry) {
    this.localeCountry = localeCountry;
    return this;
  }

   /**
   * Get localeCountry
   * @return localeCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getLocaleCountry() {
    return localeCountry;
  }

  public void setLocaleCountry(String localeCountry) {
    this.localeCountry = localeCountry;
  }

  public DeviceInformation networkCountry(String networkCountry) {
    this.networkCountry = networkCountry;
    return this;
  }

   /**
   * Get networkCountry
   * @return networkCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getNetworkCountry() {
    return networkCountry;
  }

  public void setNetworkCountry(String networkCountry) {
    this.networkCountry = networkCountry;
  }

  public DeviceInformation networkCarrier(String networkCarrier) {
    this.networkCarrier = networkCarrier;
    return this;
  }

   /**
   * Get networkCarrier
   * @return networkCarrier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getNetworkCarrier() {
    return networkCarrier;
  }

  public void setNetworkCarrier(String networkCarrier) {
    this.networkCarrier = networkCarrier;
  }

  public DeviceInformation networkCode(String networkCode) {
    this.networkCode = networkCode;
    return this;
  }

   /**
   * Get networkCode
   * @return networkCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getNetworkCode() {
    return networkCode;
  }

  public void setNetworkCode(String networkCode) {
    this.networkCode = networkCode;
  }

  public DeviceInformation networkMobileCountryCode(String networkMobileCountryCode) {
    this.networkMobileCountryCode = networkMobileCountryCode;
    return this;
  }

   /**
   * Get networkMobileCountryCode
   * @return networkMobileCountryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getNetworkMobileCountryCode() {
    return networkMobileCountryCode;
  }

  public void setNetworkMobileCountryCode(String networkMobileCountryCode) {
    this.networkMobileCountryCode = networkMobileCountryCode;
  }

  public DeviceInformation timezoneOffset(Integer timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
    return this;
  }

   /**
   * Get timezoneOffset
   * @return timezoneOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getTimezoneOffset() {
    return timezoneOffset;
  }

  public void setTimezoneOffset(Integer timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
  }

  public DeviceInformation buildIdentifier(String buildIdentifier) {
    this.buildIdentifier = buildIdentifier;
    return this;
  }

   /**
   * Get buildIdentifier
   * @return buildIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getBuildIdentifier() {
    return buildIdentifier;
  }

  public void setBuildIdentifier(String buildIdentifier) {
    this.buildIdentifier = buildIdentifier;
  }

  public DeviceInformation httpHeaderUserAgent(String httpHeaderUserAgent) {
    this.httpHeaderUserAgent = httpHeaderUserAgent;
    return this;
  }

   /**
   * Get httpHeaderUserAgent
   * @return httpHeaderUserAgent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getHttpHeaderUserAgent() {
    return httpHeaderUserAgent;
  }

  public void setHttpHeaderUserAgent(String httpHeaderUserAgent) {
    this.httpHeaderUserAgent = httpHeaderUserAgent;
  }

  public DeviceInformation iosAdvertisingId(String iosAdvertisingId) {
    this.iosAdvertisingId = iosAdvertisingId;
    return this;
  }

   /**
   * Get iosAdvertisingId
   * @return iosAdvertisingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getIosAdvertisingId() {
    return iosAdvertisingId;
  }

  public void setIosAdvertisingId(String iosAdvertisingId) {
    this.iosAdvertisingId = iosAdvertisingId;
  }

  public DeviceInformation pushToken(String pushToken) {
    this.pushToken = pushToken;
    return this;
  }

   /**
   * Get pushToken
   * @return pushToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getPushToken() {
    return pushToken;
  }

  public void setPushToken(String pushToken) {
    this.pushToken = pushToken;
  }

  public DeviceInformation cpuArchitecture(String cpuArchitecture) {
    this.cpuArchitecture = cpuArchitecture;
    return this;
  }

   /**
   * Get cpuArchitecture
   * @return cpuArchitecture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getCpuArchitecture() {
    return cpuArchitecture;
  }

  public void setCpuArchitecture(String cpuArchitecture) {
    this.cpuArchitecture = cpuArchitecture;
  }

  public DeviceInformation isTablet(Boolean isTablet) {
    this.isTablet = isTablet;
    return this;
  }

   /**
   * Get isTablet
   * @return isTablet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getIsTablet() {
    return isTablet;
  }

  public void setIsTablet(Boolean isTablet) {
    this.isTablet = isTablet;
  }

  public DeviceInformation pushNotificationSoundEnabled(Boolean pushNotificationSoundEnabled) {
    this.pushNotificationSoundEnabled = pushNotificationSoundEnabled;
    return this;
  }

   /**
   * Get pushNotificationSoundEnabled
   * @return pushNotificationSoundEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getPushNotificationSoundEnabled() {
    return pushNotificationSoundEnabled;
  }

  public void setPushNotificationSoundEnabled(Boolean pushNotificationSoundEnabled) {
    this.pushNotificationSoundEnabled = pushNotificationSoundEnabled;
  }

  public DeviceInformation pushNotificationVibrateEnabled(Boolean pushNotificationVibrateEnabled) {
    this.pushNotificationVibrateEnabled = pushNotificationVibrateEnabled;
    return this;
  }

   /**
   * Get pushNotificationVibrateEnabled
   * @return pushNotificationVibrateEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getPushNotificationVibrateEnabled() {
    return pushNotificationVibrateEnabled;
  }

  public void setPushNotificationVibrateEnabled(Boolean pushNotificationVibrateEnabled) {
    this.pushNotificationVibrateEnabled = pushNotificationVibrateEnabled;
  }

  public DeviceInformation radioAccessTechnology(String radioAccessTechnology) {
    this.radioAccessTechnology = radioAccessTechnology;
    return this;
  }

   /**
   * Get radioAccessTechnology
   * @return radioAccessTechnology
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getRadioAccessTechnology() {
    return radioAccessTechnology;
  }

  public void setRadioAccessTechnology(String radioAccessTechnology) {
    this.radioAccessTechnology = radioAccessTechnology;
  }

  public DeviceInformation supportsTelephony(Boolean supportsTelephony) {
    this.supportsTelephony = supportsTelephony;
    return this;
  }

   /**
   * Get supportsTelephony
   * @return supportsTelephony
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getSupportsTelephony() {
    return supportsTelephony;
  }

  public void setSupportsTelephony(Boolean supportsTelephony) {
    this.supportsTelephony = supportsTelephony;
  }

  public DeviceInformation hasNfc(Boolean hasNfc) {
    this.hasNfc = hasNfc;
    return this;
  }

   /**
   * Get hasNfc
   * @return hasNfc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getHasNfc() {
    return hasNfc;
  }

  public void setHasNfc(Boolean hasNfc) {
    this.hasNfc = hasNfc;
  }

  public DeviceInformation bluetoothEnabled(Boolean bluetoothEnabled) {
    this.bluetoothEnabled = bluetoothEnabled;
    return this;
  }

   /**
   * Get bluetoothEnabled
   * @return bluetoothEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getBluetoothEnabled() {
    return bluetoothEnabled;
  }

  public void setBluetoothEnabled(Boolean bluetoothEnabled) {
    this.bluetoothEnabled = bluetoothEnabled;
  }

  public DeviceInformation bluetoothVersion(String bluetoothVersion) {
    this.bluetoothVersion = bluetoothVersion;
    return this;
  }

   /**
   * Get bluetoothVersion
   * @return bluetoothVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getBluetoothVersion() {
    return bluetoothVersion;
  }

  public void setBluetoothVersion(String bluetoothVersion) {
    this.bluetoothVersion = bluetoothVersion;
  }

  public DeviceInformation attTimestampUnixtimeMs(Long attTimestampUnixtimeMs) {
    this.attTimestampUnixtimeMs = attTimestampUnixtimeMs;
    return this;
  }

   /**
   * Get attTimestampUnixtimeMs
   * @return attTimestampUnixtimeMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Long getATTTimestampUnixtimeMs() {
    return attTimestampUnixtimeMs;
  }

  public void setATTTimestampUnixtimeMs(Long attTimestampUnixtimeMs) {
    this.attTimestampUnixtimeMs = attTimestampUnixtimeMs;
  }

  public DeviceInformation attAuthorizationStatus(ATTStatusEnum attAuthorizationStatus) {
    this.attAuthorizationStatus = attAuthorizationStatus;
    return this;
  }

   /**
   * Get attAuthorizationStatus
   * @return attAuthorizationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public ATTStatusEnum getATTAuthorizationStatus() {
    return attAuthorizationStatus;
  }

  public void setATTAuthorizationStatus(ATTStatusEnum attAuthorizationStatus) {
    this.attAuthorizationStatus = attAuthorizationStatus;
  }

  public DeviceInformation iosIdfv(String iosIdfv) {
    this.iosIdfv = iosIdfv;
    return this;
  }

   /**
   * Get iosIdfv
   * @return iosIdfv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getIosIdfv() {
    return iosIdfv;
  }

  public void setIosIdfv(String iosIdfv) {
    this.iosIdfv = iosIdfv;
  }

  public DeviceInformation androidAdvertisingId(String androidAdvertisingId) {
    this.androidAdvertisingId = androidAdvertisingId;
    return this;
  }

   /**
   * Get androidAdvertisingId
   * @return androidAdvertisingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getAndroidAdvertisingId() {
    return androidAdvertisingId;
  }

  public void setAndroidAdvertisingId(String androidAdvertisingId) {
    this.androidAdvertisingId = androidAdvertisingId;
  }

  public DeviceInformation buildVersionRelease(String buildVersionRelease) {
    this.buildVersionRelease = buildVersionRelease;
    return this;
  }

   /**
   * Get buildVersionRelease
   * @return buildVersionRelease
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getBuildVersionRelease() {
    return buildVersionRelease;
  }

  public void setBuildVersionRelease(String buildVersionRelease) {
    this.buildVersionRelease = buildVersionRelease;
  }

  public DeviceInformation limitAdTracking(Boolean limitAdTracking) {
    this.limitAdTracking = limitAdTracking;
    return this;
  }

   /**
   * Get limitAdTracking
   * @return limitAdTracking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getLimitAdTracking() {
    return limitAdTracking;
  }

  public void setLimitAdTracking(Boolean limitAdTracking) {
    this.limitAdTracking = limitAdTracking;
  }

  public DeviceInformation ampId(String ampId) {
    this.ampId = ampId;
    return this;
  }

   /**
   * Get ampId
   * @return ampId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getAmpId() {
    return ampId;
  }

  public void setAmpId(String ampId) {
    this.ampId = ampId;
  }

  public DeviceInformation isDst(Boolean isDst) {
    this.isDst = isDst;
    return this;
  }

   /**
   * Get isDst
   * @return isDst
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getIsDst() {
    return isDst;
  }

  public void setIsDst(Boolean isDst) {
    this.isDst = isDst;
  }

  public DeviceInformation rokuAdvertisingId(String rokuAdvertisingId) {
    this.rokuAdvertisingId = rokuAdvertisingId;
    return this;
  }

   /**
   * Get rokuAdvertisingId
   * @return rokuAdvertisingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getRokuAdvertisingId() {
    return rokuAdvertisingId;
  }

  public void setRokuAdvertisingId(String rokuAdvertisingId) {
    this.rokuAdvertisingId = rokuAdvertisingId;
  }

  public DeviceInformation rokuPublisherId(String rokuPublisherId) {
    this.rokuPublisherId = rokuPublisherId;
    return this;
  }

   /**
   * Get rokuPublisherId
   * @return rokuPublisherId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getRokuPublisherId() {
    return rokuPublisherId;
  }

  public void setRokuPublisherId(String rokuPublisherId) {
    this.rokuPublisherId = rokuPublisherId;
  }

  public DeviceInformation microsoftAdvertisingId(String microsoftAdvertisingId) {
    this.microsoftAdvertisingId = microsoftAdvertisingId;
    return this;
  }

   /**
   * Get microsoftAdvertisingId
   * @return microsoftAdvertisingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getMicrosoftAdvertisingId() {
    return microsoftAdvertisingId;
  }

  public void setMicrosoftAdvertisingId(String microsoftAdvertisingId) {
    this.microsoftAdvertisingId = microsoftAdvertisingId;
  }

  public DeviceInformation microsoftPublisherId(String microsoftPublisherId) {
    this.microsoftPublisherId = microsoftPublisherId;
    return this;
  }

   /**
   * Get microsoftPublisherId
   * @return microsoftPublisherId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getMicrosoftPublisherId() {
    return microsoftPublisherId;
  }

  public void setMicrosoftPublisherId(String microsoftPublisherId) {
    this.microsoftPublisherId = microsoftPublisherId;
  }

  public DeviceInformation fireAdvertisingId(String fireAdvertisingId) {
    this.fireAdvertisingId = fireAdvertisingId;
    return this;
  }

   /**
   * Get fireAdvertisingId
   * @return fireAdvertisingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getFireAdvertisingId() {
    return fireAdvertisingId;
  }

  public void setFireAdvertisingId(String fireAdvertisingId) {
    this.fireAdvertisingId = fireAdvertisingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceInformation deviceInformation = (DeviceInformation) o;
    return Objects.equals(this.brand, deviceInformation.brand) &&
        Objects.equals(this.product, deviceInformation.product) &&
        Objects.equals(this.device, deviceInformation.device) &&
        Objects.equals(this.androidUuid, deviceInformation.androidUuid) &&
        Objects.equals(this.deviceManufacturer, deviceInformation.deviceManufacturer) &&
        Objects.equals(this.platform, deviceInformation.platform) &&
        Objects.equals(this.osVersion, deviceInformation.osVersion) &&
        Objects.equals(this.deviceModel, deviceInformation.deviceModel) &&
        Objects.equals(this.screenHeight, deviceInformation.screenHeight) &&
        Objects.equals(this.screenWidth, deviceInformation.screenWidth) &&
        Objects.equals(this.screenDpi, deviceInformation.screenDpi) &&
        Objects.equals(this.deviceCountry, deviceInformation.deviceCountry) &&
        Objects.equals(this.localeLanguage, deviceInformation.localeLanguage) &&
        Objects.equals(this.localeCountry, deviceInformation.localeCountry) &&
        Objects.equals(this.networkCountry, deviceInformation.networkCountry) &&
        Objects.equals(this.networkCarrier, deviceInformation.networkCarrier) &&
        Objects.equals(this.networkCode, deviceInformation.networkCode) &&
        Objects.equals(this.networkMobileCountryCode, deviceInformation.networkMobileCountryCode) &&
        Objects.equals(this.timezoneOffset, deviceInformation.timezoneOffset) &&
        Objects.equals(this.buildIdentifier, deviceInformation.buildIdentifier) &&
        Objects.equals(this.httpHeaderUserAgent, deviceInformation.httpHeaderUserAgent) &&
        Objects.equals(this.iosAdvertisingId, deviceInformation.iosAdvertisingId) &&
        Objects.equals(this.pushToken, deviceInformation.pushToken) &&
        Objects.equals(this.cpuArchitecture, deviceInformation.cpuArchitecture) &&
        Objects.equals(this.isTablet, deviceInformation.isTablet) &&
        Objects.equals(this.pushNotificationSoundEnabled, deviceInformation.pushNotificationSoundEnabled) &&
        Objects.equals(this.pushNotificationVibrateEnabled, deviceInformation.pushNotificationVibrateEnabled) &&
        Objects.equals(this.radioAccessTechnology, deviceInformation.radioAccessTechnology) &&
        Objects.equals(this.supportsTelephony, deviceInformation.supportsTelephony) &&
        Objects.equals(this.hasNfc, deviceInformation.hasNfc) &&
        Objects.equals(this.bluetoothEnabled, deviceInformation.bluetoothEnabled) &&
        Objects.equals(this.bluetoothVersion, deviceInformation.bluetoothVersion) &&
        Objects.equals(this.attTimestampUnixtimeMs, deviceInformation.attTimestampUnixtimeMs) &&
        Objects.equals(this.attAuthorizationStatus, deviceInformation.attAuthorizationStatus) &&
        Objects.equals(this.iosIdfv, deviceInformation.iosIdfv) &&
        Objects.equals(this.androidAdvertisingId, deviceInformation.androidAdvertisingId) &&
        Objects.equals(this.buildVersionRelease, deviceInformation.buildVersionRelease) &&
        Objects.equals(this.limitAdTracking, deviceInformation.limitAdTracking) &&
        Objects.equals(this.ampId, deviceInformation.ampId) &&
        Objects.equals(this.isDst, deviceInformation.isDst) &&
        Objects.equals(this.rokuAdvertisingId, deviceInformation.rokuAdvertisingId) &&
        Objects.equals(this.rokuPublisherId, deviceInformation.rokuPublisherId) &&
        Objects.equals(this.microsoftAdvertisingId, deviceInformation.microsoftAdvertisingId) &&
        Objects.equals(this.microsoftPublisherId, deviceInformation.microsoftPublisherId) &&
        Objects.equals(this.fireAdvertisingId, deviceInformation.fireAdvertisingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, product, device, androidUuid, deviceManufacturer, platform, osVersion, deviceModel, screenHeight, screenWidth, screenDpi, deviceCountry, localeLanguage, localeCountry, networkCountry, networkCarrier, networkCode, networkMobileCountryCode, timezoneOffset, buildIdentifier, httpHeaderUserAgent, iosAdvertisingId, pushToken, cpuArchitecture, isTablet, pushNotificationSoundEnabled, pushNotificationVibrateEnabled, radioAccessTechnology, supportsTelephony, hasNfc, bluetoothEnabled, bluetoothVersion, attTimestampUnixtimeMs, attAuthorizationStatus, iosIdfv, androidAdvertisingId, buildVersionRelease, limitAdTracking, ampId, isDst, rokuAdvertisingId, rokuPublisherId, microsoftAdvertisingId, microsoftPublisherId, fireAdvertisingId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceInformation {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    androidUuid: ").append(toIndentedString(androidUuid)).append("\n");
    sb.append("    deviceManufacturer: ").append(toIndentedString(deviceManufacturer)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
    sb.append("    screenHeight: ").append(toIndentedString(screenHeight)).append("\n");
    sb.append("    screenWidth: ").append(toIndentedString(screenWidth)).append("\n");
    sb.append("    screenDpi: ").append(toIndentedString(screenDpi)).append("\n");
    sb.append("    deviceCountry: ").append(toIndentedString(deviceCountry)).append("\n");
    sb.append("    localeLanguage: ").append(toIndentedString(localeLanguage)).append("\n");
    sb.append("    localeCountry: ").append(toIndentedString(localeCountry)).append("\n");
    sb.append("    networkCountry: ").append(toIndentedString(networkCountry)).append("\n");
    sb.append("    networkCarrier: ").append(toIndentedString(networkCarrier)).append("\n");
    sb.append("    networkCode: ").append(toIndentedString(networkCode)).append("\n");
    sb.append("    networkMobileCountryCode: ").append(toIndentedString(networkMobileCountryCode)).append("\n");
    sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
    sb.append("    buildIdentifier: ").append(toIndentedString(buildIdentifier)).append("\n");
    sb.append("    httpHeaderUserAgent: ").append(toIndentedString(httpHeaderUserAgent)).append("\n");
    sb.append("    iosAdvertisingId: ").append(toIndentedString(iosAdvertisingId)).append("\n");
    sb.append("    pushToken: ").append(toIndentedString(pushToken)).append("\n");
    sb.append("    cpuArchitecture: ").append(toIndentedString(cpuArchitecture)).append("\n");
    sb.append("    isTablet: ").append(toIndentedString(isTablet)).append("\n");
    sb.append("    pushNotificationSoundEnabled: ").append(toIndentedString(pushNotificationSoundEnabled)).append("\n");
    sb.append("    pushNotificationVibrateEnabled: ").append(toIndentedString(pushNotificationVibrateEnabled)).append("\n");
    sb.append("    radioAccessTechnology: ").append(toIndentedString(radioAccessTechnology)).append("\n");
    sb.append("    supportsTelephony: ").append(toIndentedString(supportsTelephony)).append("\n");
    sb.append("    hasNfc: ").append(toIndentedString(hasNfc)).append("\n");
    sb.append("    bluetoothEnabled: ").append(toIndentedString(bluetoothEnabled)).append("\n");
    sb.append("    bluetoothVersion: ").append(toIndentedString(bluetoothVersion)).append("\n");
    sb.append("    attTimestampUnixtimeMs: ").append(toIndentedString(attTimestampUnixtimeMs)).append("\n");
    sb.append("    attAuthorizationStatus: ").append(toIndentedString(attAuthorizationStatus)).append("\n");
    sb.append("    iosIdfv: ").append(toIndentedString(iosIdfv)).append("\n");
    sb.append("    androidAdvertisingId: ").append(toIndentedString(androidAdvertisingId)).append("\n");
    sb.append("    buildVersionRelease: ").append(toIndentedString(buildVersionRelease)).append("\n");
    sb.append("    limitAdTracking: ").append(toIndentedString(limitAdTracking)).append("\n");
    sb.append("    ampId: ").append(toIndentedString(ampId)).append("\n");
    sb.append("    isDst: ").append(toIndentedString(isDst)).append("\n");
    sb.append("    rokuAdvertisingId: ").append(toIndentedString(rokuAdvertisingId)).append("\n");
    sb.append("    rokuPublisherId: ").append(toIndentedString(rokuPublisherId)).append("\n");
    sb.append("    microsoftAdvertisingId: ").append(toIndentedString(microsoftAdvertisingId)).append("\n");
    sb.append("    microsoftPublisherId: ").append(toIndentedString(microsoftPublisherId)).append("\n");
    sb.append("    fireAdvertisingId: ").append(toIndentedString(fireAdvertisingId)).append("\n");
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

