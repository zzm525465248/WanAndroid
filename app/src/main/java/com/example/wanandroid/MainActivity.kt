package com.example.wanandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.wanandroid.Uint.visibleAlphaAnimation
import com.example.wanandroid.activity.LoginActivity
import com.example.wanandroid.activity.RegisterActivity
import com.jaeger.library.StatusBarUtil

class MainActivity : AppCompatActivity() {
    lateinit var bt_log: Button
    lateinit var bt_register: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StatusBarUtil.setTransparent(this)
        setContentView(R.layout.activity_main)

        bt_log = findViewById(R.id.button)
        bt_register = findViewById(R.id.button2)
        bt_log.visibleAlphaAnimation(1000)
        bt_register.visibleAlphaAnimation(1000)
        bt_register.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
            finish()
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
        bt_log.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }


}