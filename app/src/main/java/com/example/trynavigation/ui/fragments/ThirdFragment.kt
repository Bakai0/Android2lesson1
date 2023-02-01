package com.example.trynavigation.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.trynavigation.R
import com.example.trynavigation.databinding.FragmentThirdBinding
import com.example.trynavigation.ui.adapter.ThirdAdapter
import com.example.trynavigation.ui.data.FirstModel
import com.example.trynavigation.ui.repozitory.SecondRepozitory
import com.example.trynavigation.ui.repozitory.ThirdRepozitory


class ThirdFragment : Fragment() {

    private var binding: FragmentThirdBinding? = null
    private var textList3 = mutableListOf<FirstModel>()
    private val repozitory = ThirdRepozitory()
    private val adapter3 = ThirdAdapter(textList3)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initilization()

    }

    private fun initilization() {
        binding?.recycler?.layoutManager = LinearLayoutManager(context,RecyclerView.VERTICAL,false)
        textList3.addAll(repozitory.getListOfText3())
        binding?.recycler?.adapter = adapter3
    }
}