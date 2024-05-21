package com.example.fooddy.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fooddy.ui.theme.Typography

@Composable
fun SingleLineUnderlineTextField(titleTextField: String, modifier: Modifier = Modifier) {
    var textState by remember { mutableStateOf(TextFieldValue("")) }

        BasicTextField(
            value = textState,
            onValueChange = { textState = it },
            singleLine = true,
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            textStyle = Typography.labelSmall,
            cursorBrush = SolidColor(Color.Black),
            decorationBox = { innerTextField ->
                Column(modifier.padding(start = 50.dp)) {
                    Text(text = titleTextField, style = Typography.labelMedium)
                    Spacer(modifier = Modifier.height(10.dp))
                    Column {
                        innerTextField()
                        Spacer(modifier = Modifier.height(10.dp))
                        Box(
                            modifier = Modifier
                                .width(250.dp)
                                .height(1.dp)
                                .background(Color.Black),
                        )
                    }
                }
            }
        )
    }

@Preview
@Composable
fun UnderLineTextFieldPreview() {
    Surface(modifier = Modifier.background(color = Color.White)) {
    SingleLineUnderlineTextField("Email Address")
    }
}