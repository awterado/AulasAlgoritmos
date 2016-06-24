
package exercicios;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, maior = 0;
        for(int i=1; i<=5; i++){
            System.out.print("Número " + i + ":");
            a = input.nextInt();
            if (a > maior) {
                maior = a;
            }
        }
        System.out.println("O maior número foi: " + maior);
    }
}
