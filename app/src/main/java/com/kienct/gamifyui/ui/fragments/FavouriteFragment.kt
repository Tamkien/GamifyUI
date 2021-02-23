package com.kienct.gamifyui.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kienct.gamifyui.R
import com.kienct.gamifyui.ui.adapters.FavouriteAdapter
import com.kienct.gamifyui.ui.model.FavouriteGame

class FavouriteFragment : Fragment() {
    private lateinit var view1: RecyclerView
    private val favourites: MutableList<FavouriteGame> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_favourite, container, false)
        view1 = view.findViewById(R.id.favourite_container)
        addList()
        setAdapter()
        return view
    }

    private fun setAdapter() {
        val favouriteAdapter = FavouriteAdapter(favourites)
        view1.layoutManager = GridLayoutManager(context, 2)
        view1.adapter = favouriteAdapter
    }

    private fun addList() {
        favourites.add(FavouriteGame(R.drawable.f1, "Call of Duty WWII", 5f))
        favourites.add(FavouriteGame(R.drawable.f2, "Battlefield 1", 4f))
        favourites.add(FavouriteGame(R.drawable.f3, "Grand Theft Auto V", 3f))
        favourites.add(FavouriteGame(R.drawable.f4, "Call of Duty Black OPS 3", 4f))
        favourites.add(FavouriteGame(R.drawable.f5, "Far Cry 5", 2f))
        favourites.add(FavouriteGame(R.drawable.f6, "Ghost Recon Breakpoint", 1f))
    }
}