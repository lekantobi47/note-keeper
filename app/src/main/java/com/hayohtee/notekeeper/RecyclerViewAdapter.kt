package com.hayohtee.notekeeper

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hayohtee.notekeeper.model.NoteViewModel

class RecyclerViewAdapter(private  val noteViewModel: NoteViewModel):
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {


    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val title = view.findViewById(R.id.text_title) as TextView
        val content = view.findViewById(R.id.text_content) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item_view,
        parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val notes = noteViewModel.getNotes()
        holder.title.text = notes[position].title
        holder.content.text = notes[position].content
    }

    override fun getItemCount() = noteViewModel.getNotes().size

}