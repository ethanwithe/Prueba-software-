package com.example.myapplication;

public class Funciones {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Division by zero");
        return a / b;
    }

    public boolean esPar(int num) {
        return num % 2 == 0;
    }

    public double calcularAreaTriangulo(double base, double altura) {
        if (base < 0 || altura < 0) throw new IllegalArgumentException("Base and height must be non-negative");
        return (base * altura) / 2;
    }
}

