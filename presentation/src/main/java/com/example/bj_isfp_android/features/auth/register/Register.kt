package com.example.bj_isfp_android.features.auth.register

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import com.example.bj_isfp_android.uill.SexSpinner
import com.example.domain.enums.SexType

@Composable
fun RegisterScreen(
    navController: NavController,
    scaffoldState: ScaffoldState,
    registerViewModel: RegisterViewModel = hiltViewModel()
) {
    val state = registerViewModel.state.collectAsState().value
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
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
        ScanNameTextField(
            registerViewModel = registerViewModel,
            state = state
        )
        ScanPlaceNameTextField(
            registerViewModel = registerViewModel,
            state = state
        )
        ScanSexSpinner(
            registerViewModel = registerViewModel
        )
        EndRegister(registerViewModel = registerViewModel)
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
        label = "$idLabel 입력",
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
        label = "$passwordLabel 입력",
        doOnValueChange = {
            registerViewModel.setPassword(it)
        },
        imeAction = ImeAction.Done
    )
}

@Composable
fun ScanNameTextField(
    registerViewModel: RegisterViewModel,
    state: RegisterState
) {
    val nameLabel = stringResource(id = R.string.name)

    Spacers(orientation = stringResource(id = R.string.height), value = 10)
    IdTextField(
        text = state.name,
        label = "$nameLabel 입력",
        doOnValueChange = {
            registerViewModel.setName(it)
        },
        imeAction = ImeAction.Done
    )
}

@Composable
fun ScanPlaceNameTextField(
    registerViewModel: RegisterViewModel,
    state: RegisterState
) {
    val placeLabel = stringResource(id = R.string.place)

    Spacers(orientation = stringResource(id = R.string.height), value = 10)
    IdTextField(
        text = state.place,
        label = "$placeLabel 입력",
        doOnValueChange = {
            registerViewModel.setPlace(it)
        },
        imeAction = ImeAction.Done
    )
}

@Composable
fun ScanSexSpinner(
    registerViewModel: RegisterViewModel
) {
    var a by remember { mutableStateOf(false) }
    var b by remember { mutableStateOf<String>("선택") }

    Spacers(orientation = stringResource(id = R.string.height), value = 10)
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 42.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = "성별 입력",
            fontSize = 16.sp,
        )
        Spacers(orientation = stringResource(id = R.string.width), value = 15)
        Button(
            onClick = {
                a = !a
            },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
        ) {
            Text(text = b)
            val sexType: SexType
            when (b) {
                "MALE" -> {
                    sexType = SexType.MALE
                }
                "FEMALE" -> {
                    sexType = SexType.FEMALE
                }
                else -> {
                    sexType = SexType.NULL
                }
            }
            registerViewModel.setSex(sexType)
        }
    }

    if (a) {
        SexSpinner(onClick = { sexType: SexType -> b = sexType.name } )
    }
}

@Composable
fun EndRegister(
    registerViewModel: RegisterViewModel
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box (
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
            contentAlignment = Alignment.BottomCenter
        ) {
            Button(
                onClick = { registerViewModel.register() },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(40.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.LightGray,
                    contentColor = Color.Black
                )
            ) {
                Text(
                    text = stringResource(id = R.string.endregister),
                    color = Color.DarkGray,
                    fontSize = 14.sp
                )
            }
        }
    }
}