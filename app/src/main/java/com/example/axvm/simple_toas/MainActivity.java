package com.example.axvm.simple_toas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    private EditText texto;
    private int num;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init(){
        texto = (EditText) findViewById(R.id.Text);
        boton = (Button) findViewById(R.id.Conf);
        num = (int)(Math.random()*100001);
        String cadena = String.valueOf(num);
        Toast noti = Toast.makeText(this,cadena,Toast.LENGTH_LONG);
        noti.show();
    }

    public void controla(View view){
        String nume = texto.getText().toString();
        int numero = Integer.parseInt(nume);
        if (numero == num){
            Toast notifica = Toast.makeText(this,"Exelente",Toast.LENGTH_LONG);
            notifica.show();
        }else{
            Toast notifica = Toast.makeText(this,"Vuelve a intentarlo",Toast.LENGTH_LONG);
            notifica.show();
        }


    }
}
