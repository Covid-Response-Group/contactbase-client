# ContactControllerApi

All URIs are relative to *https://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listUsingGET**](ContactControllerApi.md#listUsingGET) | **GET** api/v1/contacts | list
[**storeUsingPOST**](ContactControllerApi.md#storeUsingPOST) | **POST** api/v1/contacts | store


<a name="listUsingGET"></a>
# **listUsingGET**
> List&lt;Contact&gt; listUsingGET(dateStamp, geohash)

list

### Example
```java
// Import classes:
//import org.covid19.contactbase.client.invoker.ApiException;
//import org.covid19.contactbase.client.ContactControllerApi;


ContactControllerApi apiInstance = new ContactControllerApi();
String dateStamp = "dateStamp_example"; // String | dateStamp
String geohash = "geohash_example"; // String | geohash
try {
    List<Contact> result = apiInstance.listUsingGET(dateStamp, geohash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactControllerApi#listUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dateStamp** | **String**| dateStamp |
 **geohash** | **String**| geohash |

### Return type

[**List&lt;Contact&gt;**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="storeUsingPOST"></a>
# **storeUsingPOST**
> storeUsingPOST(contacts)

store

### Example
```java
// Import classes:
//import org.covid19.contactbase.client.invoker.ApiException;
//import org.covid19.contactbase.client.ContactControllerApi;


ContactControllerApi apiInstance = new ContactControllerApi();
List<Contact> contacts = Arrays.asList(new Contact()); // List<Contact> | contacts
try {
    apiInstance.storeUsingPOST(contacts);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactControllerApi#storeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contacts** | [**List&lt;Contact&gt;**](Contact.md)| contacts |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

