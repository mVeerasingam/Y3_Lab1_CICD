package ie.atu.lab1;

// this class performs the calculation based on a switch from the desired operator i.e. add or divide

public class CalculatorFunction {
    private int num1;
    private int num2;
    private int total;
    private String operation;

    // constructor
    public CalculatorFunction(int num1, int num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
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
