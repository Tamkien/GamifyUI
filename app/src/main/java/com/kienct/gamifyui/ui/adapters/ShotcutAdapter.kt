package com.kienct.gamifyui.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kienct.gamifyui.R
import com.kienct.gamifyui.ui.model.Shortcut

class ShotcutAdapter(private val items: MutableList<Shortcut>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.shortcut_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]
        (holder as ViewHolder).img.setImageResource(item.imgSrc)
        holder.name.text = (item.desc)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    internal class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var img: ImageView = v.findViewById(R.id.imageView15)
        var name: TextView = v.findViewById(R.id.textView27)
    }
}