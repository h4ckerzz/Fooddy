package com.example.fooddy.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fooddy.R
import com.example.fooddy.ui.theme.Typography


@Composable
fun HomeScreen() {
    var text by remember { mutableStateOf("") }

    Surface(modifier = Modifier
        .background(color = Color(0xFFF2F2F2))
        .fillMaxSize(1f)) {
        Column {
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
                IconButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(start = 170.dp)) {
                    Image(painter = painterResource(id = R.drawable.shopping_cart), contentDescription = "shopping icon")
                }
            }
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = stringResource(id = R.string.title_home_screen),
            style = Typography.titleMedium,
            modifier = Modifier.padding(start = 50.dp)
        )
        Spacer(modifier = Modifier.height(28.dp))
            Row(modifier = Modifier
                .fillMaxWidth(1f)
                .padding(start = 50.dp)
            ) {
                    Icon(
                        painter = painterResource(id = R.drawable.vector),
                        contentDescription = "search icon"
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    BasicTextField(
                        value = text,
                        onValueChange = { text = it},

                    )
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