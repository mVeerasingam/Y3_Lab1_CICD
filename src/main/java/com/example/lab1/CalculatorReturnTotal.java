package com.example.lab1;

// this code returns int and string to
// ref code: https://stackoverflow.com/questions/10328604/return-a-string-and-int

public class CalculatorReturnTotal {
    private String operation;
    private int total;

    //constructor
    public CalculatorReturnTotal(String operation, int total) {
        this.operation = operation;
        this.total = total;
    }

    // getters + setters
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
