package projetos;

import java.util.Scanner;

public class JogoDaVelha {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char[][] tabuleiro = new char[3][3];
		char jogador1, jogador2;
		int linha, coluna;
		
		System.out.println("***JOGO DA VELHA***");	
		
		do {
			System.out.print("Você escolhe 'X' ou 'O'? ");
			jogador1 = scanner.next().charAt(0);
		} while (jogador1 != 'X' && jogador1 != 'x' && jogador1 != 'O'&& jogador1 != 'o');
		
		if(jogador1 == 'X' || jogador1 == 'x') {
			jogador1 = 'X';
			jogador2 = 'O';
		} else {
			jogador1 = 'O';
			jogador2 = 'X';
		}		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {	
				tabuleiro[i][j] = '_';				
			}
		}
		exibirTabuleiro(tabuleiro);
		
		
		do {			
			System.out.printf("\nJogador 1: %c. Escolha uma posição:\n", jogador1);		
			System.out.print("Linha: ");	
			linha = scanner.nextInt();
			System.out.print("Coluna: ");		
			coluna = scanner.nextInt();
			
			if(verificarPosicao(tabuleiro, linha, coluna) == true) {
				tabuleiro[linha][coluna] = jogador1;
				exibirTabuleiro(tabuleiro);
				break;
			} else {
				System.out.println("\nPosição inválida. Tente novamente.");		
			}
		} while(verificarPosicao(tabuleiro, linha, coluna) == false);
		
		do {
			System.out.printf("\nJogador 2: %c. Escolha uma posição:\n", jogador2);		
			System.out.print("Linha: ");	
			linha = scanner.nextInt();
			System.out.print("Coluna: ");		
			coluna = scanner.nextInt();
			
			if(verificarPosicao(tabuleiro, linha, coluna) == true) {
				tabuleiro[linha][coluna] = jogador2;
				exibirTabuleiro(tabuleiro);
				break;
			} else {
				System.out.println("\nPosição inválida. Tente novamente.");		
			}
		} while(verificarPosicao(tabuleiro, linha, coluna) == false);
	}
	
	public static void exibirTabuleiro(char[][] tabuleiro) {
		
		System.out.println("   0 1 2");
		for (int i = 0; i < 3; i++) {
			System.out.print(i + "  ");
			for (int j = 0; j < 3; j++) {	
				System.out.print(tabuleiro[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static boolean verificarPosicao(char[][] tabuleiro, int linha, int coluna) {
		if(linha < 0 || coluna < 0 || linha > 3 || linha > 3 ||
				tabuleiro[linha][coluna] != '_')
			return false;
		return true;
	}
}
