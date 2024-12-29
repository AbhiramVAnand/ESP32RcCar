package com.abhiram.esp32rcremote

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.abhiram.esp32rcremote.ui.pages.Controller
import com.abhiram.esp32rcremote.ui.theme.Esp32RcRemoteTheme
import com.abhiram.esp32rcremote.viewmodel.ControllerViewModel

class MainActivity : ComponentActivity() {
    private val viewModel: ControllerViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Esp32RcRemoteTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Controller(innerPadding, viewModel)
                }
            }
        }
    }
}