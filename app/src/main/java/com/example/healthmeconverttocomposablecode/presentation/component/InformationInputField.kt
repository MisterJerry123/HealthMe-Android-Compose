package com.example.healthmeconverttocomposablecode.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.healthmeconverttocomposablecode.ui.AppColors
import com.example.healthmeconverttocomposablecode.ui.AppFonts

@Composable
fun InformationInputField(label: String, placeholder: String = "") {
    Column(modifier = Modifier.fillMaxWidth().background(color = AppColors.mainColor)) {
        Text(
            "$label *",
            fontFamily = AppFonts.gmarketSans,
            fontSize = 17.sp,
            fontWeight = FontWeight.Medium,
            lineHeight = 22.sp,
            color = AppColors.white,
            modifier = Modifier.padding(start = 7.dp)
        )
        Spacer(modifier = Modifier.height(6.dp))
        Box(modifier= Modifier.height(31.dp)
            .background(color = AppColors.white, shape = RoundedCornerShape(34.dp))
        )
            {
                Row(){
                    TextField()
                }


        }

    }


}

@Preview(showBackground = true)
@Composable
private fun InformationInputFieldPreview() {
    InformationInputField(label = "이름")

}