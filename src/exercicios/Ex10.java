// lista vetores e matrizes - questão 4
package exercicios;


public class Ex10 {
    public static void main(String[] args) {
        char[] vet = {'a','b','c', 'd', 'e','f','g','h','i','j'};
		int count = 0;

		
		for(int i=0; i < vet.length; i++){
			if((vet[i] != 'a') && (vet[i] != 'e') && (vet[i] != 'i') &&
					(vet[i] != 'o') && (vet[i] != 'u')){
					count = count + 1;
					System.out.println(vet[i]);
			}
		}
		
		System.out.println("Número de consoantes: " + count);
    }
}
