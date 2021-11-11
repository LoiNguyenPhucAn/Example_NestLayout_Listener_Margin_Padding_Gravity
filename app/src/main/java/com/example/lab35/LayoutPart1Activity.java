package com.example.lab35;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LayoutPart1Activity extends AppCompatActivity {

    Button btnTransferLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_part_1);

        btnTransferLayout =findViewById(R.id.bntTransLayout2);
        btnTransferLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LayoutPart1Activity.this,LayoutPart2Activity.class));
            }
        });
    }
}