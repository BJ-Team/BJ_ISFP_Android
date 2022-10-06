package com.example.bj_isfp_android.ui

import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bj_isfp_android.features.auth.login.LoginScreen
import com.example.bj_isfp_android.features.auth.register.RegisterScreen
import com.example.bj_isfp_android.features.main.Main
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun IsFpApp() {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val systemUiController = rememberSystemUiController()

    NavHost(navController = navController, startDestination = "login") {

        composable("main") { Main(navController) }

        composable(
            route = "login"
        ) {
            LoginScreen(navController = navController, scaffoldState = scaffoldState)
        }

        composable(
            route = "register"
        ) {
            RegisterScreen(navController = navController, scaffoldState = scaffoldState)
        }
    }
}
