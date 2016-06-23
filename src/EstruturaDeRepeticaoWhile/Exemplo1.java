
package EstruturaDeRepeticaoWhile;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String resposta = "não";
        int tentativas = 0;
        while(!resposta.equalsIgnoreCase("sim")){
            System.out.print("Você vai comprar o produto? ");
            resposta = input.next();
            tentativas = tentativas + 1;
        }
        System.out.println("Parabens, você quis comprar o produto depois de "
        + tentativas + " perguntas!");
    }
}
