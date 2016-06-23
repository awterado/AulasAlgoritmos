
package EstruturaDeRepeticaoFor;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual tabuada você quer?");
        int t = entrada.nextInt();
        for(int i=0; i<10; i++){
            System.out.println(t + " x " + i + " = " + (t*i));
        }
    }
}
