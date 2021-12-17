package com.vernu.etartstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var client = object : WebChromeClient() {
        }

        var webview: WebView = findViewById(R.id.webview);
        val webSettings: WebSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.loadUrl("https://et-art-store.web.app");
    }


}