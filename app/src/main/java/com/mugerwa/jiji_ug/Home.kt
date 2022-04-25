package com.mugerwa.jiji_ug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Home : AppCompatActivity() {


    private lateinit var webView:WebView
     var  Url="https://jiji.ug/?utm_source=google_adw&utm_medium=3999809623&utm_campaign=8922311755&utm_content=88815043126&utm_term=412017654449&gclid=Cj0KCQjw6pOTBhCTARIsAHF23fJYch-7fbcUJu2X5Jnd6jtJ_oMunm508KXUjFtAU7VCnAm5R80u5MEaAiteEALw_wcB"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    webView=findViewById(R.id.web)
        webView.apply {
            loadUrl(Url)
           settings.javaScriptEnabled=true
            webViewClient= WebViewClient()

        }
    }

    override fun onBackPressed() {
        if(webView.canGoBack())
        {
            webView.goBack()
        }else
        {
            super.onBackPressed()
        }

    }
}