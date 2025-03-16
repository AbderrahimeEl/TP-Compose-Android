package fr.iutlan.tp4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fr.iutlan.tp4.ui.theme.TP4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Accueil(name = "numéro 6")
        }
    }
}

@Composable
fun Accueil(name: String, modifier: Modifier = Modifier) {
    ElevatedCard {
        Column(
            modifier = modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Bonjour $name",
                fontSize = 20.sp,
                modifier = Modifier.padding(12.dp))
            Text(text = "Je vois de grands progrès", color = Color.Blue)
        }
    }
}
@Preview
@Composable
fun AccueilPreview() {
    Column {
        Accueil(name = "numéro 10", modifier = Modifier.fillMaxWidth())
        Accueil(name = "numéro 6") // valeur par défaut du modifier
    }
}