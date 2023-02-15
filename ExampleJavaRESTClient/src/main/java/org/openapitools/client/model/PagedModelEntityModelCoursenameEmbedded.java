/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.EntityModelCoursename;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * PagedModelEntityModelCoursenameEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-15T13:53:34.748533Z[Europe/London]")
public class PagedModelEntityModelCoursenameEmbedded {
  public static final String SERIALIZED_NAME_COURSENAME = "coursename";
  @SerializedName(SERIALIZED_NAME_COURSENAME)
  private List<EntityModelCoursename> coursename = null;

  public PagedModelEntityModelCoursenameEmbedded() {
  }

  public PagedModelEntityModelCoursenameEmbedded coursename(List<EntityModelCoursename> coursename) {
    
    this.coursename = coursename;
    return this;
  }

  public PagedModelEntityModelCoursenameEmbedded addCoursenameItem(EntityModelCoursename coursenameItem) {
    if (this.coursename == null) {
      this.coursename = new ArrayList<>();
    }
    this.coursename.add(coursenameItem);
    return this;
  }

   /**
   * Get coursename
   * @return coursename
  **/
  @javax.annotation.Nullable

  public List<EntityModelCoursename> getCoursename() {
    return coursename;
  }


  public void setCoursename(List<EntityModelCoursename> coursename) {
    this.coursename = coursename;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedModelEntityModelCoursenameEmbedded pagedModelEntityModelCoursenameEmbedded = (PagedModelEntityModelCoursenameEmbedded) o;
    return Objects.equals(this.coursename, pagedModelEntityModelCoursenameEmbedded.coursename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coursename);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedModelEntityModelCoursenameEmbedded {\n");
    sb.append("    coursename: ").append(toIndentedString(coursename)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("coursename");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PagedModelEntityModelCoursenameEmbedded
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PagedModelEntityModelCoursenameEmbedded.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PagedModelEntityModelCoursenameEmbedded is not found in the empty JSON string", PagedModelEntityModelCoursenameEmbedded.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PagedModelEntityModelCoursenameEmbedded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PagedModelEntityModelCoursenameEmbedded` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("coursename") != null && !jsonObj.get("coursename").isJsonNull()) {
        JsonArray jsonArraycoursename = jsonObj.getAsJsonArray("coursename");
        if (jsonArraycoursename != null) {
          // ensure the json data is an array
          if (!jsonObj.get("coursename").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `coursename` to be an array in the JSON string but got `%s`", jsonObj.get("coursename").toString()));
          }

          // validate the optional field `coursename` (array)
          for (int i = 0; i < jsonArraycoursename.size(); i++) {
            EntityModelCoursename.validateJsonObject(jsonArraycoursename.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PagedModelEntityModelCoursenameEmbedded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PagedModelEntityModelCoursenameEmbedded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PagedModelEntityModelCoursenameEmbedded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PagedModelEntityModelCoursenameEmbedded.class));

       return (TypeAdapter<T>) new TypeAdapter<PagedModelEntityModelCoursenameEmbedded>() {
           @Override
           public void write(JsonWriter out, PagedModelEntityModelCoursenameEmbedded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PagedModelEntityModelCoursenameEmbedded read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PagedModelEntityModelCoursenameEmbedded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PagedModelEntityModelCoursenameEmbedded
  * @throws IOException if the JSON string is invalid with respect to PagedModelEntityModelCoursenameEmbedded
  */
  public static PagedModelEntityModelCoursenameEmbedded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PagedModelEntityModelCoursenameEmbedded.class);
  }

 /**
  * Convert an instance of PagedModelEntityModelCoursenameEmbedded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
