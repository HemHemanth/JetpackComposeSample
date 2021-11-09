package com.hemanth.jetpackcomposesample

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.gson.Gson

@Composable
fun RecipeScreen(navController: NavController) {
    val recipes = listOf<Recipe>(
        Recipe(
            R.drawable.samosa,
            "Samosa",
            listOf(
                "Potato",
                "Onion"
            )
        ),
        Recipe(
            R.drawable.egg_curry,
            "Egg Curry",
            listOf(
                "Egg",
                "Gravy"
            )
        ),
        Recipe(
            R.drawable.noodles,
            "Noodles",
            listOf(
                "Noodles",
                "Water"
            )
        ),
        Recipe(
            R.drawable.veg_rice,
            "Veg Rice",
            listOf(
                "Rice",
                "vegetables"
            )
        ),
        Recipe(
            R.drawable.chicken_curry,
            "Chicken Curry",
            listOf(
                "Chicken",
                "Gravy"
            )
        )
    )

    LazyColumn {
        items(recipes) { recipe ->
            Column(
                modifier = Modifier
                    .padding(7.dp)
                    .clickable {
                        val recipeItem = Gson().toJson(recipe)
                        navController.navigate(Screen.DetailScreen.route+ "/$recipeItem")
                    }
            ) {
                Surface(shape = RoundedCornerShape(6.dp, 6.dp, 0.dp, 0.dp), elevation = 2.dp) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp, 0.dp, 0.dp, 5.dp)
                    ) {
                        Image(
                            painter = painterResource(id = recipe.imageResource),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(144.dp)
                        )
                        Text(text = recipe.name)
                        val ingredients = arrayListOf("Rice", "Ginger", "Water")
                        for (ingredient in recipe.ingredients)
                            Text(
                                text = "* $ingredient",
                                fontSize = 10.sp,
                                modifier = Modifier.padding(horizontal = 4.dp)
                            )
                    }
                }

            }
        }
    }

}