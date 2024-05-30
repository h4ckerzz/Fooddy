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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
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
import com.example.fooddy.ui.components.ClickableCircle
import com.example.fooddy.ui.components.TextClickableCircle
import com.example.fooddy.ui.theme.Typography


@Composable
fun CheckOutScreen(navController: NavController) {
    val foodPrice: Int
    Column(
        modifier = Modifier.fillMaxSize(1f)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(top = 40.dp)
                .fillMaxWidth(1f)
        ) {
            IconButton(
                onClick = {},
                modifier = Modifier.padding(start = 40.dp)
            ) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.back_icon),
                    contentDescription = "Back Icon Button"
                )
            }
            Spacer(modifier = Modifier.width(70.dp))
            Text(
                text = stringResource(id = R.string.title_checkout_screen),
                style = Typography.labelSmall
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Payment", style = Typography.titleMedium, modifier = Modifier.padding(start = 50.dp))
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Payment method", style = Typography.labelSmall, modifier = Modifier.padding(start = 50.dp))
        Spacer(modifier = Modifier.height(20.dp))
        Column(
            modifier = Modifier
                .padding(start = 50.dp)
                .width(width = 315.dp)
                .height(231.dp)
                .background(color = Color(0xFFEEEEEE), shape = RoundedCornerShape(20.dp))
        ) {
            ClickableCircle(
                vectorImaged = R.drawable.card_credit_credit_card_2_svgrepo_com,
                contentDescription = "Card Credit Icon",
                paymentId = R.string.payment_method_card
            )
            ClickableCircle(
                vectorImaged = R.drawable.bank_svgrepo_com,
                contentDescription = "Card Credit Icon",
                paymentId = R.string.payment_method_Bank_account
            )
            ClickableCircle(
                vectorImaged = R.drawable.paypal_140_svgrepo_com,
                contentDescription = "Card Credit Icon",
                paymentId = R.string.payment_method_PayPal
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Delivery method", style = Typography.labelSmall, modifier = Modifier.padding(start = 50.dp))
        Spacer(modifier = Modifier.height(10.dp))
        Column(
            modifier = Modifier
                .padding(start = 50.dp)
                .shadow(
                    elevation = 40.dp,
                    spotColor = Color(0x08000000),
                    ambientColor = Color(0x08000000)
                )
                .width(315.dp)
                .height(156.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 20.dp))
        ) {
            TextClickableCircle(paymentId = R.string.door_delivery)
            TextClickableCircle(paymentId = R.string.pick_up)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(start = 50.dp)
        ) {
            Text(text = "Total", style = Typography.headlineSmall)
            Spacer(modifier = Modifier.width(200.dp))
            Text(text = "${LocalFoodDataProvider.totalPrice()} $", style = Typography.displaySmall )
        }
        Spacer(modifier = Modifier.height(35.dp))
        Row(
            modifier = Modifier.fillMaxWidth(1f).padding(start = 50.dp)
        ) {
            TextButton(
                onClick = {},
                modifier = Modifier
                    .width(315.dp)
                    .height(70.dp)
                    .background(
                        color = Color(0xFFFA4A0C),
                        shape = RoundedCornerShape(30.dp)
                    )
                    .fillMaxWidth(1f)
            ) {
                Text(
                    text = "Order now",
                    style = Typography.labelSmall.copy(color = Color(0xFFF6F6F9))
                )
            }
        }

    }
}


@Preview
@Composable
fun CheckOutScreenPreview() {
    Surface {
    CheckOutScreen(navController = rememberNavController())
    }
}