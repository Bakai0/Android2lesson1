package com.example.trynavigation.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.Person.fromBundle
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.trynavigation.R
import com.example.trynavigation.databinding.FragmentFirstBinding
import com.example.trynavigation.ui.Onclick
import com.example.trynavigation.ui.adapter.FirstAdapter
import com.example.trynavigation.ui.data.FirstModel
import com.example.trynavigation.ui.repozitory.FirstRepozitory

class FirstFragment : Fragment(),Onclick {
    private var binding: FragmentFirstBinding? = null
    private val textList = ArrayList<FirstModel>()
    private val adapter = FirstAdapter(textList, this)
    private val repo = FirstRepozitory()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return (binding?.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        click()
        getData()

    }

    private fun getData() {
        val bundle = arguments
        if (arguments != null) {
            val text: String? = bundle?.getString("first")
            textList.add(FirstModel("", text.toString()))
        }
    }

    private fun initialize() {
        binding?.recView?.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        textList.addAll(repo.getListOfText())
        binding?.recView?.adapter = adapter
    }

    private fun click() {
        fun click() {
            binding?.root?.setOnClickListener {
                findNavController().navigate(R.id.action_firstFragment_to_detailFragment)
            }
        }
        onDestroy()
        super.onDestroy()
        binding = null
    }

    override fun onClick(model: FirstModel) = with(binding) {
        val text = model.text
        val image = model.s
        findNavController().navigate(
            FirstFragmentDirections.actionFirstFragmentToDetailFragment().setText(text.toString())
                .setImg(image.toString())
        )

    }
}

//    if (arguments != null){
//    {
//        val arg = FirstFragment?.fromBundle(requireArguments())
//        binding.partnerName.text = arg.name
//        binding.partnerDescription.text = arg.shortDescription
//        connectionState = arg.connectionState.toString()
//        val logoPath = arg.logoPath

//        id = arg.id.toString()
//    }
//}



