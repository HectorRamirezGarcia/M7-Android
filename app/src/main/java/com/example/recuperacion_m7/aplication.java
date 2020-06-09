package com.example.recuperacion_m7;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class aplication extends AppCompatActivity {
    public ArrayList<String> listname = new ArrayList<>();
    public ArrayList<String> listvaloration = new ArrayList<>();
    int comprobante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplication);

        Intent intent = getIntent();
        listname = intent.getStringArrayListExtra("listname");
        listvaloration = intent.getStringArrayListExtra("listvaloration");
        comprobante = intent.getIntExtra("comprobante", comprobante);
    }

    public void addbooks(View view) {
        Intent intent = new Intent(this, AddBook.class);
        startActivity(intent);
    }

    public void listbooks(View view) {
        Intent intent = new Intent(this, view_books.class);
        intent.putExtra("listname", listname);
        intent.putExtra("listvaloration", listvaloration);
        intent.putExtra("comprobante", comprobante);
        startActivity(intent);
    }
    public void removebooks(View view) {
        for (int i = 0; i < listname.size(); i++){
            listname.remove(i);
            listvaloration.remove(i);
        }
        Toast.makeText(getApplicationContext(), "Se han borrado los libros que tu añadiste ", Toast.LENGTH_SHORT).show();
    }
    public void help(View view) {
        Intent intent = new Intent(this, Help.class);
        startActivity(intent);
    }

}
