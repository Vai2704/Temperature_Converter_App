package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e;
    Button b1 , b2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e = findViewById(R.id.editTextNumber);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double p = Double.parseDouble(e.getText().toString());
                double k = ((1.8*p) +32);
                e.setText(String.format("%.2f",k));
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double p1 = Double.parseDouble(e.getText().toString());
                double k1 = ((p1 -32)*5)/9;
                e.setText(String.format("%.2f",k1));
            }
        });

    }
}