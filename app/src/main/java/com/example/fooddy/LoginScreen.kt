package com.example.fooddy

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
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
            }
        }
    }


@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}