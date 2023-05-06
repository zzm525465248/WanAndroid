package com.example.wanandroid.Base

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import androidx.viewbinding.ViewBinding
import me.hgj.jetpackmvvm.base.activity.BaseVmVbActivity
import me.hgj.jetpackmvvm.base.viewmodel.BaseViewModel

abstract class BaseActivity<VM : BaseViewModel, VB : ViewBinding> : BaseVmVbActivity<VM, VB>() {

    override fun createObserver() {

    }

    override fun dismissLoading() {

    }

    override fun initView(savedInstanceState: Bundle?) {

    }

    override fun showLoading(message: String) {

    }
}