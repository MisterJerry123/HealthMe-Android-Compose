package com.example.healthmeconverttocomposablecode.presentation.main.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.healthmeconverttocomposablecode.ui.AppColors

@Composable
fun HomeScreen(modifier: Modifier = Modifier,onSelectedClick:()-> Unit) {
    Text("HomeScreen", modifier = modifier.fillMaxSize().background(color = AppColors.mainColor))
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen(){}
}