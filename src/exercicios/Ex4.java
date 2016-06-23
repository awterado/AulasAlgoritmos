//Questão 2 da lista de repetição
package exercicios;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String u = "i";
        String s = "i";
        do{
            System.out.print("Usuário: ");
            u = input.next();
            System.out.print("Senha: ");
            s = input.next();
        }while(u.equalsIgnoreCase(s));
    }
}
