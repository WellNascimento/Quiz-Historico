package com.example.quizzdehistoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnIniciar, btnSair;
    EditText edtNome;
    private int pontos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciar = findViewById(R.id.btnIniciar);
        btnSair = findViewById(R.id.btnSair);

        edtNome = findViewById(R.id.edtNome);
        edtNome.addTextChangedListener(edtNomeTextWatcher);

    }
    private TextWatcher edtNomeTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            btnIniciar.setEnabled(false);
            String nome = edtNome.getText().toString().trim();
            btnIniciar.setEnabled(!nome.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
    public void iniciar(View view)
    {
        Intent it = new Intent(this, Tela1.class);
        it.putExtra("nome", edtNome.getText().toString());
        it.putExtra("pontos", pontos);
        startActivity(it);
    }
    public void sair(View view)
    {
        finish();
    }
}