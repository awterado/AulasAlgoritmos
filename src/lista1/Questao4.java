
package lista1;

import java.util.Scanner;


public class Questao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nota do bimestre 01:");
        float n1 = entrada.nextFloat();
        System.out.println("Nota do bimestre 02:");
        float n2 = entrada.nextFloat();
        System.out.println("Nota do bimestre 03:");
        float n3 = entrada.nextFloat();
        System.out.println("Nota do bimestre 04:");
        float n4 = entrada.nextFloat();
        float med = (n1+n2+n3+n4)/4;
        System.out.println("Essa é a media: " + med);
        
    }
}
