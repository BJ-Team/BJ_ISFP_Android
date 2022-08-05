package com.example.bj_isfp_android.features.post

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.bj_isfp_android.features.main.BottomNavigationItem

@Composable
fun Post(
    navController: NavController
) {
    Text(
        text = "Post",
        fontSize = 40.sp,
        modifier = Modifier.fillMaxSize(),
    )
}
