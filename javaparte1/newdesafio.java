


package br.com.generation.javaparte1;

import java.util.Scanner;

public class newdesafio {
	
public static void main(String[] args) {
		
		int galoes;
		double litros;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos galçoes você quer : ");
		
		galoes = leia.nextInt();
		
		litros = galoes * 3.785;
		
		System.out.println(galoes + "  Galões são:" + litros + " Litros");
		
		
		leia.close();
		
	}


}
