package aula_4;

public class Conta {

	private String nome;
	private int numero;
	private double saldo;
	private Cores_1 cor;
	private double limite;

	public Conta(String nome, int numero, double saldo, Cores_1 cor) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
		this.cor = cor;

	}

	public void sacar(double saque) {

		saldo = saldo - saque;
	}

	public void depositar(double deposito) {

		saldo = saldo + deposito;

	}

	public void limite(double limite) {

		limite = saldo = limite;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String to() {
		return "Conta [nome=" + nome + ", numero=" + numero + ", saldo=" + saldo + ", cor=" + cor + "]";
	}

}
