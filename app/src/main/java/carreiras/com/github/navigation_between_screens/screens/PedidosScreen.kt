package carreiras.com.github.navigation_between_screens.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.unit.*
import androidx.navigation.NavController

@Composable
fun PedidosScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    cliente: String?
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Pedidos", fontSize = 24.sp)

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Cliente: $cliente")

        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = { navController.navigate("menu") }) {
            Text("Voltar")
        }
    }
}