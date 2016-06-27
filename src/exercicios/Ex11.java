// lista vetores e matrizes - questão 5
package exercicios;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeros[] = new int[20];
        for(int i = 0; i < 20; i++){
            System.out.print("Número " + (i+1) + ":");
            numeros[i] = input.nextInt();
        }
        //Imprimir todos os números
        for(int i = 0; i < 20; i++){
            System.out.println(numeros[i]);
        }
        
        System.out.println("-------");
        
        for(int i = 0; i < 20; i++){
            if(numeros[i]%2==0){
                System.out.println("O " + numeros[i] + " é par");
            }
        }
        
        System.out.println("-------");
        
        for(int i = 0; i < 20; i++){
            if(numeros[i]%2!=0){
                System.out.println("O " + numeros[i] + " é impar");
            }
        }
    }
}
