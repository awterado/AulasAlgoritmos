package introducao;

import java.util.Scanner;

public class Exemplo1 {
    
    public static void main(String[] args) {
        
        System.out.println("Qual seu nome?");
        String nome;
        Scanner entrada = new Scanner(System.in);
        nome = entrada.next();
        System.out.println("Bem vindo, " + nome);
    }
}
