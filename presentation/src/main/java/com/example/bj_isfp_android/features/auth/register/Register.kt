package com.example.bj_isfp_android.features.auth.register

import androidx.compose.foundation.layout.*
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.bj_isfp_android.R
import com.example.bj_isfp_android.features.auth.PasswordTextField
import com.example.bj_isfp_android.uill.Spacers
import com.example.bj_isfp_android.features.auth.IdTextField
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun RegisterScreen(
    navController: NavController,
    scaffoldState: ScaffoldState,
    registerViewModel: RegisterViewModel = hiltViewModel()
) {
    val state = registerViewModel.state.collectAsState().value
    Column(
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
        modifier = Modifier.padding(14.dp)
    ) {
        MainTitle()
        ScanIdTextField(
            registerViewModel = registerViewModel,
            state = state
        )
        ScanPassWordTextField(
            registerViewModel = registerViewModel,
            state = state
        )
    }
}

@Composable
fun MainTitle() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacers(orientation = stringResource(id = R.string.height), value = 10)
        Text(
            text = "ISFP 회원가입",
            fontSize = 31.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun ScanIdTextField(
    registerViewModel: RegisterViewModel,
    state: RegisterState
) {
    val idLabel = stringResource(id = R.string.id)
    Spacers(orientation = stringResource(id = R.string.height), value = 40)
    IdTextField(
        text = state.id,
        label = idLabel,
        doOnValueChange = {
            registerViewModel.setId(it)
        },
        imeAction = ImeAction.Next
    )
}

@Composable
fun ScanPassWordTextField(
    registerViewModel: RegisterViewModel,
    state: RegisterState
) {
    val passwordLabel = stringResource(id = R.string.password)

    Spacers(orientation = stringResource(id = R.string.height), value = 10)
    PasswordTextField(
        text = state.password,
        label = passwordLabel,
        doOnValueChange = {
            registerViewModel.setPassword(it)
        },
        imeAction = ImeAction.Done
    )
}