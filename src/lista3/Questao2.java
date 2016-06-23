
package lista3;

import java.util.Scanner;


public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira um número: ");
        float n = entrada.nextFloat();
        if (n>0){
            System.out.println("Esse número é positivo");
        }else if (n<0){
            System.out.println("Esse número é negativo");
        }else{
            System.out.println("0 não se encaixa!!");
        }
    }
}
