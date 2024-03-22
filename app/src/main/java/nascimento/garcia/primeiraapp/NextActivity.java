package nascimento.garcia.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        //Obtem o intent que criou esssa tela
        Intent i = getIntent();
        //Obtem o texto da tela anterior
        String texto= i.getStringExtra("texto");
        //obtem o TextView
        TextView tvTexto = findViewById(R.id.tvTexto);
        //seta o texto exibido como o texto do usuario (seta o TextView)
        tvTexto.setText(texto);
    }
}