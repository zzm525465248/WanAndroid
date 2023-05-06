package com.example.wanandroid.Bean

import android.annotation.SuppressLint
import android.os.Parcelable
import androidx.annotation.Nullable


data class User(
    var `data`: Data,
    var errorCode: Int,
    var errorMsg: String
) {
    data class Data(
        var admin: Boolean,
        var chapterTops: List<Any>,
        var coinCount: Int,
        var collectIds: List<Any>,
        var email: String,
        var icon: String,
        var id: Int,
        var nickname: String,
        var password: String,
        var publicName: String,
        var token: String,
        var type: Int,
        var username: String
    )
}