package com.example.trynavigation.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.trynavigation.databinding.ItemSecondBinding
import com.example.trynavigation.databinding.ItemThirdBinding
import com.example.trynavigation.ui.data.FirstModel

class ThirdAdapter(private var textList3 : MutableList<FirstModel>)
    : RecyclerView.Adapter<ThirdAdapter.ThirdViewHolder>()
    {
         inner class ThirdViewHolder(private var binding: ItemThirdBinding):
             RecyclerView.ViewHolder(binding.root) {
             fun onBind(firstModel: FirstModel) {
                 binding.txt3.text = firstModel.text
                 Glide.with(binding.image3.context).load(firstModel.s).into(binding.image3)
             }
         }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThirdViewHolder {
            return ThirdViewHolder( ItemThirdBinding.inflate(LayoutInflater.from(parent.context),parent,false))
        }

        override fun onBindViewHolder(holder: ThirdViewHolder, position: Int) {
            holder.onBind(textList3[position])
        }

        override fun getItemCount(): Int = textList3.size
    }