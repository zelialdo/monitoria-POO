package banco;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		OperaçãoBancaria contaZe = new ContaBancaria("Zelialdo", 1000);
		
		int opcao;
		do {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1. Depositar");
			System.out.println("2. Sacar");
			System.out.println("3. Verificar Saldo");
			System.out.println("4. Sair");
			
			opcao = scanner.nextInt();
			
			switch (opcao) {
				case 1:
					System.out.println("Digite o valor a ser depositado:");
					double valorDeposito = scanner.nextDouble();
					contaZe.depositar(valorDeposito);
					break;
				case 2:
					System.out.println("Digite o valor a ser sacado");
					double valorSaque = scanner.nextDouble();
					contaZe.sacar(valorSaque);
					break;
				case 3:
					contaZe.verificarSaldo();
					break;
				case 4:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 4);
		
		scanner.close();
	}

}
