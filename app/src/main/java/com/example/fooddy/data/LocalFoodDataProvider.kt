package com.example.fooddy.data

import com.example.fooddy.R
import com.example.fooddy.model.Food

object LocalFoodDataProvider {
    val defaultFood = getFoodData()[0]
    private fun getFoodData() : List<Food> {
        return listOf(
            Food(imageResId = R.drawable.image_1, nameFood = "Rice", price = 30000 ),
            Food(imageResId = R.drawable.image_2, nameFood ="Chicken", price = 50000),
            Food(imageResId = R.drawable.image_3, nameFood = "Rice and Chicken", price = 40000)
        )
    }
}