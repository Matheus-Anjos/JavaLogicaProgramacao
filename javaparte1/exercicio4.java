package br.com.generation.javaparte1;

/* Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
calcule a seguinte express�o: D = (R + S )/2 R = (A+3)^2 S-(B+C)^2*/
import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String[] args) {
		
		int A, B, C, D, R, S;
		
		Scanner atribui = new Scanner(System.in);
		
		System.out.println("Digite um valor de um n�mero:");
		
		A = atribui.nextInt();
		System.out.println("Digite um valor de um n�mero:");
		
		B = atribui.nextInt();
		System.out.println("Digite um valor de um n�mero:");
		
		C = atribui.nextInt();
		
		R = (A + B)*(A+ B);
		S = (B + C)*(B + C);
		D =  ( R + S) / 2;
		System.out.println("O valor da express�o �:" + D);
		
				
		atribui.close();
		
		
	}

}

