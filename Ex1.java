package matrizes;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
			
			int numero, posicao=-1;
			int numeroVetor[] = new int [] {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
			
					
			System.out.println("\nOs números são: 2, 5, 1, 3, 4, 9, 7, 8, 10, 6\n\nDigite o número que você deseja encontrar: ");
			numero = ler.nextInt();
			
			for(int i=0; i<numeroVetor.length; i++) {
				if(numero == numeroVetor[i]) {
					posicao = i;
					break;
				}
			}
			
			System.out.println("O número está na posicaor: " + posicao);
			
			
			ler.close();

	}

}
