package com.example.quizzdehistoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Tela3 extends AppCompatActivity {

    Button btnQst3;
    RadioGroup rdgLenin;
    RadioButton rbtRussa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        setTitle("Liderou qual revolução?");
        btnQst3 = findViewById(R.id.btnQst3);
        rdgLenin = findViewById(R.id.rdgLenin);
        rbtRussa = findViewById(R.id.rbtRussa);
    }
    public void responder(View view)
    {
        int idChecked = rdgLenin.getCheckedRadioButtonId();

        int pontos = getIntent().getIntExtra("pontos", 0);
        String nome = getIntent().getStringExtra("nome");

        if(idChecked == R.id.rbtRussa)
        {
            pontos++;
        }
        Intent it = new Intent(this, Tela4.class);
        it.putExtra("nome", nome);
        it.putExtra("pontos", pontos);
        startActivity(it);
        finish();
    }
    public void clicou(View view)
    {
        btnQst3.setEnabled(true);
    }
}