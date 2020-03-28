# DeviceRegistrationControllerApi

All URIs are relative to *https://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**registerUsingPOST**](DeviceRegistrationControllerApi.md#registerUsingPOST) | **POST** api/v1/devices | register


<a name="registerUsingPOST"></a>
# **registerUsingPOST**
> TokenResponse registerUsingPOST(device)

register

### Example
```java
// Import classes:
//import org.covid19.contactbase.client.invoker.ApiException;
//import org.covid19.contactbase.client.DeviceRegistrationControllerApi;


DeviceRegistrationControllerApi apiInstance = new DeviceRegistrationControllerApi();
Device device = new Device(); // Device | device
try {
    TokenResponse result = apiInstance.registerUsingPOST(device);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceRegistrationControllerApi#registerUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **device** | [**Device**](Device.md)| device |

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

