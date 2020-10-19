/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.11.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.models;

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
 * SELinuxOptions are the labels to be applied to the container
 */
@ApiModel(description = "SELinuxOptions are the labels to be applied to the container")

public class SELinuxOptions {
  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private String level;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;


  public SELinuxOptions level(String level) {
    
    this.level = level;
    return this;
  }

   /**
   * Level is SELinux level label that applies to the container.
   * @return level
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Level is SELinux level label that applies to the container.")

  public String getLevel() {
    return level;
  }


  public void setLevel(String level) {
    this.level = level;
  }


  public SELinuxOptions role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * Role is a SELinux role label that applies to the container.
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Role is a SELinux role label that applies to the container.")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public SELinuxOptions type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type is a SELinux type label that applies to the container.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type is a SELinux type label that applies to the container.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public SELinuxOptions user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * User is a SELinux user label that applies to the container.
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User is a SELinux user label that applies to the container.")

  public String getUser() {
    return user;
  }


  public void setUser(String user) {
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
    SELinuxOptions seLinuxOptions = (SELinuxOptions) o;
    return Objects.equals(this.level, seLinuxOptions.level) &&
        Objects.equals(this.role, seLinuxOptions.role) &&
        Objects.equals(this.type, seLinuxOptions.type) &&
        Objects.equals(this.user, seLinuxOptions.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, role, type, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SELinuxOptions {\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

