
package lista2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira sua altura: ");
        float altura = entrada.nextFloat();
        float p_i = (float) (72.7*altura)-58;
        System.out.println("Esse é seu peso ideal: " + Math.ceil(p_i));
    }
}
