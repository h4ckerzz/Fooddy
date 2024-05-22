package com.example.fooddy.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fooddy.R
import com.example.fooddy.ui.components.SingleLineUnderlineTextField
import com.example.fooddy.ui.components.roundedShape
import com.example.fooddy.ui.theme.Typography

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFF2F2F2)
    ) {
        Column {
            Box(
                modifier = Modifier
                    .clip(roundedShape)
                    .shadow(elevation = 50.dp, shape = roundedShape)
                    .size(width = 414.dp, height = 300.dp)
                    .fillMaxWidth(1f)
                    .background(color = Color(0xFFFFFFFF))

            ) {
                Image(
                    painter = painterResource(id = R.drawable.bella_olonje_logo_111_1),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .size(width = 130.dp, 160.dp)
                        .align(Alignment.Center)
                )
                Row(
                    modifier.fillMaxSize(1f),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.Bottom
                ) {

                    TextButton(onClick = { /*TODO*/ }, modifier.weight(1f)) {
                        Text(text = "Login", style = Typography.labelSmall)
                    }

                    TextButton(onClick = { /*TODO*/ }, modifier.weight(1f)) {
                        Text(text = "Sign-up", style = Typography.labelSmall)
                    }
                }
            }
            Spacer(modifier = Modifier.height(65.dp))
            SingleLineUnderlineTextField("Email Address")
            SingleLineUnderlineTextField("PassWord")
            Spacer(modifier = Modifier.height(20.dp))
            TextButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(start = 50.dp)) {
                Text(text = "Forgot Password?", style = Typography.bodySmall)
            }
            Spacer(modifier = Modifier.height(80.dp))
            TextButton(
                onClick = {},
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .width(315.dp)
                    .height(70.dp)
                    .background(
                        color = Color(0xFFFA4A0C),
                        shape = RoundedCornerShape(30.dp)
                    )

            ) {
                Text(
                    text = "Login",
                    style = Typography.labelSmall.copy(color = Color(0xFFF6F6F9))
                )
            }
        }
    }
}


@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}