//sistema de votação
package EstruturaDeRepeticaoWhile;

import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0, b=0, c=0, x=0, y=0, z=0;
        String sair = "não";
        do{
            System.out.print(
                "-----Votação-----\n"
                + "1 - Candidato 1\n"
                + "2 - Candidato 2\n"
                + "3 - Candidato 3\n"
                + "0 - Branco\n"
                + "----------------\n"
                + "Voto: ");
            int v = input.nextInt();
            switch (v){
                case 1:
                    a++;
                    break;
                case 2:
                    b++;
                    break;
                case 3:
                    c++;
                    break;
                case 0:
                    x++;
                    break;
                default:
                    y++;
            }
            System.out.print("--------------\n" 
                    + "Sair? ");
            sair = input.next();
            System.out.print("--------------\n");
        }while(!sair.equalsIgnoreCase("sim"));
        if((a/(a+b+c))>0.5f || (b/(a+b+c)>0.5f) || (c/(a+b+c)>0.5f)){
            System.out.println("Eleição definida em PRIMEIRO TURNO");
            if(a>b && a>c){
            System.out.println("Candidato 1 foi o vencedor!");
            } else if(b>a && b>c){
            System.out.println("Candidato 2 foi o vencedor!");
            } else {
            System.out.println("Candidato 3 foi o vencedor!");
            }
        } else {
            System.out.println("Eleição vai para SEGUNDO TURNO");
        }
    }
}
//System.out.print(
//                "-----resultado-----\n"
//                + a + " - Candidato 1\n"
//                + b + " - Candidato 2\n"
//                + c + " - Candidato 3\n"
//                + x + " - Branco\n"
//                + y + " - Nulo\n"
//                + "-----------------\n");