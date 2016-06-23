
package EstruturaDeRepeticaoWhile;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número");
        int numero = input.nextInt();
        int soma = 0, contador = 0;
        while(numero!=0){
            soma += numero;
            contador++;
            
            System.out.println("Digite um numero: ");
            numero = input.nextInt();
        }
//        int n = 0;
//        
//        do{
//            
//        }while (n !=0){
//        
//    }
    }
}
