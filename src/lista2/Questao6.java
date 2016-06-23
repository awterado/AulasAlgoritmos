
package lista2;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o tamanho em metros quadrados a ser pintado:");
        float area = entrada.nextFloat();
        float latas = (area/3f)/18f;
        System.out.println("Você vai precisar de: " + Math.ceil(latas) + " latas de tinta.");
        System.out.println(Math.ceil(latas) + " latas de tinta custão: " + 80*Math.ceil(latas));
    }
}
