package com.example.bloodlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.databinding.DataBindingUtil
import com.example.bloodlab.databinding.FragmentFirstVideoBinding


class FirstVideoFragment : Fragment() {
    private lateinit var binding:FragmentFirstVideoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_first_video, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.progressBarFirstVideo.visibility = View.VISIBLE
        setUpWebView()
    }

    private fun setUpWebView() {
        binding.webViewFirstVideo.settings.javaScriptEnabled = true

        binding.webViewFirstVideo.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url.toString())
                return true
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                binding.progressBarFirstVideo.visibility = View.GONE
            }
        }
        binding.webViewFirstVideo.loadUrl("https://zahedan.ibto.ir/index.jsp?siteid=28&fkeyid=&siteid=28&pageid=6813&mid=43")


    }

}