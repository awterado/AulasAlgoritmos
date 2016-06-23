
package lista4;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o lado 01: ");
        float l1 = input.nextFloat();
        System.out.print("Insira o lado 02: ");
        float l2 = input.nextFloat();
        System.out.print("Insira o lado 03: ");
        float l3 = input.nextFloat();
        //todos os lados iguais
        if (l1==l2 && l2==l3){
            System.out.println("Esse triângilo é equilátero!");
        //dois lados iguais
        }else if(l1==l2 || l1==l3 || l2==l3){
            System.out.println("Esse triângulo é isósceles!");
        }else{
            System.out.println("Esse triângulo é escaleno");
        }
        
    }
}
