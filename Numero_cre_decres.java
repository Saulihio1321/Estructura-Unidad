/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numero_cre_decres;

import java.util.Scanner;

/**
* 25550382
     * saul bermudez arzaga
     * estructura de datos
 */
public class Numero_cre_decres {

    /**
     * @param args     
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x = new Scanner(System.in);
        System.out.println("introdusca un numero pa ver si esta creciente o decreciente");
        int n = x.nextInt();
        //saber si esta en orden creciente o decreciente
        if (ordenadoCrec(n)){
            System.out.println("no esta ordenado en aumento");
        }else {
            System.out.println("esta ordenado en aumento");
        }
        if (ordenadoDec(n)){
            System.out.println("no esta ordenado decreciente");
        }else {
            System.out.println("esta ordenado decreciente");
        }
    }

    private static boolean ordenadoCrec(int n) {
       //ejemplo 1234 -> true
        if(n<10){
            return true;
        }else{
            int numIzq = n / potencia(10, digitos(n)-1);
            n = n - numIzq * potencia(10, digitos(n)-1);
            int numDer = n / potencia(10, digitos(n)-1);
            if (numIzq<=numDer){
                return ordenadoCrec(n);
            }else{
                return false;
            }
        }
    }
    
    
    

    private static boolean ordenadoDec(int n) {
        //ejemplo 4321 -> true
        if(n<10){
            return true;
        }else{
            int numIzq = n / potencia(10, digitos(n)-1);
            n = n - numIzq * potencia(10, digitos(n)-1);
            int numDer = n / potencia(10, digitos(n)-1);
            if (numIzq>=numDer){
                return ordenadoDec(n);
            }else{
                return false;
            }
        }
    }
    private static int potencia( int base, int exp){
        if(exp==0){
            return 1;
            
        }else if (exp == 1){
            return base;
           
        }else {
            return base + potencia( base, exp-1);
        }
    }

    private static int digitos(int n) {
        if ( n==0 ) {
            return 0 ;
            
        }else {
            return 1 + digitos(n/10);
        }
    }
    
}
