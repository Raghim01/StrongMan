package com.example.strongmanv2

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

sealed class NavRoute(val route: String){
    object Button_list:NavRoute("my_profile_button")
    object MyProfilePage:NavRoute("my_profile_back_button")

}

@Composable
fun AppNavHost(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavRoute.Button_list.route){
        composable(NavRoute.Button_list.route){ Button_list(navController = navController) }
        composable(NavRoute.MyProfilePage.route){ MyProfilePage(navController = navController)}
    }
}