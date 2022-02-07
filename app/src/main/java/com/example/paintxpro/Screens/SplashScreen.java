package com.example.paintxpro.Screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.paintxpro.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();


        Thread thread = new Thread(){
            public void run(){

                try{
                    sleep(2000);

                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally
                {

                        Intent intent = new Intent(SplashScreen.this, PaintScreen.class);
                        startActivity(intent);

                }
            }
        };
        thread.start();
    }
}