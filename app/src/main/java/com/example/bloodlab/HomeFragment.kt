package com.example.bloodlab

import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bloodlab.databinding.FragmentHomeBinding


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

        binding.cardAboutUs.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_aboutUsFragment)
        }

        binding.cardSuggestion.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_suggestionFragment)
        }
    }

    override fun onResume() {
        super.onResume()

        if (view == null) return
        requireView().isFocusableInTouchMode = true
        requireView().requestFocus()
        requireView().setOnKeyListener { v: View?, keyCode: Int, event: KeyEvent ->
            if (event.action == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK) {
                return@setOnKeyListener true
            }
            false
        }
    }

}