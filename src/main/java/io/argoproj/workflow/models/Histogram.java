/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: VERSION
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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Histogram is a Histogram prometheus metric
 */
@ApiModel(description = "Histogram is a Histogram prometheus metric")

public class Histogram {
  public static final String SERIALIZED_NAME_BUCKETS = "buckets";
  @SerializedName(SERIALIZED_NAME_BUCKETS)
  private List<BigDecimal> buckets = new ArrayList<BigDecimal>();

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public Histogram buckets(List<BigDecimal> buckets) {
    
    this.buckets = buckets;
    return this;
  }

  public Histogram addBucketsItem(BigDecimal bucketsItem) {
    this.buckets.add(bucketsItem);
    return this;
  }

   /**
   * Buckets is a list of bucket divisors for the histogram
   * @return buckets
  **/
  @ApiModelProperty(required = true, value = "Buckets is a list of bucket divisors for the histogram")

  public List<BigDecimal> getBuckets() {
    return buckets;
  }


  public void setBuckets(List<BigDecimal> buckets) {
    this.buckets = buckets;
  }


  public Histogram value(String value) {
    
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
    Histogram histogram = (Histogram) o;
    return Objects.equals(this.buckets, histogram.buckets) &&
        Objects.equals(this.value, histogram.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buckets, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Histogram {\n");
    sb.append("    buckets: ").append(toIndentedString(buckets)).append("\n");
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

