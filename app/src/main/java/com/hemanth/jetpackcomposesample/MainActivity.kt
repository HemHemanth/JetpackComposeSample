package com.hemanth.jetpackcomposesample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation()
        }
    }

/*
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
  */
}