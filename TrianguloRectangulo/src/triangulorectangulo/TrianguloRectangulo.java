/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangulorectangulo;



/**
 *23550382
 * @author saulbermudez Arzaga
 * estructura de datos
 */
//imprimir triangulo rectangulo
public class TrianguloRectangulo {

    public static void imprimirTriangulo(int altura) {
        
        for (int i = 1; i < altura; i++) {
                       for (int j = 1; j <= i; j++) {
                System.out.print("o ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        imprimirTriangulo(16);
        }
    
}
