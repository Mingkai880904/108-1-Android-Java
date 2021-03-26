package com.example.ksuie.a1217;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle bundle = this.getIntent().getExtras();
        String show_url = bundle.getString("URLSTR");
        //((TextView)findViewById(R.id.SHOW_URL)).setText(show_url);

        WebView webview = (WebView)findViewById(R.id.webview);
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        setContentView(webview);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl(show_url);
    }

    public void SCRN_CLOSE3(View v) {

        /*
        RadioButton rb1 = (RadioButton)findViewById(R.id.CHK_OK);
        RadioButton rb2 = (RadioButton)findViewById(R.id.CHK_ERR);
        String isOK = "";
        if (rb1.isChecked()) isOK = "OK";
        if (rb2.isChecked()) isOK = "ERR";
        */

        Bundle bundle = new Bundle();
        bundle.putString("CHK", "");
        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(12,intent);
        finish();
    }
}
