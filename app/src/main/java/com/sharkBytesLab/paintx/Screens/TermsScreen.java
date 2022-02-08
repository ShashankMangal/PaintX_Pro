package com.sharkBytesLab.paintx.Screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import com.sharkBytesLab.paintx.R;

public class TermsScreen extends AppCompatActivity {

    private WebView terms_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_screen);
        terms_view = findViewById(R.id.terms_view);

        try {

            terms_view.getSettings().setJavaScriptEnabled(true);
            terms_view.loadUrl("file:///android_asset/terms.html");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(TermsScreen.this, PaintScreen.class));
        finish();
    }
}