package Javaparte4;

import java.util.Scanner;

/* Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/

public class exercicio1matrizvetor {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		
		int[] vetorteste = new int[5];
		int maiorPontuacao;
		
		
		for(int i = 0; i < vetorteste.length; i++) {
			
			System.out.println("Informe um n�mero");
			vetorteste[i] = input.nextInt();	
			
		}
		
		maiorPontuacao = vetorteste[0];
		
		for(int i = 0; i < vetorteste.length; i++) { 
			
			if( vetorteste[i] > maiorPontuacao) {
				
				maiorPontuacao = vetorteste[i];
			}
		}
		
		System.out.println("A maior pontuacao � " + maiorPontuacao);
		
		input.close();
	}

}
