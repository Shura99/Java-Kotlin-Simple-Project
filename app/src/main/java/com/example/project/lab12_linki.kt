package com.example.project

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class lab12_linki : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab12_linki)
        val myWebView = findViewById<View>(R.id.myWebView) as WebView
        myWebView.loadUrl("http://java.prz.edu.pl/")
        myWebView.webViewClient = MyWebViewClient()
        val webSettings: WebSettings
        webSettings = myWebView.settings
        webSettings.javaScriptEnabled = true
    }

    private inner class MyWebViewClient : WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            if (Uri.parse(url).host == "http://java.prz.edu.pl/") {
                return false
            }
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
            return true
        }
    }
}