package com.example.recuperacion_m7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class aplication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplication);
    }

    public void listbooks (View view){
        Intent intent = new Intent(this, view_books.class);
        startActivity(intent);
    }
}
