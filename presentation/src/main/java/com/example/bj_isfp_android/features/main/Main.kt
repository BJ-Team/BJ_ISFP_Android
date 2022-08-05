package com.example.bj_isfp_android.features.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bj_isfp_android.features.chattinglist.ChattingList
import com.example.bj_isfp_android.features.dailylife.DailyLife
import com.example.bj_isfp_android.features.mypage.MyPage

@Composable
fun Main(
    navController: NavController
) {
    val scaffoldState = rememberScaffoldState()
    val navHostController = rememberNavController()

    Scaffold(
        scaffoldState = scaffoldState,
        bottomBar = { BottomNavBar(navController = navHostController) }
    ) {
        NavHost(
            navController = navHostController,
            startDestination = BottomNavigationItem.Post.route
        ) {
            composable(BottomNavigationItem.DailyLife.route) { DailyLife(navController = navController) }
            composable(BottomNavigationItem.Chatting.route) { ChattingList(navController = navController) }
            composable(BottomNavigationItem.MyPage.route) { MyPage(navController = navController) }
        }
    }
}

private fun startLogin(navController: NavController) {
    navController.navigate("login") {
        launchSingleTop = true
    }
}

@Composable
fun BottomNavBar(
    navController: NavHostController
) =
    BottomAppBar(
        cutoutShape = MaterialTheme.shapes.small.copy(
            CornerSize(percent = 50)
        ),
        backgroundColor = MaterialTheme.colors.primaryVariant,
        contentColor = Color.White
    ) {
        val bottomTabSelectedItem = rememberSaveable {
            mutableStateOf(BottomNavigationItem.Post.route)
        }
        BottomNavigationItem(
            modifier = Modifier.weight(1f),
            onClick = {
                navigateBottomNavigation(
                    BottomNavigationItem.Post.route,
                    navController
                )
                bottomTabSelectedItem.value = BottomNavigationItem.Post.route
            },
            icon = {
                Icon(
                    painter = painterResource(id = BottomNavigationItem.Post.iconResId),
                    contentDescription = null
                )
            },
            selected = bottomTabSelectedItem.value == BottomNavigationItem.Post.route
        )

        BottomNavigationItem(
            modifier = Modifier.weight(1f),
            onClick = {
                navigateBottomNavigation(
                    BottomNavigationItem.DailyLife.route,
                    navController
                )
                bottomTabSelectedItem.value = BottomNavigationItem.DailyLife.route
            },
            icon = {
                Icon(
                    painter = painterResource(id = BottomNavigationItem.DailyLife.iconResId),
                    contentDescription = null
                )
            },
            selected = bottomTabSelectedItem.value == BottomNavigationItem.DailyLife.route
        )

        BottomNavigationItem(
            modifier = Modifier.weight(1f),
            onClick = {
                navigateBottomNavigation(
                    BottomNavigationItem.MyPage.route,
                    navController
                )
                bottomTabSelectedItem.value = BottomNavigationItem.Chatting.route
            },
            icon = {
                Icon(
                    painter = painterResource(id = BottomNavigationItem.Chatting.iconResId),
                    contentDescription = null
                )
            },
            selected = bottomTabSelectedItem.value == BottomNavigationItem.Chatting.route
        )

        Box(modifier = Modifier.weight(1f))

        BottomNavigationItem(
            modifier = Modifier.weight(1f),
            onClick = {
                navigateBottomNavigation(
                    BottomNavigationItem.MyPage.route,
                    navController
                )
                bottomTabSelectedItem.value = BottomNavigationItem.MyPage.route
            },
            icon = {
                Icon(
                    painter = painterResource(id = BottomNavigationItem.MyPage.iconResId),
                    contentDescription = null
                )
            },
            selected = bottomTabSelectedItem.value == BottomNavigationItem.MyPage.route
        )

        Box(modifier = Modifier.weight(1f))
    }

private fun navigateBottomNavigation(route: String, navController: NavHostController) {
    navController.navigate(route) {
        popUpTo(navController.graph.findStartDestination().id) {
            saveState = true
        }
        launchSingleTop = true
        restoreState = true
    }
}