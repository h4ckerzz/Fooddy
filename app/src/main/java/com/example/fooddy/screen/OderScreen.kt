package com.example.fooddy.screen

import androidx.compose.foundation.background
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
fun OderScreen(navController: NavController) {
    val verticalScroll = rememberScrollState()
    val heightBox = 102.dp
    val foodList = LocalFoodDataProvider.OrderList
    Surface(modifier = Modifier.background(Color(0xFFF5F5F8))) {
        Column(
            modifier = Modifier.fillMaxSize(1f)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(top = 60.dp)
                    .fillMaxWidth(1f)
            ) {
                IconButton(onClick = {navController.navigate(FooddyScreen.HOME.name)}, modifier = Modifier.padding(start = 40.dp)) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.back_icon),
                        contentDescription = "Back Icon Button"
                    )
                }
                Spacer(modifier = Modifier.width(70.dp))
                Text(
                    text = stringResource(id = R.string.title_order_screen),
                    style = Typography.labelSmall,
                    modifier = Modifier.padding(start = 20.dp)
                )
            }
            Spacer(modifier = Modifier.height(70.dp))
            Column(
                modifier = Modifier
                    .height(heightBox * 5)
                    .padding(start = 50.dp)
                    .fillMaxSize(1f)
                    .verticalScroll(verticalScroll)
            ) {
                for (food in foodList) {
                    Spacer(modifier = Modifier.height(24.dp))
                    RowFood(food = food)
                }
            }
            Spacer(modifier = Modifier.height(40.dp))
            TextButton(
                onClick = {navController.navigate(FooddyScreen.CHECKOUT.name)},
                modifier = Modifier
                    .width(315.dp)
                    .height(70.dp)
                    .background(
                        color = Color(0xFFFA4A0C),
                        shape = RoundedCornerShape(30.dp)
                    )
                    .fillMaxWidth(1f)
                    .align(Alignment.CenterHorizontally)
            ) {
                Text(
                    text = "Complete Order",
                    style = Typography.labelSmall.copy(color = Color(0xFFF6F6F9))
                )
            }
        }
    }
}

@Preview
@Composable
fun OderScreenPreview() {
    Surface {
    OderScreen(navController = rememberNavController())
    }
}