package com.example.googlekeepn.data.model

data class NoteModel(
    val noteTitle: String,
    val noteBody: NoteBody
)

data class NoteBody(
    val text: String
)