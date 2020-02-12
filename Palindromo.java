/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebatecnica;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Palindromo {
    public static void main(String[] args) {
        String cadena;
        int longitud;
        
        Scanner lector= new Scanner(System.in);
        System.out.println("Ingrese la palabra a verificar");
        cadena= lector.nextLine();
        longitud=cadena.length();
        verificarPalin(cadena, longitud);     
    }
    
    public static void verificarPalin(String palabra, int largo){
        char[] caracteres;
        caracteres= new char[largo];
        caracteres=palabra.toCharArray();
        int i, esPal, ult, sim;
        ult= largo-1;
        esPal=0;
        
        if(largo%2!=0){
            sim= ult/2;
            esPal=1;
            for(i=0; i<sim; i++ ){
                System.out.println("anilina"
                        + "["+i+"]  ["+ult+"]");
                System.out.println("  "+caracteres[i]+"   "+caracteres[ult]);
                if(caracteres[i]!=caracteres[ult]){
                    esPal=0;
                }
                ult--;
            }
            System.out.println("Simetría: "+caracteres[sim]);
        }else{
            System.out.println("Palabras pares no suelen ser Palindromos");
        }
        if(esPal==1){
            System.out.println("La Palabra "+palabra+" es Palíndromo "+largo);
        }else{
            System.out.println("La Palabra "+palabra+" NO es Palíndromo "+largo);
        }
    }
    
}
