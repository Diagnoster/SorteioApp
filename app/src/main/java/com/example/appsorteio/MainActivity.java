package com.example.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void draw(View view) {
        int x = new Random().nextInt(10) + 1;
        TextView out = findViewById(R.id.output); // Classe R conhece todos os componentes de interface, layout, toda a parte de view.
        out.setText(String.valueOf(x));
    }
}