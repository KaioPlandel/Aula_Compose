package com.plandel.aulacompose01

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
                   // .padding(start = 10.dp, top = 18.dp)
                    .border(5.dp, Color.Magenta)
                    .padding(10.dp)
                    .border(5.dp, Color.Red)
                    .padding(10.dp)
                    .border(5.dp, Color.Black)
                    .padding(10.dp)
                    .border(5.dp, Color.LightGray)
                  //  .width(600.dp)
                   // .requiredWidth(600.dp) coloca de fato o tamanho q vc adiciona ele passa a tela do celular
            ) {
                Text(text = "Hello", modifier = Modifier.offset(0.dp, 20.dp)) // este item é usado como o margin
                Spacer(modifier = Modifier.height(50.dp))
                Text(text = "World", Modifier
                    .clickable {
                        Toast.makeText(this@MainActivity,"Hello",Toast.LENGTH_LONG).show()
                    }
                )
            }
        }
    }
}


