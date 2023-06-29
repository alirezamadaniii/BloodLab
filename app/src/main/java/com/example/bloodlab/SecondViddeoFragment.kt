package com.example.bloodlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.databinding.DataBindingUtil
import com.example.bloodlab.databinding.FragmentSecondViddeoBinding

class SecondViddeoFragment : Fragment() {
    private lateinit var binding:FragmentSecondViddeoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_second_viddeo, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.progressBarSecondVideo.visibility = View.VISIBLE
        setUpWebView()
    }

    private fun setUpWebView() {
        binding.webViewSecondVideo.settings.javaScriptEnabled = true

        binding.webViewSecondVideo.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url.toString())
                return true
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                binding.progressBarSecondVideo.visibility = View.GONE
            }
        }
        binding.webViewSecondVideo.loadUrl("https://zahedan.ibto.ir/index.jsp?siteid=28&fkeyid=&siteid=28&pageid=6813&mid=42")


    }
}