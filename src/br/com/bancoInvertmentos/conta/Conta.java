package br.com.bancoInvertmentos.conta;

public class Conta {
	
	private double checkEspecial;
	private double valor;
	private double saldo;
	public Conta() {}
	public Conta(double valor) {
		super();
		this.valor = valor;
	}
	public void limite() {
		checkEspecial = valor;
		if(valor <= 500 && valor <= saldo) {
			checkEspecial += 50;
			System.out.println("Checkespecial atual:"+checkEspecial);
			
		}else if(valor > 500 && valor <=saldo) {
			checkEspecial += valor * 0.5;
			System.out.println("Checkespecial com os 50%:"+checkEspecial);	
		}else if(checkEspecial >saldo){
			checkEspecial -= checkEspecial * 0.2;
			System.out.println("O checkespecial chegou no seu limite, taxa de 20% cobrada"
					+ ": "+checkEspecial);	
		}
	}
	public double Sacar(double sacar){
		saldo -= sacar;
		return saldo;
	}
	
	public double getSaldo() {
		saldo = valor;
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = valor;
	}
	public double getCheckEspecial() {
		return checkEspecial;
	}
	public void setCheckEspecial(double checkEspecial) {
		this.checkEspecial = checkEspecial;
	}
	public double getValor() {
		return valor;
	}
	public double setValor(double valor) {
		this.valor = valor;
		return this.valor;
	}

}
