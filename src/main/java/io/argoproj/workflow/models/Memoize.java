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
import io.argoproj.workflow.models.Cache;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Memoization enables caching for the Outputs of the template
 */
@ApiModel(description = "Memoization enables caching for the Outputs of the template")

public class Memoize {
  public static final String SERIALIZED_NAME_CACHE = "cache";
  @SerializedName(SERIALIZED_NAME_CACHE)
  private Cache cache;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_MAX_AGE = "maxAge";
  @SerializedName(SERIALIZED_NAME_MAX_AGE)
  private String maxAge;


  public Memoize cache(Cache cache) {
    
    this.cache = cache;
    return this;
  }

   /**
   * Get cache
   * @return cache
  **/
  @ApiModelProperty(required = true, value = "")

  public Cache getCache() {
    return cache;
  }


  public void setCache(Cache cache) {
    this.cache = cache;
  }


  public Memoize key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Key is the key to use as the caching key
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Key is the key to use as the caching key")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public Memoize maxAge(String maxAge) {
    
    this.maxAge = maxAge;
    return this;
  }

   /**
   * MaxAge is the maximum age (e.g. \&quot;180s\&quot;, \&quot;24h\&quot;) of an entry that is still considered valid. If an entry is older than the MaxAge, it will be ignored.
   * @return maxAge
  **/
  @ApiModelProperty(required = true, value = "MaxAge is the maximum age (e.g. \"180s\", \"24h\") of an entry that is still considered valid. If an entry is older than the MaxAge, it will be ignored.")

  public String getMaxAge() {
    return maxAge;
  }


  public void setMaxAge(String maxAge) {
    this.maxAge = maxAge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Memoize memoize = (Memoize) o;
    return Objects.equals(this.cache, memoize.cache) &&
        Objects.equals(this.key, memoize.key) &&
        Objects.equals(this.maxAge, memoize.maxAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cache, key, maxAge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Memoize {\n");
    sb.append("    cache: ").append(toIndentedString(cache)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
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

