# CoursePropertyReferenceControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPropertyReferenceCoursePatch**](CoursePropertyReferenceControllerApi.md#createPropertyReferenceCoursePatch) | **PATCH** /course/{id}/degreetype |  |
| [**createPropertyReferenceCoursePatch1**](CoursePropertyReferenceControllerApi.md#createPropertyReferenceCoursePatch1) | **PATCH** /course/{id}/students |  |
| [**createPropertyReferenceCoursePut**](CoursePropertyReferenceControllerApi.md#createPropertyReferenceCoursePut) | **PUT** /course/{id}/degreetype |  |
| [**createPropertyReferenceCoursePut1**](CoursePropertyReferenceControllerApi.md#createPropertyReferenceCoursePut1) | **PUT** /course/{id}/students |  |
| [**deletePropertyReferenceCourseDelete**](CoursePropertyReferenceControllerApi.md#deletePropertyReferenceCourseDelete) | **DELETE** /course/{id}/degreetype |  |
| [**deletePropertyReferenceCourseDelete1**](CoursePropertyReferenceControllerApi.md#deletePropertyReferenceCourseDelete1) | **DELETE** /course/{id}/students |  |
| [**deletePropertyReferenceIdCourseDelete**](CoursePropertyReferenceControllerApi.md#deletePropertyReferenceIdCourseDelete) | **DELETE** /course/{id}/degreetype/{propertyId} |  |
| [**deletePropertyReferenceIdCourseDelete1**](CoursePropertyReferenceControllerApi.md#deletePropertyReferenceIdCourseDelete1) | **DELETE** /course/{id}/students/{propertyId} |  |
| [**followPropertyReferenceCourseGet**](CoursePropertyReferenceControllerApi.md#followPropertyReferenceCourseGet) | **GET** /course/{id}/degreetype/{propertyId} |  |
| [**followPropertyReferenceCourseGet1**](CoursePropertyReferenceControllerApi.md#followPropertyReferenceCourseGet1) | **GET** /course/{id}/degreetype |  |
| [**followPropertyReferenceCourseGet2**](CoursePropertyReferenceControllerApi.md#followPropertyReferenceCourseGet2) | **GET** /course/{id}/students/{propertyId} |  |
| [**followPropertyReferenceCourseGet21**](CoursePropertyReferenceControllerApi.md#followPropertyReferenceCourseGet21) | **GET** /course/{id}/students |  |


<a name="createPropertyReferenceCoursePatch"></a>
# **createPropertyReferenceCoursePatch**
> EntityModelDegreetype createPropertyReferenceCoursePatch(id, collectionModelObject)



patch-degreetype-by-course-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CoursePropertyReferenceControllerApi apiInstance = new CoursePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    CollectionModelObject collectionModelObject = new CollectionModelObject(); // CollectionModelObject | 
    try {
      EntityModelDegreetype result = apiInstance.createPropertyReferenceCoursePatch(id, collectionModelObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursePropertyReferenceControllerApi#createPropertyReferenceCoursePatch");
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
| **collectionModelObject** | [**CollectionModelObject**](CollectionModelObject.md)|  | |

### Return type

[**EntityModelDegreetype**](EntityModelDegreetype.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-spring-data-compact+json, text/uri-list
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |

<a name="createPropertyReferenceCoursePatch1"></a>
# **createPropertyReferenceCoursePatch1**
> CollectionModelStudent createPropertyReferenceCoursePatch1(id, collectionModelObject)



patch-student-by-course-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CoursePropertyReferenceControllerApi apiInstance = new CoursePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    CollectionModelObject collectionModelObject = new CollectionModelObject(); // CollectionModelObject | 
    try {
      CollectionModelStudent result = apiInstance.createPropertyReferenceCoursePatch1(id, collectionModelObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursePropertyReferenceControllerApi#createPropertyReferenceCoursePatch1");
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
| **collectionModelObject** | [**CollectionModelObject**](CollectionModelObject.md)|  | |

### Return type

[**CollectionModelStudent**](CollectionModelStudent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-spring-data-compact+json, text/uri-list
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |

<a name="createPropertyReferenceCoursePut"></a>
# **createPropertyReferenceCoursePut**
> EntityModelDegreetype createPropertyReferenceCoursePut(id, collectionModelObject)



update-degreetype-by-course-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CoursePropertyReferenceControllerApi apiInstance = new CoursePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    CollectionModelObject collectionModelObject = new CollectionModelObject(); // CollectionModelObject | 
    try {
      EntityModelDegreetype result = apiInstance.createPropertyReferenceCoursePut(id, collectionModelObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursePropertyReferenceControllerApi#createPropertyReferenceCoursePut");
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
| **collectionModelObject** | [**CollectionModelObject**](CollectionModelObject.md)|  | |

### Return type

[**EntityModelDegreetype**](EntityModelDegreetype.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-spring-data-compact+json, text/uri-list
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **204** | No Content |  -  |

<a name="createPropertyReferenceCoursePut1"></a>
# **createPropertyReferenceCoursePut1**
> CollectionModelStudent createPropertyReferenceCoursePut1(id, collectionModelObject)



update-student-by-course-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CoursePropertyReferenceControllerApi apiInstance = new CoursePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    CollectionModelObject collectionModelObject = new CollectionModelObject(); // CollectionModelObject | 
    try {
      CollectionModelStudent result = apiInstance.createPropertyReferenceCoursePut1(id, collectionModelObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursePropertyReferenceControllerApi#createPropertyReferenceCoursePut1");
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
| **collectionModelObject** | [**CollectionModelObject**](CollectionModelObject.md)|  | |

### Return type

[**CollectionModelStudent**](CollectionModelStudent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-spring-data-compact+json, text/uri-list
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **204** | No Content |  -  |

<a name="deletePropertyReferenceCourseDelete"></a>
# **deletePropertyReferenceCourseDelete**
> deletePropertyReferenceCourseDelete(id)



delete-degreetype-by-course-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CoursePropertyReferenceControllerApi apiInstance = new CoursePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deletePropertyReferenceCourseDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursePropertyReferenceControllerApi#deletePropertyReferenceCourseDelete");
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

<a name="deletePropertyReferenceCourseDelete1"></a>
# **deletePropertyReferenceCourseDelete1**
> deletePropertyReferenceCourseDelete1(id)



delete-student-by-course-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CoursePropertyReferenceControllerApi apiInstance = new CoursePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deletePropertyReferenceCourseDelete1(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursePropertyReferenceControllerApi#deletePropertyReferenceCourseDelete1");
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

<a name="deletePropertyReferenceIdCourseDelete"></a>
# **deletePropertyReferenceIdCourseDelete**
> deletePropertyReferenceIdCourseDelete(id, propertyId)



delete-degreetype-by-course-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CoursePropertyReferenceControllerApi apiInstance = new CoursePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    String propertyId = "propertyId_example"; // String | 
    try {
      apiInstance.deletePropertyReferenceIdCourseDelete(id, propertyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursePropertyReferenceControllerApi#deletePropertyReferenceIdCourseDelete");
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
| **propertyId** | **String**|  | |

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

<a name="deletePropertyReferenceIdCourseDelete1"></a>
# **deletePropertyReferenceIdCourseDelete1**
> deletePropertyReferenceIdCourseDelete1(id, propertyId)



delete-student-by-course-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CoursePropertyReferenceControllerApi apiInstance = new CoursePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    String propertyId = "propertyId_example"; // String | 
    try {
      apiInstance.deletePropertyReferenceIdCourseDelete1(id, propertyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursePropertyReferenceControllerApi#deletePropertyReferenceIdCourseDelete1");
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
| **propertyId** | **String**|  | |

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

<a name="followPropertyReferenceCourseGet"></a>
# **followPropertyReferenceCourseGet**
> EntityModelDegreetype followPropertyReferenceCourseGet(id, propertyId)



get-degreetype-by-course-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CoursePropertyReferenceControllerApi apiInstance = new CoursePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    String propertyId = "propertyId_example"; // String | 
    try {
      EntityModelDegreetype result = apiInstance.followPropertyReferenceCourseGet(id, propertyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursePropertyReferenceControllerApi#followPropertyReferenceCourseGet");
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
| **propertyId** | **String**|  | |

### Return type

[**EntityModelDegreetype**](EntityModelDegreetype.md)

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

<a name="followPropertyReferenceCourseGet1"></a>
# **followPropertyReferenceCourseGet1**
> EntityModelDegreetype followPropertyReferenceCourseGet1(id)



get-degreetype-by-course-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CoursePropertyReferenceControllerApi apiInstance = new CoursePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      EntityModelDegreetype result = apiInstance.followPropertyReferenceCourseGet1(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursePropertyReferenceControllerApi#followPropertyReferenceCourseGet1");
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

[**EntityModelDegreetype**](EntityModelDegreetype.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, text/uri-list

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |

<a name="followPropertyReferenceCourseGet2"></a>
# **followPropertyReferenceCourseGet2**
> CollectionModelStudent followPropertyReferenceCourseGet2(id, propertyId)



get-student-by-course-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CoursePropertyReferenceControllerApi apiInstance = new CoursePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    String propertyId = "propertyId_example"; // String | 
    try {
      CollectionModelStudent result = apiInstance.followPropertyReferenceCourseGet2(id, propertyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursePropertyReferenceControllerApi#followPropertyReferenceCourseGet2");
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
| **propertyId** | **String**|  | |

### Return type

[**CollectionModelStudent**](CollectionModelStudent.md)

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

<a name="followPropertyReferenceCourseGet21"></a>
# **followPropertyReferenceCourseGet21**
> CollectionModelStudent followPropertyReferenceCourseGet21(id)



get-student-by-course-Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoursePropertyReferenceControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    CoursePropertyReferenceControllerApi apiInstance = new CoursePropertyReferenceControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CollectionModelStudent result = apiInstance.followPropertyReferenceCourseGet21(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoursePropertyReferenceControllerApi#followPropertyReferenceCourseGet21");
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

[**CollectionModelStudent**](CollectionModelStudent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, text/uri-list

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |

