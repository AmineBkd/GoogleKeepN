package com.example.googlekeepn.data.datasource.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.googlekeepn.data.model.NoteModel

@Dao
interface NoteDao {
    @Insert
    fun insertNote(vararg note: NoteModel)

    @Update
    fun updateNote(vararg note: NoteModel)

    @Delete
    fun deleteNote(vararg note: NoteModel)

    @Query("SELECT * FROM notes")
    fun getAllNotes(): LiveData<List<NoteModel>>
}