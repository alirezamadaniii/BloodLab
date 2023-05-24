package com.example.bloodlab

import android.graphics.Bitmap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.databinding.DataBindingUtil
import com.example.bloodlab.databinding.FragmentAddressBinding


class AddressFragment : Fragment() {
    private lateinit var binding:FragmentAddressBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding  = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_address, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.progressBarAddress.visibility =View.VISIBLE
        setUpWebView()
    }



    private fun setUpWebView() {
        binding.webViewAddress.settings.javaScriptEnabled = true

        binding.webViewAddress.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url.toString())
                return true
            }



            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                binding.progressBarAddress.visibility = View.GONE
            }
        }

        binding.webViewAddress.loadUrl("https://www.ibto.ir/index.jsp?siteid=1&fkeyid=&siteid=28&pageid=7108")
    }
}