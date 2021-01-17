package com.example.proyectopmdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = findViewById(R.id.Boton_Crear_partida);

        //   boton.setOnClickListener(eventoClick);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent crear = new Intent(MainActivity.this, CrearPartida.class);
                startActivity(crear);
            }
        });



        //https://code.tutsplus.com/es/tutorials/working-with-git-in-android-studio--cms-30514

    }
}