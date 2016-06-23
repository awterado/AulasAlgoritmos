
package lista2;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        int n1 = entrada.nextInt();
        System.out.print("Insira outro número inteiro: ");
        int n2 = entrada.nextInt();
        System.out.print("Insira um número real: ");
        float n3 = entrada.nextFloat();
        float a = n1*2 * n2/2;
        float b = (n1*3)+n3;
        float c = (float) Math.pow(n3, 3);
        System.out.println("Produto do dobro do primeiro com a metade do segundo: " + a);
        System.out.println("Soma do triplo do primeiro com o terceiro: " + b);
        System.out.println("Terceiro elevado ao cubo: " + c);
        
    }
}
