package com.example.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Notes:   JDK is Java 19
//          Gradle JVM was updated to Java 19

@RestController
public class CalculatorController {
    // Want to return type object
    @GetMapping("/calculate")
    public Object calculate(@RequestParam int num1,
                            @RequestParam int num2,
                            @RequestParam String operation){

        // Create CalculatorFunction object, this performs the calculation
        CalculatorFunction calculatorFunction = new CalculatorFunction(num1, num2, operation);
        int total = calculatorFunction.calculate(); // calculates num1 and num2 by desired operator

        // creates an object to return the string(operator) & int(total)
        CalculatorReturnTotal returnTotal = new CalculatorReturnTotal(operation, total);
        return returnTotal;
    }
}
