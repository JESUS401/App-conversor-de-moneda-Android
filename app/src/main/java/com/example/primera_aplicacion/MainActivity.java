package com.example.primera_aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.view.TextureView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText insertar_num_1;
    private TextView resultado1;

    private EditText insertar_num_2;
    private TextView resultado2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insertar_num_1 = (EditText)findViewById(R.id.insertar_num_1);
        resultado1 = (TextView)findViewById(R.id.Resultado);
        insertar_num_2 = (EditText)findViewById(R.id.insertar_num_2);
        resultado2 = (TextView)findViewById(R.id.Resultado2);

    }

    public void Dolar(View nombre1){
        String numero1 = insertar_num_1.getText().toString();
        double numero = Integer.parseInt(numero1);
        double resultado = numero / 22.33;
        String mostrar_resultado = String.valueOf(resultado);
        resultado1.setText(mostrar_resultado);
    }

    public void Libra(View nombre2){
        String numero1 = insertar_num_1.getText().toString();
        double numero = Integer.parseInt(numero1);
        double resultado = numero / 27.92;
        String mostrar_resultado = String.valueOf(resultado);
        resultado1.setText(mostrar_resultado);
    }


    public void Euro(View nombre3){
        String numero1 = insertar_num_1.getText().toString();
        double numero = Integer.parseInt(numero1);
        double resultado = numero / 25.05;
        String mostrar_resultado = String.valueOf(resultado);
        resultado1.setText(mostrar_resultado);
    }



    // Aquí inicia la conversión de las monedas extranjeras a pesos mexicanos
    public void Dolar2(View nombre4){
        String numero2 = insertar_num_2.getText().toString();
        double numero = Integer.parseInt(numero2);
        double resultado = 22.33 * numero;
        String mostrar_resultado_2 = String.valueOf(resultado);
        resultado2.setText(mostrar_resultado_2);
    }

    public void Libra2(View nombre5){
        String numero2 = insertar_num_2.getText().toString();
        double numero = Integer.parseInt(numero2);
        double resultado = 28.21 * numero ;
        String mostrar_resultado_2 = String.valueOf(resultado);
        resultado2.setText(mostrar_resultado_2);

    }

    public void Euro2(View nombre6){
        String numero2 = insertar_num_2.getText().toString();
        double numero = Integer.parseInt(numero2);
        double resultado = numero *  25.46  ;
        String mostrar_resultado_2 = String.valueOf(resultado);
        resultado2.setText(mostrar_resultado_2);

    }

    public void ventanaEmergente(View nombre7){
        Toast.makeText(this, "Desarrollado por Jesús Bastida Ramírez, ", Toast.LENGTH_LONG).show();
    }








}