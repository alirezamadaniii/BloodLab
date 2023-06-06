package com.example.bloodlab

import android.graphics.Bitmap
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.databinding.DataBindingUtil
import com.example.bloodlab.databinding.FragmentGalleryBinding


class GalleryFragment : Fragment() {
    private lateinit var binding:FragmentGalleryBinding

  override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
      binding= DataBindingUtil.inflate(layoutInflater,R.layout.fragment_gallery, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        binding.progressBar.visibility = View.VISIBLE
//        setUpWebView()

        setUpGallery()
    }

    private fun setUpGallery() {
        val list= arrayListOf<Int>(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image8,
            R.drawable.image9,
            R.drawable.image10,
            R.drawable.image11)
        var newsAdapter= HomeNewsAdapter(list)
        setupSpannedGridLayout()
        binding.recy.adapter = newsAdapter
    }

    private fun setupSpannedGridLayout() {
        val manager = SpannedGridLayoutManager(
            object : SpannedGridLayoutManager.GridSpanLookup {
                override fun getSpanInfo(position: Int): SpannedGridLayoutManager.SpanInfo {
                    return if (position % 12 == 0 || position % 12 == 7) {
                        SpannedGridLayoutManager.SpanInfo(2, 2)
                    } else {
                        SpannedGridLayoutManager.SpanInfo(1, 1)
                    }
                }
            },
            3,
            1f
        )
        binding.recy.layoutManager =manager
    }

//    private fun setUpWebView() {
//        binding.webViewGallery.settings.javaScriptEnabled = true
//
//        binding.webViewGallery.webViewClient = object : WebViewClient() {
//            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
//                view?.loadUrl(url.toString())
//                return true
//            }
//
//
//
//            override fun onPageFinished(view: WebView?, url: String?) {
//                super.onPageFinished(view, url)
//                binding.progressBar.visibility =View.GONE
//                Log.i("TAG", "onPageFinished: ")
//            }
//        }
//        binding.webViewGallery.loadUrl("https://zahedan.ibto.ir/index.jsp?siteid=28&fkeyid=&siteid=28&pageid=6812")
//    }
}