package com.kienct.gamifyui.ui.favourite

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kienct.gamifyui.R

class FavouriteAdapter(private val favourite: MutableList<FavouriteGame>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.favourite_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val game = favourite[position]
        (holder as ViewHolder).img.setImageResource(game.imgSrc)
        holder.name.text = game.name
        holder.r.rating = game.rating
    }

    override fun getItemCount(): Int {
        return favourite.size
    }

    internal class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var img: ImageView = v.findViewById(R.id.imageView17)
        var r: RatingBar = v.findViewById(R.id.ratingBar2)
        var name: TextView = v.findViewById(R.id.textView28)
    }
}