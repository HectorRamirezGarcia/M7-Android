package com.example.recuperacion_m7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class view_books extends AppCompatActivity {

    public ArrayList<ArrayVi> listbooks = new ArrayList<ArrayVi>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //añado la lista de libros a la arraylist
        addbooks();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list_books);

        //obtengo la referencia de recyclerbooks
        RecyclerView recyclerbooks = findViewById(R.id.RecyclerId);

        //establece un LinearLayoutManager con orientacion vertical predeterminada
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerbooks.setLayoutManager(linearLayoutManager);

        //envio los elementos de la arraylist a el adapter
        AdapterBooks adapter = new AdapterBooks(listbooks);
        recyclerbooks.setAdapter(adapter);
    }


    //metodo que añade elementos a la array
    private void addbooks() {
        listbooks.add(new ArrayVi("Cenicienta", "5"));
    }

}
