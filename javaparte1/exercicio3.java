package br.com.generation.javaparte1;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		
		
		int segundosEvento, hora, minutos, segundos;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Em quantos segundos durará o evento? : \"");
		
		segundosEvento = leia.nextInt();
		hora = segundosEvento / 3600;
		minutos = (segundosEvento % 3600 ) / 60;
		segundos = (segundosEvento % 365 ) % 60;
		
		System.out.println("Sua idade expressa em horas é:;" + hora);
		System.out.println("Sua idade expressa em  minutos é:;" + minutos);
		System.out.println("Sua idade expressa em segundos é:;" + segundos);
		
		leia.close();
		
		
	}
	

}
