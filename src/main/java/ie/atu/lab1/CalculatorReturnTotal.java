package ie.atu.lab1;

// Note: if the return type from an endpoint is an object, the response is automatically converted to
//JSON format by Spring Boot's built-in support for content negotiation and serialization

// make a class to store information about what operation you'll use and to return the total
// this code returns an int(total) and string(operation)
// ref: https://stackoverflow.com/questions/10328604/return-a-string-and-int

public class CalculatorReturnTotal extends CalculatorFunction{
    //constructor
    public CalculatorReturnTotal(String operation, int total) {
        super(operation, total);
        this.operation = operation;
        this.total = total;
    }

    // getters and setters
    public String getOperation() {return operation;}
    public int getTotal() {return total;}
}
