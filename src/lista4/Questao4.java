
package lista4;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira a nota 01: ");
        float n1 = input.nextFloat();
        System.out.print("Insira a nota 02: ");
        float n2 = input.nextFloat();
        float med = (n1+n2)/2;
        if (med<4){
            System.out.println("Média: " + med);
            System.out.println("Conceito: E.\nAluno reprovado!");
        }else if (med<6){
            System.out.println("Média: " + med);
            System.out.println("Conceito: D.\nAluno reprovado!");
        }else if (med<7.5){
            System.out.println("Média: " + med);
            System.out.println("Conceito: C.\nAluno aprovado!");
        }else if (med<9){
            System.out.println("Média: " + med);
            System.out.println("Conceito: B.\nAluno aprovado!");
        }else{
            System.out.println("Média: " + med);
            System.out.println("Conceito: A.\nAluno aprovado!");
        }
    }
}
