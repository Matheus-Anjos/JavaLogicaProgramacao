package Javaparte4;

import java.util.Scanner;

/* Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/

public class exercicio2matrizvetor {
	
	public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int maiorValor,contMaiorValor =0, soma =0 , media = 0;
		
		for(int i = 0; i < vetor.length; i++ ) {
			
			System.out.println("Informe um n�mero");
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
		
		System.out.println("A m�dia aritm�tica dos n�meros lan�ados foi : " + media);
		System.out.println("foram registras " + contMaiorValor + " contas de maior pontua��o");
		
		input.close();
		}
	
	
}
