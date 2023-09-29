package com.example.lab1;

// make a class to store information about what operation you'll use and to return the total
// total is a number

public class CalculatorFunction {
    int num1;
    int num2;
    String operation;

    // constructor
    public CalculatorFunction(int num1, int num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public int calculateTotal(){
        int total = 0;

        switch (operation) {
            case "add":
                total = num1 + num2;
                break;
            case "subtract":
                total = num1 - num2;
                break;
            case "multiply":
                total = num1 * num2;
                break;
            case "divide":
                total = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation: " + operation);
        }

        return total;
    }
}
