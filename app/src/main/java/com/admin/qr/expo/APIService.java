package com.admin.qr.expo;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Севастьян on 25.09.2017.
 */


/* Retrofit 2.0 */



public interface APIService {


    @POST("check_ticket")
    Call<User> loadTicket(@Body RequestBody ticket);

}