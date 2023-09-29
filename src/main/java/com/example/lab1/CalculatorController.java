package com.example.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    // Want to return type object
    @GetMapping("/calculate")
    public Object calculate(@RequestParam int num1,
                            @RequestParam int num2,
                            @RequestParam String operation){

        CalculatorFunction calculatorFunction = new CalculatorFunction(num1, num2, operation);
        int total = calculatorFunction.calculateTotal();

        // returns obj
        CalculatorReturnTotal returnTotal = new CalculatorReturnTotal(operation, total);
        return returnTotal;
    }
}
