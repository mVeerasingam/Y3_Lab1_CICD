package com.example.lab1;

// make a class to store information about what operation you'll use and to return the total
// total is a number

public class Total {

    int total;
    int num1;
    int num2;
    String operation;

    // figure out how to return a string and int in one object.

    public Total(int num1, int num2, String operation){
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }
}
