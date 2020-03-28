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

public interface BasicErrorControllerApi {
  /**
   * error
   * 
   * @return Call&lt;Map&lt;String, Object&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("error")
  Call<Map<String, Object>> errorUsingDELETE();
    

  /**
   * error
   * 
   * @return Call&lt;Map&lt;String, Object&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("error")
  Call<Map<String, Object>> errorUsingGET();
    

  /**
   * error
   * 
   * @return Call&lt;Map&lt;String, Object&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @HEAD("error")
  Call<Map<String, Object>> errorUsingHEAD();
    

  /**
   * error
   * 
   * @return Call&lt;Map&lt;String, Object&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @OPTIONS("error")
  Call<Map<String, Object>> errorUsingOPTIONS();
    

  /**
   * error
   * 
   * @return Call&lt;Map&lt;String, Object&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("error")
  Call<Map<String, Object>> errorUsingPATCH();
    

  /**
   * error
   * 
   * @return Call&lt;Map&lt;String, Object&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("error")
  Call<Map<String, Object>> errorUsingPOST();
    

  /**
   * error
   * 
   * @return Call&lt;Map&lt;String, Object&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("error")
  Call<Map<String, Object>> errorUsingPUT();
    

}
