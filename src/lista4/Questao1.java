
package lista4;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o sálario: ");
        float salario = input.nextFloat();
        if (salario<280){
            System.out.println("Salário antes do reajuste: " + salario);
            System.out.println("O percentual de almento é de 20%.");
            float nsal = salario * 1.2f;
            System.out.println("Valor do aumento: " + (nsal-salario));
            System.out.println("Novo salário: " + nsal);
        }else if (salario<700){
            System.out.println("Salário antes do reajuste: " + salario);
            System.out.println("O percentual de almento é de 15%.");
            float nsal = salario*1.15f;
            System.out.println("Valor do aumento: " + (nsal-salario));
            System.out.println("Novo salário: " + nsal);

        }else if(salario<1500){
            System.out.println("Salário antes do reajuste: " + salario);
            System.out.println("O percentual de almento é de 10%.");
            float nsal = salario*1.1f;
            System.out.println("Valor do aumento: " + (nsal-salario));
            System.out.println("Novo salário: " + nsal);
        }else{
            System.out.println("Salário antes do reajuste: " + salario);
            System.out.println("O percentual de almento é de 5%.");
            float nsal = salario*1.05f;
            System.out.println("Valor do aumento: " + (nsal-salario));
            System.out.println("Novo salário: " + nsal);
        }
    }
}
