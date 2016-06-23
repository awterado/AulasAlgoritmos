
package lista4;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número entre 1 e 7: ");
        int n = input.nextInt();
        switch (n) {
            case 1:
                System.out.println("o número " + n + " corresponde a Domingo!");
                break;
            case 2:
                System.out.println("o número " + n + " corresponde a Segunda!");
                break;
            case 3:
                System.out.println("o número " + n + " corresponde a Terça!");
                break;
            case 4:
                System.out.println("o número " + n + " corresponde a Quarta!");
                break;
            case 5:
                System.out.println("o número " + n + " corresponde a Quinta!");
                break;
            case 6:
                System.out.println("o número " + n + " corresponde a Sexta!");
                break;
            case 7:
                System.out.println("o número " + n + " corresponde a Sabado!");
                break;
            default:
                System.out.println("Valor invalido!");
                break;
        }
    }
}
