/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trirec;

/**
* 23550382
 * @author saul Bermudez Arzaga
 * Estructura de datos
 */
public class TRIREC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
        //1 es cresciente y 2 es decreciente
        int tipo = 1;
        if (tipo == 1 ){
            triangulo1(n);
        }else{
            triangulo2(n);
            
        }
    }

    private static void triangulo1(int n) {
        if(n>0){
            triangulo1(n-1);
            triang(n);
        }
    }

    private static void triangulo2(int n) {
       if(n>0){
           triang(n);
           triangulo2(n-1);
           
       }
    }

    private static void triang(int n) {
        if(n>0){
            System.out.print("0 ");
            triang(n-1);
        } else{
            System.out.println();
        }
    }
    
}
