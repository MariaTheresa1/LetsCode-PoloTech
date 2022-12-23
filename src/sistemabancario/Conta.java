package sistemabancario;

public class Conta {
	private int numero;
	private int agencia;
	private float saldo;
	
	public Conta(int numero, int agencia, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	public void getNumero(int numero) {
		this.numero = numero;
	}
	
	public int setNumero() {
		return this.numero;
	}
	
	public void getAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int setAgencia() {
		return this.agencia;
	}
	
	public void getSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public float setSaldo() {
		return this.saldo;
	}
	
	
}
