package com.example.trynavigation.ui.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.trynavigation.databinding.FragmentDetailBinding
import com.example.trynavigation.ui.data.FirstModel

class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding
    private var model: FirstModel? = null

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        data
        click()
    }

    private fun click() {
        binding.root.setOnClickListener {
            findNavController().navigateUp()
        }
    }

//    private val data: Unit
//        get() {
//            val argument = arguments
//            if (argument != null) {
//                model = argument.getSerializable("key") as FirstModel
//                val let = binding.imageDetail.let {
//                    var it = null
//                    it?.context.let { it1 ->
//                        Glide.with(it1).load(model?.text).into(binding.root)
//                    }
//                }
//                  model?.text
//            }
        }
