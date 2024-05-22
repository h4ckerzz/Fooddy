package com.example.fooddy.model

import androidx.annotation.DrawableRes

data class Food(
    @DrawableRes val imageResId: Int,
    val nameFood: String,
    val price: Int
)
