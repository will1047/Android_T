package tw.org.iii.appps.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webv = (WebView) findViewById(R.id.webv);
        WebSettings ws = webv.getSettings();
        ws.setJavaScriptEnabled(true);
        setContentView(webv);
        webv.setWebViewClient(new WebViewClient());
        webv.loadUrl("http://google.com");
    }
}
