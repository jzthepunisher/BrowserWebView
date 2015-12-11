package spa.secciondos.browserwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView=(WebView)findViewById(R.id.WebView01);
        webView.setWebViewClient(new Callback());
        WebSettings webSettings=webView.getSettings();
        webSettings.setBuiltInZoomControls(true);
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://www.youtube.com/user/JZThePunisherJZ");

    }

    private class   Callback extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url){
            return (false);
        }
    }

    public void onClick_WebViewUno(View view){
        webView.loadUrl("http://www.android.com/images/whatsnew/jb-new-logo.png");
    }

    public void onClick_WebViewDos(View view){
        webView.loadUrl("http://developer.android.com");
    }

    public void onClick_WebViewTres(View view){
        final String mimeType="text/html";
        final String encoding="UTF-8";
        String html =
                "<H1>Una página HTML simple desde String</H1><body>" +
                        "<p>Solo para Apasionados en Youtube y Facebook</p></body>";
        webView.loadDataWithBaseURL("",html,mimeType,encoding,"");

    }

    public void onClick_WebViewCuatro(View view){
        webView.loadUrl("file:///android_asset/index.html");
    }
}
