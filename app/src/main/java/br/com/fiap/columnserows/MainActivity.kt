package br.com.fiap.columnserows

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.columnserows.ui.theme.ColumnsERowsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColumnsERowsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Blue
                ) {
                    LayoutScreen()
                }
            }
        }
    }
}

@Composable
fun LayoutScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
            .padding(start = 16.dp, top = 16.dp)
    ) {
        HeaderSection()
        ContentSection()
    }
}

@Composable
fun HeaderSection() {
    Column(
        modifier = Modifier
            .background(Color.Magenta)
            .fillMaxWidth()
            .height(40.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Carbon Path",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif
        )
    }
}

@Composable
fun ContentSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(Color.Green)
    ) {
        Image(
            painter = painterResource(id = R.drawable.imagem),
            contentDescription = "Cidade verde",
            modifier = Modifier
                .size(300.dp)
                .align(Alignment.CenterHorizontally)
        )
    }
}



@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LayoutScreenPreview() {
    LayoutScreen()
}
        