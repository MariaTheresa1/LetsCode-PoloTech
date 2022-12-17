package projetos;

import java.util.Scanner;

public class ArrayELacos {
	public static void main(String[] args) {
		
		/* 1. Escreva um programa que lê o nome de 5 frutas e 
		 * armazena num carrinho de compras. Ao final da 
		 * entrada dos 5 itens, exiba a lista completa. */
		
		/*
		Scanner scanner = new Scanner(System.in);

		String[] carrinhoDeFrutas = new String [5];
		
		for(int i=0; i<5; i++) {
			System.out.printf("Digite a %dª fruta: ", i+1);
			String fruta = scanner.next();
			carrinhoDeFrutas[i] = fruta;
		}
		for(int i=0; i<5; i++) {
			System.out.println(carrinhoDeFrutas[i]);
		}
		*/
		
		/* 2. Escreva um programa que lê uma palavra e 
		 * a escreve de volta ao contrário. */		
		/*
		Scanner scanner = new Scanner(System.in);

		String palavra;
		String palavraInvertida = "";
		
		System.out.print("Informe a palavra: ");	
		palavra = scanner.nextLine();

		for(int i = palavra.length() - 1; i >= 0; i--) {
			palavraInvertida += palavra.charAt(i);
		}
		
		System.out.print("\nA palavra ao contrário é: " + palavraInvertida);
		
		*/
		/* 3. Escreva um programa que lê 5 números.
		 * Ao final, escreva primeiros todos os ímpares,
		 * depois todos os pares. */
		
		/*
		Scanner scanner = new Scanner(System.in);

		int tamanho = 5;
		int [] numeros = new int [tamanho];
		int [] impares = new int [tamanho];
		int [] pares = new int [tamanho];

		for (int i = 0; i < tamanho; i++) {
			System.out.printf("Informe o %dº número: ", i+1);
			numeros[i] = scanner.nextInt();
		}
		
		int indicePar = 0, indiceImpar = 0;
		
		for (int i = 0; i < tamanho; i++) {
			if(numeros[i] % 2 == 0) {
				pares[indicePar] = numeros[i];
				indicePar++;
			} else {
				impares[indiceImpar] = numeros[i];
				indiceImpar++;
			}
		}
		System.out.println("Números ímpares:");
		for (int i = 0; i < indiceImpar; i++) {
			System.out.printf("%d ", impares[i]);
		}
		System.out.println("\nNúmeros pares:");
		for (int i = 0; i < indicePar; i++) {
			System.out.printf("%d ", pares[i]);
		}
		*/
		
		/* 4. Escreva um programa que lê 5 números e 
		 * informa o maior, o menor e a média deles.
		 */
		
		/*
		Scanner scanner = new Scanner(System.in);

		int tamanho = 5, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
		float media = 0;
		int [] numeros = new int [tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			System.out.printf("Informe o %dº número: ", i+1);
			numeros[i] = scanner.nextInt();
			media += numeros[i];
			
			if(numeros[i] > maior)
				maior = numeros[i];
			if(numeros[i] < menor)
				menor = numeros[i];
		}
		media /= tamanho;
		
		System.out.println("\nO maior número é o: " + maior);
		System.out.println("O menor número é o: " + menor);
		System.out.printf("A média entre os números é: %.2f", media);
		*/
		
		/* 5. Escreva um programa que lê o nome de 5 pessoas e 
		 * armazena numa lista de convidados. Ao final, 
		 * informe qual o nome mais longo presente na lista.
		*/
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		String maiorNome = "";
		String [] nomes = new String [5];		
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Informe o %dº nome: ", i+1);	
			nomes[i] = scanner.nextLine();
			if(nomes[i].length() > maiorNome.length())
				maiorNome = nomes[i];
		}
		System.out.println("O maior nome da lista é: " + maiorNome);			
		*/
		
		/* 6. Escreva um programa que lê uma palavra e 
		 * escreve de volta com os caracteres ímpares em maiúsculo.
		 */
		/*
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Informe a palavra: ");	
		String palavra = scanner.nextLine();
		
		for(int i = 0; i < palavra.length(); i++) {
			if(i % 2 != 0) {
				palavra = palavra.replace(palavra.charAt(i), Character.toUpperCase(palavra.charAt(i)));
			}
		}
		System.out.println("A nova palavra é: " + palavra);	
		*/
		
