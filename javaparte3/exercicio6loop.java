package javaparte3;

import java.util.Scanner;

public class exercicio6loop {

	/*Autor : Matheus Anjos Data: 09/12/2021
	 
	 Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
	 
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero; 
		double contmultiplo3 = 0, somamultiplo3 = 0, mediamultiplo3 = 0;
		
		do {
			System.out.println("Digite um n�mero");
			numero = entrada.nextInt();
				if ( numero % 3 == 0) {
					contmultiplo3++;
					somamultiplo3 += numero;
					mediamultiplo3 = (somamultiplo3 / contmultiplo3);
				}
		}
		
		while( numero != 0);
		System.out.println(somamultiplo3);
		System.out.println(contmultiplo3);
		System.out.println("A m�dia dos numeros multiplos de 3 �: " + mediamultiplo3);
		
		entrada.close();
	}
}
