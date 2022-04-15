package com.example.lolapp.common.components

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DefaultToolbar() {
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(text = "Test")
            })

        }
    ){}
}

@Preview
@Composable
fun PreviewDefaultToolbar(){
    DefaultToolbar()
}