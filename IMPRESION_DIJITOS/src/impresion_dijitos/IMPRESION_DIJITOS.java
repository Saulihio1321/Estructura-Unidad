/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package impresion_dijitos;

/**
 *23550382
 * @author saulbermudez Arzaga
 * estructura de datos
 */
// crea un metodo que imprima los dijitos de 1 a N
public class IMPRESION_DIJITOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declara dijitos
        int n = 5;
        incre(n);
        System.out.println();
        decre(n);
        System.out.println();
    }

    private static void incre(int n) {
        //imprimir de 1 a n
        //ejemplo n=5 - 12345
        if(n>0){
            incre(n-1);
            System.out.print(n);
        }
        
        
    }

    private static void decre(int n) {
          //imprimir de n a 1
        //ejemplo n=5 - 54321
         System.out.print(n);
        if(n>0){
            decre(n-1);
           
        }
   }
    
}
