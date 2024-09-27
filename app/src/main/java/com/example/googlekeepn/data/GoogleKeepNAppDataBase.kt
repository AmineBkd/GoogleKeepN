package com.example.googlekeepn.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.googlekeepn.data.datasource.local.NoteDao
import com.example.googlekeepn.data.model.NoteModel

@Database(entities = [NoteModel::class], version = 1, exportSchema = false)
abstract class GoogleKeepNAppDataBase: RoomDatabase() {
    abstract fun noteDao(): NoteDao

    companion object {
        @Volatile
        private var INSTANCE: GoogleKeepNAppDataBase? = null

        fun getDatabase(context: Context): GoogleKeepNAppDataBase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    GoogleKeepNAppDataBase::class.java,
                    "note_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}