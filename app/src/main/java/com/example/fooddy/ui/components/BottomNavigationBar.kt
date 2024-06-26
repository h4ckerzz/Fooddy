package com.example.fooddy.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.fooddy.FooddyScreen
import com.example.fooddy.R
import com.example.fooddy.data.LocalFoodDataProvider
import com.example.fooddy.screen.FavouriteScreen

@Composable
fun BottomNavigationBar(navController: NavController) {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxWidth(1f)
    ) {
        IconButton(onClick = {navController.navigate(FooddyScreen.HOME.name) }) {
            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.home), contentDescription = "Home Icon")
        }
        IconButton(onClick = { navController.navigate(FooddyScreen.FAVOURITE.name)}) {
            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.heart), contentDescription = "Heart Icon")
        }
        IconButton(onClick ={navController.navigate(FooddyScreen.PROFILE.name)}) {
            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.user), contentDescription = "History Icon")
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.history), contentDescription = "History Icon")
        }
    }

}

@Preview
@Composable
fun BottomNavigationBarPreview() {
    Surface(modifier = Modifier.fillMaxWidth(1f)) {
    BottomNavigationBar(navController = rememberNavController())
    }
}