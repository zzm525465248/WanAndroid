package com.example.wanandroid.net

import me.hgj.jetpackmvvm.network.BaseResponse

data class ApiResponse<T>(var errorCode: Int, var errorMsg: String, var data: T) :
    BaseResponse<T>() {

    // 这里是示例，wanandroid 网站返回的 错误码为 0 就代表请求成功，请你根据自己的业务需求来编写
    override fun isSucces() = errorCode == 0

    override fun getResponseCode() = errorCode

    override fun getResponseData() = data

    override fun getResponseMsg() = errorMsg

}