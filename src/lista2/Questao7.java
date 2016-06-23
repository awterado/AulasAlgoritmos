
package lista2;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o tamanho em metros quadrados a ser pintado:");
        float area = entrada.nextFloat();
        float latas = (area/6f)/18f;
        float latas2 = (area/6f/3.6f);
        System.out.println("Você vai precisar de: " + Math.ceil(latas) + " latas de tinta de 18 litros,");
        System.out.println(Math.ceil(latas) + " latas de tinta custão: " + 80*Math.ceil(latas) + ".");
        System.out.print("Ou você pode optar pro " + Math.ceil(latas2) + ",");
        System.out.println(" que custam " + Math.ceil(latas2)*25);
    }
}
