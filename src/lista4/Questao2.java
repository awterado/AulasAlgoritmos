
package lista4;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira quanto ganha por hora: ");
        float n = input.nextFloat();
        System.out.print("Insira quantas horas trabalha no mês: ");
        float h = input.nextFloat();
        float sb = n*h;
        //salário até 900
        if (sb<=900){
            System.out.println("Salário bruto: " + sb);
            System.out.println("Isento de Imposto de Renda");
            float inss = sb*1.1f - sb;
            System.out.println("INSS: " + inss);
            float fgts = sb*1.11f - sb;
            System.out.println("FGTS: " + fgts);
            System.out.println(" Salário liquido: " + (sb-inss));
        //salário até 1500
        }else if (sb<=1500){
            System.out.println("Salário bruto: " + sb);
            float ir = sb*1.05f - sb;
            System.out.println("Imposto de renda(5%): " + ir);
            float inss = sb*1.1f - sb;
            System.out.println("INSS: " + inss);
            float fgts = sb*1.11f - sb;
            System.out.println("FGTS: " + fgts);
            System.out.println("Salário liquido: " + (sb-inss-ir));
        //salário até 2500
        } else if (sb<=2500){
            System.out.println("Salário bruto: " + sb);
            float ir = sb*1.1f - sb;
            System.out.println("Imposto de renda(10%): " + ir);
            float inss = sb*1.1f - sb;
            System.out.println("INSS: " + inss);
            float fgts = sb*1.11f - sb;
            System.out.println("FGTS: " + fgts);
            System.out.println("Salario liquido: " + (sb-inss-ir));
        //salário superior a 2500
        }else{
            System.out.println("Salário bruto: " + sb);
            float ir = sb*1.2f - sb;
            System.out.println("Imposto de renda(20%): " + ir);
            float inss = sb*1.1f - sb;
            System.out.println("INSS: " + inss);
            float fgts = sb*1.11f - sb;
            System.out.println("FGTS: " + fgts);
            System.out.println("Salário liquido: " + (sb-inss-ir));
        }
    }
}
