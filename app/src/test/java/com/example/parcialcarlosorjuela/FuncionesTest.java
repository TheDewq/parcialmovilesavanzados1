package com.example.parcialcarlosorjuela;

import junit.framework.TestCase;

public class FuncionesTest extends TestCase {

    public void testAgregar() {
        Funciones funciones = new Funciones();
        funciones.producto1[2] = "550";
        funciones.sumar(1, 10);
        assertEquals(560,Integer.parseInt(funciones.getProducto1()));
    }

}