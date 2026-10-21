package com.example.whatsapp.presentation.userRegistrationScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.ui.theme.LightGreen

@Composable
fun TextFieldRS(){
    var countrycode by remember { mutableStateOf("+91") }
    var phoneNumber by remember { mutableStateOf("") }

    Column(
        modifier=Modifier.fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(){
            TextField(value=countrycode,
                onValueChange = {countrycode=it},
                modifier=Modifier.width(70.dp),singleLine=true,
                textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
                colors = TextFieldDefaults.colors(
                    focusedTextColor = Color(0xFF111B21),
                    unfocusedTextColor = Color(0xFF111B21),
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    unfocusedIndicatorColor = LightGreen,
                    focusedIndicatorColor = LightGreen
                )
            )
            Spacer(modifier= Modifier.width(30.dp))
            TextField(value=phoneNumber,
                onValueChange = {phoneNumber=it},
                placeholder = {Text(text="Phone Number")},
                modifier=Modifier.width(150.dp),singleLine=true,
                colors = TextFieldDefaults.colors(
                    focusedTextColor = Color(0xFF111B21),
                    unfocusedTextColor = Color(0xFF111B21),
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    unfocusedIndicatorColor = LightGreen,
                    focusedIndicatorColor = LightGreen
                )
            )
        }
    }
}
