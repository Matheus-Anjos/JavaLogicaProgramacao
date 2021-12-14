package Javaparte4;

import java.util.Scanner;

/* Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

public class exercicio2matrizvetor {
	
	public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int maiorValor,contMaiorValor =0, soma =0 , media = 0;
		
		for(int i = 0; i < vetor.length; i++ ) {
			
			System.out.println("Informe um número");
			vetor[i] = input.nextInt();
		}
		
		maiorValor = vetor[0];
	
		for(int i = 0; i < vetor.length; i++ ) {
			
			 soma += vetor[i];
			 media = soma / vetor.length;
			
			if( vetor[i] > maiorValor) {
				
				maiorValor = vetor[i];
				contMaiorValor = 0;
				contMaiorValor = contMaiorValor + 1;
			}
			
			else if (vetor[i] == maiorValor) {
				contMaiorValor++;
			}
			
			
			}
		
		System.out.println("A média aritmética dos números lançados foi : " + media);
		System.out.println("foram registras " + contMaiorValor + " contas de maior pontuação");
		
		input.close();
		}
	
	
}
