package com.example.whatsapp.presentation.userRegistrationScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import com.example.whatsapp.ui.theme.DarkGreen
import com.example.whatsapp.ui.theme.LightGreen

@Composable
fun dropDownMenu() {
    var expanded by remember { mutableStateOf(false) }
    var selectedCountry by remember { mutableStateOf("India") }
    TextButton(
        onClick = { expanded = !expanded },
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.textButtonColors(
            containerColor = Color.Transparent
        )
    ) {
        Box(modifier = Modifier.width(230.dp)) {
            Text(
                text = selectedCountry,
                modifier = Modifier.align(Alignment.Center),
                color = Color.Black,
                fontSize = 16.sp
            )
            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = null,
                modifier = Modifier.align(Alignment.CenterEnd),
                tint = DarkGreen
            )
        }
    }
    Spacer(modifier = Modifier.height(8.dp))
    HorizontalDivider(
        modifier = Modifier.padding(horizontal = 66.dp),
        thickness = 2.dp,
        color = LightGreen
    )
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = { expanded = false }
    ) {
        listOf("India", "USA", "UK", "Germany", "Australia").forEach { country ->
            DropdownMenuItem(
                text = { Text(country) },
                onClick = {
                    selectedCountry = country
                    expanded = false
                }
            )
        }
        DropdownMenuItem(
            text = { Text("Option 2") },
            onClick = { /* Do something... */ }
        )
    }
}
