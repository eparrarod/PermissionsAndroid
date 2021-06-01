package com.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;



public class MainActivity extends AppCompatActivity {

    EditText mUrl;
    ImageButton mGoButton;
    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUrl = findViewById(R.id.URLinputField);
        mGoButton = findViewById(R.id.goButton);

        // if we remove this, then the system will open URLs in the default browser
        // instead of our WebView


        mGoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // This will not load if the proper permissions are not set
                // in the Android Manifest file. Take a loot at the XML behind
                // the manifest file

            }
        });
    }
}
