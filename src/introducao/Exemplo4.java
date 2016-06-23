// Multiplicação
package introducao;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        float n1 = entrada.nextFloat();
        System.out.println("Digite o segundo número:");
        float n2 = entrada.nextFloat();
        float mult = n1*n2;
        System.out.println("Valor da multiplicação: " + mult);
        
    }
    
}
