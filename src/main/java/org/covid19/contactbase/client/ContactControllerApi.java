package org.covid19.contactbase.client;

import org.covid19.contactbase.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.covid19.contactbase.client.model.Contact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ContactControllerApi {
  /**
   * list
   * 
   * @param dateStamp dateStamp (required)
   * @param geohash geohash (required)
   * @return Call&lt;List&lt;Contact&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("api/v1/contacts")
  Call<List<Contact>> listUsingGET(
    @retrofit2.http.Query("dateStamp") String dateStamp, @retrofit2.http.Query("geohash") String geohash
  );

  /**
   * store
   * 
   * @param contacts contacts (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/v1/contacts")
  Call<Void> storeUsingPOST(
    @retrofit2.http.Body List<Contact> contacts
  );

}
