package com.example.bloodlab

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.bloodlab.databinding.FragmentPhoneRatingBinding


class PhoneRatingFragment : Fragment() {
    private lateinit var binding:FragmentPhoneRatingBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_phone_rating, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.phoneZabol.setOnClickListener {
           intentToPhoneCall("05432241335")
        }

        binding.phoneChab.setOnClickListener {
            intentToPhoneCall("05435330780")
        }

        binding.phoneIran.setOnClickListener {
            intentToPhoneCall("05437222999")
        }

        binding.phoneSara.setOnClickListener {
            intentToPhoneCall("05437628008")
        }

        binding.phoneZahedan1.setOnClickListener {
            intentToPhoneCall("05433229999")
        }

        binding.phoneZahedan2.setOnClickListener {
            intentToPhoneCall("05433220000")
        }
    }

    private fun intentToPhoneCall(number:String){
        val phone = number
        val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))
        startActivity(intent)
    }

}