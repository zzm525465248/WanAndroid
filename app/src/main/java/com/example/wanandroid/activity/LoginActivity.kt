package com.example.wanandroid.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewTreeLifecycleOwner
import androidx.lifecycle.lifecycleScope
import com.example.wanandroid.Base.BaseActivity
import com.example.wanandroid.Bean.User
import com.example.wanandroid.R
import com.example.wanandroid.databinding.ActivityLoginBinding

import com.example.wanandroid.viewmodel.LoginViewmodel
import com.jaeger.library.StatusBarUtil
import me.hgj.jetpackmvvm.ext.getAppViewModel
import me.hgj.jetpackmvvm.ext.parseState
import me.hgj.jetpackmvvm.ext.util.logd

class LoginActivity : BaseActivity<LoginViewmodel, ActivityLoginBinding>() {
    private val requestLoginRegisterViewModel: LoginViewmodel by viewModels()
    override fun createObserver() {


    }

    override fun dismissLoading() {
        super.dismissLoading()
    }

    override fun initView(savedInstanceState: Bundle?) {
        super.initView(savedInstanceState)
        addLoadingObserve(requestLoginRegisterViewModel)
        mViewBind.button.setOnClickListener {
            login().log()
            requestLoginRegisterViewModel.loginResult2.observe(this, Observer { resultState ->
                parseState(resultState, {
                    if (it.errorCode == 0) {
                        //登录成功 打印用户名
                        it.data.data.nickname.logd()
                    } else {
                        //登录失败

                    }
                }, {
                    //请求发生了异常

                })
            })
        }

    }

    override fun showLoading(message: String) {
        super.showLoading(message)
    }

    inner class login {
        fun log() {
            requestLoginRegisterViewModel.login(
                "zzm525465248", "112233"
            )
        }
    }
}