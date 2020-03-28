# DeviceControllerApi

All URIs are relative to *https://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**isInfectedUsingGET**](DeviceControllerApi.md#isInfectedUsingGET) | **GET** api/v1/device/infected | isInfected
[**markInfectedUsingPOST**](DeviceControllerApi.md#markInfectedUsingPOST) | **POST** api/v1/device/infected | markInfected
[**unMarkInfectedUsingDELETE**](DeviceControllerApi.md#unMarkInfectedUsingDELETE) | **DELETE** api/v1/device/infected | unMarkInfected


<a name="isInfectedUsingGET"></a>
# **isInfectedUsingGET**
> Boolean isInfectedUsingGET()

isInfected

### Example
```java
// Import classes:
//import org.covid19.contactbase.client.invoker.ApiException;
//import org.covid19.contactbase.client.DeviceControllerApi;


DeviceControllerApi apiInstance = new DeviceControllerApi();
try {
    Boolean result = apiInstance.isInfectedUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceControllerApi#isInfectedUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="markInfectedUsingPOST"></a>
# **markInfectedUsingPOST**
> markInfectedUsingPOST()

markInfected

### Example
```java
// Import classes:
//import org.covid19.contactbase.client.invoker.ApiException;
//import org.covid19.contactbase.client.DeviceControllerApi;


DeviceControllerApi apiInstance = new DeviceControllerApi();
try {
    apiInstance.markInfectedUsingPOST();
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceControllerApi#markInfectedUsingPOST");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="unMarkInfectedUsingDELETE"></a>
# **unMarkInfectedUsingDELETE**
> unMarkInfectedUsingDELETE()

unMarkInfected

### Example
```java
// Import classes:
//import org.covid19.contactbase.client.invoker.ApiException;
//import org.covid19.contactbase.client.DeviceControllerApi;


DeviceControllerApi apiInstance = new DeviceControllerApi();
try {
    apiInstance.unMarkInfectedUsingDELETE();
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceControllerApi#unMarkInfectedUsingDELETE");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

