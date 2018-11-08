package com.example.tecinfo.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.tecinfo.calculadora.ActivityC;
import com.example.tecinfo.calculadora.MainActivity;
import com.example.tecinfo.calculadora.R;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        final EditText l_datanasc = findViewById(R.id.l_datanasc);
        final EditText l_formacao = findViewById(R.id.l_formacao);
        final Button salvar = findViewById(R.id.bt_salvar);


        l_datanasc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityB.this,ActivityB.class);
                intent.putExtra("data_nasc", l_datanasc.getText().toString());
                startActivity(intent);
                finish();
            }
        });

        l_formacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityB.this,ActivityB.class);
                intent.putExtra("formacao", l_formacao.getText().toString());
                startActivity(intent);
                finish();
            }
        });

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityB.this,ActivityC.class);
                intent.putExtra("salvar", salvar.getText().toString());
                startActivity(intent);
                finish();
            }
        });

    }
}