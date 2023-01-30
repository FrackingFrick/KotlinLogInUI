package com.example.simpleloginui

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simpleloginui.ui.theme.SimpleLoginUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleLoginUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LogIn()
                }
            }
        }
    }
}

@Composable
fun LogIn() {
    var userName: String by remember{ mutableStateOf("") }
    var passWord: String by remember{ mutableStateOf("") }
    Column (
        verticalArrangement= Arrangement.spacedBy(8.dp),
        modifier=Modifier.padding(8.dp)

    ){
        Text(
            text = "Login",
            color=MaterialTheme.colors.primary,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value =userName ,
            onValueChange = {userName=it},
            label={Text(text="username")},
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            trailingIcon= { Icon(imageVector = Icons.Default.Email, contentDescription = "Email Icon") }
        )
        OutlinedTextField(
            value =passWord ,
            onValueChange = {passWord=it},
            label={Text(text="password")},
            visualTransformation = PasswordVisualTransformation(),
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            trailingIcon = {Icon(imageVector = Icons.Default.Lock, contentDescription = "Password Icon")}
        )
        Button(
            onClick = { /*TODO*/ },

        ) {
            Text("Submit")
        }
    }
}

