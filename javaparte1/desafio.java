
package br.com.generation.javaparte1;

import java.util.Scanner;

public class desafio {

public static void main(String[] args) {
		
		int a, b, soma,subtracao, multiplicacao,divisao,modulo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A : ");
		
		a = leia.nextInt();
		
		System.out.println("Digite o valor de B : ");
		
		b = leia.nextInt();

		System.out.println("Digite sua idade em dias : ");
		
		soma = a + b;
		subtracao = a - b;
		multiplicacao = a * b;
		divisao = a / b;
		modulo = a % b;
		
		System.out.println("Resultado da soma : " + soma);
		System.out.println("Resultado da subtra��o : " + subtracao);
		System.out.println("Resultado da multiplica��o : " + multiplicacao);
		System.out.println("Resultado da divis�o : " + divisao);
		System.out.println("Resultado do m�dulo : " + modulo);
		
		leia.close();
		
	}

}
