package com.cook.bio.myfirstalcproject;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutAlcActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WvClient());
        webView.loadUrl("https://andela.com/alc/");
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
