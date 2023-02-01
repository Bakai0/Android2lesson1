package com.example.trynavigation.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.trynavigation.R
import com.example.trynavigation.databinding.FragmentSecondBinding
import com.example.trynavigation.databinding.FragmentThirdBinding
import com.example.trynavigation.ui.adapter.ThirdAdapter
import com.example.trynavigation.ui.data.FirstModel
import com.example.trynavigation.ui.repozitory.ThirdRepozitory


class SecondFragment : Fragment() {

    private var binding: FragmentSecondBinding? = null
    private var textList2 = mutableListOf<FirstModel>()
    private val repozitory = ThirdRepozitory()
    private val adapter2 = ThirdAdapter(textList2)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initilization()
    }

    private fun initilization() {
        binding?.recycler2?.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL,false)
        textList2.addAll(repozitory.getListOfText3())
        binding?.recycler2?.adapter = adapter2
    }
}