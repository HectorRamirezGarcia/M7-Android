package com.example.recuperacion_m7;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class aplication extends AppCompatActivity {

    String[] listname;
    String[] listvaloration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplication);

        Intent intent = getIntent();
        listname = intent.getStringArrayExtra("listname");
        listvaloration = intent.getStringArrayExtra("listvaloration");
    }

    public void addbooks(View view) {
        Intent intent = new Intent(this, AddBook.class);
        startActivity(intent);
    }

    public void listbooks(View view) {
        Intent intent = new Intent(this, view_books.class);
        intent.putExtra("listname", listname);
        intent.putExtra("listvaloration", listvaloration);
        startActivity(intent);
    }
}
