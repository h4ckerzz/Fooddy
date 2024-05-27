package com.example.fooddy.ui

import androidx.lifecycle.ViewModel
import com.example.fooddy.data.LocalFoodDataProvider
import com.example.fooddy.model.Food
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class FoodViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(
        FoodUIState(
            foodList = LocalFoodDataProvider.getFoodData(),
            favouriteFoodList = LocalFoodDataProvider.getFavouriteFoodData(),
            currentFood = LocalFoodDataProvider.getFoodData().getOrElse(0) {
                LocalFoodDataProvider.defaultFood
            }
        )
    )
    val uiStateFlow = _uiState.asStateFlow()

}
data class FoodUIState(
    val foodList: List<Food> = emptyList(),
    val favouriteFoodList: List<Food> = emptyList(),
    val currentFood: Food = LocalFoodDataProvider.defaultFood
)