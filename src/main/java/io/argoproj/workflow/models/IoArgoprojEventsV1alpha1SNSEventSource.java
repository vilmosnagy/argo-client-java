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
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1WebhookContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IoArgoprojEventsV1alpha1SNSEventSource
 */

public class IoArgoprojEventsV1alpha1SNSEventSource {
  public static final String SERIALIZED_NAME_ACCESS_KEY = "accessKey";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector accessKey;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_ROLE_A_R_N = "roleARN";
  @SerializedName(SERIALIZED_NAME_ROLE_A_R_N)
  private String roleARN;

  public static final String SERIALIZED_NAME_SECRET_KEY = "secretKey";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector secretKey;

  public static final String SERIALIZED_NAME_TOPIC_ARN = "topicArn";
  @SerializedName(SERIALIZED_NAME_TOPIC_ARN)
  private String topicArn;

  public static final String SERIALIZED_NAME_VALIDATE_SIGNATURE = "validateSignature";
  @SerializedName(SERIALIZED_NAME_VALIDATE_SIGNATURE)
  private Boolean validateSignature;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private IoArgoprojEventsV1alpha1WebhookContext webhook;


  public IoArgoprojEventsV1alpha1SNSEventSource accessKey(io.kubernetes.client.openapi.models.V1SecretKeySelector accessKey) {
    
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


  public IoArgoprojEventsV1alpha1SNSEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public IoArgoprojEventsV1alpha1SNSEventSource putMetadataItem(String key, String metadataItem) {
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


  public IoArgoprojEventsV1alpha1SNSEventSource region(String region) {
    
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


  public IoArgoprojEventsV1alpha1SNSEventSource roleARN(String roleARN) {
    
    this.roleARN = roleARN;
    return this;
  }

   /**
   * Get roleARN
   * @return roleARN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRoleARN() {
    return roleARN;
  }


  public void setRoleARN(String roleARN) {
    this.roleARN = roleARN;
  }


  public IoArgoprojEventsV1alpha1SNSEventSource secretKey(io.kubernetes.client.openapi.models.V1SecretKeySelector secretKey) {
    
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


  public IoArgoprojEventsV1alpha1SNSEventSource topicArn(String topicArn) {
    
    this.topicArn = topicArn;
    return this;
  }

   /**
   * Get topicArn
   * @return topicArn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTopicArn() {
    return topicArn;
  }


  public void setTopicArn(String topicArn) {
    this.topicArn = topicArn;
  }


  public IoArgoprojEventsV1alpha1SNSEventSource validateSignature(Boolean validateSignature) {
    
    this.validateSignature = validateSignature;
    return this;
  }

   /**
   * Get validateSignature
   * @return validateSignature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getValidateSignature() {
    return validateSignature;
  }


  public void setValidateSignature(Boolean validateSignature) {
    this.validateSignature = validateSignature;
  }


  public IoArgoprojEventsV1alpha1SNSEventSource webhook(IoArgoprojEventsV1alpha1WebhookContext webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1WebhookContext getWebhook() {
    return webhook;
  }


  public void setWebhook(IoArgoprojEventsV1alpha1WebhookContext webhook) {
    this.webhook = webhook;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1SNSEventSource ioArgoprojEventsV1alpha1SNSEventSource = (IoArgoprojEventsV1alpha1SNSEventSource) o;
    return Objects.equals(this.accessKey, ioArgoprojEventsV1alpha1SNSEventSource.accessKey) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1SNSEventSource.metadata) &&
        Objects.equals(this.region, ioArgoprojEventsV1alpha1SNSEventSource.region) &&
        Objects.equals(this.roleARN, ioArgoprojEventsV1alpha1SNSEventSource.roleARN) &&
        Objects.equals(this.secretKey, ioArgoprojEventsV1alpha1SNSEventSource.secretKey) &&
        Objects.equals(this.topicArn, ioArgoprojEventsV1alpha1SNSEventSource.topicArn) &&
        Objects.equals(this.validateSignature, ioArgoprojEventsV1alpha1SNSEventSource.validateSignature) &&
        Objects.equals(this.webhook, ioArgoprojEventsV1alpha1SNSEventSource.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, metadata, region, roleARN, secretKey, topicArn, validateSignature, webhook);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1SNSEventSource {\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    roleARN: ").append(toIndentedString(roleARN)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
    sb.append("    topicArn: ").append(toIndentedString(topicArn)).append("\n");
    sb.append("    validateSignature: ").append(toIndentedString(validateSignature)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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

