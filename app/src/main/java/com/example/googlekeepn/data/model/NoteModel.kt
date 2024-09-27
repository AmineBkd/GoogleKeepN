package com.example.googlekeepn.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "notes")
data class NoteModel(
    @PrimaryKey val uuid: String,
    @ColumnInfo(name = "note_title") val noteTitle: String,
    @ColumnInfo(name = "note_Body") val noteBody: String?
)