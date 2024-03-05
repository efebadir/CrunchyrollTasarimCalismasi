package com.example.cruncyrolltasarim.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cruncyrolltasarim.data.entity.Animeler
import com.example.cruncyrolltasarim.databinding.CardTasarimBinding

class AnimelerAdapter(var mContext: Context, var animeListesi:List<Animeler>)
    : RecyclerView.Adapter<AnimelerAdapter.CardTasarimTutucu>() {
        inner class CardTasarimTutucu(var tasarim:CardTasarimBinding) :
            RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding: CardTasarimBinding =
            CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val anime:Animeler =  animeListesi.get(position)
        val t = holder.tasarim

        t.imageViewAnime.setImageResource(
            mContext.resources.getIdentifier((anime.resim),"drawable",mContext.packageName))

        t.textViewAd.text = "${anime.ad}"
        t.textViewAciklama.text = "${anime.aciklama}"
        t.textViewEpisode.text = "${anime.episode}"
    }

    override fun getItemCount(): Int {
        return animeListesi.size
    }


}