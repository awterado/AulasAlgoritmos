//verificacao de número primo com >if<
package EstruturaDeRepeticaoWhile;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int n = input.nextInt(),contagem = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
            contagem++;
            }
        }
        if(contagem == 2){
            System.out.println("O número digitado é primo");
        }else{
            System.out.println("O número digitado não é primo");
        }
    }
}