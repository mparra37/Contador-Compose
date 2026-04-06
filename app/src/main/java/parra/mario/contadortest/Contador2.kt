package parra.mario.contadortest

import android.R

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants
import parra.mario.contadortest.ui.theme.ContadorTestTheme

class Contador2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContadorTestTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Contador2(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Contador2(modifier: Modifier = Modifier){
    var contador by remember {
        mutableStateOf(0)
    }


    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


            Text(text = "$contador",
                fontSize = 40.sp
                )
        Spacer(modifier = modifier.height(50.dp))

        Row() {
            Button(onClick = {
                contador--
            }, colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
                contentColor = Color.Black
            ),


                ) {
                Text(text = "-", fontSize = 40.sp)
            }

            Spacer(modifier = modifier.width(50.dp))

            Button(onClick = {
                contador++
            }, colors = ButtonDefaults.buttonColors(
                contentColor = Color.Black,
                containerColor = Color.Green
            )
            ) {
                Text(text = "+", fontSize = 40.sp)
            }
        }
        Spacer(modifier = modifier.height(50.dp))
        TextButton( onClick = {
            contador = 0
        }

        ) {
            Text(text = "Reiniciar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    ContadorTestTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Contador2(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}