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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ReceivingAccountType
 */
@JsonAdapter(ReceivingAccountType.Adapter.class)public enum ReceivingAccountType {
  
  BREX_CASH("BREX_CASH");

  private String value;

  ReceivingAccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReceivingAccountType fromValue(String value) {
    for (ReceivingAccountType b : ReceivingAccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReceivingAccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReceivingAccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReceivingAccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReceivingAccountType.fromValue(value);
    }
  }
}

