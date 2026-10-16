package com.example.whatsapp.presentation.welcomescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.whatsapp.R
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.whatsapp.ui.theme.DarkGreen
import com.example.whatsapp.ui.theme.LightGreen

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WelcomeScreen(){
    Column(modifier=Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Image(
            painter = painterResource(R.drawable.whatsapp_sticker),
            contentDescription = "WhatsApp sticker",
            modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Row() {
            Text(text="Read our",color=Color.Gray)
            Spacer(modifier = Modifier.width(5.dp))
            Text(text="Privacy Policy",color= LightGreen)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text="Tap 'Agree and continue' to",color= Color.Gray)
        }
        Row() {
            Text(text = "accept", color = Color.Gray)
            Spacer(modifier = Modifier.width(5.dp))
            Text(text = "Terms of Service", color = LightGreen)
        }
        Spacer(modifier=Modifier.height(24.dp))
        Button(
            onClick = {},
            modifier =Modifier.size(220.dp,43.dp),
            shape= RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = DarkGreen,
            )
        ) {
            Text(text = "Agree and Continue")
        }
    }
}