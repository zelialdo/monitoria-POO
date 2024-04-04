package banco;

public class ContaBancaria implements OperaçãoBancaria {
	
	private String titular;
	private double saldo;
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public ContaBancaria(String titular, double saldoInicial) {
		this.titular = titular;
		this.saldo = saldoInicial;
	}
		
	
	@Override
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
	}
	
	@Override
	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			System.out.println("saque de R$" + valor + " realizado com sucesso.");
		} else {
			System.out.println("Saldo insulficiente para efetuar o saque.");
		}
	}
	
	@Override
	public void verificarSaldo() {
		System.out.println("Saldo atual: R$" + saldo);
	}
	
}
