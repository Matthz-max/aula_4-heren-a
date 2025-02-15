package aula_4;

public class ContaComercial extends Conta {

	private double limite;

	public ContaComercial(String nome, int numero, double saldo, Cores_1 cor, double limite) {
		super(nome, numero, saldo, cor);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return  to() + "ContaComercial [limite=" + limite + "]";
	}
	
	
}
