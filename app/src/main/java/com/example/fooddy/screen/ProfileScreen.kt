package com.example.fooddy.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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
import com.example.fooddy.ui.components.BoxInformation
import com.example.fooddy.ui.components.ClickableCircle
import com.example.fooddy.ui.theme.Typography

@Composable
fun ProfileScreen(navController: NavController) {
    Surface(
        modifier = Modifier.background(color = Color(0xFFF5F5F8))
    ) {
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
                    text = stringResource(id = R.string.title_profile_screen),
                    style = Typography.labelSmall
                )
            }
            Spacer(modifier = Modifier.height(54.dp))
            Column(
                modifier = Modifier
                    .padding(start = 50.dp)
                    .fillMaxSize(1f)
            ) {
                Text(text = "Information", style = Typography.labelSmall)
                BoxInformation()
                Spacer(modifier = Modifier.height(48.dp))
                Text(text = "Payment Method", style = Typography.labelSmall)
                Spacer(modifier = Modifier.height(20.dp))
                Column(
                    modifier = Modifier
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
                    Spacer(modifier = Modifier.height(162.dp))
                }
                Spacer(modifier = Modifier.height(100.dp))
                TextButton(
                    onClick = { },
                    modifier = Modifier
                        .align(Alignment.Start)
                        .width(315.dp)
                        .height(70.dp)
                        .background(
                            color = Color(0xFFFA4A0C),
                            shape = RoundedCornerShape(30.dp)
                        )
                ) {
                    Text(
                        text = "Update",
                        style = Typography.labelSmall.copy(color = Color(0xFFF6F6F9))
                    )
                }

            }
        }
    }
}

@Preview
@Composable
fun ProfileScreenPreview() {
    Surface(
        modifier = Modifier.background(color = Color(0xFFF5F5F8))
    ) {
    ProfileScreen(navController = rememberNavController())
    }
}

