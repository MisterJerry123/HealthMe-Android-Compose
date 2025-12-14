package com.example.healthmeconverttocomposablecode.core.routing

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import com.example.healthmeconverttocomposablecode.presentation.auth.login.LoginScreen
import com.example.healthmeconverttocomposablecode.presentation.auth.signup.set_email.SetEmailScreen
import com.example.healthmeconverttocomposablecode.presentation.auth.splash.SplashScreen

@Composable
fun NavigationRoot(modifier: Modifier = Modifier) {

    val toplevelBackStack = rememberNavBackStack(Route.Splash)

    NavDisplay(
        modifier = modifier,
        entryDecorators = listOf(
            rememberSaveableStateHolderNavEntryDecorator(),
            rememberViewModelStoreNavEntryDecorator()
        ),
        backStack = toplevelBackStack,
        entryProvider = entryProvider {
            entry<Route.Splash> {
                SplashScreen(
                    onSplashStart = {
                        toplevelBackStack.clear()
                        toplevelBackStack.add(Route.Splash)
                    },
                    onLoginButtonClick = {
                        toplevelBackStack.clear()
                        toplevelBackStack.add(Route.Login)
                    },
                    onSignUpButtonClick = {
                        toplevelBackStack.clear()
                        toplevelBackStack.add(Route.SetEmail)
                    })
            }
            entry<Route.SetEmail> {
                SetEmailScreen()
            }
            entry<Route.Login> {
                LoginScreen()
            }
        }

    )


}
