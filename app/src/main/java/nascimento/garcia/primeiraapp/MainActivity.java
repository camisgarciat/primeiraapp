package nascimento.garcia.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Constroi a interface a partir da leitura do arquivo de layout
        setContentView(R.layout.activity_main);

        //Conecta o id "btnEnviar" ao botao da interface para obte-lo
        Button btnEnviar = findViewById(R.id.btnEnviar);

        //Define o que acontece quando clica no botao
        btnEnviar.setOnClickListener(new View.OnClickListener(){
            @Override
            //O OnClick é chamado quando da o clique do botao
            public void onClick(View v) {
                //Recebe o texto que o usuario digitou (obtem campo de texto)
                EditText etDigiteAqui= findViewById(R.id.etDigiteAqui);
                //Transforma em String
                String textoDigitado = etDigiteAqui.getText().toString();
                //Cria uma intencao que navega de uma tela para outra
                Intent i = new Intent(MainActivity.this,NextActivity.class);
                //Coloca o texto dentro da intencao pra enviar para proxima tela
                i.putExtra("texto", textoDigitado);
                //executa a intencao e navegua para proxima tela
                startActivity(i);


            }
        });
    }
}