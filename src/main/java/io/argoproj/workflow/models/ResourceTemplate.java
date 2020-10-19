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
import java.util.ArrayList;
import java.util.List;

/**
 * ResourceTemplate is a template subtype to manipulate kubernetes resources
 */
@ApiModel(description = "ResourceTemplate is a template subtype to manipulate kubernetes resources")

public class ResourceTemplate {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_FAILURE_CONDITION = "failureCondition";
  @SerializedName(SERIALIZED_NAME_FAILURE_CONDITION)
  private String failureCondition;

  public static final String SERIALIZED_NAME_FLAGS = "flags";
  @SerializedName(SERIALIZED_NAME_FLAGS)
  private List<String> flags = null;

  public static final String SERIALIZED_NAME_MANIFEST = "manifest";
  @SerializedName(SERIALIZED_NAME_MANIFEST)
  private String manifest;

  public static final String SERIALIZED_NAME_MERGE_STRATEGY = "mergeStrategy";
  @SerializedName(SERIALIZED_NAME_MERGE_STRATEGY)
  private String mergeStrategy;

  public static final String SERIALIZED_NAME_SET_OWNER_REFERENCE = "setOwnerReference";
  @SerializedName(SERIALIZED_NAME_SET_OWNER_REFERENCE)
  private Boolean setOwnerReference;

  public static final String SERIALIZED_NAME_SUCCESS_CONDITION = "successCondition";
  @SerializedName(SERIALIZED_NAME_SUCCESS_CONDITION)
  private String successCondition;


  public ResourceTemplate action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Action is the action to perform to the resource. Must be one of: get, create, apply, delete, replace, patch
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Action is the action to perform to the resource. Must be one of: get, create, apply, delete, replace, patch")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public ResourceTemplate failureCondition(String failureCondition) {
    
    this.failureCondition = failureCondition;
    return this;
  }

   /**
   * FailureCondition is a label selector expression which describes the conditions of the k8s resource in which the step was considered failed
   * @return failureCondition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FailureCondition is a label selector expression which describes the conditions of the k8s resource in which the step was considered failed")

  public String getFailureCondition() {
    return failureCondition;
  }


  public void setFailureCondition(String failureCondition) {
    this.failureCondition = failureCondition;
  }


  public ResourceTemplate flags(List<String> flags) {
    
    this.flags = flags;
    return this;
  }

  public ResourceTemplate addFlagsItem(String flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<String>();
    }
    this.flags.add(flagsItem);
    return this;
  }

   /**
   * Flags is a set of additional options passed to kubectl before submitting a resource I.e. to disable resource validation: flags: [  \&quot;--validate&#x3D;false\&quot;  # disable resource validation ]
   * @return flags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flags is a set of additional options passed to kubectl before submitting a resource I.e. to disable resource validation: flags: [  \"--validate=false\"  # disable resource validation ]")

  public List<String> getFlags() {
    return flags;
  }


  public void setFlags(List<String> flags) {
    this.flags = flags;
  }


  public ResourceTemplate manifest(String manifest) {
    
    this.manifest = manifest;
    return this;
  }

   /**
   * Manifest contains the kubernetes manifest
   * @return manifest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Manifest contains the kubernetes manifest")

  public String getManifest() {
    return manifest;
  }


  public void setManifest(String manifest) {
    this.manifest = manifest;
  }


  public ResourceTemplate mergeStrategy(String mergeStrategy) {
    
    this.mergeStrategy = mergeStrategy;
    return this;
  }

   /**
   * MergeStrategy is the strategy used to merge a patch. It defaults to \&quot;strategic\&quot; Must be one of: strategic, merge, json
   * @return mergeStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MergeStrategy is the strategy used to merge a patch. It defaults to \"strategic\" Must be one of: strategic, merge, json")

  public String getMergeStrategy() {
    return mergeStrategy;
  }


  public void setMergeStrategy(String mergeStrategy) {
    this.mergeStrategy = mergeStrategy;
  }


  public ResourceTemplate setOwnerReference(Boolean setOwnerReference) {
    
    this.setOwnerReference = setOwnerReference;
    return this;
  }

   /**
   * SetOwnerReference sets the reference to the workflow on the OwnerReference of generated resource.
   * @return setOwnerReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SetOwnerReference sets the reference to the workflow on the OwnerReference of generated resource.")

  public Boolean getSetOwnerReference() {
    return setOwnerReference;
  }


  public void setSetOwnerReference(Boolean setOwnerReference) {
    this.setOwnerReference = setOwnerReference;
  }


  public ResourceTemplate successCondition(String successCondition) {
    
    this.successCondition = successCondition;
    return this;
  }

   /**
   * SuccessCondition is a label selector expression which describes the conditions of the k8s resource in which it is acceptable to proceed to the following step
   * @return successCondition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SuccessCondition is a label selector expression which describes the conditions of the k8s resource in which it is acceptable to proceed to the following step")

  public String getSuccessCondition() {
    return successCondition;
  }


  public void setSuccessCondition(String successCondition) {
    this.successCondition = successCondition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceTemplate resourceTemplate = (ResourceTemplate) o;
    return Objects.equals(this.action, resourceTemplate.action) &&
        Objects.equals(this.failureCondition, resourceTemplate.failureCondition) &&
        Objects.equals(this.flags, resourceTemplate.flags) &&
        Objects.equals(this.manifest, resourceTemplate.manifest) &&
        Objects.equals(this.mergeStrategy, resourceTemplate.mergeStrategy) &&
        Objects.equals(this.setOwnerReference, resourceTemplate.setOwnerReference) &&
        Objects.equals(this.successCondition, resourceTemplate.successCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, failureCondition, flags, manifest, mergeStrategy, setOwnerReference, successCondition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceTemplate {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    failureCondition: ").append(toIndentedString(failureCondition)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    manifest: ").append(toIndentedString(manifest)).append("\n");
    sb.append("    mergeStrategy: ").append(toIndentedString(mergeStrategy)).append("\n");
    sb.append("    setOwnerReference: ").append(toIndentedString(setOwnerReference)).append("\n");
    sb.append("    successCondition: ").append(toIndentedString(successCondition)).append("\n");
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

