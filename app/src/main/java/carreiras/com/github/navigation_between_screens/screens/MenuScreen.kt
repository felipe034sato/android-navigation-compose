package carreiras.com.github.navigation_between_screens.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.*
import androidx.navigation.NavController
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

@Composable
fun MenuScreen(modifier: Modifier = Modifier, navController: NavController) {

    val nome = URLEncoder.encode("Fulano de Tal", StandardCharsets.UTF_8.toString())
    val cliente = URLEncoder.encode("Cliente XPTO", StandardCharsets.UTF_8.toString())

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF2C4EC7))
            .padding(32.dp)
    ) {

        Text(
            text = "MENU",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
        ) {

            Button(
                onClick = { navController.navigate("perfil/$nome/27") }
            ) {
                Text("Perfil")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = { navController.navigate("pedidos?cliente=$cliente") }
            ) {
                Text("Pedidos com Cliente")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = { navController.navigate("pedidos") }
            ) {
                Text("Pedidos sem Cliente")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = { navController.navigate("login") }
            ) {
                Text("Sair")
            }
        }
    }
}
