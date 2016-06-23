
package lista1;

import java.util.Scanner;


public class Questao6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o raio do círculo:");
        float r = entrada.nextFloat();
        float area = (float) ((r*r)*3.14);
        System.out.println("O área do círculo é: " + area);
        
    }
}
