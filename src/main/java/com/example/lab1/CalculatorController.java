package com.example.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1,
                         @RequestParam int num2,
                         @RequestParam String operation){
        int total = 0;
        String symbol = " + ";

        switch (operation) {
            case "add":
                total = num1 + num2;
                break;
            case "subtract":
                total = num1 - num2;
                symbol = " - ";
                break;
            case "multiply":
                total = num1 * num2;
                symbol = " * ";
                break;
            case "divide":
                total = num1 / num2;
                symbol = " / ";
                break;
            default:
                System.out.println("Invalid operation: " + operation);
        }
        return num1 + symbol + num2 + " = " + total;
    }
}
