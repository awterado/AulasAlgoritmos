
package lista2;

import java.util.Scanner;


public class Questao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informer seu altura: ");
        float h = entrada.nextFloat();
        System.out.println("## SEXO ##\nMASCULINO\nFEMININO");
        String escolha = entrada.next();
        switch (escolha){
            case "MASCULINO": case "Masculino": case "masculino": case "M": case "m":
                float p1 = 72.7f*h-58f;
                System.out.println("Seu peso ideal é: " + Math.ceil(p1));
                break;
            case "FEMININO": case "Feminino": case "feminino": case "F": case "f":
                float p2 = 62.1f*h-44.7f;
                System.out.println("Seu peso ideal é: " + Math.ceil(p2));
                break;
            default:
                System.out.println("Você não se encaixa nos parametros!");
                
            
        }
        
    }
}
