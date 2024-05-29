package com.example.fooddy.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fooddy.R
import com.example.fooddy.data.LocalFoodDataProvider
import com.example.fooddy.model.Food
import com.example.fooddy.ui.theme.Typography
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@Composable
fun BoxFood(
    food: Food,
) {
    var isClicked by remember { mutableStateOf(false) }
    val colorIconButton = if (isClicked) Color(0xFFFA4A0C) else Color.White
    val croutonScope = rememberCoroutineScope()
    var showButton  by remember { mutableStateOf(false) }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .width(180.dp)
                .height(270.dp)
                .background(
                    color = com.example.fooddy.ui.theme.BoxFood,
                    shape = RoundedCornerShape(30.dp)
                )
                .shadow(elevation = 40.dp, spotColor = Color(0x08000000), ambientColor = Color(0x08000000))
                .clip(shape = RoundedCornerShape(30.dp))
                .pointerInput(Unit) {
                    detectTapGestures(
                        onPress = {
                            croutonScope.launch {
                                delay(2000)
                                showButton = true
                            }
                            val success = tryAwaitRelease()
                            if (!success) {
                                showButton = false
                            }
                        }
                    )
                }

        ) {
            if (showButton) {
                IconButton(
                    onClick = {
                    LocalFoodDataProvider.addFoodToFavourite(food.copy())
                    isClicked = !isClicked
                   },
                    modifier = Modifier.align(Alignment.CenterHorizontally)) {
                    Icon(
                        imageVector = Icons.Filled.FavoriteBorder,
                        contentDescription = "heart icon",
                        tint = colorIconButton
                    )
                }
            }
            Image(
                painter = painterResource(id = food.imageResId),
                contentDescription = "food", modifier = Modifier
                    .padding(top = 20.dp)
                    .clip(
                        RoundedCornerShape(90.dp),
                    )
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = stringResource(food.nameFoodId), style = Typography.bodyMedium)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = food.price.toString() + "$", style = Typography.bodySmall)
        }
    }

@Preview
@Composable
fun BoxFoodPreview() {
    Surface() {
            BoxFood(
                food = Food(
                    R.drawable.tomato,
                    nameFoodId = R.string.veggie_tomato_mix,
                    price = 5
                )
            )
    }
}