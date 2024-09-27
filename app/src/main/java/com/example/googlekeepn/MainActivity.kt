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
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.googlekeepn.data.GoogleKeepNAppDataBase
import com.example.googlekeepn.data.model.NoteModel
import com.example.googlekeepn.ui.screens.note.NoteScreen
import com.example.googlekeepn.ui.theme.GoogleKeepNTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.UUID

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDb()
        launchEntryComposeScreen()
    }

    private fun initDb(){
        GoogleKeepNAppDataBase.getDatabase(context = baseContext)
    }

    private fun launchEntryComposeScreen(){
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