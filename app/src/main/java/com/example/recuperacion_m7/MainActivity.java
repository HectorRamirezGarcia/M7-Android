package com.example.recuperacion_m7;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public String[] ArrayUserNames = new String[20];
    public String[] ArrayPasswords = new String[20];
    public String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayUserNames[0] = "admin";
        ArrayPasswords[0] = "admin";


        Button buttonlogin = (Button) findViewById(R.id.buttonLogin);
        buttonlogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String username = ((EditText) findViewById(R.id.NameUserLogin)).getText().toString();
                String password = ((EditText) findViewById(R.id.PasswordLogin)).getText().toString();
                for (int i = 0; i < ArrayUserNames.length; i++){
                    if (username.equals(ArrayUserNames[i])&& password.equals(ArrayPasswords[i])){
                        Toast.makeText(getApplicationContext(), "El usuario introducido y contraseña son correctos", Toast.LENGTH_SHORT).show();
                        logintrue(view);
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "El usuario introducido o contraseña son incorrectos", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }

    public void logintrue (View view){
        Intent intent = new Intent(this, aplication.class);
        startActivity(intent);
    }

    public void urlFaceboock(View view){
        Intent intent;
        intent = new Intent(this, url_view.class);
        url = "https://facebook.com/";
        String valor = url;
        intent.putExtra("valor", valor);
        startActivity(intent);

    }

    public void urlTwitter(View view){
        Intent intent;
        intent = new Intent(this, url_view.class);
        url = "https://twitter.com/";
        String valor = url;
        intent.putExtra("valor", valor);
        startActivity(intent);

    }

    public void urlYoutube(View view){
        Intent intent;
        intent = new Intent(this, url_view.class);
        url = "https://youtube.com/";
        String valor = url;
        intent.putExtra("valor", valor);
        startActivity(intent);

    }

    public void urlInstagram(View view){
        Intent intent;
        intent = new Intent(this, url_view.class);
        url = "https://instagram.com/";
        String valor = url;
        intent.putExtra("valor", valor);
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
