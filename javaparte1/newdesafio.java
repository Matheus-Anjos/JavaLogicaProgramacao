


package br.com.generation.javaparte1;

import java.util.Scanner;

public class newdesafio {
	
public static void main(String[] args) {
		
		int galoes;
		double litros;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos gal�oes voc� quer : ");
		
		galoes = leia.nextInt();
		
		litros = galoes * 3.785;
		
		System.out.println(galoes + "  Gal�es s�o:" + litros + " Litros");
		
		
		leia.close();
		
	}


}
