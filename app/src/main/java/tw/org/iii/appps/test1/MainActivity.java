package tw.org.iii.appps.test1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {

    private TextView ShowText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShowText = findViewById(R.id.ShowLT);

        /*
        WebView webv = (WebView) findViewById(R.id.webv);
        WebSettings ws = webv.getSettings();
        ws.setJavaScriptEnabled(true);
        setContentView(webv);
        webv.setWebViewClient(new WebViewClient());
        webv.loadUrl("http://google.com");
        */
    }

    public void CreateLottery(View view) {
        String ls = Lottery();
        ShowText.setText(ls);
    }

    private String Lottery(){
        TreeSet<Integer> ln = new TreeSet<>();
        while(ln.size() < 6){
            ln.add((int)(Math.random()*38+1));
        }
        return ln.toString() + " : " + (int)(Math.random()*8+1);
    }
}
