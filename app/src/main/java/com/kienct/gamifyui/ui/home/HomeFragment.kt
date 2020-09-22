package com.kienct.gamifyui.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kienct.gamifyui.R


class HomeFragment : Fragment() {

    private lateinit var view1: RecyclerView
    private lateinit var view2: RecyclerView
    private lateinit var view3: RecyclerView
    private lateinit var view4: RecyclerView
    private val slider: MutableList<SliderModel> = ArrayList()
    private val recyclerView1: MutableList<Shortcut> = ArrayList()
    private val recyclerView2: MutableList<Int> = ArrayList()
    private val recyclerView3: MutableList<Int> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)
        view1 = view.findViewById(R.id.sliderView)
        view2 = view.findViewById(R.id.recyclerView2)
        view3 = view.findViewById(R.id.recyclerView4)
        view4 = view.findViewById(R.id.recyclerView)
        addList()
        setAdapter()
        return view
    }

    private fun setAdapter() {
        val slideAdapter = SlideAdapter(slider)
        view1.layoutManager =  LinearLayoutManager(view?.context, LinearLayoutManager.HORIZONTAL, false)
        view1.adapter = slideAdapter
        val shortcutAdapter = ShotcutAdapter(recyclerView1)
        view2.layoutManager =  LinearLayoutManager(view?.context, LinearLayoutManager.HORIZONTAL, false)
        view2.adapter = shortcutAdapter
        val smallBannerAdapter = SmallBannerAdapter(recyclerView2)
        view3.layoutManager =  LinearLayoutManager(view?.context, LinearLayoutManager.HORIZONTAL, false)
        view3.adapter = smallBannerAdapter
        val secondRowAdapter = SecondRowAdapter(recyclerView3)
        view4.layoutManager = LinearLayoutManager(view?.context, LinearLayoutManager.HORIZONTAL, false)
        view4.adapter = secondRowAdapter
    }

    private fun addList() {
        slider.add(SliderModel(R.drawable.slider_image1, "Ghost Recon Breakpoint"))
        slider.add(SliderModel(R.drawable.slider_image2, "Assassin’s Creed Odyssey"))
        slider.add(SliderModel(R.drawable.slider_image3, "Total War: Three Kingdoms"))
        recyclerView1.add(Shortcut(R.drawable.i1, "Battlefield V Firestrome"))
        recyclerView1.add(Shortcut(R.drawable.i2, "Ghost Recon Breakpoint"))
        recyclerView1.add(Shortcut(R.drawable.i3, "Tom Clancy's Division 2"))
        recyclerView1.add(Shortcut(R.drawable.i4, "Cyberpunk 2077"))
        recyclerView1.add(Shortcut(R.drawable.i5, "Halo Infinite"))
        recyclerView1.add(Shortcut(R.drawable.i6, "Doom Eternal"))
        recyclerView1.add(Shortcut(R.drawable.i7, "Grand Theft Auto V"))
        recyclerView1.add(Shortcut(R.drawable.i8, "Ghost Recon Wildlands"))
        recyclerView1.add(Shortcut(R.drawable.i9, "Zelda breath of the wild"))
        recyclerView2.add(R.drawable.banner1)
        recyclerView2.add(R.drawable.banner2)
        recyclerView2.add(R.drawable.banner3)
        recyclerView3.add(R.drawable.i11)
        recyclerView3.add(R.drawable.i12)
        recyclerView3.add(R.drawable.i13)
        recyclerView3.add(R.drawable.i14)
        recyclerView3.add(R.drawable.i15)
        recyclerView3.add(R.drawable.i16)
        recyclerView3.add(R.drawable.i17)
        recyclerView3.add(R.drawable.i18)
    }
}