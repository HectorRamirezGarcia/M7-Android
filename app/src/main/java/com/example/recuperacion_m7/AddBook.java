package com.example.recuperacion_m7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class AddBook extends AppCompatActivity {

    public ArrayList<String> listname = new ArrayList<>();
    public ArrayList<String> listvaloration = new ArrayList<>();

    int contador = 0, comprobante = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);

        Button buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String namebook = ((EditText) findViewById(R.id.NameBook)).getText().toString();
                String valoration = ((EditText) findViewById(R.id.Valoration)).getText().toString();
                listname.add(namebook);
                listvaloration.add(valoration);
                contador++;
                comprobante++;
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, aplication.class);
        intent.putExtra("listname", listname);
        intent.putExtra("listvaloration", listvaloration);
        intent.putExtra("comprobante", comprobante);
        startActivity(intent);
    }

}
