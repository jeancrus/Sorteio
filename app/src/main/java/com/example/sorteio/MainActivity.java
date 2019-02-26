package com.example.sorteio;

import android.support.v7.app.AppCompatActivity;
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

    public void numSelect(View view) {

        TextView texto = findViewById(R.id.texto2);

        int numSort = new Random().nextInt(11);
        if (numSort == 0) {
            numSort = new Random().nextInt(11);
        }

        texto.setText("O número sorteado é: " + numSort);
    }
}
