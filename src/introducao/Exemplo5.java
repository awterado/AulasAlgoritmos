//Média
package introducao;

import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Primeira nota:");
        float n1 = entrada.nextFloat();
        System.out.println("Segunda nota:");
        float n2 = entrada.nextFloat();
        System.out.println("Terceira nota:");
        float n3 = entrada.nextFloat();
        System.out.println("Quarta nota:");
        float n4 = entrada.nextFloat();
        float media = (n1+n2+n3+n4)/4;
        System.out.println("Média final: " + media);
    }
    
}
