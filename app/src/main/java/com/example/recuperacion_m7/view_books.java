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
    String[] listname = new String[10];
    String[] listvaloration = new String[10];
    int i = 0;


    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                listname = data.getStringArrayExtra("listname");
                listvaloration = data.getStringArrayExtra("listvaloration");
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //añado la lista de libros a la arraylist
        addbooks(listname, listvaloration);

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
    private void addbooks(String []listname, String [] listvaloration) {
        while (i != listname.length) {
            listbooks.add(new ArrayVi(listname[i], listvaloration[i]));
            i++;
        }

    }

}
