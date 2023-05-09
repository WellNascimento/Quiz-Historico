package com.example.quizzdehistoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Tela5 extends AppCompatActivity {

    Button btnQst5;
    RadioGroup rdgFonseca;
    RadioButton rbtFonseca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);

        setTitle("Responsável pelo golpe a monarquia.");
        btnQst5 = findViewById(R.id.btnQst5);
        rdgFonseca = findViewById(R.id.rdgFonseca);
        rbtFonseca = findViewById(R.id.rbtFonseca);
    }
    public void responder(View view)
    {
        int idChecked = rdgFonseca.getCheckedRadioButtonId();

        int pontos = getIntent().getIntExtra("pontos", 0);
        String nome = getIntent().getStringExtra("nome");

        if (idChecked == R.id.rbtFonseca)
        {
            pontos++;
        }
        Intent it = new Intent(this, Tela6.class);
        it.putExtra("nome", nome);
        it.putExtra("pontos", pontos);
        startActivity(it);
        finish();
    }
    public void clicou(View view)
    {
        btnQst5.setEnabled(true);
    }
}