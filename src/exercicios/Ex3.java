//estrutura de repetição
package exercicios;

import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n = 0;
        do {
            System.out.print("Digite sua nota: ");
            n = input.nextInt();
        } while (n < 0 || n > 10);
        
    }
    
}
