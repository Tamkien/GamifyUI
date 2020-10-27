package com.kienct.gamifyui.ui.snapshot

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kienct.gamifyui.R
import com.kienct.gamifyui.ui.most_played.MostPlayedAdapter

class AboutGameFragment : Fragment() {

    private lateinit var view1: RecyclerView
    private val snapshots: MutableList<Int> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.about_game_layout, container, false)
        view1 = view.findViewById(R.id.snapshot_view)
        addList()
        setAdapter()
        return view
    }

    private fun setAdapter() {
        val mostPlayedAdapter = MostPlayedAdapter(snapshots)
        view1.layoutManager =
            LinearLayoutManager(view?.context, LinearLayoutManager.HORIZONTAL, false)
        view1.adapter = mostPlayedAdapter
    }

    private fun addList() {
        snapshots.add(R.drawable.screenshotone)
        snapshots.add(R.drawable.screenshottwo)
    }
}