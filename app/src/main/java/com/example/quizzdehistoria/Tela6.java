package com.example.quizzdehistoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Tela6 extends AppCompatActivity {
    Button btnQst6;

    RadioGroup rdgGama;

    RadioButton rbtGama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela6);

        btnQst6 = findViewById(R.id.btnQst6);
        rdgGama = findViewById(R.id.rdgGama);
        rbtGama = findViewById(R.id.rbtGama);

    }
    public void responder (View view) {
        int idChecked = rdgGama.getCheckedRadioButtonId();

        int pontos = getIntent().getIntExtra("pontos", 0);
        String nome = getIntent().getStringExtra("nome");

        if(idChecked == R.id.rbtGama)
        {
            pontos++;
        }
        Intent it = new Intent(this, Tela7.class);
        it.putExtra("pontos", pontos);
        it.putExtra("nome", nome);
        startActivity(it);
        finish();
    }
    public void clicou(View view)
    {
        btnQst6.setEnabled(true);
    }
}
