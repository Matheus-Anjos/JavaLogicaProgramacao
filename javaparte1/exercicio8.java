package br.com.generation.javaparte1;

import java.util.Scanner;

/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.*/

public class exercicio8 {
	
	public static void main(String[] args) {
		
	double custofabrica, custodistribuidor, custoconsumidor, porcentdistribuidor = 1.28, porcentimposto = 1.45;
		
		System.out.println("Qual o custo de f�brica do carro? : ");
		
		Scanner leia = new Scanner(System.in);
		
		custofabrica = leia.nextDouble();
		
		custodistribuidor = (custofabrica * porcentdistribuidor);
		custoconsumidor = (custodistribuidor * porcentimposto);
		
		System.out.println("o custo do carro ao distribuidor ser� de : " + custoconsumidor);
		
		leia.close();
	}

}
