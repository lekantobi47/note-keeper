package com.hayohtee.notekeeper.model

class NoteViewModel {
    private val notes = mutableListOf<Note>()

    fun getNotes(): List<Note>{
        return notes
    }

    fun addNote(note: Note){
        notes.add(note)
    }
}