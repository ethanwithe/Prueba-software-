package com.example.myapplication;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleUnitTest {

    Funciones funciones = new Funciones();

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testSumar() {
        assertEquals(5, funciones.sumar(2, 3));
        assertEquals(-5, funciones.sumar(-2, -3));
        assertEquals(1, funciones.sumar(3, -2));
        assertEquals(0, funciones.sumar(0, 0));
        assertEquals(100, funciones.sumar(50, 50));
    }

    @Test
    public void testRestar() {
        assertEquals(1, funciones.restar(3, 2));
        assertEquals(1, funciones.restar(-2, -3));
        assertEquals(5, funciones.restar(3, -2));
        assertEquals(0, funciones.restar(0, 0));
        assertEquals(1000, funciones.restar(2000, 1000));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, funciones.multiplicar(2, 3));
        assertEquals(6, funciones.multiplicar(-2, -3));
        assertEquals(-6, funciones.multiplicar(-2, 3));
        assertEquals(0, funciones.multiplicar(0, 3));
        assertEquals(1000000, funciones.multiplicar(1000, 1000));
    }

    @Test
    public void testDividir() {
        assertEquals(2, funciones.dividir(6, 3));
        assertEquals(2, funciones.dividir(-6, -3));
        assertEquals(-2, funciones.dividir(6, -3));
        try {
            funciones.dividir(6, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Test passed
        }
        assertEquals(0, funciones.dividir(0, 3));
        assertEquals(1000, funciones.dividir(1000000, 1000));
    }

    @Test
    public void testEsPar() {
        assertTrue(funciones.esPar(4));
        assertFalse(funciones.esPar(3));
        assertTrue(funciones.esPar(0));
    }

    @Test
    public void testCalcularAreaTriangulo() {
        assertEquals(6.0, funciones.calcularAreaTriangulo(3.0, 4.0), 0.0);
        try {
            funciones.calcularAreaTriangulo(-3.0, 4.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Test passed
        }
        try {
            funciones.calcularAreaTriangulo(3.0, -4.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Test passed
        }
        assertEquals(0.0, funciones.calcularAreaTriangulo(0.0, 4.0), 0.0);
        assertEquals(0.0, funciones.calcularAreaTriangulo(3.0, 0.0), 0.0);
        assertEquals(500000.0, funciones.calcularAreaTriangulo(1000.0, 1000.0), 0.0);
    }
}
