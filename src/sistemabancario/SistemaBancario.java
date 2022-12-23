package sistemabancario;

import java.util.ArrayList;
import java.util.Scanner;

/* 

*** Sistema Bancário ***
- Deposito
- Sacar
- Transferir

- Transferir apenas se tiver saldo
- Sacar apenas se tiver saldo

- Todos os atributos tem que ser privados

*/

public class SistemaBancario {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Conta conta1 = new Conta(44444, 0001, 100.0f);
		Conta conta2 = new Conta(55555, 0001, 200.0f);
		Conta conta3 = new Conta(66666, 0001, 300.0f);

		Cliente cliente1 = new Cliente("111", "Maria", "123", conta1);
		Cliente cliente2 = new Cliente("222", "Pedro", "12345", conta2);
		Cliente cliente3 = new Cliente("333", "Ana", "1234", conta3);
		
		ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();
		
		listaDeClientes.add(cliente1);
		listaDeClientes.add(cliente2);
		listaDeClientes.add(cliente3);

		Cliente clienteAtual = login(listaDeClientes);

		int escolha;
		
		do {

			System.out.println("*** MENU ***");			
			System.out.println("1 - Consultar Saldo");
			System.out.println("2 - Depositar");
			System.out.println("3 - Sacar");
			System.out.println("4 - Transferir");
			System.out.println("5 - Trocar usuário");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");

			escolha = scanner.nextInt();
			
			switch (escolha) {
			case 1:
				consultarSaldo(clienteAtual);
				break;
			case 2:
				depositar(clienteAtual);
				break;
			case 3:
				sacar(clienteAtual);
				break;
			case 4:
				listaDeClientes = tranferir(clienteAtual, listaDeClientes);
				break;
			case 5:
				clienteAtual = login(listaDeClientes);
				break;
			case 0:
				System.out.println("\nPrograma encerrado.");
				break;				
			default:
				System.out.print("Opção inválida, tente novamente: ");
				break;
			}
			
		} while (escolha != 0);		
	}
	
	public static Cliente login(ArrayList<Cliente> listaDeClientes) {
		
		Scanner scanner = new Scanner(System.in);
				
		Cliente clienteSelecionado = null;

		while(true) {
			
			System.out.println("--- Login ---");
			
			System.out.print("Informe o CPF: ");
			String cpf = scanner.next();
			
			System.out.print("Informe a senha: ");
			String senha = scanner.next();
			
			for(Cliente cliente: listaDeClientes) {
				if(cpf.equals(cliente.setCpf())) {
					clienteSelecionado = cliente;
					break;
				}
			}
			
			if(clienteSelecionado != null) {
				if(senha.equals(clienteSelecionado.setSenha())) {
					System.out.printf("\nOlá %s!\n\n", clienteSelecionado.setNome());	
					return clienteSelecionado;
				} else {
					System.out.println("Senha inválida, tente novamente.\n");
				}
			} else {
				System.out.println("CPF inválido, tente novamente.\n");
			}
		}	
	}
	
	public static void consultarSaldo(Cliente cliente) {
		
		System.out.printf("\nSeu saldo atual é de R$ %.2f.\n\n", cliente.conta.setSaldo());

	}
	
	public static void depositar(Cliente cliente) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Qual o valor que deseja depositar? ");
		float valor = scanner.nextFloat();
		
		cliente.conta.getSaldo(cliente.conta.setSaldo() + valor);
		
		System.out.println("\nValor depositado com sucesso.\n");

	}
	
	public static void sacar(Cliente cliente) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Qual o valor que deseja sacar? ");
		float valor = scanner.nextFloat();
		
		if(valor <= cliente.conta.setSaldo()) {
			
			cliente.conta.getSaldo(cliente.conta.setSaldo() - valor);
			System.out.println("\nSaque bem sucedido.\n");

		} else {
			System.out.printf("\nSaldo insuficiente. Seu saldo é de R$ %.2f\n\n", cliente.conta.setSaldo());
		}
	}
	
	public static ArrayList<Cliente> tranferir(Cliente clienteAtual, ArrayList<Cliente> listaDeClientes) {

		Scanner scanner = new Scanner(System.in);
		Cliente clienteSelecionado = null;
		
		System.out.print("Qual o numero da conta: ");
		int conta = scanner.nextInt();
		
		System.out.print("Qual o número da agencia: ");
		int agencia = scanner.nextInt();
		
		for(Cliente cliente: listaDeClientes) {
			if(conta == cliente.conta.setNumero()) {
				clienteSelecionado = cliente;
				break;
			} 
		}
		if(clienteSelecionado != null) {
			if(agencia == clienteSelecionado.conta.setAgencia()) {
				System.out.print("Qual o valor que deseja tranferir? ");
				float valor = scanner.nextFloat();
								
				if(valor <= clienteAtual.conta.setSaldo()) {
					for(Cliente cliente: listaDeClientes) {
						if(cliente.equals(clienteAtual)) {
							cliente.conta.getSaldo(cliente.conta.setSaldo() - valor);
						}
						if(cliente.equals(clienteSelecionado)) {
							cliente.conta.getSaldo(cliente.conta.setSaldo() + valor);
						}
					}
					System.out.println("Transferência bem sucedida.\n");
				} else {
					System.out.printf("Saldo insuficiente. Seu saldo é de R$ %.2f\n\n", clienteAtual.conta.setSaldo());
				}

			} else {
				System.out.println("Número da agencia não encontrado.\n");
			}
		} else {
			System.out.println("Número da conta não encontrado.\n");
		}
		return listaDeClientes;
	}	
}
