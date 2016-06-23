
package lista1;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira a temperatura em Farenheit:");
        float f = entrada.nextFloat();
        float convc = (float) (5*(f-32)/9);
        System.out.println("Esta é a temperatura em Celsius: " + convc);
    }
    
}
