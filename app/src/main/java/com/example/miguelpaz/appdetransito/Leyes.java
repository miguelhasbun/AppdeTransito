package com.example.miguelpaz.appdetransito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Leyes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leyes);
    }

    public void callhead(View view){
        Toast.makeText(this, "Ley encontrada", Toast.LENGTH_SHORT).show();
        Intent i= new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
