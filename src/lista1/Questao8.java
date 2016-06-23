
package lista1;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora?");
        float valor = entrada.nextFloat();
        System.out.println("Qauntas horas você trabalha por dia?");
        float hora = entrada.nextFloat();
        float salario = (float) ((valor*hora)*28);
        System.out.println("Esse é seu salário: " + salario);
    }
}
