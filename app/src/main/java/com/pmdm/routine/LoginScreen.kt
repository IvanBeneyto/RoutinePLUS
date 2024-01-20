package com.pmdm.routine

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen() {
    GradientBox(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.45f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Bienvenido a Routine+",
                    style = MaterialTheme.typography.headlineMedium,
                    color = Color.Black
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
                    .background(Color(0xff09b3e4)),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                if (isSmallScreenHeight()){
                    Spacer(modifier = Modifier.fillMaxSize(0.05f))
                }else{
                    Spacer(modifier = Modifier.fillMaxSize(0.1f))
                }
                Text(
                    text = "INICIO DE SESIÓN",
                    style = MaterialTheme.typography.headlineMedium,
                    color = Color(0xffffd699)
                )
            }
        }
    }
}