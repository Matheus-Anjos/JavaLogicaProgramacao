package br.generation.javaparte2;

/* Autor : Matheus Anjos data : 09/12/2021
 exerc�cio : Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 proposta : usar somente condicionais e aritm�ticos */

import java.util.Scanner;

public class exercicio1condicional {

	public static void main(String[] args) {
	
	int numero1, numero2, numero3;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite um n�mero : ");
	
	numero1 = input.nextInt();
	
	System.out.println("Digite um n�mero : ");
	
	numero2 = input.nextInt();
	
	System.out.println("Digite um n�mero : ");
	
	numero3 = input.nextInt();
	
	if(numero1 > numero2 && numero1 > numero3) {
	System.out.println("o n�mero maior � o " + numero1);
		
	}
	
	else if(numero2 > numero1 && numero2 > numero3) {
	System.out.println("o n�mero maior � o " + numero2);
		
	}
	
	else if(numero3 > numero1 && numero3 > numero2) {
		System.out.println("o n�mero maior � o " + numero3);
			
		}
	
	input.close();
	

	
	
	
	
	
	
}

}