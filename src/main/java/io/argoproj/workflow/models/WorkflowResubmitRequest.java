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

/**
 * WorkflowResubmitRequest
 */

public class WorkflowResubmitRequest {
  public static final String SERIALIZED_NAME_MEMOIZED = "memoized";
  @SerializedName(SERIALIZED_NAME_MEMOIZED)
  private Boolean memoized;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;


  public WorkflowResubmitRequest memoized(Boolean memoized) {
    
    this.memoized = memoized;
    return this;
  }

   /**
   * Get memoized
   * @return memoized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMemoized() {
    return memoized;
  }


  public void setMemoized(Boolean memoized) {
    this.memoized = memoized;
  }


  public WorkflowResubmitRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WorkflowResubmitRequest namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowResubmitRequest workflowResubmitRequest = (WorkflowResubmitRequest) o;
    return Objects.equals(this.memoized, workflowResubmitRequest.memoized) &&
        Objects.equals(this.name, workflowResubmitRequest.name) &&
        Objects.equals(this.namespace, workflowResubmitRequest.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memoized, name, namespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowResubmitRequest {\n");
    sb.append("    memoized: ").append(toIndentedString(memoized)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

