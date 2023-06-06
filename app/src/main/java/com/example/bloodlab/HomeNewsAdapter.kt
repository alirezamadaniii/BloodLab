package com.example.bloodlab

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bloodlab.databinding.ItemHomeBinding


class HomeNewsAdapter(var mSliderItems:ArrayList<Int>): RecyclerView.Adapter<HomeNewsAdapter.NewsViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val binding = ItemHomeBinding
            .inflate(LayoutInflater.from(parent.context),parent,false)
        return NewsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return mSliderItems.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val sliderItem = mSliderItems[position]
        holder.bind(sliderItem)
    }


    inner class  NewsViewHolder(val binding: ItemHomeBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(itemNews:Int){
            Glide.with(binding.imageViewExplore.context)
                .load(itemNews)
                .into(binding.imageViewExplore)


        }
    }

    private var onItemClick :((ItemNews)->Unit)?=null

    fun setOnItemClick(listener:(ItemNews)->Unit){
        onItemClick = listener
    }

}