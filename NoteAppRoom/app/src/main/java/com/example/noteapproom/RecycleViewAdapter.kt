package com.example.noteapproom

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.noteapproom.data.*
import kotlinx.android.synthetic.main.item.view.*

class RecycleView(val activity: MainActivity, val notes: List<Note>) : RecyclerView.Adapter<RecycleView.recyclerViewHolder>() {
    class recyclerViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): recyclerViewHolder {
        return recyclerViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item,
                parent,
                false))
    }

    override fun onBindViewHolder(holder: recyclerViewHolder, position: Int) {
        val note = notes[position]

        holder.itemView.apply {

            tvtxt.text = note.note

            ibEditNote.setOnClickListener {
                activity.update(note)
            }
            ibDeleteNote.setOnClickListener {
                activity.confirm(note)
            }
        }}


    override fun getItemCount()=notes.size
}

