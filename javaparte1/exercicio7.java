package br.com.generation.javaparte1;

/*Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x  e y */
import java.util.Scanner;

public class exercicio7 {

	
	public static void main(String[] args) {
		
		double a,b,c,d,e,f, x, y;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um valor de um número:");
		
		a = leia.nextDouble();
		
		System.out.println("Digite o valor de outro número:");
		
		b = leia.nextDouble();
		
		System.out.println("Digite o valor de outro número:");
		
		c = leia.nextDouble();
		
		System.out.println("Digite o valor de outro número:");
		
		d = leia.nextDouble();
		System.out.println("Digite o valor de outro número:");
		
		e = leia.nextDouble();
		
		System.out.println("Digite o valor de outro número:");
		
		e = leia.nextDouble();
		
		System.out.println("Digite o valor de outro número");
		
		f = leia.nextDouble();
		
		x = (( c * e) - ( b * f)) / (( a * e) - ( b * d));
		
		y = (( a * f) - ( c * d)) / (( a * e) - ( b * d));
		
		System.out.println("O valor de X é :" + x);
		System.out.println("O valro de Y é:" +  y);
		
		leia.close();
		
		
	}
			
}
