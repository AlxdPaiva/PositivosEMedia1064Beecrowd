/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positivosemedia1064beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class PositivosEMedia1064Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);        
        
        int pos = 0;
        double soma = 0;
        
        for (int i = 0; i <6; i++) {
            double valor = teclado.nextDouble();
            if (valor > 0) {
                pos++;
                soma += valor;
            }
            
        }
        System.out.println(String.format(pos + " valores positivos"));
        System.out.printf(String.format("%.1f", soma/pos));
    }
    
}
