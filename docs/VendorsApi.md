# VendorsApi

All URIs are relative to *https://platform.brexapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewVendor**](VendorsApi.md#createNewVendor) | **POST** /v1/vendors |  Create vendor  |
| [**deleteVendorById**](VendorsApi.md#deleteVendorById) | **DELETE** /v1/vendors/{id} |  Delete vendor.  |
| [**getById**](VendorsApi.md#getById) | **GET** /v1/vendors/{id} |  Get vendor  |
| [**list**](VendorsApi.md#list) | **GET** /v1/vendors |  Lists vendors   |
| [**updateById**](VendorsApi.md#updateById) | **PUT** /v1/vendors/{id} | Update vendor |


<a name="createNewVendor"></a>
# **createNewVendor**
> VendorResponse createNewVendor(idempotencyKey, createVendorRequest).execute();

 Create vendor 

 This endpoint creates a new vendor. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VendorsApi;
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
    String companyName = "companyName_example"; // Name for vendor. The name must be unique.
    String idempotencyKey = "idempotencyKey_example";
    String email = "email_example"; // Email for vendor.
    String phone = "phone_example"; // Phone number for vendor.
    List<PaymentAccountRequest> paymentAccounts = Arrays.asList(); // Payment accounts associated with the vendor.
    try {
      VendorResponse result = client
              .vendors
              .createNewVendor(companyName, idempotencyKey)
              .email(email)
              .phone(phone)
              .paymentAccounts(paymentAccounts)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCompanyName());
      System.out.println(result.getEmail());
      System.out.println(result.getPhone());
      System.out.println(result.getPaymentAccounts());
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorsApi#createNewVendor");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VendorResponse> response = client
              .vendors
              .createNewVendor(companyName, idempotencyKey)
              .email(email)
              .phone(phone)
              .paymentAccounts(paymentAccounts)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorsApi#createNewVendor");
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
| **createVendorRequest** | [**CreateVendorRequest**](CreateVendorRequest.md)|  | |

### Return type

[**VendorResponse**](VendorResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | createVendor 200 response |  -  |

<a name="deleteVendorById"></a>
# **deleteVendorById**
> deleteVendorById(id).execute();

 Delete vendor. 

 This endpoint deletes a vendor by ID. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VendorsApi;
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
      client
              .vendors
              .deleteVendorById(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorsApi#deleteVendorById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .vendors
              .deleteVendorById(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorsApi#deleteVendorById");
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

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | deleteVendor 200 response |  -  |

<a name="getById"></a>
# **getById**
> VendorResponse getById(id).execute();

 Get vendor 

 This endpoint gets a vendor by ID. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VendorsApi;
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
      VendorResponse result = client
              .vendors
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCompanyName());
      System.out.println(result.getEmail());
      System.out.println(result.getPhone());
      System.out.println(result.getPaymentAccounts());
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VendorResponse> response = client
              .vendors
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorsApi#getById");
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

[**VendorResponse**](VendorResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | getVendorById 200 response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a name="list"></a>
# **list**
> PageVendorResponse list().cursor(cursor).limit(limit).name(name).execute();

 Lists vendors  

 This endpoint lists all existing vendors for an account. Takes an optional parameter to match by vendor name. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VendorsApi;
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
    String name = "name_example";
    try {
      PageVendorResponse result = client
              .vendors
              .list()
              .cursor(cursor)
              .limit(limit)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextCursor());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageVendorResponse> response = client
              .vendors
              .list()
              .cursor(cursor)
              .limit(limit)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorsApi#list");
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
| **name** | **String**|  | [optional] |

### Return type

[**PageVendorResponse**](PageVendorResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | listVendors 200 response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="updateById"></a>
# **updateById**
> VendorResponse updateById(id, updateVendorRequest).idempotencyKey(idempotencyKey).execute();

Update vendor

     Updates an existing vendor by ID. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VendorsApi;
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
    String companyName = "companyName_example"; // Name for vendor
    String email = "email_example"; // Email for vendor
    String phone = "phone_example"; // Phone number for vendor
    List<PaymentAccountRequest> paymentAccounts = Arrays.asList(); // To update payment instruments, we require the entire payload for each payment instrument that is being updated. 
    String beneficiaryName = "beneficiaryName_example"; // Name for the Beneficiary
    String idempotencyKey = "idempotencyKey_example";
    try {
      VendorResponse result = client
              .vendors
              .updateById(id)
              .companyName(companyName)
              .email(email)
              .phone(phone)
              .paymentAccounts(paymentAccounts)
              .beneficiaryName(beneficiaryName)
              .idempotencyKey(idempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCompanyName());
      System.out.println(result.getEmail());
      System.out.println(result.getPhone());
      System.out.println(result.getPaymentAccounts());
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorsApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VendorResponse> response = client
              .vendors
              .updateById(id)
              .companyName(companyName)
              .email(email)
              .phone(phone)
              .paymentAccounts(paymentAccounts)
              .beneficiaryName(beneficiaryName)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorsApi#updateById");
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
| **updateVendorRequest** | [**UpdateVendorRequest**](UpdateVendorRequest.md)|  | |
| **idempotencyKey** | **String**|  | [optional] |

### Return type

[**VendorResponse**](VendorResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | updateVendor 200 response |  -  |

