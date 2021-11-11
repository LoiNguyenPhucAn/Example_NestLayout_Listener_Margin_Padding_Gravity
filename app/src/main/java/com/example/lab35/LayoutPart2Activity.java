package com.example.lab35;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LayoutPart2Activity extends AppCompatActivity {

    Button leftButton, rightButton;
    String buttonText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_part_2);
        leftButton = findViewById(R.id.btnLeft);
        rightButton =findViewById(R.id.btnRight);
        buttonText = getString(R.string.btn_not_pressed_lbl);

        leftButton.setOnClickListener(this::buttonClick);
        rightButton.setOnClickListener(this::buttonClick);

    }
    //code for part 2
    public void buttonClick(View view){

        if(view.getId() == R.id.btnLeft){
            rightButton.setText(buttonText);
            leftButton.setText("");
        }
        else{
            leftButton.setText(buttonText);
            rightButton.setText("");
        }
    }
}