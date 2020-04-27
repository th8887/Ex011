package com.example.ex01102;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Double a,b,c;
    WebView wv;
    Button btn,btn2;
    EditText et1,et2,et3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv=(WebView) findViewById(R.id.wv);
        btn=(Button) findViewById(R.id.btn);
        btn2=(Button) findViewById(R.id.btn2);
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        et3=(EditText) findViewById(R.id.et3);

        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new MyWebViewClient());
    }

    public void graph(View view) {
        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();
        String s3 = et3.getText().toString();
        if (s1.equals("")||s2.equals("")||s3.equals(""))
            Toast.makeText(this, "please enter numbers", Toast.LENGTH_SHORT).show();
        else {
            a = Double.parseDouble(s1);
            b = Double.parseDouble(s2);
            c = Double.parseDouble(s3);
            if (a == 1)
                wv.loadUrl("https://www.google.com/search?q=x%5E2%2B"+b+"*x"+c+"&oq=x%5E2&aqs=chrome.0.69i59l2j69i57j0l5.3888j0j7&sourceid=chrome&ie=UTF-8");
            if (a>0)
                if (c>0)
                    wv.loadUrl("https://www.google.com/search?sxsrf=ALeKk02ib-jVvetky8xNaUimiLZdsY3P0g%3A1587972763862&ei=m4qmXtSONMOVkwWk87mQDQ&q="+a+"*x%5E2%2B"+b+"*x%2B"+c+"&oq="+a+"*x%5E2%2B"+b+"*x%2B"+c+"&gs_lcp=CgZwc3ktYWIQAzoECCMQJzoGCAAQBxAeOgcIIxDqAhAnOgQIABBDOgIIADoFCAAQgwE6BAgAEB46BggAEAgQHlDDE1ijvAFg1cEBaAJwAHgAgAHFAogB1xmSAQgwLjE1LjMuMZgBAKABAaoBB2d3cy13aXqwAQo&sclient=psy-ab&ved=0ahUKEwiUyILEi4jpAhXDyqQKHaR5DtIQ4dUDCAw&uact=5");
                else
                    wv.loadUrl("https://www.google.com/search?sxsrf=ALeKk02WW9HC-sasb3XTpiH3OpL1CTT79A:1587903014796&q="+a+"*x%5E2%2B"+b+"x"+c+"&spell=1&sa=X&ved=2ahUKEwj8v4nZh4bpAhUTuHEKHdKLDnYQBSgAegQIBxAq&biw=1280&bih=578");
            else
                if (c>0)
                    wv.loadUrl("https://www.google.com/search?sxsrf=ALeKk0069_JmTOT7-bp_Wb8YPO1AvzKRHQ%3A1587972789496&ei=tYqmXsDhHZC8kwXvmqagCw&q="+a+"*x%5E2%2B"+b+"*x%2B"+c+"&oq="+a+"*x%5E2%2B"+b+"*x%2B"+c+"&gs_lcp=CgZwc3ktYWIQAzoHCCMQ6gIQJ1C_rskBWKfkygFgk-bKAWgBcAB4AYABpgKIAbcEkgEDMi0ymAEMoAEBqgEHZ3dzLXdperABCg&sclient=psy-ab&ved=0ahUKEwiAkJ_Qi4jpAhUQ3qQKHW-NCbQQ4dUDCAw&uact=5");
                else
                    wv.loadUrl("https://www.google.com/search?sxsrf=ALeKk023TCnPMU0DWP3yMJww32TBeo9PYg%3A1587829239789&ei=91mkXrXZL8ODsAeu-bLoDQ&q="+a+"*x%5E2%2B"+b+"*x"+c+"&oq=-2*x%5E2%2B4*x-16&gs_lcp=CgZwc3ktYWIQAzoHCCMQ6gIQJzoCCABQ0cUEWN6nBWD2sAVoAXAAeACAAaIBiAHQD5IBBDAuMTSYAQCgAQGqAQdnd3Mtd2l6sAEK&sclient=psy-ab&ved=0ahUKEwj1sLTu9IPpAhXDAewKHa68DN0Q4dUDCAw&uact=5");

        }
    }

    public void new0(View view) {
        et1.setText("");
        et2.setText("");
        et3.setText("");
    }

    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
