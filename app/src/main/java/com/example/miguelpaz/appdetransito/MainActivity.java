package com.example.miguelpaz.appdetransito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callregistro(View view){
        Intent i= new Intent(this, Registro.class);
        startActivity(i);
    }

    public void calldenuncias(View view){
        Intent i= new Intent(this, Denuncias.class);
        startActivity(i);
    }

    public void callleyes(View view){
        Intent i= new Intent(this, Leyes.class);
        startActivity(i);
    }

    public void callmenu(View view){
        Intent i= new Intent(this, Menu.class);
        startActivity(i);
    }
}
