
package javaparte3;

import java.util.Scanner;
/* Autor : Matheus Anjos Data : 10/12/2021
 Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR) 
 * proposta : usar o loop for, condicionais e operadores*/
public class exercicio2loop {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero, totalpar = 0, totalimpar = 0;
		
		for(int cont = 0; cont < 10; cont++) {
		
				System.out.println("Digite um n�mero");
				
				numero = input.nextInt();
			
				if( numero % 2 == 0) {
					
					totalpar++;
					
				}
				
				else if( numero % 2 == 1) {
					
					totalimpar++;
					
				}		
		}
		
		System.out.println(" O total de n�meros pares � de : " + totalpar);
		System.out.println(" O total de n�meros impares � de : " + totalimpar);
		
		input.close();
	}
	
	
}
