package com.example.orange.Retro;

import com.example.orange.User;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface RetrofitInterface
{
    //Get user by id
    @GET("api/Users1/{id}")
    public Call <User> getUserById(@Path("id") int id);

    //Get All Users
    @GET("api/Users1")
    public Call <List<User>> getAllUsers();

    //delete user by id
    @DELETE("api/Users1/{id}")
    public Call <User> deleteUserById(@Path("id") int id);


    //Add user
    @FormUrlEncoded
    @POST("api/Users1")
    public Call <User> addUser(@Field("FName") String FName,
                               @Field("LName") String LName,
                               @Field("Email") String mail);

    //Add user
    @FormUrlEncoded
    @POST("api/Users1")
    public Call <User> addUser(@Field("Email") String mail,
                               @Field("FName") String FName,
                               @Field("LName") String LName,
                               @Field("PhoneNumber") String PhoneNumber,
                               @Field("Age") String Age,
                               @Field("Country") String Country);

    //Add user
    @POST("api/Users1")
    public Call <User> addUser(@Body User user);

    //Update user
    @FormUrlEncoded
    @PUT("api/Users1/{id}")
    public Call <User> updateUser(@Path("id") int id,
                                  @Field("Email") String mail,
                                  @Field("FName") String FName,
                                  @Field("LName") String LName,
                                  @Field("PhoneNumber") String PhoneNumber,
                                  @Field("Age") String Age,
                                  @Field("Country") String Country);


}
