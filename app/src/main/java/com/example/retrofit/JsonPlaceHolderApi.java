package com.example.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

/*    @GET("posts")

    Call<List<Post>> getPosts();*/

    @GET("/v1/dc283e42-94ee-4363-972e-a42f37a83144")

    Call<List<Reprr>> getPosts();

}
