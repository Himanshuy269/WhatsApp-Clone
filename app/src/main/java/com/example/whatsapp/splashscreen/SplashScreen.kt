package com.example.whatsapp.splashscreen

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.whatsapp.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SplashScreen(){
    Box(modifier = Modifier.fillMaxSize(),
     //   contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(R.drawable.whatsapp_icon),
                contentDescription = null,
            modifier=Modifier.size(80.dp).
            align(Alignment.Center)
        )
        Column(modifier =Modifier.align(Alignment.BottomCenter).padding(50.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text="from",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(9.dp))
            Row() {
                Icon(painter = painterResource(R.drawable.meta),
                    contentDescription = "Meta",
                    modifier = Modifier.size(26.dp),
                    tint = Color.Green
                    )
                Spacer(modifier=Modifier.width(3.dp))
               Text(text="Meta",
                   color = Color.Green,
                   fontSize = 20.sp,
                   fontWeight = FontWeight.Bold
               )
            }
        }
    }
}