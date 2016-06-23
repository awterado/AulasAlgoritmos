
package lista1;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira a temperatura em Celsius:");
        float c = entrada.nextFloat();
        float convf = (float) ((c/5)*9+32);
        System.out.println("Esta é a temperatura em Farenheit: " + convf);
    }
}
