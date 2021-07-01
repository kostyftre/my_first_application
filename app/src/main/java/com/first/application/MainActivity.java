package com.first.application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setNewText();
        changeColor();
        setHeartImageToImageView();
    }
    
    public void initViews(){
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);--
    }
    
    public void setNewText(){
        textView.setText("Пиво");
    }
    
    public void changeColor(){
        int colorRes = R.color.teal_700;
        int color = ContextCompat.getColor(getApplicationContext(),colorRes);
        textView.setTextColor(color);
    }

    public void setHeartImageToImageView(){
//        int imageRes= R.drawable.ic_baseline_favorite_24;
//        Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), imageRes);
        imageView.setImageResource(R.drawable.ic_baseline_favorite_24);
    }


}