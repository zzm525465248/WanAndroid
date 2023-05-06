package com.example.wanandroid.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.wanandroid.Bean.User
import com.example.wanandroid.net.ApiResponse
import com.example.wanandroid.net.ApiService
import com.example.wanandroid.net.apiService
import me.hgj.jetpackmvvm.base.viewmodel.BaseViewModel
import me.hgj.jetpackmvvm.ext.request
import me.hgj.jetpackmvvm.ext.requestNoCheck
import me.hgj.jetpackmvvm.state.ResultState
import kotlin.math.log

class LoginViewmodel : BaseViewModel() {
    //自动脱壳过滤处理请求结果，自动判断结果是否成功
    var loginResult = MutableLiveData<ResultState<User>>()

    //不用框架帮脱壳
    var loginResult2 = MutableLiveData<ResultState<ApiResponse<User>>>()

    fun login(username: String, password: String) {
        //      1.在 Activity/Fragment的监听回调中拿到已脱壳的数据（项目有基类的可以用）
//        request(
//            { apiService.login(username,password) }, //请求体
//
//            loginResult,//请求的结果接收者，请求成功与否都会改变该值，在Activity或fragment中监听回调结果，具体可看loginActivity中的回调
//            true,//是否显示等待框，，默认false不显示 可以默认不传
//            "正在登录中..."//等待框内容，可以默认不填请求网络中...
//        )


        // 2.在Activity/Fragment中的监听拿到未脱壳的数据，你可以自己根据code做业务需求操作（项目没有基类的可以用）
        requestNoCheck(
            { apiService.login(username, password) },
            loginResult2,
            true,
            "正在登录中..."
        )


    }
}