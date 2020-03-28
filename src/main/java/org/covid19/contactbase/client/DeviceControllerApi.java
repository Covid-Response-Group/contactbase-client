package org.covid19.contactbase.client;

import org.covid19.contactbase.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DeviceControllerApi {
  /**
   * isInfected
   * 
   * @return Call&lt;Boolean&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("api/v1/device/infected")
  Call<Boolean> isInfectedUsingGET();
    

  /**
   * markInfected
   * 
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/v1/device/infected")
  Call<Void> markInfectedUsingPOST();
    

  /**
   * unMarkInfected
   * 
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("api/v1/device/infected")
  Call<Void> unMarkInfectedUsingDELETE();
    

}
