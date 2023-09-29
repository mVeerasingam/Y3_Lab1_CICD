package ie.atu.lab1;

// make a class to store information about what operation you'll use and to return the total
// this code returns an int(total) and string(operation)
// ref: https://stackoverflow.com/questions/10328604/return-a-string-and-int

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
