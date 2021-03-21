package com.hayohtee.notekeeper.model

import androidx.lifecycle.ViewModel

class NoteViewModel: ViewModel() {
    private val notes = mutableListOf<Note>()

    fun getNotes(): List<Note>{
        return notes
    }

    fun addNote(note: Note){
        notes.add(note)
    }
}