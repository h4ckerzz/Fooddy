package com.example.fooddy.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fooddy.FooddyScreen
import com.example.fooddy.R
import com.example.fooddy.ui.theme.Typography


@Composable
fun CheckOutScreen() {
    Column(
        modifier = Modifier.fillMaxSize(1f)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(top = 60.dp)
                .fillMaxWidth(1f)
        ) {
            IconButton(
                onClick = {},
                modifier = Modifier.padding(start = 40.dp)
            ) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.back_icon),
                    contentDescription = "Back Icon Button"
                )
            }
            Spacer(modifier = Modifier.width(70.dp))
            Text(
                text = stringResource(id = R.string.title_favourite_screen),
                style = Typography.labelSmall
            )
        }
    }
}


@Preview
@Composable
fun CheckOutScreenPreview() {
    Surface {
    CheckOutScreen()
    }
}