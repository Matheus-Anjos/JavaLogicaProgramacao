
package javaparte3;

import java.util.Scanner;

public class exercicio5loop {
/*Autor : Matheus Anjos Data : 09/12/2021
 Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE) */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero, somanumero = 0;
		
		do {
			System.out.println(" Digite um n�mero");
			numero = entrada.nextInt();
			somanumero += numero;
			
		}
		
		while( numero != 0);

		System.out.println("A soma dos n�meros digitados � " + somanumero);
		
		entrada.close();
	}

	
}
