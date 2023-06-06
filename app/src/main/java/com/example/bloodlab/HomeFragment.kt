package com.example.bloodlab

import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bloodlab.databinding.FragmentHomeBinding
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderAnimations


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onSetUpSlider()
        binding.cardNews.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_newsFragment)
        }

        binding.mbtnRatingOnline.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_turnRatingFragment)
        }

        binding.mbtnRatingPhone.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_phoneRatingFragment)
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

        binding.cardHistory.setOnClickListener {
            Toast.makeText(requireContext(),"به زودی...",Toast.LENGTH_LONG).show()
        }

        binding.cardConditions.setOnClickListener {
           findNavController().navigate(R.id.action_homeFragment_to_moreInfoFragment)
        }
    }

    private fun onSetUpSlider(){
        val list= arrayListOf<Int>(R.drawable.image1, R.drawable.image2,R.drawable.image3,R.drawable.image7)
        binding.imageSlider.setSliderAdapter(SliderAdapter(requireContext(),list))

        binding.imageSlider.setIndicatorAnimation(IndicatorAnimationType.WORM);
        binding.imageSlider.setSliderTransformAnimation(SliderAnimations.CUBEINROTATIONTRANSFORMATION);
        binding.imageSlider.startAutoCycle();
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