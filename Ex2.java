package matrizes;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	int numero[] = new int[10];
	int soma=0;
	double media=0;
	
	for(int i=0; i<10; i++) {
		System.out.println("Digite o número: ");
		numero[i] = ler.nextInt();
		
	}
	
System.out.println("Elementos nos índices ímpares: ");
for(int i=1; i<numero.length; i+=2 ) {
	System.out.println(numero[i] + " ");
}

System.out.println("Elementos pares: ");
for(int i=0; i<numero.length; i++) {
	if(numero[i] % 2 == 0)
	System.out.println(numero[i] + " ");
}

System.out.println("Soma: ");
for(int i=0; i<numero.length; i++) {
	soma += numero[i];
}
System.out.println(soma + " ");

media=soma/10;
System.out.println("Média: " + media);

	ler.close();
}
}
