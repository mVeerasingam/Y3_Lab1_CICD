package ie.atu.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello, World";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Hello, " + name;
    }

    @GetMapping("/details")
    public String greetByName(@RequestParam String name,
                              @RequestParam int age) {
        return "Welcome, " + name + " Your age is " + age;
    }
}