package com.example.demo;

public class Calculator {


    public int div(int a, int b) {
        if (a == 0 || b == 0) {
            throw new ArithmeticException("Dividing by zero is forbidden");
        }
        else return a/b;
    }

    public int mult(int a, int b) {
        return a*b;
    }

    public int add(int a, int b) {
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }
}
