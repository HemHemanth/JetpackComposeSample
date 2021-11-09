package com.hemanth.jetpackcomposesample

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailsScreen(recipe: Recipe) {
    Row(
        modifier = Modifier.padding(
            horizontal = 3.dp,
            vertical = 2.dp
        )
    ) {
        Image(
            painter = painterResource(id = recipe.imageResource),
            contentDescription = "",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
        )

        Column(
            modifier = Modifier.padding(horizontal = 7.dp)
        ) {

            Text(
                text = recipe.name,
                fontSize = 14.sp,
                modifier = Modifier.padding(horizontal = 7.dp)
            )

            Row(modifier = Modifier.padding(vertical = 5.dp)) {
                for (ingredient in recipe.ingredients)
                    Text(
                        text = "$ingredient,",
                        modifier = Modifier.padding(horizontal = 5.dp)
                    )
            }

            Text(
                text = "$40",
                fontSize = 18.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 7.dp)
            )
        }
    }
}