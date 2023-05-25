package com.example.bloodlab

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bloodlab.databinding.FragmentSplashScreenBinding


class SplashScreenFragment : Fragment() {
    private lateinit var binding: FragmentSplashScreenBinding
      override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


          binding = DataBindingUtil.inflate(inflater,com.example.bloodlab.R.layout.fragment_splash_screen, container, false)

          val myFadeInAnimationImage: Animation = AnimationUtils.loadAnimation(requireContext(), com.example.bloodlab.R.anim.fade)
          binding.cvSplash.startAnimation(myFadeInAnimationImage) //Set animation to your ImageView

          val myFadeInAnimationText: Animation = AnimationUtils.loadAnimation(requireContext(), com.example.bloodlab.R.anim.fade_title)
          binding.tvSplash.startAnimation(myFadeInAnimationText) //Set animation to your TextView

          Handler().postDelayed({
              findNavController().navigate(com.example.bloodlab.R.id.action_splashScreenFragment_to_homeFragment)
          },3500)

          return binding.root
    }

}