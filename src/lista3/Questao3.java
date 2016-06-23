
package lista3;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escreva a primeira letra do seu sexo: ");
        String sexo = entrada.next();
        if ((sexo.equalsIgnoreCase("f"))) {
            System.out.println("Feminino");
        }else if ((sexo.equalsIgnoreCase("m"))){
            System.out.println("Masculino");
        }else{
            System.out.println("Sexo invalido");
        }
    }
}
