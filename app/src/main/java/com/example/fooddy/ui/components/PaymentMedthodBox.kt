package com.example.fooddy.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PaymentMethodBox() {
    Column (
        modifier = Modifier
            .shadow(
                elevation = 40.dp,
                spotColor = Color(0x08000000),
                ambientColor = Color(0x08000000)
            )
            .width(315.dp)
            .height(231.dp)
            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(20.dp))
    ) {

    }
}

@Preview
@Composable
fun PaymentMethodBoxPreview() {
    Surface {
    PaymentMethodBox()
    }
}

