package br.generation.javaparte2;
import java.util.Scanner;

/* 
 Autor : Matheus Anjos Data : 09/12/2021
 exerc�cio : Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
categoria ela se encontra: 10-14 infantil, 15-17 juvenil, 18-25 adulto 
proposta : usar conhecimento de apenas do escopo de la�os condicionais(if e else) e dos operadores aritm�ticos
*/

public class exercicio3condicional {

	public static void main(String[] args) {
		int idade; 
		String categoria1, categoria2, categoria3;
		categoria1 = "infantil";
		categoria2 = "juvenil";
		categoria3 = "adulto";
		
		Scanner guarde = new Scanner(System.in);
		System.out.println("Digite sua idade");
		idade = guarde.nextInt();
		
		if (idade > 10 && idade < 14) {
			
			System.out.println("voc� est� na categoria " + categoria1);
		}
		
		else if (idade > 15 && idade < 17) {
			System.out.println("voc� est� na cateoria " + categoria2);
		}
		
		else if (idade > 18 && idade < 25) {
			System.out.println("voc� est� na cateoria " + categoria3);
			
		}
		
		else {
			System.out.println("Digite uma idade v�lida : 10 a 25 anos");
			
		}
		
		guarde.close();
	
		
	}
	
}
