package com.example.googlekeepn.ui.screens.note

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.googlekeepn.ui.theme.GoogleKeepNTheme
import com.example.googlekeepn.viewModel.note.NoteScreenViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteScreen(noteViewModel: NoteScreenViewModel = viewModel()) {
    //Till a localStorage is setup and a backend
    val titleAppBar = "Write a Coding Challenge about Google Keep Write a Coding Challenge about Google Keep"
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

    Scaffold(
        bottomBar = { NoteScreenBottomAppBar() },
        topBar = {
            NoteScreenTopAppBar(
                titleAppBar,
                scrollBehavior
            )
        }
    ) { innerPadding ->
        Box (
            Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .verticalScroll(state = rememberScrollState())
        ) {
            NoteScreenContent()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteScreenTopAppBar(
    title: String,
    scrollBehavior: TopAppBarScrollBehavior,
){
    val titleEditText by remember { mutableStateOf(title) }

    LargeTopAppBar(
        title = {
            Row(Modifier.fillMaxWidth()) {
                Column(
                    Modifier.weight(1f, fill = true)
                ) {
                    Text(
                        text = titleEditText,
                        fontSize = 22.sp,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 1,
                        textAlign = TextAlign.Left
                    )
                }
                Column{
                    IconButton(onClick = {}) {
                        Icon(
                            Icons.Filled.MoreVert,
                            contentDescription = "Top App Bar options"
                        )
                    }
                }
            }
        },
        actions = {
            Row(Modifier.fillMaxWidth()) {
                Column {
                    IconButton(onClick = {}) {
                        Icon(
                            Icons.AutoMirrored.Default.KeyboardArrowLeft,
                            contentDescription = "Top App Bar options",
                            modifier = Modifier.size(75.dp)
                        )
                    }
                }
                Spacer(Modifier.weight(1f))
                Column {
                    Row {
                        IconButton(onClick = {}, Modifier.padding(end = 3.dp)) {
                            Icon(
                                Icons.Outlined.FavoriteBorder,
                                contentDescription = "Top App Bar options",
                                modifier = Modifier.size(24.dp)
                            )
                        }

                        IconButton(onClick = {}, Modifier.padding(end = 3.dp)) {
                            Icon(
                                Icons.Outlined.Notifications,
                                contentDescription = "Top App Bar options",
                                modifier = Modifier.size(24.dp)
                            )
                        }

                        IconButton(onClick = {}) {
                            Icon(
                                Icons.Rounded.AddCircle,
                                contentDescription = "Top App Bar options",
                                modifier = Modifier.size(24.dp)
                            )
                        }
                    }
                }
            }
        },
        scrollBehavior = scrollBehavior
    )
}

@Composable
fun NoteScreenBottomAppBar(){
    BottomAppBar(
        actions = {
            Row(Modifier.fillMaxWidth()) {
                Column {
                    Row {
                        IconButton(onClick = {}, Modifier.padding(start = 0.dp,end = 3.dp)) {
                            Icon(
                                Icons.Outlined.AddCircle,
                                contentDescription = "Top App Bar options",
                                modifier = Modifier.size(23.dp)
                            )
                        }

                        IconButton(onClick = {}) {
                            Icon(
                                Icons.Outlined.Face,
                                contentDescription = "Top App Bar options",
                                modifier = Modifier.size(23.dp)
                            )
                        }
                    }
                }

                Spacer(Modifier.weight(1f))
                Text("Edited 19:15", Modifier.padding(top = 12.dp,end = 35.dp), fontSize = 11.sp)
                Spacer(Modifier.weight(1f))
                Column {
                    Row {
                        IconButton(onClick = {}, Modifier.padding(end = 3.dp)) {
                            Icon(
                                Icons.Filled.MoreVert,
                                contentDescription = "Top App Bar options",
                                modifier = Modifier.size(21.dp)
                            )
                        }
                    }
                }
            }
        }
    )
}

@Composable
fun NoteScreenContent(){
    Column(modifier = Modifier.padding(start = 20.dp)) {
        Text("This is a note Content", fontSize = 15.sp)
    }
}

//Preview Section: To view Design Changes
@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
private fun NoteScreenTopAppBarPreviewDarkMode(){
    GoogleKeepNTheme(darkTheme = true) {
        NoteScreenTopAppBar(
            title = "Write a Coding Challenge about Google Keep",
            scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
private fun NoteScreenTopAppBarPreviewLightMode(){
    GoogleKeepNTheme(darkTheme = false) {
        NoteScreenTopAppBar(
            title = "Write a Coding Challenge about Google Keep",
            scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
        )
    }
}

@Composable
@Preview
private fun NoteScreenBottomAppBarPreviewDarkMode(){
    GoogleKeepNTheme(darkTheme = true) {
        NoteScreenBottomAppBar()
    }
}

@Composable
@Preview
private fun NoteScreenBottomAppBarPreviewLightMode(){
    GoogleKeepNTheme(darkTheme = false) {
        NoteScreenBottomAppBar()
    }
}