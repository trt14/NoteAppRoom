package com.example.noteapproom.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {
    @Query("SELECT * FROM Notes ORDER BY note DESC")
    fun getAllUserInfo(): List<Note>

    @Insert
    fun insertnote(n: Note)
    @Update
    fun updateNote(note: Note)
    @Delete
    fun deleteNote(note: Note)

}
