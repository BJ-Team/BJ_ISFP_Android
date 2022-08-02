package com.example.bj_isfp_android.uill

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Spacers(orientation: String, value: Int) {
    if (orientation == "height") {
        Spacer(modifier = Modifier.height(value.dp))
    } else if (orientation == "width") {
        Spacer(modifier = Modifier.width(value.dp))
    }
}