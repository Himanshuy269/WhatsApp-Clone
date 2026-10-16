package com.example.whatsapp.userRegistrationScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun UserRegistrationScreen() {

    Column(modifier=Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment=Alignment.CenterHorizontally) {
        Text(
            text = "Enter your phone number",
            color = Color(0xFF008069),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(14.dp))
        Row {
            Text(
                text = "WhatsApp will need to verify your phone number.",
                color = Color(0xFF111B21) // WhatsApp Main Text Black
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "what's",
                color = Color(0xFF008069) // WhatsApp Link Teal
            )
        }
        Text(
            text = "my number?",
            color = Color(0xFF008069) // WhatsApp Link Teal
        )
        Spacer(modifier = Modifier.height(16.dp))
        dropDownMenu()
        TextFieldRS()
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = "Carrier charges may apply",
            fontSize = 12.sp,
            color = Color(0xFF667781) // WhatsApp Helper Subtext Grey
        )
        Spacer(modifier = Modifier.height(26.dp))
        Button(
            onClick = {},
            shape = RoundedCornerShape(6.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF00A884) // WhatsApp Button Accent Green
            )
        ) {
            Text(text = "Next", color = Color(0xFFFFFFFF))
        }
    }
}
