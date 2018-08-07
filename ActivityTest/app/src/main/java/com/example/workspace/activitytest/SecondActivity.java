package com.example.workspace.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView text;
    WebView webSite;
    Button webButton;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text = (TextView) findViewById(R.id.secondText);
        webSite = (WebView) findViewById(R.id.webSiteView);
        webButton = (Button) findViewById(R.id.webButton);

        Bundle bundle = getIntent().getExtras();
        s = bundle.getString("tag");
        text.setText(s);

        webButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "https://www.google.com/search?q="+s;

                webSite.getSettings().setJavaScriptEnabled(true);
                webSite.setWebViewClient(new WebViewClient());

                webSite.loadUrl(url);
                //

            }
        });

        //
    }
}
