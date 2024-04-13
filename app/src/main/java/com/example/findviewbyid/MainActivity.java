package com.example.findviewbyid;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText texto; /* criando um edittext*/
    Button button; /* criando um botao*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* procurando o endereço do botao e do edittext*/
        texto = (EditText) findViewById(R.id.texto);
        button = (Button) findViewById(R.id.button);

        /*criando o evento de click*/
        button.setOnClickListener(this);


    }

    /* oque acontece no evento de click*/
    @Override
    public void onClick(View view) {

        /*Mensagem que vai ser escrita pelo usuario*/
         String mensagem = texto.getText().toString();

         /* criando um toast*/
         Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
    }
}