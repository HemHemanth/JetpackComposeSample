package com.hemanth.jetpackcomposesample

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle.Companion.Italic
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hemanth.jetpackcomposesample.ui.theme.JetpackComposeSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeSampleTheme {
                // A surface container using the 'background' color from the theme
//                Surface(color = MaterialTheme.colors.background) {
////                    Greeting("Android")
//                    createList(
//                        list = arrayListOf(
//                            "Me",
//                            "Hemanth",
//                            "Android",
//                            "Jetpack",
//                            "Jetpack Compose",
//                            "Kotlin"
//                        )
//                    )
//                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        "Hemanth", fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(10.dp, 20.dp, 10.dp, 20.dp)
            .width(15.dp),
        maxLines = 2,
        textAlign = TextAlign.Center
    )
}

@Composable
fun createList(list: ArrayList<String>) {
    LazyColumn(
//        verticalArrangement = Arrangement.spacedBy(100.dp),
        contentPadding = PaddingValues(vertical = 10.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        items(list.size) { index ->
            Row() {
                Text(
                    text = list[index],
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "",
                    modifier = Modifier.size(30.dp),
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeSampleTheme {
//        Greeting("Android")

        Surface(color = MaterialTheme.colors.background) {
//                    Greeting("Android")
            createList(
                list = arrayListOf(
                    "Me",
                    "Hemanth",
                    "Android",
                    "Jetpack",
                    "Jetpack Compose",
                    "Kotlin"
                )
            )
        }
    }
}