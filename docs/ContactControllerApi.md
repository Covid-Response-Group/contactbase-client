# ContactControllerApi

All URIs are relative to *https://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listUsingPOST**](ContactControllerApi.md#listUsingPOST) | **POST** api/v1/contacts/query | list
[**storeUsingPOST**](ContactControllerApi.md#storeUsingPOST) | **POST** api/v1/contacts | store


<a name="listUsingPOST"></a>
# **listUsingPOST**
> List&lt;Contact&gt; listUsingPOST(queryRequest)

list

### Example
```java
// Import classes:
//import org.covid19.contactbase.client.invoker.ApiException;
//import org.covid19.contactbase.client.ContactControllerApi;


ContactControllerApi apiInstance = new ContactControllerApi();
QueryRequest queryRequest = new QueryRequest(); // QueryRequest | queryRequest
try {
    List<Contact> result = apiInstance.listUsingPOST(queryRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactControllerApi#listUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryRequest** | [**QueryRequest**](QueryRequest.md)| queryRequest |

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

