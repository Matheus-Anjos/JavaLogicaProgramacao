package br.generation.javaparte2;

import java.util.Scanner;

/* Autor : Matheus Anjos Data : 09/12/2021
 exercicio : Faça um programa que entre com três números e coloque em ordem crescente. proposta : usar conhecimento apenas
 do escopo de condicionais e de aritméticos*/

public class exercicio2condicional {

	public static void main(String[] args) {
	
		int numero1, numero2, numero3, maiorNumero = 0, segMaiorNumero = 0, terMaiorNumero = 0;
		
		Scanner insira = new Scanner(System.in);
		
		System.out.println("Digite um número");
		
		numero1 = insira.nextInt();
		
		System.out.println("Digite um número");
		
		numero2 = insira.nextInt();
		
		System.out.println("Digite um número");
		
		numero3 = insira.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
					maiorNumero = numero1;
				if(numero2 > numero3) {
					 segMaiorNumero = numero2;
					 terMaiorNumero = numero3;}
				else {terMaiorNumero = numero2; segMaiorNumero = numero3; }
					
				}
		

		else if (numero2 > numero1 && numero2 > numero3) {
					maiorNumero = numero2;
				if(numero1 > numero3) {
					segMaiorNumero = numero1;
					terMaiorNumero = numero3; }
				else {terMaiorNumero = numero1; segMaiorNumero = numero3; }
				
		}
		
		else { maiorNumero = numero3 ; 
						if (numero1 > numero2) {
							segMaiorNumero = numero1;
							terMaiorNumero = numero2; }
						else {terMaiorNumero = numero1; segMaiorNumero = numero2;
							
						} }
					
		System.out.print("Em ordem crescente temos :" + maiorNumero);
		System.out.print(" " + segMaiorNumero);
		System.out.print(" " + terMaiorNumero);
		
		insira.close();

		
	}
}

