/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio8exer3;

/**
 *
 * @author baung
 */
public class Desafio8Exer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros;
        numeros = 1000;
        while (numeros < 2000) {
            if (numeros % 11 == 5) {
                System.out.println(numeros);
                numeros++;
            } else {
                numeros++;
            }
        }
        System.out.println("Acabou Guri!");
    }

}
