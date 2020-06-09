package com.example.recuperacion_m7;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class view_books extends AppCompatActivity {

    public ArrayList<ArrayVi> listbooks = new ArrayList<ArrayVi>();
    public ArrayList<String> listname = new ArrayList<>();
    public ArrayList<String> listvaloration = new ArrayList<>();
    int i = 0;
    int comprobante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent = getIntent();
        listname = intent.getStringArrayListExtra("listname");
        listvaloration = intent.getStringArrayListExtra("listvaloration");
        comprobante = intent.getIntExtra("comprobante", comprobante);

        //añado la lista de libros a la arraylist
        addbooks(listname, listvaloration, comprobante);

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
    private void addbooks(ArrayList<String> listname, ArrayList<String> listvaloration, int  comprobante) {
        if (comprobante >= 1) {
            while (i != listname.size() || i != listname.size()) {
                listbooks.add(new ArrayVi(listname.get(i), "Valoracion = "+listvaloration.get(i)));
                i++;
            }
        }
    }

}
