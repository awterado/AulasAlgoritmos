// Questão 3 da lista de  de repetição
package exercicios;

import java.util.Scanner;

public class Ex5 {
    
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
        String sexo = "s", ec = "d", nome = "1";
        int idade = 0; float salario = 0;
        do{
            System.out.print("Nome: ");
            nome = input.next();
            System.out.print("Idade: ");
            idade = input.nextInt();
            System.out.print("Salário: ");
            salario = input.nextFloat();
            System.out.print("Sexo(f,m): ");
            sexo = input.next();
            System.out.print("Estado civil(s,c,v,d): ");
            ec = input.next();
 // Fatores de erro          
        }while(nome.length()<3 || idade<0 || idade>150 || salario<0 ||
                (!sexo.equals("f") && !sexo.equals("m")) || 
                ((!ec.equals("s") && !ec.equals("c") && !ec.equals("v") && !ec.equals("d"))));
        
    }
    
}
