
package lista1;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o primeiro número:");
        float n1 = entrada.nextFloat();
        System.out.println("Insira o segundo número:");
        float n2 = entrada.nextFloat();
        float soma = n1 + n2;
        System.out.println("O valor da soma é: " + soma);
    }
}
