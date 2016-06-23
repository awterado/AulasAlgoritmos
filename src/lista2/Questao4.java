
package lista2;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o peso da pesca: ");
        float p = entrada.nextFloat();
        if (p>=50){
            System.out.println("O peso está acima do limite!");
        }else{
            System.out.println("O peso se encontra dentro do parametro!");
        }
    }
}
