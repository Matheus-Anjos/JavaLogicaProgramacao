



package br.com.generation.javaparte1;

import java.util.Scanner;

public class exercicio6 {
	
	public static void main(String[] args) {
		
		double x1, y1, x2, y2;
		double p1, p2, d;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um valor de um n�mero:");
		
		x1 = leia.nextDouble();
		
		System.out.println("Digite o valor de outro n�mero:");
		
		y1 = leia.nextDouble();
		
		System.out.println("Digite um valor de um n�mero:");
		
		x2 = leia.nextDouble();
		
		System.out.println("Digite o valor de outro n�mero:");
		
		y2 = leia.nextDouble();
		
		p1 = Math.pow((x2-x1), 2);
		p2 = Math.pow((y2-y1), 2);
		
		d = Math.sqrt(p1 + p2);
		
		System.out.println("A distancia entre os dois pontos �:" + d);
		
		leia.close();
	}

}
