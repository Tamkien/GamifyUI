package com.kienct.gamifyui.ui.most_played

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kienct.gamifyui.R

class MostPlayedFragment : Fragment() {

    private lateinit var view1: RecyclerView
    private val mostPlayed : MutableList<Int> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_most_played, container, false)
        view1 = view.findViewById(R.id.most_played_container)
        addList()
        setAdapter()
        return view
    }
    private fun setAdapter() {
        val mostPlayedAdapter = MostPlayedAdapter(mostPlayed)
        view1.layoutManager = LinearLayoutManager(view?.context)
        view1.adapter = mostPlayedAdapter
    }

    private fun addList() {
        mostPlayed.add(R.drawable.cod_banner)
        mostPlayed.add(R.drawable.battlefield_banner)
        mostPlayed.add(R.drawable.farcry_banner)
    }
}