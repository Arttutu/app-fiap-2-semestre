package br.com.fiap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize


import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PrimeroComponente()
                }
            }
        }
    }
}

@Composable
fun PrimeroComponente() {
    var idade = remember {
        mutableStateOf(0)
    };
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = "Meu primeiro APP",
            color = Color.Red,
            fontSize = 24.sp,
            fontWeight =  FontWeight.Bold,
            textAlign =  TextAlign.Center,
            //modifier = Modifier.fillMaxWidth()

            )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Molestias vitae odit corporis enim repellat officiis ea optio ullam aliquam aliquid obcaecati assumenda ipsum accusantium, velit, debitis tenetur placeat perferendis omnis.",
            fontSize = 12.sp,
            color = Color.Blue,
            //modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Text(
            text = "${idade.value}",
            fontSize = 48.sp,
            color = Color.Red,
            textAlign = TextAlign.Center,

        )
        Spacer(modifier = Modifier.height(30.dp))
        Row (horizontalArrangement = Arrangement.Center ,modifier = Modifier.fillMaxSize()) {
            Button(
                onClick = {
                          idade.value++
                },
                modifier = Modifier.size(84.dp),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF88c6a5))
            ){Text(text = "+")}
            Spacer(modifier = Modifier.width(30.dp))
            Button(
                onClick = { idade.value--},
                modifier = Modifier.size(84.dp),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF88c6a5))
            ){Text(text = "-")}

        }
        Text(text = "testando 2")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewPrimeiroComponente() {
    PrimeroComponente();
}
