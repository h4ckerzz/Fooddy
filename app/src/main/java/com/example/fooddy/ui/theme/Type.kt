package com.example.fooddy.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.fooddy.R

// Set of Material typography styles to start with
val Typography = Typography(
    titleLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_bold)),
        fontWeight = FontWeight(800),
        fontSize = 65.sp,
        lineHeight = 56.44.sp,
        letterSpacing = 0.sp,
        color = Color.White
    ),
    displaySmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_medium)),
        fontWeight = FontWeight(600),
        fontSize = 24.sp,
        color = Color(0xFFFF460A)
    ),
    bodySmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_medium)),
        fontWeight = FontWeight(600),
        fontSize = 16.sp,
        color = Color(0xFFFF460A)
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_bold)),
        fontWeight = FontWeight(600),
        fontSize = 18.sp,
        color = Color(0xFF000000)
    ),
    labelMedium = TextStyle(
        fontSize = 15.sp,
        fontFamily = FontFamily(Font(R.font.roboto_bold)),
        fontWeight = FontWeight(600),
        color = Color(0xFF000000),
    ),
    titleMedium = TextStyle(
        fontSize = 34.sp,
        fontFamily = FontFamily(Font(R.font.roboto_bold)),
        fontWeight = FontWeight(700),
        color = Color(0xFF000000)
    )


)