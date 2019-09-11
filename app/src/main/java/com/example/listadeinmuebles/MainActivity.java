package com.example.listadeinmuebles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Inmueble> lista=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();
    }

    public void generarListView(){
        ArrayAdapter<Inmueble> adapter=new ListaInmueblesAdapter(this,R.layout.item,lista,getLayoutInflater());
        ListView lv=findViewById(R.id.milista);
        lv.setAdapter(adapter);
    }

    public void cargarDatos(){
        lista.add(new Inmueble(R.drawable.casa1,"La Punta",76000));
        lista.add(new Inmueble(R.drawable.edificio1,"El Durazno",38000));
        lista.add(new Inmueble(R.drawable.edificio2,"San Luis",78500));

    }
}
