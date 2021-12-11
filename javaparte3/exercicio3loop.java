package javaparte3;

import java.util.Scanner;

public class exercicio3loop {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int idade = 0, total21 = 0, total50 = 0;
		
		while( idade != -99) {
			
			System.out.println("Digite sua idade");
			
			idade = input.nextInt();
			
		     if(idade < 21) {
		    	 total21++;		
		     }
		     
		     else if(idade > 50) {
		    	 total50++; 
		     }
		     
			
		}
		System.out.println("número de pessoas com menos de 21 anos é " + total21);
		System.out.println("número de pessoas com mais de 50 anos é " + total50);
		
		 input.close();
		
		
		
	}

}
