package com.example.fooddy.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.fooddy.R
import com.example.fooddy.data.LocalFoodDataProvider
import com.example.fooddy.ui.components.BottomNavigationBar
import com.example.fooddy.ui.components.BoxFood
import com.example.fooddy.ui.theme.Typography


@Composable
fun HomeScreen(navController: NavController) {
    val foodList = LocalFoodDataProvider.getFoodData()
    var text by remember { mutableStateOf("") }
    val scrollState = rememberScrollState()

    Surface(modifier = Modifier
        .background(color = Color(0xFFF2F2F2))
        .fillMaxSize(1f)) {
        Column {
            Spacer(modifier = Modifier.height(60.dp))
            Row(modifier = Modifier.fillMaxWidth(1f)) {
                IconButton(
                    onClick = { /*TODO*/ }, modifier = Modifier.padding(start = 50.dp)
                    ) {
                    Image(
                        painter = painterResource(id = R.drawable.menu_button),
                        contentDescription = "menu button",
                        modifier = Modifier.padding()
                        )
                }
                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(start = 170.dp)) {
                    Image(painter = painterResource(id = R.drawable.shopping_cart), contentDescription = "shopping icon")
                }
            }
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = stringResource(id = R.string.title_home_screen),
            style = Typography.titleMedium,
            modifier = Modifier.padding(start = 50.dp)
        )
        Spacer(modifier = Modifier.height(28.dp))
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 50.dp)
                    .width(314.dp)
                    .height(60.dp)
                    .fillMaxWidth(1f)
                    .border(
                        2.dp, shape = RoundedCornerShape(30.dp),
                        color = Color(0xFFE6E6E6)
                    )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(start = 35.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.search),
                        contentDescription = "search icon"
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    BasicTextField(
                        value = text,
                        onValueChange = { text = it },
                        textStyle = Typography.titleSmall,
                        singleLine = true
                    )
                }
            }
            Spacer(modifier = Modifier.height(40.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(start = 50.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                TextButton(onClick = {  }) {
                    Text(text = "Foods", style = Typography.titleSmall, )
                }
                TextButton(onClick = {  }) {
                    Text(text = "Drinks",style = Typography.titleSmall, )
                }
                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "Snacks",style = Typography.titleSmall)
                }
                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "Sauce",style = Typography.titleSmall, maxLines = 1)
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(30.dp),
                modifier = Modifier
                    .horizontalScroll(scrollState)
                    .padding(20.dp)
            ) {
                for (food in foodList) {
                    BoxFood(food = food)
            }
        }
            Spacer(modifier = Modifier.height(45.dp))
            BottomNavigationBar(navController = navController)
    }
    }
}


@Preview
@Composable
fun HomeScreenPreview() {
    Surface {
        HomeScreen(navController = rememberNavController())
    }
}