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
		exibirTabuleiro(tabuleiro, jogador1, jogador2);
		
		do {
			do {			
				System.out.printf("\nJogador 1: %c. Escolha uma posição:\n", jogador1);		
				System.out.print("Linha: ");	
				linha = scanner.nextInt();
				System.out.print("Coluna: ");		
				coluna = scanner.nextInt();
				
				if(verificarPosicao(tabuleiro, linha, coluna) == true) {
					tabuleiro[linha][coluna] = jogador1;
					exibirTabuleiro(tabuleiro, jogador1, jogador2);
					break;
				} else {
					System.out.println("\nPosição inválida. Tente novamente.");		
					exibirTabuleiro(tabuleiro, jogador1, jogador2);
				}
			} while(verificarPosicao(tabuleiro, linha, coluna) == false);
			
			if(ganhou(tabuleiro, jogador1, jogador2) == true) {
				break;
			}
			
			do {
				System.out.printf("\nJogador 2: %c. Escolha uma posição:\n", jogador2);		
				System.out.print("Linha: ");	
				linha = scanner.nextInt();
				System.out.print("Coluna: ");		
				coluna = scanner.nextInt();
				
				if(verificarPosicao(tabuleiro, linha, coluna) == true) {
					tabuleiro[linha][coluna] = jogador2;
					exibirTabuleiro(tabuleiro, jogador1, jogador2);
					break;
				} else {
					System.out.println("\nPosição inválida. Tente novamente.");		
					exibirTabuleiro(tabuleiro, jogador1, jogador2);
				}
			} while(verificarPosicao(tabuleiro, linha, coluna) == false);
			
		} while (ganhou(tabuleiro, jogador1, jogador2) == false);
	}
	
	public static void exibirTabuleiro(char[][] tabuleiro, char jogador1, char jogador2) {
		
		System.out.printf("Jogador 1: %c. Jogador 2: %c.\n", jogador1, jogador2);
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
	
	public static boolean ganhou(char[][] tabuleiro, char jogador1, char jogador2) {
		if(tabuleiro[0][0] == jogador1 && tabuleiro[1][1] == jogador1 && tabuleiro[2][2] == jogador1 ||
		   tabuleiro[0][0] == jogador1 && tabuleiro[0][1] == jogador1 && tabuleiro[0][2] == jogador1 ||
		   tabuleiro[1][0] == jogador1 && tabuleiro[1][1] == jogador1 && tabuleiro[1][2] == jogador1 ||
		   tabuleiro[2][0] == jogador1 && tabuleiro[2][1] == jogador1 && tabuleiro[2][2] == jogador1 ||
		   tabuleiro[0][0] == jogador1 && tabuleiro[1][0] == jogador1 && tabuleiro[2][0] == jogador1 ||
		   tabuleiro[0][1] == jogador1 && tabuleiro[1][1] == jogador1 && tabuleiro[2][1] == jogador1 ||
		   tabuleiro[0][2] == jogador1 && tabuleiro[1][2] == jogador1 && tabuleiro[2][2] == jogador1 ||
		   tabuleiro[0][2] == jogador1 && tabuleiro[1][1] == jogador1 && tabuleiro[2][0] == jogador1
		) {
			System.out.printf("Jogador 1 '%c' venceu.\n", jogador1);
			return true;
		} else if (tabuleiro[0][0] == jogador2 && tabuleiro[1][1] == jogador2 && tabuleiro[2][2] == jogador2 ||
				   tabuleiro[0][0] == jogador2 && tabuleiro[0][1] == jogador2 && tabuleiro[0][2] == jogador2 ||
				   tabuleiro[1][0] == jogador2 && tabuleiro[1][1] == jogador2 && tabuleiro[1][2] == jogador2 ||
				   tabuleiro[2][0] == jogador2 && tabuleiro[2][1] == jogador2 && tabuleiro[2][2] == jogador2 ||
				   tabuleiro[0][0] == jogador2 && tabuleiro[1][0] == jogador2 && tabuleiro[2][0] == jogador2 ||
				   tabuleiro[0][1] == jogador2 && tabuleiro[1][1] == jogador2 && tabuleiro[2][1] == jogador2 ||
				   tabuleiro[0][2] == jogador2 && tabuleiro[1][2] == jogador2 && tabuleiro[2][2] == jogador2 ||
				   tabuleiro[0][2] == jogador2 && tabuleiro[1][1] == jogador2 && tabuleiro[2][0] == jogador2
				) {
			System.out.printf("Jogador 2 '%c' venceu.\n", jogador2);
			return true;
		} else if (tabuleiro[0][0] != '_' && tabuleiro[0][1] != '_' && tabuleiro[0][2] != '_' &&
				   tabuleiro[1][0] != '_' && tabuleiro[1][1] != '_' && tabuleiro[1][2] != '_' && 
				   tabuleiro[2][0] != '_' && tabuleiro[2][1] != '_' && tabuleiro[2][2] != '_') {
			System.out.println("Deu velha.\n");
			return true;
		}
		return false;
	}
	

}
