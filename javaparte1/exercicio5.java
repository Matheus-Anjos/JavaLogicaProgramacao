package br.com.generation.javaparte1;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
	double media,nota1, nota2, nota3, ponderada1 = 2, ponderada2 = 3, ponderada3 =5;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor de um número:");
		
		nota1 = leia.nextDouble();
		
		System.out.println("Digite um valor de um número:");
		
		nota2 = leia.nextDouble();
		
		System.out.println("Digite um valor de um número:");
		
		nota3 = leia.nextDouble();
		
		media = ((nota1 * ponderada1) + (nota2 * ponderada2) + (nota3 * ponderada3)) / ( ponderada1 + ponderada2 + ponderada3);
	
		System.out.println("Sua media das notas é igual:" + media);
	
		leia.close();
	}
	}


