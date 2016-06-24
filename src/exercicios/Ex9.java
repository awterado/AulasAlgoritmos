
package exercicios;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 2;
        for(int i=0; i<=50; i++){
            if(i%a!=0){
                System.out.print(i + " ");
            }
        }
    }
}
