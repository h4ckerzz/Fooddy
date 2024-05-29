package com.example.fooddy.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fooddy.R
import com.example.fooddy.ui.theme.Typography

@Composable
fun BoxInformation() {
    Row(
        modifier = Modifier
            .width(315.dp)
            .height(133.dp)
            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(20.dp))
    ) {
        Spacer(modifier = Modifier.width(16.dp))
        Row(modifier = Modifier.padding(top = 20.dp).fillMaxWidth(1f)) {
            Image(
                painter = painterResource(id = R.drawable.user_ima),
                contentDescription = "User Image"
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(text = "Hoang Duc Manh", style = Typography.labelSmall)
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "jandyz.dev@gmail.com", style = Typography.headlineSmall, modifier = Modifier.alpha(0.5f))
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Dien Chau, Nghe An", style = Typography.headlineSmall,modifier = Modifier.alpha(0.5f))
            }
        }
    }
}

@Preview
@Composable
fun BoxInformationPreview() {
    BoxInformation()
}