package com.patmahoneyJR.csu.vikings;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class SocialNetwork extends Activity {
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);
        
        WebView webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/social.html");
        
	}
}