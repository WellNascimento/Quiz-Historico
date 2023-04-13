package com.example.quizzdehistoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Tela2 extends AppCompatActivity {

    Button btnQst2;
    RadioGroup rdgIntegralista;
    RadioButton rbtIntegralista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        setTitle("Fundador do partido/movimento?");
        btnQst2 = findViewById(R.id.btnQst2);
        rdgIntegralista = findViewById(R.id.rdgIntegralista);
        rbtIntegralista = findViewById(R.id.rbtIntegralista);
    }
    public void responder(View view)
    {
        int idChecked = rdgIntegralista.getCheckedRadioButtonId();

        int pontos = getIntent().getIntExtra("pontos", 0);
        String nome = getIntent().getStringExtra("nome");

        if(idChecked == R.id.rbtIntegralista)
        {
            pontos++;
        }
        Intent it = new Intent(this, Tela3.class);
        it.putExtra("pontos", pontos);
        it.putExtra("nome", nome);
        startActivity(it);
        finish();
    }
    public void clicou(View view)
    {
        btnQst2.setEnabled(true);
    }
}