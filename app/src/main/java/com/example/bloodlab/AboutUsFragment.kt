package com.example.bloodlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.databinding.DataBindingUtil
import com.example.bloodlab.databinding.FragmentAboutUsBinding


class AboutUsFragment : Fragment() {
  private lateinit var binding: FragmentAboutUsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_about_us, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.progressBarAboutUs.visibility = View.VISIBLE
        setUpWebView()
    }


    private fun setUpWebView() {
        binding.webViewAboutUs.settings.javaScriptEnabled = true

        binding.webViewAboutUs.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url.toString())
                return true
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                binding.progressBarAboutUs.visibility = View.GONE
            }
        }
        binding.webViewAboutUs.loadUrl("https://zahedan.ibto.ir/index.jsp?fkeyid=&siteid=28&pageid=7547")


    }

}