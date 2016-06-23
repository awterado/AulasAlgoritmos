
package lista2;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira quanto você ganha por hora: ");
        float salh = entrada.nextFloat();
        System.out.print("Insira quantas horas você trabalha no mês: ");
        float hrt = entrada.nextFloat();
        float salbruto = salh*hrt;
        float ir = salbruto*0.11f;
        float inss = salbruto*0.08f;
        float sind = salbruto*0.05f;
        float sliq = salbruto - ir - inss - sind;
        System.out.println("Salario bruto: " + salbruto);
        System.out.println("Valor do imposto de renda: " + ir);
        System.out.println("Valor do INSS: " + inss);
        System.out.println("Valor do sindicato: " + sind);
        System.out.println("Salario líquido: " + sliq);
        
    }
}
