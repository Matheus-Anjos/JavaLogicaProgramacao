package br.com.generation.javaparte1;

/*Escreva um sistema que l� os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x  e y */
import java.util.Scanner;

public class exercicio7 {

	
	public static void main(String[] args) {
		
		double a,b,c,d,e,f, x, y;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um valor de um n�mero:");
		
		a = leia.nextDouble();
		
		System.out.println("Digite o valor de outro n�mero:");
		
		b = leia.nextDouble();
		
		System.out.println("Digite o valor de outro n�mero:");
		
		c = leia.nextDouble();
		
		System.out.println("Digite o valor de outro n�mero:");
		
		d = leia.nextDouble();
		System.out.println("Digite o valor de outro n�mero:");
		
		e = leia.nextDouble();
		
		System.out.println("Digite o valor de outro n�mero:");
		
		e = leia.nextDouble();
		
		System.out.println("Digite o valor de outro n�mero");
		
		f = leia.nextDouble();
		
		x = (( c * e) - ( b * f)) / (( a * e) - ( b * d));
		
		y = (( a * f) - ( c * d)) / (( a * e) - ( b * d));
		
		System.out.println("O valor de X � :" + x);
		System.out.println("O valro de Y �:" +  y);
		
		leia.close();
		
		
	}
			
}
