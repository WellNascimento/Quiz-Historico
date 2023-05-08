package com.example.quizzdehistoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Tela1 extends AppCompatActivity {

    RadioGroup rdgConstitucionalista;
    RadioButton rbt1932;
    Button btnQst1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        setTitle("Ano da revolução Constitucionalista.");
        rdgConstitucionalista = findViewById(R.id.rdgConstitucionalista);
        rbt1932 = findViewById(R.id.rbt1932);
        btnQst1 = findViewById(R.id.btnQst1);

    }
    public void responder(View view)
    {
        int idChecked = rdgConstitucionalista.getCheckedRadioButtonId();

        int pontos = getIntent().getIntExtra("pontos", 0);
        String nome = getIntent().getStringExtra("nome");

        if(idChecked == R.id.rbt1932)
        {
            pontos++;
        }
        Intent it = new Intent(this, Tela2.class);
        it.putExtra("nome", nome);
        it.putExtra("pontos", pontos);
        startActivity(it);
        finish();
    }
    public void clicou(View view)
    {
        btnQst1.setEnabled(true);
    }
}