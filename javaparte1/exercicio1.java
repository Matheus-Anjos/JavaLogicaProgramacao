package br.com.generation.javaparte1;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		
		int idade, ano, meses, dias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade em anos : ");
		
		ano = leia.nextInt();
		
		System.out.println("Digite sua idade em meses : ");
		
		meses = leia.nextInt();

		System.out.println("Digite sua idade em dias : ");
		
		dias = leia.nextInt();
		
		idade = (ano * 365) + (meses * 30 ) + dias;
		
		System.out.println("sua idade expressa em dias é : " + idade);
		
		leia.close();
		
		
	}

}
