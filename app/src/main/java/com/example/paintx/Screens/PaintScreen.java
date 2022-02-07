package com.example.paintx.Screens;

import static com.example.paintx.Screens.display.colorList;
import static com.example.paintx.Screens.display.current_brush;
import static com.example.paintx.Screens.display.pathList;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.paintx.R;


public class PaintScreen extends AppCompatActivity {

    public static Path path = new Path();
    public static Paint paint_brush = new Paint();

    private ConstraintLayout content;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint_screen);

        content = findViewById(R.id.display_content);

        content.setDrawingCacheEnabled(true);

    }

    public void pencil(View view) {
        paint_brush.setColor(Color.BLACK);
        currentColor(paint_brush.getColor());

    }

    public void redColor(View view) {
        paint_brush.setColor(Color.RED);
        currentColor(paint_brush.getColor());
    }

    public void yellowColor(View view) {
        paint_brush.setColor(Color.YELLOW);
        currentColor(paint_brush.getColor());
    }

    public void greenColor(View view) {
        paint_brush.setColor(Color.GREEN);
        currentColor(paint_brush.getColor());
    }

    public void blueColor(View view) {
        paint_brush.setColor(Color.BLUE);
        currentColor(paint_brush.getColor());
    }

    public void blackColor(View view) {
        paint_brush.setColor(Color.BLACK);
        currentColor(paint_brush.getColor());
    }

    public void eraser(View view) {
        pathList.clear();
        colorList.clear();
        path.reset();
    }


    public void currentColor(int c)
    {
        current_brush = c;
        path = new Path();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.rateUs:
                Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName());
                Intent i = new Intent(Intent.ACTION_VIEW, uri);

                try {
                    startActivity(i);
                } catch (Exception e) {

                    Toast.makeText(getApplicationContext(), "Error :" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }

                return true;

            case R.id.update:
                Uri uri2 = Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName());
                Intent i2 = new Intent(Intent.ACTION_VIEW, uri2);

                try {
                    startActivity(i2);
                } catch (Exception e) {

                    Toast.makeText(getApplicationContext(), "Error :" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }

                return true;

            case R.id.privacy:
                Toast.makeText(this, "Privacy", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.terms:
                Toast.makeText(this, "Terms", Toast.LENGTH_SHORT).show();
                return true;


            default:
                return super.onOptionsItemSelected(item);
        }

    }


}