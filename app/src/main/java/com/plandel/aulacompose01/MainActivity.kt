package com.plandel.aulacompose01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(
                modifier = Modifier
                    .background(Color.Red)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                Row(    //basicamente é um linear layout horizontal e o Column é o vertical
                    modifier = Modifier // o metodo onde encontra as funções para alterar o layout do item
                        // .fillMaxSize(0.5f) se deixar sem nada dentro ocupa todo o espaço mas se colocar a fração ocupa o espaco q esta no argumento
                        .width(200.dp)
                        .height(300.dp)
                        //  .fillMaxHeight(0.7f) outra forma de definir o tamanho. aqui diz q vai ocupar 70 por cento da tela do celular
                        .background(Color.Green),
                    verticalAlignment = Alignment.CenterVertically, // forma de alinhamento de itens dentro do bloco q esta dentro deste item
                    horizontalArrangement  = Arrangement.SpaceAround
                ) {
                    Text(text = "Hello")
                    Text(text = "World")
                    Text(text = "I'm Kaio Plandel!")
                }
            }

        }
    }
}


