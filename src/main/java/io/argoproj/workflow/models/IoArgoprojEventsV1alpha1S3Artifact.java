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
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1S3Bucket;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1S3Filter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IoArgoprojEventsV1alpha1S3Artifact
 */

public class IoArgoprojEventsV1alpha1S3Artifact {
  public static final String SERIALIZED_NAME_ACCESS_KEY = "accessKey";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector accessKey;

  public static final String SERIALIZED_NAME_BUCKET = "bucket";
  @SerializedName(SERIALIZED_NAME_BUCKET)
  private IoArgoprojEventsV1alpha1S3Bucket bucket;

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<String> events = null;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private IoArgoprojEventsV1alpha1S3Filter filter;

  public static final String SERIALIZED_NAME_INSECURE = "insecure";
  @SerializedName(SERIALIZED_NAME_INSECURE)
  private Boolean insecure;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_SECRET_KEY = "secretKey";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector secretKey;


  public IoArgoprojEventsV1alpha1S3Artifact accessKey(io.kubernetes.client.openapi.models.V1SecretKeySelector accessKey) {
    
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Get accessKey
   * @return accessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getAccessKey() {
    return accessKey;
  }


  public void setAccessKey(io.kubernetes.client.openapi.models.V1SecretKeySelector accessKey) {
    this.accessKey = accessKey;
  }


  public IoArgoprojEventsV1alpha1S3Artifact bucket(IoArgoprojEventsV1alpha1S3Bucket bucket) {
    
    this.bucket = bucket;
    return this;
  }

   /**
   * Get bucket
   * @return bucket
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1S3Bucket getBucket() {
    return bucket;
  }


  public void setBucket(IoArgoprojEventsV1alpha1S3Bucket bucket) {
    this.bucket = bucket;
  }


  public IoArgoprojEventsV1alpha1S3Artifact endpoint(String endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndpoint() {
    return endpoint;
  }


  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }


  public IoArgoprojEventsV1alpha1S3Artifact events(List<String> events) {
    
    this.events = events;
    return this;
  }

  public IoArgoprojEventsV1alpha1S3Artifact addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<String>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEvents() {
    return events;
  }


  public void setEvents(List<String> events) {
    this.events = events;
  }


  public IoArgoprojEventsV1alpha1S3Artifact filter(IoArgoprojEventsV1alpha1S3Filter filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1S3Filter getFilter() {
    return filter;
  }


  public void setFilter(IoArgoprojEventsV1alpha1S3Filter filter) {
    this.filter = filter;
  }


  public IoArgoprojEventsV1alpha1S3Artifact insecure(Boolean insecure) {
    
    this.insecure = insecure;
    return this;
  }

   /**
   * Get insecure
   * @return insecure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInsecure() {
    return insecure;
  }


  public void setInsecure(Boolean insecure) {
    this.insecure = insecure;
  }


  public IoArgoprojEventsV1alpha1S3Artifact metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public IoArgoprojEventsV1alpha1S3Artifact putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public IoArgoprojEventsV1alpha1S3Artifact region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public IoArgoprojEventsV1alpha1S3Artifact secretKey(io.kubernetes.client.openapi.models.V1SecretKeySelector secretKey) {
    
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Get secretKey
   * @return secretKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getSecretKey() {
    return secretKey;
  }


  public void setSecretKey(io.kubernetes.client.openapi.models.V1SecretKeySelector secretKey) {
    this.secretKey = secretKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1S3Artifact ioArgoprojEventsV1alpha1S3Artifact = (IoArgoprojEventsV1alpha1S3Artifact) o;
    return Objects.equals(this.accessKey, ioArgoprojEventsV1alpha1S3Artifact.accessKey) &&
        Objects.equals(this.bucket, ioArgoprojEventsV1alpha1S3Artifact.bucket) &&
        Objects.equals(this.endpoint, ioArgoprojEventsV1alpha1S3Artifact.endpoint) &&
        Objects.equals(this.events, ioArgoprojEventsV1alpha1S3Artifact.events) &&
        Objects.equals(this.filter, ioArgoprojEventsV1alpha1S3Artifact.filter) &&
        Objects.equals(this.insecure, ioArgoprojEventsV1alpha1S3Artifact.insecure) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1S3Artifact.metadata) &&
        Objects.equals(this.region, ioArgoprojEventsV1alpha1S3Artifact.region) &&
        Objects.equals(this.secretKey, ioArgoprojEventsV1alpha1S3Artifact.secretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, bucket, endpoint, events, filter, insecure, metadata, region, secretKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1S3Artifact {\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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

