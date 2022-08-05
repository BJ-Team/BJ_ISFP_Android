package com.example.bj_isfp_android.features.postdetail

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun PostDetail(
    navController: NavController
) {
    Text(
        text = "PostDetail",
        fontSize = 40.sp,
        modifier = Modifier.fillMaxSize(),
    )
}