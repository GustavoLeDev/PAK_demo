package com.example.ExampleSoap;

import javax.jws.WebService;

@WebService
public class Example {
    public int somme(int a, int b){return a+b; }

    public int soustraction(int a, int b){
        return a-b;
    }

    public int produit(int a, int b){
        return a*b;
    }

    public int division(int a, int b){
        return a/b;
    }
}
