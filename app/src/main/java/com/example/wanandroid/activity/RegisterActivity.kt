package com.example.wanandroid.activity

import android.app.Activity
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wanandroid.R
import com.jaeger.library.StatusBarUtil

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StatusBarUtil.setTransparent(this)
        setContentView(R.layout.activity_register)

    }
}