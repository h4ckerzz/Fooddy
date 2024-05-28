package com.example.fooddy

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fooddy.screen.FavouriteScreen
import com.example.fooddy.screen.HomeScreen
import com.example.fooddy.screen.LoginScreen
import com.example.fooddy.screen.StartScreen

enum class FooddyScreen() {
     START,
    LOGIN,
    HOME,
    FAVOURITE,
}
@Composable
fun FooddyApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = FooddyScreen.START.name) {
        composable(FooddyScreen.START.name) {
            StartScreen(onClick = { /*TODO*/ }, navController = navController)
        }
        composable(FooddyScreen.HOME.name) {
            HomeScreen(navController = navController)
        }
        composable(FooddyScreen.LOGIN.name) {
            LoginScreen(navController = navController)
        }
        composable(FooddyScreen.FAVOURITE.name) {
            FavouriteScreen(navController = navController)
        }
    }

}
