package com.example.recuperacion_m7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class url_view extends AppCompatActivity {

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url_view);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String url = (String)extras.get("valor");
        webview = (WebView)findViewById(R.id.webview);

        webview.loadUrl(url);

    }
}
