package com.example.trynavigation.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trynavigation.R
import com.example.trynavigation.databinding.ItemFirstBinding
import com.example.trynavigation.ui.data.FirstModel
import com.example.trynavigation.ui.fragments.FirstFragment
import com.example.trynavigation.ui.adapter.FirstAdapter.FirstViewHolder as FirstViewHolder

class FirstAdapter(private val listText: MutableList<FirstModel>, firstFragment: FirstFragment) :
    RecyclerView.Adapter<FirstViewHolder>(){

    class FirstViewHolder (view: View): RecyclerView.ViewHolder(view) {
        fun onBind(firstModel: FirstModel) {
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        return FirstViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.item_first,parent,false))
    }


    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.onBind(listText[position])
        holder.itemView.setOnLongClickListener {
            listText.removeAt(holder.adapterPosition)
            notifyItemRemoved(holder.adapterPosition)
            true

        }
    }

    override fun getItemCount(): Int = listText.size
}