package aula_4;

import aula_4.Cores_1;

class ContaPoupanca extends Conta {

	public ContaPoupanca(String nome, int numero, double saldo, Cores_1 cor) {
		super(nome, numero, saldo, cor);
		 
	}

	@Override
	public String toString() {
		return "ContaPoupanca" + to();
	}

	 

	
	 
	 
}
