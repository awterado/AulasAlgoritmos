
package EstruturaDeRepeticaoFor;

import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int f = 0;
        System.out.print("Digite um número: ");
        f = entrada.nextInt();
        String imprimir = f + "!";
        for (int i=f-1; i>=1; i--){
            f*=i;
        }
        System.out.print(imprimir + " = ");
        System.out.println(f);
    }   
}

/* jeito certo:

        Scanner entrada = new Scanner(System.in);
        int f=1, n=entrada.nextInt;
        String p = "";
        for(int i=n; i>0; i--)
            if(i == 1) {
                p*=i;
            }else{
                p+=i*/