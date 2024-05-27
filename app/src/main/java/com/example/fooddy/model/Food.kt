package com.example.fooddy.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Food(
    @DrawableRes val imageResId: Int,
    @StringRes val nameFoodId: Int,
    val price: String
)
