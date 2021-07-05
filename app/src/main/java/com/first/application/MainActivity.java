package com.first.application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private ImageView imageView;
    private Button button;
    public int gg=0;

    private Button button_1;
    private TextView textView_1;
    private EditText editText;
    private CheckBox checkBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setNewText();
        changeColor();
        setHeartImageToImageView();
        setOnButtonClickListner();
        setTextFromYou();
        setOnCheckboxBehavior();


    }
    
    public void initViews(){
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button_1);
        button_1=findViewById(R.id.button_2);
        textView_1= findViewById(R.id.textView_1);
        editText= findViewById(R.id.editText);
        checkBox= findViewById(R.id.checkbox);

    }
    
    public void setNewText(){

        String appNameStr = getString(R.string.app_name);  // достаём значение этой строки

        textView.setText(R.string.new_text);
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

    private void setOnButtonClickListner(){


        button.setOnClickListener(v -> {
            String buttonClicker;

            buttonClicker = "I love beer "+gg;
            textView.setText(buttonClicker);
            gg++;

        });

    }

    private void setTextFromYou(){
        button_1.setOnClickListener(v -> {

            String string=editText.getText().toString();
            textView_1.setText(string);


        });

    }

    private void setOnCheckboxBehavior(){
        boolean isChecked = checkBox.isChecked();
//
//        checkBox.setOnCheckedChangeListener((buttonView, isChecked1) -> {
//        textView_1.setText("Молодец, что поставил галочку!");
//
//        });



        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()){
                    textView_1.setText("Молодец, что поставил галочку!");
                }
                else
                    textView_1.setText(".!.");
            }
        });

    }



}