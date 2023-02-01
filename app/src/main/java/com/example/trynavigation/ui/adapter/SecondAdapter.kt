package com.example.trynavigation.ui.adapter

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.trynavigation.databinding.ItemFirstBinding
import com.example.trynavigation.databinding.ItemSecondBinding
import com.example.trynavigation.ui.data.FirstModel

class SecondAdapter (
    private var textList2 : MutableList<FirstModel>
        ) :RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {

    inner class SecondViewHolder(private var binding: ItemSecondBinding):
    RecyclerView.ViewHolder(binding.root){
        fun onBind(firstModel: FirstModel) {
            binding.txt2.text = firstModel.text
            Glide.with(binding.image2.context).load(firstModel.s).into(binding.image2)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        return SecondViewHolder( ItemSecondBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.onBind(textList2[position])
    }

    override fun getItemCount(): Int = textList2.size

}