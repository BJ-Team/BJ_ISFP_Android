package com.example.bj_isfp_android.features.main

import com.example.bj_isfp_android.R

sealed class BottomNavigationItem(var route: String, var iconResId: Int, var title: String) {
    object Post : BottomNavigationItem("post", R.drawable.file_defalut, "Post")
    object DailyLife : BottomNavigationItem("dailyLife", R.drawable.home_defalut, "DailyLife")
    object Chatting : BottomNavigationItem("chatting", R.drawable.chat_defalut, "Chatting")
    object MyPage : BottomNavigationItem("myPage", R.drawable.person_defalut, "MyPage")
}
