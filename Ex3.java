package matrizes;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero[][] = new int[3][3];
		int somaPrincipal=0, somaSecundaria=0;
		
		for(int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.println("Digite o número: ");
				numero[i][j] = ler.nextInt();
			}
		}
			
			 System.out.println("\nElementos da Diagonal Principal: ");
		        for (int i = 0; i < 3; i++) {
		        	somaPrincipal += numero[i][i];
		            System.out.print(numero[i][i] + " ");
		        }
		        System.out.println("\nSoma da Diagonal Principal: " + somaPrincipal);
		      
		        System.out.println("\nElementos da Diagonal Secundária: ");
		        for (int i = 0; i < 3; i++) {
		        	somaSecundaria += numero[i][2 - i];
		            System.out.print(numero[i][2 - i] + " ");
		        }
		        System.out.println("\nSoma da Diagonal Secundaria: " + somaSecundaria);
		
		ler.close();
	}
}
