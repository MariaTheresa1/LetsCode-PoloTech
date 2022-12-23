package sistemabancario;

import java.util.Scanner;

/* *** Sistema Bancário ***
- Deposito
- Sacar
- Transferir

- Transferir apenas se tiver saldo
- Sacar apenas se tiver saldo

- Todos os atributos tem que ser privados */

public class SistemaBancario {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Conta conta1 = new Conta(44444, 0001, 100.0f);
		Conta conta2 = new Conta(55555, 0001, 200.0f);

		Cliente cliente1 = new Cliente("111", "Maria", "123", conta1);
		Cliente cliente2 = new Cliente("222", "Pedro", "12345", conta2);
		
		Cliente clienteAtual = login(cliente1, cliente2);

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
				//tranferir(cliente1, cliente2);
				break;
			case 5:
				clienteAtual = login(cliente1, cliente2);
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
	
	public static Cliente login(Cliente cliente1, Cliente cliente2) {
		
		Scanner scanner = new Scanner(System.in);
				
		while(true) {
			
			System.out.println("--- Login ---");
			
			System.out.print("Informe o CPF: ");
			String cpf = scanner.next();
			
			System.out.print("Informe a senha: ");
			String senha = scanner.next();
			
			if(cliente1.setCpf().equals(cpf) && cliente1.setSenha().equals(senha)) {
				System.out.printf("\nOlá %s.\n", cliente1.setNome());
				return cliente1;
			} else if (cliente2.setCpf().equals(cpf) && cliente2.setSenha().equals(senha)) {		
				System.out.printf("\nOlá %s.\n", cliente2.setNome());
				return cliente2;
			} else {
				System.out.println("CPF e/ou senha inválidos, tente novamente.\n");
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
		
		System.out.println("\nValor depositado com sucesso.");

	}
	
	public static void sacar(Cliente cliente) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Qual o valor que deseja sacar? ");
		float valor = scanner.nextFloat();
		
		if(valor <= cliente.conta.setSaldo()) {
			
			cliente.conta.getSaldo(cliente.conta.setSaldo() - valor);
			System.out.println("\nSaque bem sucedido.");

		} else {
			System.out.println("\nSaldo insuficiente.");
		}
	}
	
	public static void tranferir(Cliente cliente1, Cliente cliente2) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Qual o valor que deseja tranferir? ");
		float valor = scanner.nextFloat();
		
	}
	
}
