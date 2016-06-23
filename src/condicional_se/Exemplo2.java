
package condicional_se;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um número:");
        float num = entrada.nextFloat();
        
        if (num>0){
            System.out.println("ESSE NÚMERO É POSITIVO!!");
        } else if(num<0) {
            System.out.println("ESSE NÚMERO É NEGATIVO!!");
        } else{
            System.out.println("NÚMERO NEUTRO!!");
        }
        
    }
    
}