package com.example.fooddy.ui.components

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.fooddy.ui.theme.Typography

@Composable
fun EmailTextField() {
    var text by remember { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = {newText -> text = newText},
        label = { Text(text = "Email Address", style = Typography.labelSmall)}
    )

}


@Preview
@Composable
fun UnderLineTextFieldPreview() {
    EmailTextField()
}