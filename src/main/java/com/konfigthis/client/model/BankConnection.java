/*
 * Payments API
 *  The payments API allows you to initiate and manage payments and vendors from your Brex business accounts. 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: developer-access@brex.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.BankConnectionAvailableBalance;
import com.konfigthis.client.model.BankDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * BankConnection
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BankConnection {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BANK_DETAILS = "bank_details";
  @SerializedName(SERIALIZED_NAME_BANK_DETAILS)
  private BankDetails bankDetails;

  public static final String SERIALIZED_NAME_BREX_ACCOUNT_ID = "brex_account_id";
  @SerializedName(SERIALIZED_NAME_BREX_ACCOUNT_ID)
  private String brexAccountId;

  public static final String SERIALIZED_NAME_LAST_FOUR = "last_four";
  @SerializedName(SERIALIZED_NAME_LAST_FOUR)
  private String lastFour;

  public static final String SERIALIZED_NAME_AVAILABLE_BALANCE = "available_balance";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_BALANCE)
  private BankConnectionAvailableBalance availableBalance;

  public static final String SERIALIZED_NAME_CURRENT_BALANCE = "current_balance";
  @SerializedName(SERIALIZED_NAME_CURRENT_BALANCE)
  private BankConnectionAvailableBalance currentBalance;

  public BankConnection() {
  }

  public BankConnection id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public BankConnection bankDetails(BankDetails bankDetails) {
    
    
    
    
    this.bankDetails = bankDetails;
    return this;
  }

   /**
   * Get bankDetails
   * @return bankDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BankDetails getBankDetails() {
    return bankDetails;
  }


  public void setBankDetails(BankDetails bankDetails) {
    
    
    
    this.bankDetails = bankDetails;
  }


  public BankConnection brexAccountId(String brexAccountId) {
    
    
    
    
    this.brexAccountId = brexAccountId;
    return this;
  }

   /**
   * Brex business account ID 
   * @return brexAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Brex business account ID ")

  public String getBrexAccountId() {
    return brexAccountId;
  }


  public void setBrexAccountId(String brexAccountId) {
    
    
    
    this.brexAccountId = brexAccountId;
  }


  public BankConnection lastFour(String lastFour) {
    
    
    
    
    this.lastFour = lastFour;
    return this;
  }

   /**
   * Get lastFour
   * @return lastFour
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLastFour() {
    return lastFour;
  }


  public void setLastFour(String lastFour) {
    
    
    
    this.lastFour = lastFour;
  }


  public BankConnection availableBalance(BankConnectionAvailableBalance availableBalance) {
    
    
    
    
    this.availableBalance = availableBalance;
    return this;
  }

   /**
   * Get availableBalance
   * @return availableBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BankConnectionAvailableBalance getAvailableBalance() {
    return availableBalance;
  }


  public void setAvailableBalance(BankConnectionAvailableBalance availableBalance) {
    
    
    
    this.availableBalance = availableBalance;
  }


  public BankConnection currentBalance(BankConnectionAvailableBalance currentBalance) {
    
    
    
    
    this.currentBalance = currentBalance;
    return this;
  }

   /**
   * Get currentBalance
   * @return currentBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BankConnectionAvailableBalance getCurrentBalance() {
    return currentBalance;
  }


  public void setCurrentBalance(BankConnectionAvailableBalance currentBalance) {
    
    
    
    this.currentBalance = currentBalance;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the BankConnection instance itself
   */
  public BankConnection putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankConnection bankConnection = (BankConnection) o;
    return Objects.equals(this.id, bankConnection.id) &&
        Objects.equals(this.bankDetails, bankConnection.bankDetails) &&
        Objects.equals(this.brexAccountId, bankConnection.brexAccountId) &&
        Objects.equals(this.lastFour, bankConnection.lastFour) &&
        Objects.equals(this.availableBalance, bankConnection.availableBalance) &&
        Objects.equals(this.currentBalance, bankConnection.currentBalance)&&
        Objects.equals(this.additionalProperties, bankConnection.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bankDetails, brexAccountId, lastFour, availableBalance, currentBalance, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankConnection {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bankDetails: ").append(toIndentedString(bankDetails)).append("\n");
    sb.append("    brexAccountId: ").append(toIndentedString(brexAccountId)).append("\n");
    sb.append("    lastFour: ").append(toIndentedString(lastFour)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("bank_details");
    openapiFields.add("brex_account_id");
    openapiFields.add("last_four");
    openapiFields.add("available_balance");
    openapiFields.add("current_balance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("last_four");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BankConnection
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BankConnection.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BankConnection is not found in the empty JSON string", BankConnection.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BankConnection.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `bank_details`
      if (jsonObj.get("bank_details") != null && !jsonObj.get("bank_details").isJsonNull()) {
        BankDetails.validateJsonObject(jsonObj.getAsJsonObject("bank_details"));
      }
      if (!jsonObj.get("brex_account_id").isJsonNull() && (jsonObj.get("brex_account_id") != null && !jsonObj.get("brex_account_id").isJsonNull()) && !jsonObj.get("brex_account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brex_account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brex_account_id").toString()));
      }
      if (!jsonObj.get("last_four").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_four` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_four").toString()));
      }
      // validate the optional field `available_balance`
      if (jsonObj.get("available_balance") != null && !jsonObj.get("available_balance").isJsonNull()) {
        BankConnectionAvailableBalance.validateJsonObject(jsonObj.getAsJsonObject("available_balance"));
      }
      // validate the optional field `current_balance`
      if (jsonObj.get("current_balance") != null && !jsonObj.get("current_balance").isJsonNull()) {
        BankConnectionAvailableBalance.validateJsonObject(jsonObj.getAsJsonObject("current_balance"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BankConnection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BankConnection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BankConnection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BankConnection.class));

       return (TypeAdapter<T>) new TypeAdapter<BankConnection>() {
           @Override
           public void write(JsonWriter out, BankConnection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public BankConnection read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BankConnection instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BankConnection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BankConnection
  * @throws IOException if the JSON string is invalid with respect to BankConnection
  */
  public static BankConnection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BankConnection.class);
  }

 /**
  * Convert an instance of BankConnection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

