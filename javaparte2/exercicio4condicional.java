package br.generation.javaparte2;

import java.util.Scanner;
/* Autor : Matheus Anjos Data : 09/12/2021
 exercicio : Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
proposta : usar somente condiconais e operadores aritm�ticos */

public class exercicio4condicional {
	
	public static void main(String[] args) {
		
		double numero, numerocalculado;
		
		Scanner guarde = new Scanner(System.in);
		
		System.out.println("Informe um n�mero :");
		
		 numero = guarde.nextInt();
		 
		 if ( numero % 2 == 0) {
			 
			numerocalculado = Math.sqrt(numero);
			 
			 System.out.println("o n�mero  " + numero + "  � par");
			 System.out.println("a raiz quadrada de  " + numero + " � igual a " + numerocalculado);
			 
		 }
		
		 else {  
			 numerocalculado = Math.pow(numero, 2);
			 System.out.println("o n�mero " + numero + " � �mpar");
			 System.out.println("o n�mero " + numero + " elevado ao quadrado �  " + numerocalculado);
		 }
		
		 
		 guarde.close();
		
	}

}
