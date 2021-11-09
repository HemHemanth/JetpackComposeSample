package com.hemanth.jetpackcomposesample

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.google.gson.Gson

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(Screen.MainScreen.route) {
            RecipeScreen(navController)
        }

        composable(
            Screen.DetailScreen.route + "/{recipe}",
            arguments = listOf(
                navArgument("recipe") {
                    type = NavType.StringType
                })
        ) { entry ->
            val recipe = Gson().fromJson(entry.arguments?.getString("recipe"), Recipe::class.java)
            DetailsScreen(recipe = recipe)
        }
    }
}