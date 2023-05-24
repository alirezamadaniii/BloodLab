package com.example.bloodlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.databinding.DataBindingUtil
import com.example.bloodlab.databinding.FragmentTrunRatingBinding

class TurnRatingFragment : Fragment() {
    private lateinit var binding: FragmentTrunRatingBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_trun_rating, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.progressBarRating.visibility = View.VISIBLE
        setUpWebView()

    }

    private fun setUpWebView() {
        binding.webViewRating.settings.javaScriptEnabled = true

        binding.webViewRating.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url.toString())
                return true
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                binding.progressBarRating.visibility = View.GONE
            }
        }
        binding.webViewRating.loadUrl("https://nobatdehi.ibto.ir/Nobat/DaryaftNobatInternetiNew5")
    }

}