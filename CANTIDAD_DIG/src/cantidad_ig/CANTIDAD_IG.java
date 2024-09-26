/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cantidad_ig;

/**
 *23550382
 * @author saulbermudez Arzaga
 * estructura de datos
 */
/* crea un metodo que crea la cantidad de dijitos delnumero N

*/
public class CANTIDAD_IG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 12313245;
        //dijito(n);
        System.out.println(n+" tiene " +dijito(n)+" digitos ");
        
    }

    private static int dijito(int n) {
        if (n<=0){
            return 0;
        } else {
            return 1+dijito(n/10);
        }
    }
    
}
