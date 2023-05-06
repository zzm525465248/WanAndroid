package com.example.wanandroid.net

import com.example.wanandroid.Bean.User
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import okhttp3.ResponseBody
import retrofit2.Response

interface ApiService {
    companion object {
        const val SERVER_URL = "https://wanandroid.com/"
    }

    /*
        登录
     */
    @FormUrlEncoded
    @POST("user/login")
    suspend fun login(
        @Field("username") username: String,
        @Field("password") pwd: String
    ): ApiResponse<User>

}