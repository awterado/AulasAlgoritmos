//sistema de votação
package EstruturaDeRepeticaoWhile;

import java.util.Scanner;

public class Exemplo5 {
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
        System.out.print(
                "-----resultado-----\n"
                + a + " - Candidato 1\n"
                + b + " - Candidato 2\n"
                + c + " - Candidato 3\n"
                + x + " - Branco\n"
                + y + " - Nulo\n"
                + "-----------------\n");
        
        if(a>b && a>c && a>x && a>y){
            System.out.println("Candidato 1 foi o vencedor!");
        } else if(b>a && b>c && b>x && b>y){
            System.out.println("Candidato 2 foi o vencedor!");
        } else if(c>a && c>b && c>x && c>y){
            System.out.println("Candidato 3 foi o vencedor!");
        } else{
            if((a/(a+b+c))>(a+b+c)/2 || (b/(a+b+c))>(a+b+c)/2 || (c/(a+b+c))>(a+b+c)/2){
                System.out.println("Deverá haver segundo turno!");
            }
            
        }
    }
}
