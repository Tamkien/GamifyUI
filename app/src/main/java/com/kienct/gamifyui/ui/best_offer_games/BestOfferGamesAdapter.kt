package com.kienct.gamifyui.ui.best_offer_games

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kienct.gamifyui.R

class BestOfferGamesAdapter(private val bestOfferGame: MutableList<BestOfferGame>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.best_offer_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val game = bestOfferGame[position]
        (holder as ViewHolder).img.setImageResource(game.imgSrc)
        holder.desc.text = game.description
        holder.name.text = game.name
        holder.r.rating = game.rating
    }

    override fun getItemCount(): Int {
        return bestOfferGame.size
    }

    internal class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var img: ImageView = v.findViewById(R.id.imageView10)
        var r: RatingBar = v.findViewById(R.id.ratingBar)
        var desc: TextView = v.findViewById(R.id.textView20)
        var name: TextView = v.findViewById(R.id.textView19)
    }
}