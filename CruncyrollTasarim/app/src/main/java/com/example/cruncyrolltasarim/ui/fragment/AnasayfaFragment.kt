package com.example.cruncyrolltasarim.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.cruncyrolltasarim.data.entity.Animeler
import com.example.cruncyrolltasarim.databinding.FragmentAnasayfaBinding
import com.example.cruncyrolltasarim.ui.adapter.AnimelerAdapter


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        val watchList = ArrayList<Animeler>()
        val wl1 = Animeler(1,"Naruto","naruto","Subtitled English","Up Next: S1 E54")
        watchList.add(wl1)
        val wl2 = Animeler(2,"One Piece","onepiece","Dub | Sub English","Up Next: S1 E751")
        watchList.add(wl2)
        val wl3 = Animeler(3,"Hell's Paradise","hellsparadise","Dub | Sub French","Watch Again: S1 E13")
        watchList.add(wl3)
        val wl4 = Animeler(4,"A Returner's Magic Should Be Special","kikanshanomahou","Dubbed","Start Watching: S1 E1")
        watchList.add(wl4)
        val wl5 = Animeler(5,"Mashle: Magic and Muscles","mashle","Dub | Sub English","Start Watching: S1 E1")
        watchList.add(wl5)
        val wl6 = Animeler(6,"Solo Leveling","sololeveling","Dub | Sub Arabic","Start Watching: S1 E1")

        val watchListAdapter = AnimelerAdapter(requireContext(),watchList)


        binding.animeRV.adapter = watchListAdapter

        binding.animeRV.layoutManager =
            StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL)

        binding.castshare.itemActiveIndicatorColor = null
        return binding.root
    }
}