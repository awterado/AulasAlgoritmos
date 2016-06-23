
package lista1;

import java.util.Scanner;


public class Questao5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira uma distância em metros:");
        float d1 = entrada.nextFloat();
        float conv = d1*100;
        System.out.println("Essa é a distância em centímetros: " + conv);
    }
}

