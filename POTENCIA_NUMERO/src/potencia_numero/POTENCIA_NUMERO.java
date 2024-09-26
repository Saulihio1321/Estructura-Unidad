/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package potencia_numero;

/**
 *23550382
 * @author saulbermudez Arzaga
 * estructura de datos
 */
//crear un metodo que tenga el resultado de elevar numero a otro
public class POTENCIA_NUMERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base = 2;
        int exp = 4;
        System.out.println(base + " elevado a " + exp + " = "+potencia(base,exp));
    }

    private static int potencia(int base, int exp) {
        if (exp==0){
            return 1;
        } else if(exp==1){
            return base;
        }else {
            return base * potencia(base, exp-1);
        }
    }
    
}
