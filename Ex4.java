package matrizes;

import java.util.Scanner;

public class Ex4 {
public static void main(String[] args) {}
Scanner ler = new Scanner(System.in);

float notas [][] = new float[10][4];

for(int i=0; i<10; i++) {
	System.out.println("Digite as 4 notas: ");
	for(int j=0; j<4; j++) {
	
		notas[i][j] = ler.nextInt();
	}
}
}
