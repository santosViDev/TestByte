/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebatecnica;

/**
 *
 * @author Usuario
 */
public class Primos {
    public static void main(String[] args) {
        int[] primos;
        primos = new int[10];
        int i, j, vector, bandera, noEsPrimo;
        
        i=0;
        j=0;
        vector=0;
        bandera=0;
        
        //puesto que ya sabemos de entrada que 2 y 3 son primos, los almacenamos en el vector Primos
        primos[vector]=2;
        vector++;
        primos[vector]=3;
        vector++;
                
        // bandera controla que el arreglo no esté lleno. si está lleno, ya están los diez
        while(bandera==0){
            
            /*El for externo controla cada número, del 4 en adelante, porque ya guardamos 2 y 3,
            mientras que el interno controla la división desde el 1 al i, para saber si es primo
            */
            for (i=4; i<30; i++){
                noEsPrimo=0;
                for (j=2; j<=i; j++){
                    if((i%j)==0){
                        if (j!=i){
                            if (noEsPrimo==0){
                                System.out.println(i+" no es primo");
                                noEsPrimo=1;
                            } 
                        }else{
                            if(noEsPrimo==0){
                                primos[vector]= i; //El número es primo
                                System.out.println(" "+i+" SÍ ES PRIMO");
                                if (vector==9){
                                    bandera=1;
                                }else{
                                    vector++;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        System.out.println("PRIMEROS DIEZ PRIMOS");
        System.out.println("--------------------");
        System.out.println("\n");
        
        for(i=0; i<10; i++){
            System.out.println(" "+primos[i]);
        }
    }
}
