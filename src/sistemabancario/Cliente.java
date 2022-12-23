package sistemabancario;

public class Cliente {
	private String cpf;
	private String nome;
	private String senha;
	public Conta conta;
	
	public Cliente(String cpf, String nome, String senha, Conta conta) {
		this.cpf = cpf;
		this.nome = nome;
		this.senha = senha;		
		this.conta = conta;
	}
	
	public void getCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String setCpf() {
		return this.cpf;
	}
	
	public void getNome(String nome) {
		this.nome = nome;
	}
	
	public String setNome() {
		return this.nome;
	}
	
	public void getSenha(String senha) {
		 this.senha = senha;
	}
	
	public String setSenha() {
		return this.senha;
	}
}
