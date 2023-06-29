package com.example.bloodlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.bloodlab.databinding.FragmentVideoGalleryBinding


class VideoGalleryFragment : Fragment() {
    private lateinit var binding:FragmentVideoGalleryBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_video_gallery, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.firstVideo.setOnClickListener {
            findNavController().navigate(R.id.action_videoGalleryFragment_to_firstVideoFragment)
        }

        binding.secondVideo.setOnClickListener {
            findNavController().navigate(R.id.action_videoGalleryFragment_to_secondViddeoFragment)
        }
    }





}