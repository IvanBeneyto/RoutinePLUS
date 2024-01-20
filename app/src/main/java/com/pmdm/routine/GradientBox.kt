package com.pmdm.routine

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Blue = Color(0xffffffff)
val Blue2 = Color(0xffffffff)

@Composable
fun GradientBox(
    modifier: Modifier,
    content: @Composable BoxScope.() -> Unit
){
    Box(
        modifier = Modifier.background(brush = Brush.linearGradient(
            listOf(
                Blue, Blue2
            )
        ))
    ){
        content()
    }
}