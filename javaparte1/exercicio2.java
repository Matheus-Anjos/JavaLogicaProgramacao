




package br.com.generation.javaparte1;

import java.util.Scanner;

public class exercicio2 {
public static void main(String[] args) {
		
		
		int dias, totalDias, anos, meses;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Em quantos segundos durará o evento? : \"");
		
		totalDias = leia.nextInt();
		anos = totalDias / 365;
		meses = (totalDias % 365 ) / 30;
		dias = (totalDias % 365 ) % 30;
		
		System.out.println("Sua idade expressa em anos é:;" + anos);
		System.out.println("Sua idade expressa em meses é:;" + meses);
		System.out.println("Sua idade expressa em dias é:;" + dias);
		
		leia.close();
		
		
	}
}
