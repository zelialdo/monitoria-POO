package banco;

public interface OperaçãoBancaria {
	void depositar(double valor);
	void sacar(double valor);
	void verificarSaldo();
}
