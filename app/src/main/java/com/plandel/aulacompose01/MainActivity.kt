package com.plandel.aulacompose01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            val narutoImage = painterResource(id = R.drawable.naruto)

            // desta forma vc consegue buscar o index da lista
            LazyColumn {
                itemsIndexed(
                    listOf("This", "is", "kaio", "plandel")
                ) { index, item ->
                    Column(modifier = Modifier.height(40.dp)) {
                        CardImage(painter = narutoImage, contentDescription = "Naruto Photo")
                    }
                }
            }

            LazyColumn {
                // quantidade de itens da lista
                items(500) {
                    CardImage(painter = narutoImage, contentDescription = "Naruto Photo")
                }
            }
        }
    }

}


@Composable
fun CardImage(
    painter: Painter,
    contentDescription: String
) {

    Card(
        modifier = Modifier
            .fillMaxSize(0.5f)
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 6.dp
    ) {
        Image(painter = painter, contentDescription = contentDescription)
    }

}









