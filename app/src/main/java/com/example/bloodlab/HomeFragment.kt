package com.example.bloodlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.bloodlab.databinding.FragmentHomeBinding
import com.example.bloodlab.databinding.FragmentNewsBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.cardNews.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_newsFragment)
        }

        binding.mbtnRating.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_turnRatingFragment)
        }

        binding.cardAddress.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_addressFragment)
        }

        binding.cardGallery.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_galleryFragment)
        }
    }



}