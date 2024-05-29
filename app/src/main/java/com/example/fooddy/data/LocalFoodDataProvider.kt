package com.example.fooddy.data

import com.example.fooddy.R
import com.example.fooddy.model.Food

object LocalFoodDataProvider {
    val defaultFood = getFoodData()[0]
    fun getFoodData() : List<Food> {
        return listOf(
            Food(imageResId = R.drawable.tomato, nameFoodId = R.string.veggie_tomato_mix, price = 5  ),
            Food(imageResId = R.drawable.fried_chicken, nameFoodId = R.string.fried_chicken, price = 10 ),
            Food(imageResId = R.drawable.fried_chicken, nameFoodId = R.string.fried_chicken, price = 10 ),
            Food(imageResId = R.drawable.fried_chicken, nameFoodId = R.string.fried_chicken, price = 10 ),
            Food(imageResId = R.drawable.fried_chicken, nameFoodId = R.string.fried_chicken, price = 10 ),
            Food(imageResId = R.drawable.fried_chicken, nameFoodId = R.string.fried_chicken, price = 10 ),
            Food(imageResId = R.drawable.fried_chicken, nameFoodId = R.string.fried_chicken, price = 10 ),
            Food(imageResId = R.drawable.fried_chicken, nameFoodId = R.string.fried_chicken, price = 10 ),
            Food(imageResId = R.drawable.fried_chicken, nameFoodId = R.string.fried_chicken, price = 10 ),
            Food(imageResId = R.drawable.fried_chicken, nameFoodId = R.string.fried_chicken, price = 10 ),

        )
    }
    fun getFavouriteFoodData() : List<Food> {
        return favouriteList
    }
    val favouriteList = mutableListOf<Food>()
    fun addFoodToFavourite(food: Food) {
        favouriteList.add(food)
    }
    fun removeFoodFromFavourite(food: Food) {
        favouriteList.remove(food)
    }
    fun getOderFoodData() : List<Food> {
        return OrderList
    }
    val OrderList = mutableListOf<Food>()
    fun addFoodToOder(food: Food) {
        OrderList.add(food)
    }
    fun removeFoodFromOrder(food: Food) {
        OrderList.remove(food)
    }
}