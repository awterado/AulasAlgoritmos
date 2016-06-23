//Média ponderada com quarta prova!
package condicional_se;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nota da prova 01:");
        float n1 = entrada.nextFloat();
        System.out.println("Nota da prova 02:");
        float n2 = entrada.nextFloat();
        System.out.println("Nota da prova 03:");
        float n3 = entrada.nextFloat();
        float medp = (n1*4+n2*5+n3*6)/15;
        System.out.println("Média final: " + medp);
        
        if (medp>=7){
            System.out.println("Aluno aprovado");
        }else if (medp>=3){
            System.out.println("Aluno em quarta prova!!");
            System.out.println("Nota 04:");
            float n4 = entrada.nextFloat();
            medp = (medp + n4)/2;
            
            if (medp>=5){
                System.out.println("Aluno aprovado com média: " + medp);
            }else{
                System.out.println("Aluno reprovado com média: " + medp);
            }

        }else{
            System.out.println("Aluno reprovado");
        }
    }
    
}