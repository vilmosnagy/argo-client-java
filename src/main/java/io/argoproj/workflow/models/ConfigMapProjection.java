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
import io.argoproj.workflow.models.KeyToPath;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Adapts a ConfigMap into a projected volume.  The contents of the target ConfigMap&#39;s Data field will be presented in a projected volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. Note that this is identical to a configmap volume source without the default mode.
 */
@ApiModel(description = "Adapts a ConfigMap into a projected volume.  The contents of the target ConfigMap's Data field will be presented in a projected volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. Note that this is identical to a configmap volume source without the default mode.")

public class ConfigMapProjection {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<KeyToPath> items = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;


  public ConfigMapProjection items(List<KeyToPath> items) {
    
    this.items = items;
    return this;
  }

  public ConfigMapProjection addItemsItem(KeyToPath itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<KeyToPath>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.")

  public List<KeyToPath> getItems() {
    return items;
  }


  public void setItems(List<KeyToPath> items) {
    this.items = items;
  }


  public ConfigMapProjection name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ConfigMapProjection optional(Boolean optional) {
    
    this.optional = optional;
    return this;
  }

   /**
   * Specify whether the ConfigMap or its keys must be defined
   * @return optional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify whether the ConfigMap or its keys must be defined")

  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigMapProjection configMapProjection = (ConfigMapProjection) o;
    return Objects.equals(this.items, configMapProjection.items) &&
        Objects.equals(this.name, configMapProjection.name) &&
        Objects.equals(this.optional, configMapProjection.optional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, name, optional);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigMapProjection {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
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

