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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Specifies the type of the recipient.  &#x60;ACCOUNT_ID&#x60; is the ID of a Brex Business account. &#x60;PAYMENT_INSTRUMENT_ID&#x60; is the ID of Payment Instrument of the receiving Brex account. 
 */
@JsonAdapter(RecipientType.Adapter.class)public enum RecipientType {
  
  ACCOUNT_ID("ACCOUNT_ID"),
  
  PAYMENT_INSTRUMENT_ID("PAYMENT_INSTRUMENT_ID");

  private String value;

  RecipientType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RecipientType fromValue(String value) {
    for (RecipientType b : RecipientType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RecipientType> {
    @Override
    public void write(final JsonWriter jsonWriter, final RecipientType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RecipientType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RecipientType.fromValue(value);
    }
  }
}

