package com.example.healthmeconverttocomposablecode.presentation.main.exercise

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.healthmeconverttocomposablecode.ui.AppColors

@Composable
fun ExerciseScreen(modifier: Modifier = Modifier,onSelectedClick:()-> Unit) {
    Text("ExerciseScreen", modifier = modifier.fillMaxSize().background(color = AppColors.mainColor))
}

@Preview(showBackground = true)
@Composable
private fun ExerciseScreenPreview() {
    ExerciseScreen(){}
}