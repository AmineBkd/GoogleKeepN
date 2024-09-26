package com.example.googlekeepn.model.data

data class NoteModel(
    val noteTitle: String,
    val noteBody: NoteBody
)

data class NoteBody(
    val text: String
)