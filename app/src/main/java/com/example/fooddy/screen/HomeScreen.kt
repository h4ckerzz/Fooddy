package com.example.fooddy.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.sharp.List
import androidx.compose.material.icons.sharp.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fooddy.R


@Composable
fun HomeScreen() {
    Surface(modifier = Modifier
        .background(color = Color(0xFFF2F2F2))
        .fillMaxSize(1f)) {
        Column() {
            Spacer(modifier = Modifier.height(74.dp))
            Row(modifier = Modifier.fillMaxWidth(1f)) {
                IconButton(
                    onClick = { /*TODO*/ }, modifier = Modifier.padding(start = 55.dp)
                    ) {
                    Image(
                        painter = painterResource(id = R.drawable.menu_button),
                        contentDescription = "menu button",
                        modifier = Modifier.padding()
                        )

                }
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    Surface {
        HomeScreen()
    }
}