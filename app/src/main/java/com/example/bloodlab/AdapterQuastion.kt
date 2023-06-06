package com.example.bloodlab

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class AdapterQuastion(private val context: Context, list: List<FrequentQuestionsContent>) :
    RecyclerView.Adapter<AdapterQuastion.Holder>() {
    private val list: List<FrequentQuestionsContent>
    private var mExpandedPosition = -1

    init {
        this.list = list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_questaion, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val quastion: FrequentQuestionsContent = list[position]
        holder.textViewTitle.setText(quastion.txt)
        holder.textViewDescription.setText(quastion.answer)
        val isExpanded = position == mExpandedPosition
        holder.textViewDescription.visibility = if (isExpanded) View.VISIBLE else View.GONE
        holder.viewLine.visibility = if (isExpanded) View.GONE else View.VISIBLE
        holder.imageViewExpand.setImageResource(if (isExpanded) R.drawable.baseline_keyboard_arrow_up_24 else R.drawable.baseline_keyboard_arrow_down_24)
        holder.itemView.isActivated = isExpanded
        holder.imageViewExpand.setOnClickListener { v: View? ->
            mExpandedPosition = if (isExpanded) -1 else position
            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var constraintLayout: ConstraintLayout
        var textViewDescription: TextView
        var textViewTitle: TextView
        var imageViewExpand: ImageView
        var viewLine: View

        init {
            textViewTitle = itemView.findViewById(R.id.textViewTitleQoastion)
            textViewDescription = itemView.findViewById(R.id.textViewseDcriptionQuestion)
            imageViewExpand = itemView.findViewById(R.id.imageViewExpand)
            viewLine = itemView.findViewById(R.id.view6)
            constraintLayout = itemView.findViewById<ConstraintLayout>(R.id.cons_anim)
        }
    }
}
