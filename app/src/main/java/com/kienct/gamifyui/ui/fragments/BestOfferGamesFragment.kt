package com.kienct.gamifyui.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kienct.gamifyui.R
import com.kienct.gamifyui.ui.model.BestOfferGame
import com.kienct.gamifyui.ui.adapters.BestOfferGamesAdapter

class BestOfferGamesFragment : Fragment() {

    private lateinit var view1: RecyclerView
    private val bestOfferGames: MutableList<BestOfferGame> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_best_offer_games, container, false)
        view1 = view.findViewById(R.id.best_offer_view)
        addList()
        setAdapter()
        return view
    }

    private fun setAdapter() {
        val bestOfferGamesAdapter = BestOfferGamesAdapter(bestOfferGames)
        view1.layoutManager = LinearLayoutManager(view?.context)
        view1.adapter = bestOfferGamesAdapter
    }

    private fun addList() {
        bestOfferGames.add(
            BestOfferGame(
                "Call of Duty WWII",
                "Call of Duty: WWII is a first-person shooter video game developed by Sledgehammer Games and published by Activision.",
                R.drawable.codwwii_logo,
                5f
            )
        )
        bestOfferGames.add(
            BestOfferGame(
                "Battlefield 1",
                "Battlefield 1 is a first-person shooter video game developed by EA DICE and published by Electronic Arts.",
                R.drawable.battlefield_logo,
                4f
            )
        )
        bestOfferGames.add(
            BestOfferGame(
                "Grand Theft Auto V",
                "Grand Theft Auto V is an action-adventure video game developed by Rockstar North and published by Rockstar Games.",
                R.drawable.gtav_logo,
                3f
            )
        )
        bestOfferGames.add(
            BestOfferGame(
                "Call of Duty Black OPS 3",
                "Call of Duty: Black Ops III is a cyberpunk first-person shooter video game, developed by Treyarch and published by Activision.",
                R.drawable.codbo_logo,
                4f
            )
        )
        bestOfferGames.add(
            BestOfferGame(
                "Farcry 5",
                "Far Cry 5 is a first-person shooter video game developed by Ubisoft Montreal and Ubisoft Toronto and published by Ubisoft.",
                R.drawable.farcry_logo,
                5f
            )
        )
    }
}