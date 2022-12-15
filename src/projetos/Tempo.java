package projetos;

import java.util.Scanner;

public class Tempo {
	
	public int ano;
	public int mes;
	public int dia;
	public int hora;
	public int minuto;
	public int segundo;
	
	public static void main(String[] args) {
		pegarDados();
	}
	
	public static void pegarDados() {
		Scanner scanner = new Scanner(System.in);
		
		Tempo hoje = new Tempo();
		int quantidadeAdicionar;
		String tipoDaQuantidade;
		
		System.out.print("Informe o ano: ");
		hoje.ano = scanner.nextInt();
		
		System.out.print("Informe o mês: ");
		hoje.mes = scanner.nextInt();
		
		System.out.print("Informe o dia: ");
		hoje.dia = scanner.nextInt();
		
		System.out.print("Informe o hora: ");
		hoje.hora = scanner.nextInt();
		
		System.out.print("Informe o minuto: ");
		hoje.minuto = scanner.nextInt();
		
		System.out.print("Informe o segundo: ");
		hoje.segundo = scanner.nextInt();		
		
		System.out.printf("%d/%d/%d %d:%d:%d\n", hoje.dia, hoje.mes, hoje.ano, hoje.hora, hoje.minuto, hoje.segundo);
		
		System.out.print("Informe um valor e um tipo para adicionar " + 
		"(y, m, d, h, M, s): ");
		quantidadeAdicionar = scanner.nextInt();
		
		//tipoDaQuantidade.charAt(tipoDaQuantidade.length() -1);
		tipoDaQuantidade = scanner.next();
		
		exibirNovaData(quantidadeAdicionar, tipoDaQuantidade, hoje.ano, hoje.mes, hoje.dia, hoje.hora, hoje.minuto, hoje.segundo);
	
	}
	
	public static void exibirNovaData(int quant, String tipo, int y, int m, int d, int h, int M, int s) {
		
		int numeroDeDias = 30;
		
		switch(tipo) {
			// ANOS
			case "y":
				y += quant;
				break;
				
			// MESES
			case "m":
				m += quant;
				m /= 12;
				m %= 12;
				break;
			
			// DIAS
			case "d":
				break;
				
			// HORAS
			case "h":
				break;
								
			// MINUTOS
			case "M":
				break;
								
			// SEGUNDOS
			case "s":
				break;
											
			default:
				System.out.println("Tipo da quantidade inválida.");
				break;
		}
		
		switch (m) {
		case 1: case 3: case 5: case 7:
		case 8:	case 10: case 12: 
			numeroDeDias = 31;
			break;
		case 4: case 6: case 9: case 11:
			numeroDeDias = 30;
			break;			
		case 2:
			if(((y % 4 == 0) && !(y % 100 == 0)) || 
					(y % 400 == 0)) {
				numeroDeDias = 29;
			} else {
				numeroDeDias = 28;
			}
		default:
			break;
		}
		
		System.out.println("\nApós a quantidade ser adicionada...");		
		System.out.printf("A nova data é %d/%d/%d %d:%d:%d\n", d, m, y, h, M, s);
		
	}
}
