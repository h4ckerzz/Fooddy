package com.example.fooddy.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.fooddy.FooddyScreen
import com.example.fooddy.R
import com.example.fooddy.ui.theme.Typography

@Composable
fun StartScreen(onClick: () -> Unit, navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxHeight(),
        color = Color(0xFFFF4B3A)
        ) {
        Column(modifier = Modifier.fillMaxHeight()) {
            Box(modifier = Modifier.padding(start = 48.dp, top = 56.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.ellipse_1),
                    contentDescription = null,
                    modifier = Modifier
                        .size(60.dp, 80.dp)
                        .fillMaxWidth(1f)
                )
                Image(
                    painter = painterResource(id = R.drawable.bella_olonje_logo_111_1),
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp, 50.dp)
                        .align(alignment = Alignment.Center)
                )
            }
            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.padding_medium)))
            Text(
                text = stringResource(id = R.string.title_start_screen),
                style = Typography.titleLarge,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp)
                )
            Spacer(modifier = Modifier.height(50.dp))
           Box(modifier = Modifier.fillMaxWidth(1f)) {
                Image(
                    painter = painterResource(id = R.drawable.toyfaces_tansparent_bg_29),
                    contentDescription = "Image 1",
                    modifier = Modifier
                        .size(width = 200.dp, height = 300.dp)
                        .align(Alignment.BottomEnd)
                    )
                Image(
                    painter = painterResource(id = R.drawable.toyfaces_tansparent_bg_49),
                    contentDescription = "Image 2",
                    modifier = Modifier
                        .size(width = 300.dp, height = 350.dp)
                        .padding(end = 70.dp)
                    )
            }
            Spacer(modifier = Modifier.height(30.dp))
            TextButton(
                onClick = { navController.navigate(FooddyScreen.LOGIN.name) },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .width(315.dp)
                    .height(70.dp)
                    .background(
                        color = Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(30.dp)
                    )

            ) {
                Text(
                    text = "Get Started",
                    style = Typography.displaySmall
                )
            }
        }
    }
}





@Preview
@Composable
fun StartScreenPreview() {
    Surface {
        StartScreen(onClick = {}, navController = rememberNavController())
    }
}
