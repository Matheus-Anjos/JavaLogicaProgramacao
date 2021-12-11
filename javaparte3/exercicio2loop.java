
package javaparte3;

import java.util.Scanner;
/* Autor : Matheus Anjos Data : 10/12/2021
 Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR) 
 * proposta : usar o loop for, condicionais e operadores*/
public class exercicio2loop {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero, totalpar = 0, totalimpar = 0;
		
		for(int cont = 0; cont < 10; cont++) {
		
				System.out.println("Digite um número");
				
				numero = input.nextInt();
			
				if( numero % 2 == 0) {
					
					totalpar++;
					
				}
				
				else if( numero % 2 == 1) {
					
					totalimpar++;
					
				}		
		}
		
		System.out.println(" O total de números pares é de : " + totalpar);
		System.out.println(" O total de números impares é de : " + totalimpar);
		
		input.close();
	}
	
	
}
