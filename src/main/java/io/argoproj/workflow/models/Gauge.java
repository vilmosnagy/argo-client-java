/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.12.0
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
 * Gauge is a Gauge prometheus metric
 */
@ApiModel(description = "Gauge is a Gauge prometheus metric")

public class Gauge {
  public static final String SERIALIZED_NAME_REALTIME = "realtime";
  @SerializedName(SERIALIZED_NAME_REALTIME)
  private Boolean realtime;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public Gauge realtime(Boolean realtime) {
    
    this.realtime = realtime;
    return this;
  }

   /**
   * Realtime emits this metric in real time if applicable
   * @return realtime
  **/
  @ApiModelProperty(required = true, value = "Realtime emits this metric in real time if applicable")

  public Boolean getRealtime() {
    return realtime;
  }


  public void setRealtime(Boolean realtime) {
    this.realtime = realtime;
  }


  public Gauge value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value is the value of the metric
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Value is the value of the metric")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gauge gauge = (Gauge) o;
    return Objects.equals(this.realtime, gauge.realtime) &&
        Objects.equals(this.value, gauge.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(realtime, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gauge {\n");
    sb.append("    realtime: ").append(toIndentedString(realtime)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

