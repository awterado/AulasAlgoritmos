
package lista1;

import java.util.Scanner;


public class Questao7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um lado do quadrado");
        float l = entrada.nextFloat();
        float ad = (float) ((l*l)*2);
        System.out.println("Esse é o dobro da área: " + ad);
    }
}
