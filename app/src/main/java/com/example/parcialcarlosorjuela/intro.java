package com.example.parcialcarlosorjuela;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;

public class intro extends AppCompatActivity {
    Funciones funciones;
    TextView Nombre;
    TextView Precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        invocar();
    }
    protected void invocar(){
        funciones = new Funciones();
    }
    public void agregar_producto1(View view){
        System.out.println("sirve 1");
        Nombre = findViewById(R.id.nombre1);
        Precio = findViewById(R.id.precio1);
        String[] lista = new String[3];
        lista[0] = (String) Nombre.getText();
        lista[1] = (String) Precio.getText();
        lista[2] = "1";
        funciones.agregar(lista, 1);
        System.out.println(funciones.getProducto1());
    }
    public void agregar_producto2(View view){
        System.out.println("sirve 2");
        Nombre = findViewById(R.id.nombre2);
        Precio = findViewById(R.id.precio2);
        String[] lista = new String[3];
        lista[0] = (String) Nombre.getText();
        lista[1] = (String) Precio.getText();
        lista[2] = "1";
        funciones.agregar(lista, 2);
        System.out.println(funciones.getProducto2());
    }
}
class Funciones{

    public String[] producto1 = new String[3];
    public String[] producto2 = new String[3];
    public void agregar(String[] producto, int x){ // 1] nombre 2] precio 3] cantidad    int x = numero de producto
        switch (x){
            case 1:
                if(producto1[1]!=null){
                    sumar(1, Integer.parseInt(producto[2]));
                }else{
                    producto1[0] = producto[0];
                    producto1[1] = producto[1];
                    producto1[2] = producto[2];
                }
                break;
            case 2:
                if(producto2[1]!=null){
                    sumar(2, Integer.parseInt(producto[2]));
                }else{
                    producto2[0] = producto[0];
                    producto2[1] = producto[1];
                    producto2[2] = producto[2];
                }
                break;
        }
    }
    public void sumar(int id, int cantidad){
        switch (id){
            case 1:
                producto1[2] = String.valueOf(Integer.parseInt(producto1[2]) + cantidad);
                break;
            case 2:
                producto2[2] = String.valueOf(Integer.parseInt(producto2[2]) + cantidad);
                break;
        }
    }

    public String getProducto1(){
        return producto1[2];
    }
    public String getProducto2(){
        return producto2[2];
    }
}