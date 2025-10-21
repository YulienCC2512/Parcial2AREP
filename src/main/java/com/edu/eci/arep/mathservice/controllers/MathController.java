package com.edu.eci.arep.mathservice.controllers;


import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.*;

@RestController
public class MathController {

    @GetMapping("/factors")
    public ArrayList<Integer> factors(@RequestParam(value = "num") Integer num) {
        ArrayList factores = new ArrayList();
        for(int i = 1; i <= num/2; i++){
            if (num % i == 0){
                factores.add(i);
            }
        }
        factores.add(num);
        return factores;
    }

    @GetMapping("/primes")
    public List<Integer> primes(@RequestParam(value = "num")Integer num){
        ArrayList primos = new ArrayList();

        for (int i = 1; i <= num;i++ ){
            ArrayList factores = new ArrayList();
            for(int j = 1; j <= num/2; j++){
                if (num % j == 0){
                    factores.add(j);
                }
            }
            if (factores.size() == 2){
                primos.add(num);
            }
        }

        return primos;
    }
}
