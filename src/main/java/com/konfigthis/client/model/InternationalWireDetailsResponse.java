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
import com.konfigthis.client.model.Address;
import com.konfigthis.client.model.PaymentDetailsTypeResponse;
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
 * InternationalWireDetailsResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InternationalWireDetailsResponse {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private PaymentDetailsTypeResponse type;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID = "payment_instrument_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID)
  private String paymentInstrumentId;

  public static final String SERIALIZED_NAME_SWIFT_CODE = "swift_code";
  @SerializedName(SERIALIZED_NAME_SWIFT_CODE)
  private String swiftCode;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_BENEFICIARY_BANK_NAME = "beneficiary_bank_name";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_BANK_NAME)
  private String beneficiaryBankName;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public InternationalWireDetailsResponse() {
  }

  public InternationalWireDetailsResponse type(PaymentDetailsTypeResponse type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PaymentDetailsTypeResponse getType() {
    return type;
  }


  public void setType(PaymentDetailsTypeResponse type) {
    
    
    
    this.type = type;
  }


  public InternationalWireDetailsResponse paymentInstrumentId(String paymentInstrumentId) {
    
    
    
    
    this.paymentInstrumentId = paymentInstrumentId;
    return this;
  }

   /**
   * Payment Instrument ID that can be passed to the /transfers endpoint to trigger a transfer. The type of the payment instrument dictates the method. 
   * @return paymentInstrumentId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Payment Instrument ID that can be passed to the /transfers endpoint to trigger a transfer. The type of the payment instrument dictates the method. ")

  public String getPaymentInstrumentId() {
    return paymentInstrumentId;
  }


  public void setPaymentInstrumentId(String paymentInstrumentId) {
    
    
    
    this.paymentInstrumentId = paymentInstrumentId;
  }


  public InternationalWireDetailsResponse swiftCode(String swiftCode) {
    
    
    
    
    this.swiftCode = swiftCode;
    return this;
  }

   /**
   * Counterparty&#39;s &#x60;SWIFT&#x60; code
   * @return swiftCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Counterparty's `SWIFT` code")

  public String getSwiftCode() {
    return swiftCode;
  }


  public void setSwiftCode(String swiftCode) {
    
    
    
    this.swiftCode = swiftCode;
  }


  public InternationalWireDetailsResponse iban(String iban) {
    
    
    
    
    this.iban = iban;
    return this;
  }

   /**
   * Counterparty&#39;s international bank account number
   * @return iban
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Counterparty's international bank account number")

  public String getIban() {
    return iban;
  }


  public void setIban(String iban) {
    
    
    
    this.iban = iban;
  }


  public InternationalWireDetailsResponse beneficiaryBankName(String beneficiaryBankName) {
    
    
    
    
    this.beneficiaryBankName = beneficiaryBankName;
    return this;
  }

   /**
   * Name of counterparty&#39;s bank
   * @return beneficiaryBankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of counterparty's bank")

  public String getBeneficiaryBankName() {
    return beneficiaryBankName;
  }


  public void setBeneficiaryBankName(String beneficiaryBankName) {
    
    
    
    this.beneficiaryBankName = beneficiaryBankName;
  }


  public InternationalWireDetailsResponse address(Address address) {
    
    
    
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Address getAddress() {
    return address;
  }


  public void setAddress(Address address) {
    
    
    
    this.address = address;
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
   * @return the InternationalWireDetailsResponse instance itself
   */
  public InternationalWireDetailsResponse putAdditionalProperty(String key, Object value) {
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
    InternationalWireDetailsResponse internationalWireDetailsResponse = (InternationalWireDetailsResponse) o;
    return Objects.equals(this.type, internationalWireDetailsResponse.type) &&
        Objects.equals(this.paymentInstrumentId, internationalWireDetailsResponse.paymentInstrumentId) &&
        Objects.equals(this.swiftCode, internationalWireDetailsResponse.swiftCode) &&
        Objects.equals(this.iban, internationalWireDetailsResponse.iban) &&
        Objects.equals(this.beneficiaryBankName, internationalWireDetailsResponse.beneficiaryBankName) &&
        Objects.equals(this.address, internationalWireDetailsResponse.address)&&
        Objects.equals(this.additionalProperties, internationalWireDetailsResponse.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, paymentInstrumentId, swiftCode, iban, beneficiaryBankName, address, additionalProperties);
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
    sb.append("class InternationalWireDetailsResponse {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    swiftCode: ").append(toIndentedString(swiftCode)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    beneficiaryBankName: ").append(toIndentedString(beneficiaryBankName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("payment_instrument_id");
    openapiFields.add("swift_code");
    openapiFields.add("iban");
    openapiFields.add("beneficiary_bank_name");
    openapiFields.add("address");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("payment_instrument_id");
    openapiRequiredFields.add("swift_code");
    openapiRequiredFields.add("iban");
    openapiRequiredFields.add("address");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InternationalWireDetailsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InternationalWireDetailsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InternationalWireDetailsResponse is not found in the empty JSON string", InternationalWireDetailsResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InternationalWireDetailsResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("payment_instrument_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_instrument_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_instrument_id").toString()));
      }
      if (!jsonObj.get("swift_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `swift_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("swift_code").toString()));
      }
      if (!jsonObj.get("iban").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iban` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iban").toString()));
      }
      if (!jsonObj.get("beneficiary_bank_name").isJsonNull() && (jsonObj.get("beneficiary_bank_name") != null && !jsonObj.get("beneficiary_bank_name").isJsonNull()) && !jsonObj.get("beneficiary_bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiary_bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiary_bank_name").toString()));
      }
      // validate the required field `address`
      Address.validateJsonObject(jsonObj.getAsJsonObject("address"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InternationalWireDetailsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InternationalWireDetailsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InternationalWireDetailsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InternationalWireDetailsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<InternationalWireDetailsResponse>() {
           @Override
           public void write(JsonWriter out, InternationalWireDetailsResponse value) throws IOException {
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
           public InternationalWireDetailsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InternationalWireDetailsResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InternationalWireDetailsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InternationalWireDetailsResponse
  * @throws IOException if the JSON string is invalid with respect to InternationalWireDetailsResponse
  */
  public static InternationalWireDetailsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InternationalWireDetailsResponse.class);
  }

 /**
  * Convert an instance of InternationalWireDetailsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

