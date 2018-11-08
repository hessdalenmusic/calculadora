package com.example.tecinfo.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.tecinfo.calculadora.MainActivity;
import com.example.tecinfo.calculadora.ActivityB;
import com.example.tecinfo.calculadora.R;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        final EditText ins_dados = findViewById(R.id.l_inserirdados);
        final Button inicio = findViewById(R.id.bt_inicio);
        final Button calcular = findViewById(R.id.bt_calcular);


        ins_dados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityC.this,MainActivity.class);
                intent.putExtra("data_nasc", ins_dados.getText().toString());
                startActivity(intent);
                finish();
            }
        });

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityC.this,MainActivity.class);
                intent.putExtra("inicio", inicio.getText().toString());
                startActivity(intent);
                finish();
            }
        });

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityC.this,MainActivity.class);
                intent.putExtra("calcular", calcular.getText().toString());
                startActivity(intent);
                finish();
            }
        });

    }
}