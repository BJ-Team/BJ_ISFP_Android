package com.example.bj_isfp_android.features.auth

import android.text.Layout
import android.widget.Space
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.R
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bj_isfp_android.uill.Spacers
import org.intellij.lang.annotations.JdkConstants

@Composable
fun LoginScreen() {
    val (id, setId) = rememberSaveable {
        mutableStateOf("")
    }

    val (password, setPassword) = rememberSaveable {
        mutableStateOf("")
    }
    Scaffold {
        Column(
            modifier = Modifier.padding(14.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacers(orientation = "height", value = -20)
            Title()
            Spacers(orientation = "height", value = 50)
            OutlinedTextField(
                value = id,
                onValueChange = setId,
                label = { Text("ID") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )
            OutlinedTextField(
                value = password,
                onValueChange = setPassword,
                label = { Text("PW") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )
            Spacers(orientation = "height", value = 40)
            LoginButton()
            Spacers(orientation = "height", value = 25)
            FindIdPw()
            Spacers(orientation = "height", value = 5)
            JoinEmail()
        }
    }
}

@Composable
fun Title() {
    Text(
        text = "로그인",
        color = Color.Black,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun LoginButton() {
    Button(
        onClick = {},
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.LightGray,
            contentColor = Color.Black
        )
    ) {
        Text("로그인")
    }
}

@Composable
fun FindIdPw() {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "아이디 찾기",
            color = Color.DarkGray,
            fontSize = 11.sp
        )
        Spacer(
            modifier = Modifier
                .padding()
                .width(25.5.dp)
        )
        Text(
            text = "|",
            color = Color.DarkGray,
            fontSize = 11.sp
        )
        Spacer(
            modifier = Modifier
                .padding()
                .width(25.5.dp)
        )
        Text(
            text = "비밀번호 찾기",
            color = Color.DarkGray,
            fontSize = 11.sp
        )
    }
}

@Composable
fun JoinEmail() {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(40.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.LightGray,
            contentColor = Color.Black
        )
    ) {
        Text(
            text = "이메일로 가입하기",
            color = Color.DarkGray,
            fontSize = 14.sp
        )
    }
}