/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.covid19.contactbase.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Device
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-29T00:28:16.839+05:30")
public class Device {
  @SerializedName("deviceId")
  private String deviceId = null;

  @SerializedName("registrationTimeStamp")
  private Long registrationTimeStamp = null;

  @SerializedName("user")
  private Object user = null;

  public Device deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @ApiModelProperty(value = "")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public Device registrationTimeStamp(Long registrationTimeStamp) {
    this.registrationTimeStamp = registrationTimeStamp;
    return this;
  }

   /**
   * Get registrationTimeStamp
   * @return registrationTimeStamp
  **/
  @ApiModelProperty(value = "")
  public Long getRegistrationTimeStamp() {
    return registrationTimeStamp;
  }

  public void setRegistrationTimeStamp(Long registrationTimeStamp) {
    this.registrationTimeStamp = registrationTimeStamp;
  }

  public Device user(Object user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public Object getUser() {
    return user;
  }

  public void setUser(Object user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Device device = (Device) o;
    return Objects.equals(this.deviceId, device.deviceId) &&
        Objects.equals(this.registrationTimeStamp, device.registrationTimeStamp) &&
        Objects.equals(this.user, device.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, registrationTimeStamp, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    registrationTimeStamp: ").append(toIndentedString(registrationTimeStamp)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