		/* 7. Escreva um programa que lê nome e idade de 5 pessoas
		 * e ao final informa quem é o mais novo, o mais velho e
		 * qual a média de idade.
		 * */
		
		/*
		class Pessoa{
			public String nome;
			public int idade;		
		}
		
		Scanner scanner = new Scanner(System.in);
		
		int tamanho = 5, menorIdade = Integer.MAX_VALUE, maiorIdade = Integer.MIN_VALUE;
		String nomePessoaMenorIdade = "", nomePessoaMaiorIdade = "";
		float mediaIdade = 0;
		Pessoa pessoa = new Pessoa ();
		
		for (int i = 0; i < tamanho; i++) {

			System.out.printf("Informe o nome da %dª pessoa: ", i+1);
			pessoa.nome = scanner.next();
			System.out.printf("Informe a idade da %dª pessoa: ", i+1);
			pessoa.idade = scanner.nextInt();

			if(pessoa.idade < menorIdade) {
				menorIdade = pessoa.idade;
				nomePessoaMenorIdade = pessoa.nome;
			}
			if(pessoa.idade > maiorIdade) {
				maiorIdade = pessoa.idade;
				nomePessoaMaiorIdade = pessoa.nome;
			}
			
			mediaIdade += pessoa.idade;
		}
		mediaIdade /= tamanho;
		
		System.out.println();
		System.out.printf("%s é a pessoa mais nova com %d anos.\n", nomePessoaMenorIdade, menorIdade);
		System.out.printf("%s é a pessoa mais velha com %d anos.\n", nomePessoaMaiorIdade, maiorIdade);
		System.out.printf("A média de idade das pessoas é de %.2f ano(s).\n", mediaIdade);
		*/
		
		/* 8. Escreva um programa que lê nome, altura e peso de 5 pessoas,
		 * calcula o IMC de cada um e ao final informa se alguém está
		 * fora do peso ideal (o IMC ideal é entre 18,5 e 25). */

		/*
		Scanner scanner = new Scanner(System.in);
		
		int tamanho = 5;		
		String[] nome = new String[tamanho];
		float[] altura = new float [tamanho], peso = new float [tamanho];

		for (int i = 0; i < tamanho; i++) {

			System.out.printf("Informe o nome da %dª pessoa: ", i+1);
			nome[i] = scanner.next();
			System.out.printf("Informe a altura da %dª pessoa: ", i+1);
			altura[i] = scanner.nextFloat();
			System.out.printf("Informe o peso da %dª pessoa: ", i+1);
			peso[i] = scanner.nextFloat();		
		}
		
		for (int i = 0; i < tamanho; i++) {
			
			float imc = peso[i] / (altura[i] * altura[i]);
			
			System.out.printf("%s com IMC: %.2f\n", nome[i], imc);		
			if(imc < 18.5 || imc > 25) {
				System.out.println("Fora do peso ideal.\n");				
			}	
		}
		*/
		
		/* 9. Supondo que a população do país "A" seja de 80_000 habitantes,
		 * com uma taxa anual de crescimento de 3%. E que a população de B
		 * seja 200_000 habitantes, com uma taxa de crescimento de 1.5%.

		 Faça um programa que calcule e escreva o número de anos necessários
		 para que a população do país A ultrapasse ou iguale a população do
		 país B mantidas as taxas de crescimento. */
		
		float populacaoPaisA = 80000, populacaoPaisB = 200000;
		float taxaDeCrescimentoA = 0.03f, taxaDeCrescimentoB = 0.015f;
		int anos = 0;
		
		while(true) {
			anos++;
			populacaoPaisA += populacaoPaisA * taxaDeCrescimentoA;
			populacaoPaisB += populacaoPaisB * taxaDeCrescimentoB;
			if(populacaoPaisA >= populacaoPaisB)
				break;
		}
		System.out.println("A quantidade de anos é " + anos);	
	}
}
