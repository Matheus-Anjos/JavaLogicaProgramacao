package javaparte3;

import java.util.Scanner;

public class exercicio6loop {

	/*Autor : Matheus Anjos Data: 09/12/2021
	 
	 Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
	 
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero; 
		double contmultiplo3 = 0, somamultiplo3 = 0, mediamultiplo3 = 0;
		
		do {
			System.out.println("Digite um número");
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
		System.out.println("A média dos numeros multiplos de 3 é: " + mediamultiplo3);
		
		entrada.close();
	}
}
