package com.jetpack.alertdialog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.jetpack.alertdialog.ui.theme.AlertDialogTheme
import com.jetpack.alertdialog.ui.theme.Purple500

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlertDialogTheme {
                CallAlertDialog()
            }
        }
    }
}

@Composable
fun CallAlertDialog() {
    val isDialogOpen = remember { mutableStateOf(false)}

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        ShowAlertDialog(isDialogOpen)

        Button(
            onClick = {
             isDialogOpen.value = true
            },
            modifier = Modifier
                .padding(10.dp)
                .height(50.dp),
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Purple500)
        ) {
            Text(
                text = "Show Popup",
                color = Color.White
            )
        }
    }
}















