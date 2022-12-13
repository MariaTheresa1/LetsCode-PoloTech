package projetos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a hora: ");
		int horas = scanner.nextInt();
		
		System.out.print("Informe os minutos: ");
		int minutos = scanner.nextInt();
		
		System.out.print("Quantidade de horas a serem adicionada: ");
		int quantidadeDeHoras = scanner.nextInt();
		
		horas += quantidadeDeHoras;
		
		System.out.println("Brasil: " + ((horas + 24) % 24) + "h" + minutos + "min");
		System.out.println("México (dst): " + ((horas - 3 + 24) % 24) + "h" + minutos + "min");
		System.out.println("Londres: " + ((horas + 3 + 24) % 24) + "h" + minutos + "min");

	}
}
