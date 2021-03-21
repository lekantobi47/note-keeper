package com.hayohtee.notekeeper

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val position = view.findViewById(R.id.text_position) as TextView
        val content = view.findViewById(R.id.text_content) as TextView
    }

    // dummy list
    private val names = arrayOf("James", "John", "Caleb", "Sarah")


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item_view,
        parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.position.text = (position + 1).toString()
        holder.content.text = names[position]
    }

    override fun getItemCount() = names.size

}