
package lista3;

import java.util.Scanner;


public class Questao1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira um número: ");
        float n1 = entrada.nextFloat();
        System.out.print("Insira outro número: ");
        float n2 = entrada.nextFloat();
        System.out.println("O maior número é " + Math.max(n1, n2));
    }
    
}
