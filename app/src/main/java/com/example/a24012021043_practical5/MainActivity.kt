
package com.example.a24012021043_practical5

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.a24012021043_practical5.ui.theme._24012021043_Practical5Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            _24012021043_Practical5Theme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "login"
                ) {
                    composable("login") {
                        LoginActivityUI(
                            navController = navController,
                            showMsg = { msg ->
                                Toast.makeText(
                                    this@MainActivity,
                                    msg,
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        )
                    }

                    composable("register") {
                        RegisterUI(
                            navController = navController
                        )
                    }
                }
            }
        }
    }
}
