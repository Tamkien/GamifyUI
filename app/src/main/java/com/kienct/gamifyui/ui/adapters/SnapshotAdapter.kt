package com.kienct.gamifyui.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.kienct.gamifyui.R

class SnapshotAdapter(private val snapshot: MutableList<Int>) ://to be implemented
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.about_game_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val snap = snapshot[position]
        (holder as ViewHolder).img.setImageResource(snap)
    }

    override fun getItemCount(): Int {
        return snapshot.size
    }

    internal class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var img: ImageView = v.findViewById(R.id.snapshot)
    }
}