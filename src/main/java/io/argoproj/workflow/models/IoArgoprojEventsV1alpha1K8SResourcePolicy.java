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
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1Backoff;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IoArgoprojEventsV1alpha1K8SResourcePolicy
 */

public class IoArgoprojEventsV1alpha1K8SResourcePolicy {
  public static final String SERIALIZED_NAME_BACKOFF = "backoff";
  @SerializedName(SERIALIZED_NAME_BACKOFF)
  private IoArgoprojEventsV1alpha1Backoff backoff;

  public static final String SERIALIZED_NAME_ERROR_ON_BACKOFF_TIMEOUT = "errorOnBackoffTimeout";
  @SerializedName(SERIALIZED_NAME_ERROR_ON_BACKOFF_TIMEOUT)
  private Boolean errorOnBackoffTimeout;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = null;


  public IoArgoprojEventsV1alpha1K8SResourcePolicy backoff(IoArgoprojEventsV1alpha1Backoff backoff) {
    
    this.backoff = backoff;
    return this;
  }

   /**
   * Get backoff
   * @return backoff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1Backoff getBackoff() {
    return backoff;
  }


  public void setBackoff(IoArgoprojEventsV1alpha1Backoff backoff) {
    this.backoff = backoff;
  }


  public IoArgoprojEventsV1alpha1K8SResourcePolicy errorOnBackoffTimeout(Boolean errorOnBackoffTimeout) {
    
    this.errorOnBackoffTimeout = errorOnBackoffTimeout;
    return this;
  }

   /**
   * Get errorOnBackoffTimeout
   * @return errorOnBackoffTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getErrorOnBackoffTimeout() {
    return errorOnBackoffTimeout;
  }


  public void setErrorOnBackoffTimeout(Boolean errorOnBackoffTimeout) {
    this.errorOnBackoffTimeout = errorOnBackoffTimeout;
  }


  public IoArgoprojEventsV1alpha1K8SResourcePolicy labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public IoArgoprojEventsV1alpha1K8SResourcePolicy putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1K8SResourcePolicy ioArgoprojEventsV1alpha1K8SResourcePolicy = (IoArgoprojEventsV1alpha1K8SResourcePolicy) o;
    return Objects.equals(this.backoff, ioArgoprojEventsV1alpha1K8SResourcePolicy.backoff) &&
        Objects.equals(this.errorOnBackoffTimeout, ioArgoprojEventsV1alpha1K8SResourcePolicy.errorOnBackoffTimeout) &&
        Objects.equals(this.labels, ioArgoprojEventsV1alpha1K8SResourcePolicy.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backoff, errorOnBackoffTimeout, labels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1K8SResourcePolicy {\n");
    sb.append("    backoff: ").append(toIndentedString(backoff)).append("\n");
    sb.append("    errorOnBackoffTimeout: ").append(toIndentedString(errorOnBackoffTimeout)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

