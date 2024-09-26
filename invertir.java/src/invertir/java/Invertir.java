/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invertir.java;

/**
 *23550382
 * @author saulbermudez Arzaga
 * estructura de datos
 */
public class Invertir{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 1234;
        System.out.println(n);
        invertido (n);
        
    }

    private static void invertido(int n) {
        if (n<10){
            System.out.println(n);
            
        } else {
            System.out.print(n%10);
            invertido (n/10);
        }
    }
    
}
