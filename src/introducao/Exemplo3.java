//Soma
package introducao;

import java.util.Scanner;


public class Exemplo3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int int1 = entrada.nextInt();
        System.out.println("Digite o segundo número:");
        int int2 = entrada.nextInt();
        int soma = int1 + int2;
        System.out.println("Soma dos números: " + soma );
        
    }
    
}
