package org.covid19.contactbase.client;

import org.covid19.contactbase.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.covid19.contactbase.client.model.Device;
import org.covid19.contactbase.client.model.TokenResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DeviceRegistrationControllerApi {
  /**
   * register
   * 
   * @param device device (required)
   * @return Call&lt;TokenResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/v1/devices")
  Call<TokenResponse> registerUsingPOST(
    @retrofit2.http.Body Device device
  );

}
