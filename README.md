<div align="left">

[![Visit Brex](./header.png)](https://brex.com)

# [Brex](https://brex.com)


The payments API allows you to initiate and manage payments and vendors from your Brex business accounts.


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Brex&serviceName=Payments&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>brex-payments-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:brex-payments-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/brex-payments-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LinkedAccountsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    BrexPayments client = new BrexPayments(configuration);
    String cursor = "cursor_example";
    Integer limit = 56;
    try {
      PageBankConnection result = client
              .linkedAccounts
              .list()
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextCursor());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling LinkedAccountsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageBankConnection> response = client
              .linkedAccounts
              .list()
              .cursor(cursor)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LinkedAccountsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://platform.brexapis.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*LinkedAccountsApi* | [**list**](docs/LinkedAccountsApi.md#list) | **GET** /v1/linked_accounts |  Lists linked accounts 
*TransfersApi* | [**createIncomingTransfer**](docs/TransfersApi.md#createIncomingTransfer) | **POST** /v1/incoming_transfers |  Create incoming transfer 
*TransfersApi* | [**createTransfer**](docs/TransfersApi.md#createTransfer) | **POST** /v1/transfers |  Create transfer 
*TransfersApi* | [**getById**](docs/TransfersApi.md#getById) | **GET** /v1/transfers/{id} |  Get transfer 
*TransfersApi* | [**list**](docs/TransfersApi.md#list) | **GET** /v1/transfers |  Lists transfers  
*VendorsApi* | [**createNewVendor**](docs/VendorsApi.md#createNewVendor) | **POST** /v1/vendors |  Create vendor 
*VendorsApi* | [**deleteVendorById**](docs/VendorsApi.md#deleteVendorById) | **DELETE** /v1/vendors/{id} |  Delete vendor. 
*VendorsApi* | [**getById**](docs/VendorsApi.md#getById) | **GET** /v1/vendors/{id} |  Get vendor 
*VendorsApi* | [**list**](docs/VendorsApi.md#list) | **GET** /v1/vendors |  Lists vendors  
*VendorsApi* | [**updateById**](docs/VendorsApi.md#updateById) | **PUT** /v1/vendors/{id} | Update vendor


## Documentation for Models

 - [ACHDetailsRequest](docs/ACHDetailsRequest.md)
 - [ACHDetailsRequestAllOf](docs/ACHDetailsRequestAllOf.md)
 - [ACHDetailsResponse](docs/ACHDetailsResponse.md)
 - [ACHDetailsResponseAllOf](docs/ACHDetailsResponseAllOf.md)
 - [AccountClass](docs/AccountClass.md)
 - [AccountType](docs/AccountType.md)
 - [Address](docs/Address.md)
 - [ApprovalType](docs/ApprovalType.md)
 - [Balance](docs/Balance.md)
 - [BankAccountDetailsResponse](docs/BankAccountDetailsResponse.md)
 - [BankAccountDetailsResponseAllOf](docs/BankAccountDetailsResponseAllOf.md)
 - [BankConnection](docs/BankConnection.md)
 - [BankConnectionAvailableBalance](docs/BankConnectionAvailableBalance.md)
 - [BankDetails](docs/BankDetails.md)
 - [BankType](docs/BankType.md)
 - [BeneficiaryBank](docs/BeneficiaryBank.md)
 - [BeneficiaryBankAddress](docs/BeneficiaryBankAddress.md)
 - [BookTransferDetails](docs/BookTransferDetails.md)
 - [BookTransferDetailsAllOf](docs/BookTransferDetailsAllOf.md)
 - [BookTransferDetailsResponse](docs/BookTransferDetailsResponse.md)
 - [BookTransferDetailsResponseAllOf](docs/BookTransferDetailsResponseAllOf.md)
 - [BrexCashAccountDetails](docs/BrexCashAccountDetails.md)
 - [BrexCashAccountDetailsAllOf](docs/BrexCashAccountDetailsAllOf.md)
 - [BrexCashAccountDetailsResponse](docs/BrexCashAccountDetailsResponse.md)
 - [BrexCashAccountDetailsResponseAllOf](docs/BrexCashAccountDetailsResponseAllOf.md)
 - [BrexCashDetails](docs/BrexCashDetails.md)
 - [BrexCashDetailsAllOf](docs/BrexCashDetailsAllOf.md)
 - [ChequeDetailsRequest](docs/ChequeDetailsRequest.md)
 - [ChequeDetailsRequestAllOf](docs/ChequeDetailsRequestAllOf.md)
 - [ChequeDetailsResponse](docs/ChequeDetailsResponse.md)
 - [ChequeDetailsResponseAllOf](docs/ChequeDetailsResponseAllOf.md)
 - [CounterPartyBankDetails](docs/CounterPartyBankDetails.md)
 - [CounterPartyBankDetailsAllOf](docs/CounterPartyBankDetailsAllOf.md)
 - [CounterPartyIncomingTransferType](docs/CounterPartyIncomingTransferType.md)
 - [CounterPartyResponseType](docs/CounterPartyResponseType.md)
 - [CounterPartyType](docs/CounterPartyType.md)
 - [CreateIncomingTransferRequest](docs/CreateIncomingTransferRequest.md)
 - [CreateTransferRequest](docs/CreateTransferRequest.md)
 - [CreateVendorRequest](docs/CreateVendorRequest.md)
 - [DomesticWireDetailsRequest](docs/DomesticWireDetailsRequest.md)
 - [DomesticWireDetailsRequestAllOf](docs/DomesticWireDetailsRequestAllOf.md)
 - [DomesticWireDetailsResponse](docs/DomesticWireDetailsResponse.md)
 - [DomesticWireDetailsResponseAllOf](docs/DomesticWireDetailsResponseAllOf.md)
 - [InternationalWireDetailsResponse](docs/InternationalWireDetailsResponse.md)
 - [InternationalWireDetailsResponseAllOf](docs/InternationalWireDetailsResponseAllOf.md)
 - [Money](docs/Money.md)
 - [OriginatingAccountResponseType](docs/OriginatingAccountResponseType.md)
 - [OriginatingAccountType](docs/OriginatingAccountType.md)
 - [PageBankConnection](docs/PageBankConnection.md)
 - [PageTransfer](docs/PageTransfer.md)
 - [PageVendorResponse](docs/PageVendorResponse.md)
 - [PaymentAccountRequest](docs/PaymentAccountRequest.md)
 - [PaymentAccountResponse](docs/PaymentAccountResponse.md)
 - [PaymentDetailsTypeRequest](docs/PaymentDetailsTypeRequest.md)
 - [PaymentDetailsTypeResponse](docs/PaymentDetailsTypeResponse.md)
 - [PaymentType](docs/PaymentType.md)
 - [ReceivingAccountType](docs/ReceivingAccountType.md)
 - [Recipient](docs/Recipient.md)
 - [RecipientType](docs/RecipientType.md)
 - [Transfer](docs/Transfer.md)
 - [TransferCancellationReason](docs/TransferCancellationReason.md)
 - [TransferStatus](docs/TransferStatus.md)
 - [UpdateVendorRequest](docs/UpdateVendorRequest.md)
 - [VendorDetails](docs/VendorDetails.md)
 - [VendorDetailsAllOf](docs/VendorDetailsAllOf.md)
 - [VendorDetailsResponse](docs/VendorDetailsResponse.md)
 - [VendorDetailsResponseAllOf](docs/VendorDetailsResponseAllOf.md)
 - [VendorResponse](docs/VendorResponse.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
