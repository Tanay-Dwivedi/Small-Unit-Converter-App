package com.example.myfirstestapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView foot;
    private TextView yard;
    private TextView mile;
    private EditText enter;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        foot = findViewById(R.id.foot);
        yard = findViewById(R.id.yard);
        mile = findViewById(R.id.mile);
        enter = findViewById(R.id.enter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "SUCCESS", Toast.LENGTH_SHORT).show();
                String F = enter.getText().toString();
                double f = Double.parseDouble(F);
                double fv = f * 3.28084;
                double y = Double.parseDouble(F);
                double yv = f * 1.09361;
                double m = Double.parseDouble(F);
                double mv = f * 0.000621371;
                foot.setText("The value in foot is "+ fv);
                yard.setText("The value in yard is "+ yv);
                mile.setText("The value in mile is "+ mv);
            }
        });
    }
}