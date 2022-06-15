package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class CalculatorController {

    private Calculator calc = new Calculator();

    @RequestMapping("/div")
    public int div (@RequestParam int a, @RequestParam int b) {
        try {
            return calc.div(a,b);
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping("mult")
    public int mult(@RequestParam int a, @RequestParam int b) {
        return calc.mult(a,b);
    }

    @RequestMapping("add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return calc.add(a,b);
    }

    @RequestMapping("sub")
    public int sub(@RequestParam int a, @RequestParam int b) {
        return calc.sub(a,b);
    }
}
