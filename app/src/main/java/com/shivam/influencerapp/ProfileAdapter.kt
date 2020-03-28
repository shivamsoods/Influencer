package com.shivam.influencerapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.video_item.view.*

class ProfileAdapter(private val exampleList: List<ExampleList>) :
    RecyclerView.Adapter<ProfileAdapter.ExampleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.video_item,
            parent, false)

        return ExampleViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = exampleList[position]

        holder.imageView.setImageResource(currentItem.imgRes)
        holder.textView1.text = currentItem.title
        holder.textView2.text = currentItem.description
    }

    override fun getItemCount() = exampleList.size

    class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.ivVideoItem
        val textView1: TextView = itemView.tvVideoTitle
        val textView2: TextView = itemView.tvVideoDescription
    }
}