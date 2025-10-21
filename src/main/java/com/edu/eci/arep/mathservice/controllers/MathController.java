package com.edu.eci.arep.mathservice.controllers;


import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.*;

@RestController
public class MathController {

    @GetMapping("/factors")
    public String factors(@RequestParam Integer value) {
        String operacion = "factors";
        ArrayList factores = new ArrayList();
        for(int i = 1; i <= value/2; i++){
            if (value % i == 0){
                factores.add(i);
            }
        }
        factores.add(value);
        return "{operacion:" + operacion + ", input : " + value + "output :" + factores +"}";
    }

    @GetMapping("/primes")
    public String primes(@RequestParam Integer value){
        String operacion = "primos";
        ArrayList primos = new ArrayList();

        for (int i = 1; i <= value;i++ ){
            ArrayList factores = new ArrayList();
            for(int j = 1; j <= value/2; j++){
                if (value % j == 0){
                    factores.add(j);
                }
            }
            if (factores.size() == 2){
                primos.add(value);
            }
        }

        return "{operacion:" + operacion + ", input : " + value + " output :" + primos +"}";
    }
}
