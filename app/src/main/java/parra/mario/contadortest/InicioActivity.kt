package parra.mario.contadortest

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import parra.mario.contadortest.ui.theme.ContadorTestTheme
import parra.mario.contadortest.ui.theme.Purple80

class InicioActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContadorTestTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   PantallaInicio(
                       modifier = Modifier.padding(innerPadding)
                   )
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun PantallaInicio(modifier: Modifier = Modifier){
    val context = LocalContext.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "LOGIN",
            fontSize = 32.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = {
            //Toast.makeText(context, "This is a test", Toast.LENGTH_SHORT).show()
            var intent = Intent(context, Contador2::class.java)
            context.startActivity(intent)

        }, modifier = modifier.width(200.dp).height(50.dp)

        ) {
            Text(text = "Iniciar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    ContadorTestTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            PantallaInicio(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}