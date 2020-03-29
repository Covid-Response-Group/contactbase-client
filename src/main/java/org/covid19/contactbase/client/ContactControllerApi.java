package org.covid19.contactbase.client;

import org.covid19.contactbase.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.covid19.contactbase.client.model.Contact;
import org.covid19.contactbase.client.model.QueryRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ContactControllerApi {
  /**
   * list
   * 
   * @param queryRequest queryRequest (required)
   * @return Call&lt;List&lt;Contact&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/v1/contacts/query")
  Call<List<Contact>> listUsingPOST(
    @retrofit2.http.Body QueryRequest queryRequest
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
