package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.openapitools.client.model.Client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import play.libs.F;
import retrofit2.Response;

public interface FakeClassnameTags123Api {
  /**
   * To test class name in snake case
   * To test class name in snake case
   * @param client client model (required)
   * @return Call&lt;Client&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("fake_classname_test")
  F.Promise<Response<Client>> testClassname(
    @retrofit2.http.Body Client client
  );

}
