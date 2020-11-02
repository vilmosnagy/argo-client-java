/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.11.7
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
import io.argoproj.workflow.models.Artifact;
import io.argoproj.workflow.models.Parameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Inputs are the mechanism for passing parameters, artifacts, volumes from one template to another
 */
@ApiModel(description = "Inputs are the mechanism for passing parameters, artifacts, volumes from one template to another")

public class Inputs {
  public static final String SERIALIZED_NAME_ARTIFACTS = "artifacts";
  @SerializedName(SERIALIZED_NAME_ARTIFACTS)
  private List<Artifact> artifacts = null;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<Parameter> parameters = null;


  public Inputs artifacts(List<Artifact> artifacts) {
    
    this.artifacts = artifacts;
    return this;
  }

  public Inputs addArtifactsItem(Artifact artifactsItem) {
    if (this.artifacts == null) {
      this.artifacts = new ArrayList<Artifact>();
    }
    this.artifacts.add(artifactsItem);
    return this;
  }

   /**
   * Artifact are a list of artifacts passed as inputs
   * @return artifacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Artifact are a list of artifacts passed as inputs")

  public List<Artifact> getArtifacts() {
    return artifacts;
  }


  public void setArtifacts(List<Artifact> artifacts) {
    this.artifacts = artifacts;
  }


  public Inputs parameters(List<Parameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public Inputs addParametersItem(Parameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<Parameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Parameters are a list of parameters passed as inputs
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parameters are a list of parameters passed as inputs")

  public List<Parameter> getParameters() {
    return parameters;
  }


  public void setParameters(List<Parameter> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Inputs inputs = (Inputs) o;
    return Objects.equals(this.artifacts, inputs.artifacts) &&
        Objects.equals(this.parameters, inputs.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifacts, parameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Inputs {\n");
    sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

