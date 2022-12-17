package projetos;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		Character matriz[][] = new Character[3][3];
		matriz[0][0] = 'x';
		
		imprimir(matriz);
	}
	
	public static void imprimir(Character[][] mat) {
		System.out.println();
		
		for(int indiceLinha = 0; indiceLinha < mat.length; indiceLinha++) {
			Character[] linha = mat[indiceLinha];
			System.out.print("[ ");
			
			for(int indiceColuna = 0; indiceColuna < mat[indiceLinha].length; indiceColuna++) {
				
				Character elemento = mat[indiceLinha][indiceColuna];
								
				if(elemento == null) {
					System.out.print("_");
				} else {
					System.out.print(elemento);
				}				
				
				if(indiceColuna == linha.length - 1) {
					System.out.print(" ]");
				} else {
					System.out.print(" , ");
				}	
			}			
			System.out.println();
		}		
		
	}
	
	public static void mover(Character[][] mat) {
		encontrar(mat);
		
		int[] posicao = encontrar(mat);
		
		int linha = posicao[0];
		int coluna = posicao[1];
		
		Character elemento = mat[posicao[0]][posicao[1]];
	}
	
	public static int[] encontrar(Character[][] mat) {
		int[] posicoes = new int[2];
		posicoes[0] = 0;
		posicoes[1] = 0;		
		
		return posicoes;
	}
	
	private static void moverParaBaixoEComeco(Character[][] mat) {
		
	}
}
