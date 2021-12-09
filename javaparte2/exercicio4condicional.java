package br.generation.javaparte2;

import java.util.Scanner;
/* Autor : Matheus Anjos Data : 09/12/2021
 exercicio : Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
proposta : usar somente condiconais e operadores aritméticos */

public class exercicio4condicional {
	
	public static void main(String[] args) {
		
		double numero, numerocalculado;
		
		Scanner guarde = new Scanner(System.in);
		
		System.out.println("Informe um número :");
		
		 numero = guarde.nextInt();
		 
		 if ( numero % 2 == 0) {
			 
			numerocalculado = Math.sqrt(numero);
			 
			 System.out.println("o número  " + numero + "  é par");
			 System.out.println("a raiz quadrada de  " + numero + " é igual a " + numerocalculado);
			 
		 }
		
		 else {  
			 numerocalculado = Math.pow(numero, 2);
			 System.out.println("o número " + numero + " é ímpar");
			 System.out.println("o número " + numero + " elevado ao quadrado é  " + numerocalculado);
		 }
		
		 
		 guarde.close();
		
	}

}
