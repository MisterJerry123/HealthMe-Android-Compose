package com.example.healthmeconverttocomposablecode.core.routing

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed interface Route: NavKey {
    @Serializable
    data object Splash : Route
    object SetEmail : Route
    object Login : Route

}