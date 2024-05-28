package com.example.fooddy.screen

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.fooddy.FooddyScreen
import com.example.fooddy.R
import com.example.fooddy.data.LocalFoodDataProvider
import com.example.fooddy.model.Food
import com.example.fooddy.ui.components.RowFood
import com.example.fooddy.ui.theme.Typography


@Composable
fun FavouriteScreen(navController: NavController) {
    val food: List<Food> = LocalFoodDataProvider.favouriteList
    val scrollState = rememberScrollState()
    Column(modifier = Modifier
        .fillMaxSize(1f)
        .horizontalScroll(scrollState)) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(top = 60.dp)
                .fillMaxWidth(1f)) {
            IconButton(onClick = { navController.navigate(FooddyScreen.HOME.name) }, modifier = Modifier.padding(start = 40.dp)) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.back_icon),
                    contentDescription = "Back Icon Button"
                )
            }
            Spacer(modifier = Modifier.width(70.dp))
            Text(text = stringResource(id = R.string.title_favourite_screen), style = Typography.labelSmall)
        }
        Spacer(modifier = Modifier.height(50.dp))
        Column(modifier = Modifier.padding(start = 50.dp)) {
        for (food in food) {
            Spacer(modifier = Modifier.height(24.dp))
            RowFood(food = food)
            }
        }
    }
}


@Preview
@Composable
fun FavouriteScreenPreview() {
    Surface(color = MaterialTheme.colorScheme.background) {
        FavouriteScreen(navController = rememberNavController())
    }
}