package com.example.fooddy.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fooddy.data.LocalFoodDataProvider
import com.example.fooddy.model.Food
import com.example.fooddy.ui.theme.Typography

@Composable
fun RowFood(food: Food) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .width(315.dp)
            .height(102.dp)
            .background(color = Color(0xFFEEEEEE), shape = RoundedCornerShape(20.dp))
            .clip(shape = RoundedCornerShape(20.dp))

    ) {
        Image(
            painter = painterResource(id = food.imageResId),
            contentDescription = food.nameFoodId.toString(),
            modifier = Modifier
                .size(90.dp)
                .clip(RoundedCornerShape(90.dp))
                .padding(start = 30.dp)
        )
        Spacer(modifier = Modifier.width(20.dp))
        Column {
            Text(
                text = stringResource(id = food.nameFoodId).replace("\n", ""),
                style = Typography.labelMedium,
                maxLines = 2,
                modifier = Modifier.fillMaxWidth(1f)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = food.price, style = Typography.bodySmall)
        }
    }
}

@Preview
@Composable
fun RowFoodPreview() {
    RowFood(food = LocalFoodDataProvider.defaultFood)
}