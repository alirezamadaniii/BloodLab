package com.example.bloodlab

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.smarteist.autoimageslider.SliderViewAdapter

class SliderAdapter(val context: Context, var mSliderItems:ArrayList<Int>) :
    SliderViewAdapter<SliderAdapter.SliderAdapterVH>() {


//    fun renewItems(sliderItems: List<SliderItem?>) {
//        this.mSliderItems = sliderItems
//        notifyDataSetChanged()
//    }

    //    fun deleteItem(position: Int) {
//        this.mSliderItems.removeAt(position)
//        notifyDataSetChanged()
//
//    }
//
//    fun addItem(sliderItem: SliderItem?) {
//        this.mSliderItems.add(sliderItem)
//        notifyDataSetChanged()
//    }
    override fun getCount(): Int {
        return mSliderItems.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?): SliderAdapterVH {
        val inflate: View =
            LayoutInflater.from(parent!!.context).inflate(R.layout.image_slider_layout_item, null)
        return SliderAdapterVH(inflate)
    }

    override fun onBindViewHolder(
        viewHolder: SliderAdapterVH?,
        position: Int
    ) {
        val sliderItem = mSliderItems[position]

//        viewHolder!!.textViewDescription.setText(sliderItem.getDescription())
//        viewHolder!!.textViewDescription.setTextSize(16)
//        viewHolder!!.textViewDescription.setTextColor(Color.WHITE)
        Glide.with(viewHolder!!.itemView)
            .load(sliderItem)
            .fitCenter()
            .into(viewHolder!!.imageViewBackground)

        viewHolder!!.itemView.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_galleryFragment)
        }
    }

    class SliderAdapterVH(itemView: View) : ViewHolder(itemView) {
        var imageViewBackground: ImageView
//        var imageGifContainer: ImageView
//        var textViewDescription: TextView

        init {
            imageViewBackground = itemView.findViewById(R.id.iv_auto_image_slider)
//            imageGifContainer = itemView.findViewById(R.id.iv_gif_container)
//            textViewDescription = itemView.findViewById(R.id.tv_auto_image_slider)
        }
    }
}