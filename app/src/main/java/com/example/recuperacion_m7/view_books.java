package com.example.recuperacion_m7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class view_books extends AppCompatActivity {

    ArrayList<ArrayVi> listbooks = new ArrayList<ArrayVi>();
    RecyclerView recyclerbooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_books);

        recyclerbooks = findViewById(R.id.RecyclerId);
        addbooks();
        recyclerbooks.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        AdapterBooks adapter = new AdapterBooks(listbooks);
        recyclerbooks.setAdapter(adapter);
    }

    private void addbooks() {
        listbooks.add(new ArrayVi("Cenicienta", "5"));
    }

}
