package com.example.quizzdehistoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Tela4 extends AppCompatActivity {

    Button btnQst4;
    RadioGroup rdgHitler;
    RadioButton rbtAustria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);

        setTitle("Qual a nacionalidade de Hitler?");

        btnQst4 = findViewById(R.id.btnQst4);
        rdgHitler = findViewById(R.id.rdgHitler);
        rbtAustria = findViewById(R.id.rbtAustria);

    }
    public void responder(View view)
    {
        int idChecked = rdgHitler.getCheckedRadioButtonId();

        int pontos = getIntent().getIntExtra("pontos", 0);
        String nome = getIntent().getStringExtra("nome");

        if(idChecked == R.id.rbtAustria)
        {
            pontos++;
        }
        Intent it = new Intent(this, Tela5.class);
        it.putExtra("nome", nome);
        it.putExtra("pontos", pontos);
        startActivity(it);
        finish();
    }
    public void clicou(View view)
    {
        btnQst4.setEnabled(true);
    }
}