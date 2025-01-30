package edu.ucne.bryanovalles_p1_ap2.presentation.navegation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun ParcialNavHost(
    navHostController: NavHostController
){
    NavHost (
        navController = navHostController,
        startDestination = Screen.PantallaInicio
    ) {
        composable<Screen.PantallaInicio>{
        }
    }
}