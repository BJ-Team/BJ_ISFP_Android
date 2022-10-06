package com.example.bj_isfp_android.uill

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.domain.enums.SexType

@Preview
@Composable
fun PreviewSexSpinner() {
    SexSpinner(onClick = { sexType: SexType -> println(sexType) })
}

@Composable
fun SexSpinner(
    onClick: (SexType) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        SpinnerItem(item = SexType.MALE, onClick)
        SpinnerItem(item = SexType.FEMALE, onClick)
        SpinnerItem(item = SexType.NULL, onClick)
    }
}

@Composable
fun SpinnerItem(
    item: SexType,
    onClick: (SexType) -> Unit,
) {
    Surface(
        modifier = Modifier
            .clickable {
                onClick(item)
            }
            .fillMaxWidth()
            .padding(start = 40.dp, top = 10.dp, end = 40.dp),
        color = Color.LightGray
    ) {
        Text(
            text = item.name,
            fontSize = 20.sp
        )
    }
}