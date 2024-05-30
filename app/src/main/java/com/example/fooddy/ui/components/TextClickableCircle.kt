package com.example.fooddy.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fooddy.R
import com.example.fooddy.ui.theme.Typography

@Composable
fun TextClickableCircle(paymentId: Int) {
    var isClicked by remember { mutableStateOf(false) }
    val color = if (isClicked) Color(0xFFFA4A0C) else Color.White
    IconButton(
        onClick = {isClicked = !isClicked},
        modifier = Modifier
            .width(315.dp)
            .height(75.dp)
            .background(Color.White)

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
        ) {
            Box (
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(16.dp)
                    .clip(CircleShape)
                    .border(width = 1.dp, color = Color(0xFF9F9F9F), shape = CircleShape)
            ) {
                Box(
                    modifier = Modifier
                        .size(7.dp)
                        .clip(CircleShape)
                        .background(color)
                ) {

                }
            }
            Spacer(modifier = Modifier.width(20.dp))
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = stringResource(id = paymentId), style = Typography.headlineSmall)
        }
    }
}



@Preview
@Composable
fun PreviewTextClickableCircle() {
    TextClickableCircle(R.string.payment_method_Bank_account)
}