package ie.atu.lab1;

// this class performs the calculation based on a switch from the desired operator i.e. add or divide

public class CalculatorFunction {
    private int num1;
    private int num2;
    String operation;
    int total;

    // constructor
    public CalculatorFunction(int num1, int num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    // this constructor is for when returning an object in @CalculatorReturnTotal
    public CalculatorFunction(String operation, int total) {
        this.operation = operation;
        this.total = total;
    }

    //calculator method
    public int calculate(){
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
