package carreiras.com.github.navigation_between_screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import carreiras.com.github.navigation_between_screens.screens.LoginScreen
import carreiras.com.github.navigation_between_screens.screens.MenuScreen
import carreiras.com.github.navigation_between_screens.screens.PedidosScreen
import carreiras.com.github.navigation_between_screens.screens.PerfilScreen
import carreiras.com.github.navigation_between_screens.ui.theme.Android5navigationbetweenscreensTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Android5navigationbetweenscreensTheme {

                val navController = rememberNavController()

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    NavHost(
                        navController = navController,
                        startDestination = "login"
                    ) {
                        composable(route = "login") {
                            LoginScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController
                            )
                        }
                        composable(route = "menu") {
                            MenuScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController
                            )
                        }
                        composable(
                            route = "pedidos?cliente={cliente}",
                            arguments = listOf(
                                navArgument("cliente") {
                                    type = NavType.StringType
                                    defaultValue = "Cliente Genérico"
                                    nullable = true
                                }
                            )
                        ) { backStackEntry ->

                            val cliente = backStackEntry
                                .arguments
                                ?.getString("cliente") ?: "Cliente Genérico"

                            PedidosScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController,
                                cliente
                            )
                        }
                        composable(
                            route = "perfil/{nome}/{idade}",
                            arguments = listOf(
                                navArgument("nome") {
                                    type = NavType.StringType
                                },
                                navArgument("idade") {
                                    type = NavType.IntType
                                }
                            )
                        ) { backStackEntry ->

                            val nome = backStackEntry
                                .arguments
                                ?.getString("nome") ?: "Usuário"

                            val idade = backStackEntry
                                .arguments
                                ?.getInt("idade") ?: 0

                            PerfilScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController,
                                nome,
                                idade
                            )
                        }
                    }
                }
            }
        }
    }
}