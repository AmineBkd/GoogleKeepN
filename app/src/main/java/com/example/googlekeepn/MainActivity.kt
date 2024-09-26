package com.example.googlekeepn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.googlekeepn.ui.screens.note.NoteScreen
import com.example.googlekeepn.ui.theme.GoogleKeepNTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GoogleKeepNTheme {
                NoteScreen()
            }
        }
    }
}


@Composable
@Preview
private fun NoteScreenPreviewDarkMode(){
    GoogleKeepNTheme(darkTheme = true) {
        NoteScreen()
    }
}

@Composable
@Preview
private fun NoteScreenPreviewLightMode(){
    GoogleKeepNTheme {
        NoteScreen()
    }
}