package caixaeletronico;

import java.util.Scanner;

public class CaixaEletronico {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		
		cliente.nome = "Maria";
		cliente.isAtivo = true;
		cliente.dataCadastro = "21/12/22";
		
		conta.saldo = 100.0f;
		conta.numero = 12345;
		conta.agencia = 0001;
		
		cliente.conta = conta;
		
		int escolha;

		do {					
			System.out.print("*** MENU ***\n" + 
					"1 - Consultar Saldo\n" + 
					"2 - Sacar\n" + 
					"3 - Depositar\n" +
					"0 - Sair\n" + 
					"Digite uma opção: ");
			escolha = scanner.nextInt();
			
			switch (escolha) {
				case 1:
					
					System.out.printf("\nOlá %s, seu saldo é de R$ %.2f.\n\n", cliente.nome, cliente.conta.saldo);
					break;
					
				case 2:
					
					System.out.print("\nInforme o valor que deseja sacar: ");
					float saque = scanner.nextFloat();
					
					if(saque > conta.saldo) {
						System.out.print("\nSaldo insuficiente. ");
						System.out.printf("Seu saldo atual é de %.2f.\n", conta.saldo);
						System.out.println("Tente novamente.\n");
					} else {
						conta.saldo -= saque;
						System.out.println("\nSaque efetuado com sucesso.");
						System.out.printf("Seu saldo atual é de %.2f.\n", conta.saldo);
					}
					
					break;
					
				case 3:
					
					System.out.print("\nInforme o valor que deseja depositar: ");
					float deposito = scanner.nextFloat();
					
					conta.saldo += deposito;
					System.out.println("\nDepósito efetuado com sucesso.");
					System.out.printf("Seu saldo atual é de %.2f.\n", conta.saldo);
					
					break;
					
				case 0:
					
					System.out.println("\nPrograma encerrado.");
					break;
					
				default: 
					
					System.out.println("\nOpção inválida. Tente novamente.");
					break;
					
			}
		} while (escolha != 0);
	}
}
