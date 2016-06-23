// duas logicas
package condicional_se;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in );
        
        System.out.print("Informe sua média: ");
        float n = entrada.nextFloat();
        System.out.print("Informe suas faltas: ");
        int f = entrada.nextInt();
        if (n>=7 && f<=25){
            System.out.println("Aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }
    }
    
}
