package edu.ucne.bryanovalles_p1_ap2.presentation.navegation

import kotlinx.serialization.Serializable

sealed class Screen {
    @Serializable
    data object PantallaInicio : Screen()

}