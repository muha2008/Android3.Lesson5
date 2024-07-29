package com.example.android3lesson5.ui.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android3homework5mc5.data.models.DataItem
import com.example.android3lesson5.R
import com.example.android3lesson5.databinding.ItemCharacterBinding

class CharacterAdapter :
    RecyclerView.Adapter<CharacterAdapter.RickAndMortyViewHolder>() {

    private val _rickAndMortyList = mutableListOf<DataItem>()

    fun setRickAndMortyList(rickAndMortyList: List<DataItem>) {
        this._rickAndMortyList.addAll(rickAndMortyList)
        this._rickAndMortyList.distinctBy {
            it.id
        }
        notifyDataSetChanged()
    }

    inner class RickAndMortyViewHolder(private val binding: ItemCharacterBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: DataItem) = with(binding) {
            val imageUrl = item.attributes.image
            Log.d("ImageUrlDebug", "URL of the image: $imageUrl")

            Glide.with(ivCover)
                .load(imageUrl)
                .error(R.drawable.error)
                .into(ivCover)
            tvName.text = item.attributes.slug
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RickAndMortyViewHolder {
        val binding =
            ItemCharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RickAndMortyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RickAndMortyViewHolder, position: Int) {
        holder.onBind(_rickAndMortyList[position])
    }

    override fun getItemCount(): Int = _rickAndMortyList.size

}