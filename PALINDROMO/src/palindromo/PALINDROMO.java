/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

import java.util.Scanner;

/**
 *23550382
 * @author saul bermudez Arzaga
 * estructura de datos
 */
public class PALINDROMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x = new Scanner(System.in);
        System.out.println("escribe una palabra para saber si es o no");
        String s = x.next();
        if(palin(s)){
            System.out.println("Es un palindromo");
        } else{
            System.out.println("no es un palindromo");
            
        }
    }

    private static boolean palin(String s) {
        s = s.toLowerCase();
        if(s.length()<=1){
            return true;
        }else{
            if(s.charAt(0)== s.charAt(s.length()-1)){
                return palin(s.substring(1,s.length()-1));
            } else{
                return false;
            }
        }
    }
    
}
