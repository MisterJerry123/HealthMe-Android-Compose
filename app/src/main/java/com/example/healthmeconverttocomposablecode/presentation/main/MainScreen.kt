package com.example.healthmeconverttocomposablecode.presentation.main

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.example.healthmeconverttocomposablecode.R
import com.example.healthmeconverttocomposablecode.core.routing.Route
import com.example.healthmeconverttocomposablecode.ui.AppColors

@Composable
fun MainScreen(
//    backStack: NavBackStack<NavKey>,
//    body: @Composable () -> Unit
) {
    //val currentBackStack = backStack.lastOrNull()
    Scaffold(
        bottomBar = {
            Surface(
                shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
                color = AppColors.white.copy(alpha = 0.65f)
            ) {
                NavigationBar() {
                    NavigationBarItem(
                        selected = false,
                        onClick = {

                        },
                        icon = {
                            Icon(
                                painter = painterResource(R.drawable.icon_bottom_nav_home),
                                contentDescription = "홈화면 아이콘",
                                tint = AppColors.black
                            )
                        }
                    )
                    NavigationBarItem(
                        selected = false,
                        onClick = {

                        },
                        icon = {
                            Icon(
                                painter = painterResource(R.drawable.icon_bottom_nav_home),
                                contentDescription = "홈화면 아이콘",
                                tint = AppColors.black
                            )
                        }
                    )
                    NavigationBarItem(
                        selected = false,
                        onClick = {

                        },
                        icon = {
                            Icon(
                                painter = painterResource(R.drawable.icon_bottom_nav_home),
                                contentDescription = "홈화면 아이콘",
                                tint = AppColors.black
                            )
                        }
                    )
                    NavigationBarItem(
                        selected = false,
                        onClick = {

                        },
                        icon = {
                            Icon(
                                painter = painterResource(R.drawable.icon_bottom_nav_home),
                                contentDescription = "홈화면 아이콘",
                                tint = AppColors.black
                            )
                        }
                    )
                    NavigationBarItem(
                        selected = false,
                        onClick = {

                        },
                        icon = {
                            Icon(
                                painter = painterResource(R.drawable.icon_bottom_nav_home),
                                contentDescription = "홈화면 아이콘",
                                tint = AppColors.black
                            )
                        }
                    )
                }
            }
        }
    ) { }


}

@Preview(showBackground = true)
@Composable
private fun MainScreenPreview() {
    MainScreen()
}