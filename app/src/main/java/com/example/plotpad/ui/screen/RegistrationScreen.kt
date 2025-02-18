package com.example.plotpad.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RegistrationScreen (){
    var fullName by remember { mutableStateOf("")}
    var userName by remember { mutableStateOf("")}
    var email by remember { mutableStateOf("")}
    var psw by remember { mutableStateOf("")}
    var pswConf by remember { mutableStateOf("")}

    Column(
        modifier = Modifier.fillMaxSize(),

    ) {

        TextField(
            value = fullName,
            onValueChange = { fullName = it },
            label = { Text("at least 8 charachters ") },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
@Composable
fun PreviewRegistrationScreen(){
    RegistrationScreen()
}
