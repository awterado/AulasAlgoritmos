// lista vetores e matrizes - questão 3
package exercicios;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] notas = new float[4];
        float soma = 0, media = 0;
        for(int i = 0; i < 4; i++) {
            System.out.print("Digite a nota: ");
            notas[i] = input.nextFloat();
            soma += notas[i];
        }
        media = soma / 4;
        for (int i = 0; i < 4; i++) {
            System.out.print(notas[i]+" ");
        }
        System.out.println("= "+media);
        
    }
}
