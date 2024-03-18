# TransfersApi

All URIs are relative to *https://platform.brexapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createIncomingTransfer**](TransfersApi.md#createIncomingTransfer) | **POST** /v1/incoming_transfers |  Create incoming transfer  |
| [**createTransfer**](TransfersApi.md#createTransfer) | **POST** /v1/transfers |  Create transfer  |
| [**getById**](TransfersApi.md#getById) | **GET** /v1/transfers/{id} |  Get transfer  |
| [**list**](TransfersApi.md#list) | **GET** /v1/transfers |  Lists transfers   |


<a name="createIncomingTransfer"></a>
# **createIncomingTransfer**
> Transfer createIncomingTransfer(idempotencyKey, createIncomingTransferRequest).execute();

 Create incoming transfer 

 This endpoint creates a new incoming transfer. You may use use any eligible bank account connection to fund (ACH Debit)  any active Brex business account.  **Reminder**: You may not use the Brex API for any activity that requires a license or registration from any  governmental authority without Brex&#39;s prior review and approval. This includes but is not limited to any money services business or money transmission activity.  Please review the &lt;a href&#x3D;\&quot;https://www.brex.com/legal/developer-portal/\&quot;&gt;Brex Access Agreement&lt;/a&gt; and contact us if  you have any questions. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransfersApi;
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
    String description = "description_example"; //   Description of the transfer for internal use. Not exposed externally.  
    Object counterparty = null;
    Object receivingAccount = null;
    Money amount = new Money();
    String idempotencyKey = "idempotencyKey_example";
    try {
      Transfer result = client
              .transfers
              .createIncomingTransfer(description, counterparty, receivingAccount, amount, idempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getCounterparty());
      System.out.println(result.getPaymentType());
      System.out.println(result.getAmount());
      System.out.println(result.getProcessDate());
      System.out.println(result.getOriginatingAccount());
      System.out.println(result.getStatus());
      System.out.println(result.getCancellationReason());
      System.out.println(result.getEstimatedDeliveryDate());
      System.out.println(result.getCreatorUserId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDisplayName());
      System.out.println(result.getExternalMemo());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransfersApi#createIncomingTransfer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Transfer> response = client
              .transfers
              .createIncomingTransfer(description, counterparty, receivingAccount, amount, idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransfersApi#createIncomingTransfer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idempotencyKey** | **String**|  | |
| **createIncomingTransferRequest** | [**CreateIncomingTransferRequest**](CreateIncomingTransferRequest.md)|  | |

### Return type

[**Transfer**](Transfer.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | createIncomingTransfer 200 response |  -  |

<a name="createTransfer"></a>
# **createTransfer**
> Transfer createTransfer(idempotencyKey, createTransferRequest).execute();

 Create transfer 

 This endpoint creates a new transfer.  Currently, the API can only create transfers for the following payment rails: - ACH - DOMESTIC_WIRE - CHEQUE - INTERNATIONAL_WIRES (For vendors already created through dashboard. Rate limited to 100/day - Please reach out to developer-support@brex.com if you need to do more)  **Transaction Descriptions** * For outgoing check payments, a successful transfer will return a response containing a description value with a format of &#x60;Check #&lt;check number&gt; to &lt;recipient_name&gt; - &lt;external_memo&gt;&#x60;. * For book transfers (from one Brex Business account to another), the recipient value will have a format of &#x60;&lt;customer_account.dba_name&gt; - &lt;external_memo&gt;&#x60; and the sender will have a format of &#x60;&lt;target customer account&#39;s dba name&gt; - &lt;external_memo&gt;&#x60;. * For other payment rails, the format will be &#x60;&lt;counterparty_name&gt; - &lt;external_memo&gt;&#x60;, where Counterparty name is &#x60;payment_instrument.beneficiary_name&#x60; or &#x60;contact.name&#x60; For vendors created from the Payments API, the &#x60;counterparty_name&#x60; will be the &#x60;company_name&#x60; [field](https://developer.brex.com/openapi/payments_api/).  **Reminder**: You may not use the Brex API for any activity that requires a license or registration from any  governmental authority without Brex&#39;s prior review and approval. This includes but is not limited to any money services business or money transmission activity.  Please review the &lt;a href&#x3D;\&quot;https://www.brex.com/legal/developer-portal/\&quot;&gt;Brex Access Agreement&lt;/a&gt; and contact us if  you have any questions. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransfersApi;
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
    String description = "description_example"; // Description of the transfer for internal use. Not exposed externally.
    Object counterparty = null;
    Money amount = new Money();
    String externalMemo = "externalMemo_example"; // External memo for the transfer. `Payment Instructions` for Wires and the `Entry Description` for ACH payments.  Must be at most 90 characters for `ACH` and `WIRE` transactions and at most 40 characters for `CHEQUES` 
    Object originatingAccount = null;
    String idempotencyKey = "idempotencyKey_example";
    ApprovalType approvalType = new ApprovalType();
    try {
      Transfer result = client
              .transfers
              .createTransfer(description, counterparty, amount, externalMemo, originatingAccount, idempotencyKey)
              .approvalType(approvalType)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getCounterparty());
      System.out.println(result.getPaymentType());
      System.out.println(result.getAmount());
      System.out.println(result.getProcessDate());
      System.out.println(result.getOriginatingAccount());
      System.out.println(result.getStatus());
      System.out.println(result.getCancellationReason());
      System.out.println(result.getEstimatedDeliveryDate());
      System.out.println(result.getCreatorUserId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDisplayName());
      System.out.println(result.getExternalMemo());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransfersApi#createTransfer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Transfer> response = client
              .transfers
              .createTransfer(description, counterparty, amount, externalMemo, originatingAccount, idempotencyKey)
              .approvalType(approvalType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransfersApi#createTransfer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idempotencyKey** | **String**|  | |
| **createTransferRequest** | [**CreateTransferRequest**](CreateTransferRequest.md)|  | |

### Return type

[**Transfer**](Transfer.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | createTransfer 200 response |  -  |

<a name="getById"></a>
# **getById**
> Transfer getById(id).execute();

 Get transfer 

 This endpoint gets a transfer by ID.  Currently, the API can only return transfers for the following payment rails: - ACH - DOMESTIC_WIRE - CHEQUE - INTERNATIONAL_WIRE 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransfersApi;
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
    String id = "id_example";
    try {
      Transfer result = client
              .transfers
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getCounterparty());
      System.out.println(result.getPaymentType());
      System.out.println(result.getAmount());
      System.out.println(result.getProcessDate());
      System.out.println(result.getOriginatingAccount());
      System.out.println(result.getStatus());
      System.out.println(result.getCancellationReason());
      System.out.println(result.getEstimatedDeliveryDate());
      System.out.println(result.getCreatorUserId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDisplayName());
      System.out.println(result.getExternalMemo());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransfersApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Transfer> response = client
              .transfers
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransfersApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**Transfer**](Transfer.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | getTransfersById 200 response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a name="list"></a>
# **list**
> PageTransfer list().cursor(cursor).limit(limit).execute();

 Lists transfers  

 This endpoint lists existing transfers for an account.  Currently, the API can only return transfers for the following payment rails: - ACH - DOMESTIC_WIRE - CHEQUE - INTERNATIONAL_WIRE 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransfersApi;
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
      PageTransfer result = client
              .transfers
              .list()
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextCursor());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransfersApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageTransfer> response = client
              .transfers
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
      System.err.println("Exception when calling TransfersApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cursor** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**PageTransfer**](PageTransfer.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | listTransfers 200 response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

