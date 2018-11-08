package com.example.tecinfo.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.tecinfo.calculadora.ActivityB;
import com.example.tecinfo.calculadora.MainActivity;
import com.example.tecinfo.calculadora.R;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);

        final EditText l_nome = findViewById(R.id.l_nome);
        final EditText l_senha = findViewById(R.id.l_senha);
        Button login = findViewById(R.id.bt_login);
        Button cadastro = findViewById(R.id.bt_cadastro);

        cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityA.this,ActivityB.class);
                intent.putExtra("nome", l_nome.getText().toString());
                startActivity(intent);
                finish();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityA.this,MainActivity.class);
                intent.putExtra("login", l_senha.getText().toString());
                startActivity(intent);
                finish();
            }
        });

    }
}