package com.sharkBytesLab.paintx.Screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import com.sharkBytesLab.paintx.R;

public class PolicyScreen extends AppCompatActivity {

    private WebView policy_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policy_screen);

        policy_view = findViewById(R.id.policy_view);

        try {

            policy_view.getSettings().setJavaScriptEnabled(true);
            policy_view.loadUrl("file:///android_asset/policy.html");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(PolicyScreen.this, PaintScreen.class));
        finish();
    }
}