package com.example.bj_isfp_android.features.auth.login

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.bj_isfp_android.R
import com.example.bj_isfp_android.features.auth.IdTextField
import com.example.bj_isfp_android.features.auth.PasswordTextField
import com.example.bj_isfp_android.uill.Spacers

@Composable
fun LoginScreen(
    navController: NavController,
    scaffoldState: ScaffoldState,
    loginViewModel: LoginViewModel = hiltViewModel()
) {
    val state = loginViewModel.state.collectAsState().value
    Scaffold {
        Column(
            modifier = Modifier.padding(14.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacers(orientation = stringResource(id = R.string.height), value = -20)
            Title()
            Spacers(orientation = stringResource(id = R.string.height), value = 50)
            val idLabel = stringResource(id = R.string.id)
            IdTextField(
                text = state.email,
                label = idLabel,
                doOnValueChange = {
                    loginViewModel.setEmail(it)
                },
                imeAction = ImeAction.Next
            )

            val passwordLabel = stringResource(id = R.string.password)
            PasswordTextField(
                text = state.password,
                label = passwordLabel,
                doOnValueChange = {
                    loginViewModel.setPassword(it)
                },
                imeAction = ImeAction.Done
            )
            Spacers(orientation = stringResource(id = R.string.height), value = 40)
            LoginButton()
            Spacers(orientation = stringResource(id = R.string.height), value = 25)
            FindIdPw()
            Spacers(orientation = stringResource(id = R.string.height), value = 5)
            JoinEmail()
        }
    }
}



@Composable
fun Title() {
    Text(
        text = stringResource(id = R.string.login),
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
            text = stringResource(id = R.string.findId),
            color = Color.DarkGray,
            fontSize = 11.sp
        )
        Spacers(
            orientation = stringResource(id = R.string.width),
            value = 15
        )
        Text(
            text = "|",
            color = Color.DarkGray,
            fontSize = 11.sp
        )
        Spacers(
            orientation = stringResource(id = R.string.width),
            value = 15
        )
        Text(
            text = stringResource(id = R.string.findPw),
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
            text = stringResource(id = R.string.register),
            color = Color.DarkGray,
            fontSize = 14.sp
        )
    }
}