# CoursenameEntityControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteItemResourceCoursenameDelete**](CoursenameEntityControllerApi.md#deleteItemResourceCoursenameDelete) | **DELETE** /coursename/{id} |  |
| [**getCollectionResourceCoursenameGet1**](CoursenameEntityControllerApi.md#getCollectionResourceCoursenameGet1) | **GET** /coursename |  |
| [**getItemResourceCoursenameGet**](CoursenameEntityControllerApi.md#getItemResourceCoursenameGet) | **GET** /coursename/{id} |  |
| [**patchItemResourceCoursenamePatch**](CoursenameEntityControllerApi.md#patchItemResourceCoursenamePatch) | **PATCH** /coursename/{id} |  |
| [**postCollectionResourceCoursenamePost**](CoursenameEntityControllerApi.md#postCollectionResourceCoursenamePost) | **POST** /coursename |  |
| [**putItemResourceCoursenamePut**](CoursenameEntityControllerApi.md#putItemResourceCoursenamePut) | **PUT** /coursename/{id} |  |


<a name="deleteItemResourceCoursenameDelete"></a>
# **deleteItemResourceCoursenameDelete**
> deleteItemResourceCoursenameDelete(id)



delete-coursename

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursenameEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CoursenameEntityControllerApi apiInstance = new CoursenameEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteItemResourceCoursenameDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursenameEntityControllerApi#deleteItemResourceCoursenameDelete");
      System.err.println("Status code: " + e.getCode());
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **404** | Not Found |  -  |

<a name="getCollectionResourceCoursenameGet1"></a>
# **getCollectionResourceCoursenameGet1**
> PagedModelEntityModelCoursename getCollectionResourceCoursenameGet1(page, size, sort)



get-coursename

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursenameEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CoursenameEntityControllerApi apiInstance = new CoursenameEntityControllerApi(defaultClient);
    Integer page = 0; // Integer | Zero-based page index (0..N)
    Integer size = 20; // Integer | The size of the page to be returned
    List<String> sort = Arrays.asList(); // List<String> | Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
    try {
      PagedModelEntityModelCoursename result = apiInstance.getCollectionResourceCoursenameGet1(page, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursenameEntityControllerApi#getCollectionResourceCoursenameGet1");
      System.err.println("Status code: " + e.getCode());
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
| **page** | **Integer**| Zero-based page index (0..N) | [optional] [default to 0] |
| **size** | **Integer**| The size of the page to be returned | [optional] [default to 20] |
| **sort** | [**List&lt;String&gt;**](String.md)| Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional] |

### Return type

[**PagedModelEntityModelCoursename**](PagedModelEntityModelCoursename.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/x-spring-data-compact+json, text/uri-list

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getItemResourceCoursenameGet"></a>
# **getItemResourceCoursenameGet**
> EntityModelCoursename getItemResourceCoursenameGet(id)



get-coursename

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursenameEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CoursenameEntityControllerApi apiInstance = new CoursenameEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      EntityModelCoursename result = apiInstance.getItemResourceCoursenameGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursenameEntityControllerApi#getItemResourceCoursenameGet");
      System.err.println("Status code: " + e.getCode());
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

[**EntityModelCoursename**](EntityModelCoursename.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |

<a name="patchItemResourceCoursenamePatch"></a>
# **patchItemResourceCoursenamePatch**
> EntityModelCoursename patchItemResourceCoursenamePatch(id, coursenameRequestBody)



patch-coursename

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursenameEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CoursenameEntityControllerApi apiInstance = new CoursenameEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    CoursenameRequestBody coursenameRequestBody = new CoursenameRequestBody(); // CoursenameRequestBody | 
    try {
      EntityModelCoursename result = apiInstance.patchItemResourceCoursenamePatch(id, coursenameRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursenameEntityControllerApi#patchItemResourceCoursenamePatch");
      System.err.println("Status code: " + e.getCode());
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
| **coursenameRequestBody** | [**CoursenameRequestBody**](CoursenameRequestBody.md)|  | |

### Return type

[**EntityModelCoursename**](EntityModelCoursename.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |

<a name="postCollectionResourceCoursenamePost"></a>
# **postCollectionResourceCoursenamePost**
> EntityModelCoursename postCollectionResourceCoursenamePost(coursenameRequestBody)



create-coursename

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursenameEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CoursenameEntityControllerApi apiInstance = new CoursenameEntityControllerApi(defaultClient);
    CoursenameRequestBody coursenameRequestBody = new CoursenameRequestBody(); // CoursenameRequestBody | 
    try {
      EntityModelCoursename result = apiInstance.postCollectionResourceCoursenamePost(coursenameRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursenameEntityControllerApi#postCollectionResourceCoursenamePost");
      System.err.println("Status code: " + e.getCode());
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
| **coursenameRequestBody** | [**CoursenameRequestBody**](CoursenameRequestBody.md)|  | |

### Return type

[**EntityModelCoursename**](EntityModelCoursename.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="putItemResourceCoursenamePut"></a>
# **putItemResourceCoursenamePut**
> EntityModelCoursename putItemResourceCoursenamePut(id, coursenameRequestBody)



update-coursename

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursenameEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CoursenameEntityControllerApi apiInstance = new CoursenameEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    CoursenameRequestBody coursenameRequestBody = new CoursenameRequestBody(); // CoursenameRequestBody | 
    try {
      EntityModelCoursename result = apiInstance.putItemResourceCoursenamePut(id, coursenameRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursenameEntityControllerApi#putItemResourceCoursenamePut");
      System.err.println("Status code: " + e.getCode());
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
| **coursenameRequestBody** | [**CoursenameRequestBody**](CoursenameRequestBody.md)|  | |

### Return type

[**EntityModelCoursename**](EntityModelCoursename.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **204** | No Content |  -  |

