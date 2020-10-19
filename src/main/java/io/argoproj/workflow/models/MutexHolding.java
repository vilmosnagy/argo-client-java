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
 * MutexHolding describes the mutex and the object which is holding it.
 */
@ApiModel(description = "MutexHolding describes the mutex and the object which is holding it.")

public class MutexHolding {
  public static final String SERIALIZED_NAME_HOLDER = "holder";
  @SerializedName(SERIALIZED_NAME_HOLDER)
  private String holder;

  public static final String SERIALIZED_NAME_MUTEX = "mutex";
  @SerializedName(SERIALIZED_NAME_MUTEX)
  private String mutex;


  public MutexHolding holder(String holder) {
    
    this.holder = holder;
    return this;
  }

   /**
   * Holder is a reference to the object which holds the Mutex. Holding Scenario:   1. Current workflow&#39;s NodeID which is holding the lock.      e.g: ${NodeID} Waiting Scenario:   1. Current workflow or other workflow NodeID which is holding the lock.      e.g: ${WorkflowName}/${NodeID}
   * @return holder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Holder is a reference to the object which holds the Mutex. Holding Scenario:   1. Current workflow's NodeID which is holding the lock.      e.g: ${NodeID} Waiting Scenario:   1. Current workflow or other workflow NodeID which is holding the lock.      e.g: ${WorkflowName}/${NodeID}")

  public String getHolder() {
    return holder;
  }


  public void setHolder(String holder) {
    this.holder = holder;
  }


  public MutexHolding mutex(String mutex) {
    
    this.mutex = mutex;
    return this;
  }

   /**
   * Reference for the mutex e.g: ${namespace}/mutex/${mutexName}
   * @return mutex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference for the mutex e.g: ${namespace}/mutex/${mutexName}")

  public String getMutex() {
    return mutex;
  }


  public void setMutex(String mutex) {
    this.mutex = mutex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MutexHolding mutexHolding = (MutexHolding) o;
    return Objects.equals(this.holder, mutexHolding.holder) &&
        Objects.equals(this.mutex, mutexHolding.mutex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holder, mutex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MutexHolding {\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    mutex: ").append(toIndentedString(mutex)).append("\n");
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

