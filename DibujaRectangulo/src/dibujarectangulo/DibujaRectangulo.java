/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dibujarectangulo;

/**
 * 23550382
 * @author saul Bermudez Arzaga
 * Estructura de datos
 */
public class DibujaRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base = 10;
        int altura = 5;
        rectangulo(base,altura);
        
    }

    private static void rectangulo(int base, int altura) {
        if(altura>0){
            rectangulo2(base);
            rectangulo(base,altura-1); 
        }
    }

    private static void rectangulo2(int base) {
        if(base>0){
            System.out.print("*");
            rectangulo2(base-1);
        }else{
            System.out.println();
    }
    
}
    
}
