package bancoInvestimentos;

import java.util.Scanner;


import br.com.bancoInvertmentos.conta.Conta;

public class GerenciadorConta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		var conta = new Conta();
		double valor;

		String exibir = "Selecione uma opcoes abaixo:\r\n"
				+ "1 - Consultar saldo\r\n"
				+ "2 - consultar cheque especial\r\n"
				+ "3 - Depositar dinheiro\r\n"
				+ "4 - Sacar dinheiro\r\n"
				+ "5 - Pagar um boleto\r\n"
				+ "6 - Verificar se a conta está usando cheque especial.\r\n"
				+ "7 - Sair";
		System.out.println(exibir);
		String op = scanner.next();
		while (op != "7"){
			switch (op) {
			case "1": {
				System.out.println(conta.getSaldo());
				op = scanner.next();
				break;
			}
			case "2": {
				System.out.println(conta.getCheckEspecial());
				op = scanner.next();
				break;
			}
			case "3": {
				valor = scanner.nextDouble();
				System.out.println(conta.setValor(valor));
				op = scanner.next();
				break;
			}
			case "4": {
				valor = scanner.nextDouble();
				System.out.println(conta.Sacar(valor));
				op = scanner.next();
				break;
			}
			case "5": {
				System.out.println("Pagar boleto: sim ou nao?");
				op = scanner.next();
				if(op =="sim") {
				System.out.println("Pagando pago....");
				}else {
					System.out.println("Pamento cancelado....");
				}
				System.out.println(exibir);
				op = scanner.next();
				break;
			}
			case "6": {
				conta.limite();
				conta.getCheckEspecial();
				op = scanner.next();
				break;
			}
			case "7": {
				System.out.println("Saindo...");
				break;
			}
			default:
				System.out.println("Opcao invalida!!!!");
				break;
			}
		}

	}

}
