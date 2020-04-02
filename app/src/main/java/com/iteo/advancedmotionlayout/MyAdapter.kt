package com.iteo.advancedmotionlayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_item.view.*

class MyAdapter : RecyclerView.Adapter<Item>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Item =
        Item(LayoutInflater.from(parent.context).inflate(R.layout.view_item, parent, false))

    override fun getItemCount(): Int = 20

    override fun onBindViewHolder(holder: Item, position: Int) {
        holder.bind()
    }
}

class Item(view: View) : RecyclerView.ViewHolder(view) {
    fun bind() {
        (itemView as MotionLayout).setTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {}
            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {}
            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, progress: Float) {
                itemView.lottie.progress = progress
            }

            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {}
        })
    }
}
