




package br.com.generation.javaparte1;

import java.util.Scanner;

public class exercicio2 {
public static void main(String[] args) {
		
		
		int dias, totalDias, anos, meses;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Em quantos segundos durar� o evento? : \"");
		
		totalDias = leia.nextInt();
		anos = totalDias / 365;
		meses = (totalDias % 365 ) / 30;
		dias = (totalDias % 365 ) % 30;
		
		System.out.println("Sua idade expressa em anos �:;" + anos);
		System.out.println("Sua idade expressa em meses �:;" + meses);
		System.out.println("Sua idade expressa em dias �:;" + dias);
		
		leia.close();
		
		
	}
}
