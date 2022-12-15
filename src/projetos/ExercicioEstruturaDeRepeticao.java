package projetos;

/**
 * 1. Fa�a um programa que leia 5 n�meros e informe o maior n�mero.
 *
*/

import java.util.Scanner;

public class ExercicioEstruturaDeRepeticao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero, maior = Integer.MIN_VALUE;
		
		for (int i=0; i<5; i++) {
			System.out.printf("Informe o %d� n�mero: ", i+1);
			numero = scanner.nextInt();
			if (numero > maior)
				maior = numero;
		}
		System.out.println("O maior n�mero informado �: "+ maior);
		
		System.out.println();
/*
		2. Fa�a um programa que receba dois n�meros inteiros e
		gere os n�meros inteiros que est�o no
		intervalo compreendido por eles.
*/
		
		int num1, num2, menorNumero, maiorNumero;
		
		System.out.print("Informe o primeiro n�mero: ");
		num1 = scanner.nextInt();
		
		System.out.print("Informe o segundo n�mero: ");
		num2 = scanner.nextInt();
		
		menorNumero = num1;
		maiorNumero = num2;
		
		if (num2 < num1) {
			menorNumero = num2;
			maiorNumero = num1;			
		}
		
		for (int i=menorNumero; i<=maiorNumero; i++) {
			System.out.printf("%d ", i);
		}
		
		/*ESCREVA UM PROGRAMA PARA IMRPIMIR A TABUADA DE MULTIPLICA��O 1 A 9*/
		System.out.println("\nTABUADA\n");
		for (int i = 1; i < 10 ; i ++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		
		System.out.println("\nPAL�NDROMO OU N�O?\n");
		System.out.print("Informe uma palavra: ");
		String palavra = scanner.next();
		int aux = 0;
		boolean ePalindromo = true;
		char primeiroCaracter = palavra.charAt(0);
		char ultimoCaracter = palavra.charAt(palavra.length()-1);
		
		for (int i = 0; i < palavra.length()/2; i++) {
			if (palavra.charAt(i) != ultimoCaracter) {
				System.out.println("N�o � pal�ndromo");
				aux = 1;
					break;
			} 
			ultimoCaracter--;
			
		}
		if (aux != 1) 
			System.out.println("� pal�ndromo");	
		
	}
}
