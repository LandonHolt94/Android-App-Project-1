package com.example.androidappproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class WebViewActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView = findViewById(R.id.webView1);

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://www.valleycollege.edu/");
    }

    @Override
    public void onBackPressed(){
        if (webView.canGoBack()){
            webView.goBack();
            Toast.makeText(this, "Going back inside of webView", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Exiting webView", Toast.LENGTH_SHORT).show();
            super.onBackPressed();
        }


    }
}