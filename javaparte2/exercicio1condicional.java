package br.generation.javaparte2;

/* Autor : Matheus Anjos data : 09/12/2021
 exercício : Faça um programa que receba três inteiros e diga qual deles é o maior.
 proposta : usar somente condicionais e aritméticos */

import java.util.Scanner;

public class exercicio1condicional {

	public static void main(String[] args) {
	
	int numero1, numero2, numero3;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite um número : ");
	
	numero1 = input.nextInt();
	
	System.out.println("Digite um número : ");
	
	numero2 = input.nextInt();
	
	System.out.println("Digite um número : ");
	
	numero3 = input.nextInt();
	
	if(numero1 > numero2 && numero1 > numero3) {
	System.out.println("o número maior é o " + numero1);
		
	}
	
	else if(numero2 > numero1 && numero2 > numero3) {
	System.out.println("o número maior é o " + numero2);
		
	}
	
	else if(numero3 > numero1 && numero3 > numero2) {
		System.out.println("o número maior é o " + numero3);
			
		}
	
	input.close();
	

	
	
	
	
	
	
}

}