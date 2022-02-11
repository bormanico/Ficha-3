package Ficha3;

public class Main {
	public static void main(String[] args) {
		ContaBancaria contaExemplo1 = new ContaBancaria("Manel");

		contaExemplo1.getInformacao();

		System.out.println("O saldo atual é: " + contaExemplo1.getSaldo() + "\n");

		contaExemplo1.depositar(256.87);

		System.out.println("O saldo após o depósito é: " + contaExemplo1.getSaldo() + "\n");

		contaExemplo1.levantar(23.17);

		System.out.println("O saldo após o levantamento é: " + contaExemplo1.getSaldo() + "\n");

		System.out.println("\n ----- Exercício 2 -----\n");

		Banco banco1 = new Banco("Super Banco");

		ContaBancaria contaExemplo2 = new ContaBancaria("Zézinho");

		contaExemplo2.depositar(5600);

		banco1.criaConta(contaExemplo2);

		System.out.println("O saldo da conta do " + banco1.getConta("Zézinho").getTitular() + " no Banco Super é: "
				+ banco1.getConta("Zézinho").getSaldo());

		banco1.getConta("Zézinho").depositar(333);

		System.out.println("O saldo da conta do " + banco1.getConta("Zézinho").getTitular()
				+ " no Banco Super, depois do depósito, é: " + banco1.getConta("Zézinho").getSaldo());

		banco1.getConta("Zézinho").levantar(55);

		System.out.println("O saldo da conta do " + banco1.getConta("Zézinho").getTitular()
				+ " no Banco Super, depois do levantamento, é: " + banco1.getConta("Zézinho").getSaldo());

		System.out.println("\n ----- Exercício 3 -----\n");

		Casa casa1 = new Casa("Rua das Murças, 33");

		casa1.setPrecoCusto(500000);
		casa1.setPrecoVenda(1000000);

		Casa casa2 = new Casa("Rua das Pretas, 1");

		casa2.setPrecoCusto(71000);
		casa2.setPrecoVenda(80000);

		Casa casa3 = new Casa("Estrada do Arco da Velha, 666");

		casa3.setPrecoCusto(330000);
		casa3.setPrecoVenda(1500000);

		System.out.println("Casa 1\n preço custo: " + casa1.getPrecoCusto() + "\n preço venda: " + casa1.getPrecoVenda()
				+ "\n margem lucro: " + casa1.getMargemLucro() + "\n % margem lucro: " + casa1.getPercentMargemLucro()
				+ "%\n");

		System.out.println("Casa 2\n preço custo: " + casa2.getPrecoCusto() + "\n preço venda: " + casa2.getPrecoVenda()
				+ "\n margem lucro: " + casa2.getMargemLucro() + "\n % margem lucro: " + casa2.getPercentMargemLucro()
				+ "%\n");

		System.out.println("Casa 3\n preço custo: " + casa3.getPrecoCusto() + "\n preço venda: " + casa3.getPrecoVenda()
				+ "\n margem lucro: " + casa3.getMargemLucro() + "\n % margem lucro: " + casa3.getPercentMargemLucro()
				+ "%\n");

		System.out.println("\n ----- Exercício 4 -----\n");

		banco1.addCasa(casa1);
		banco1.addCasa(casa2);
		banco1.addCasa(casa3);

		for (Casa iCasa : banco1.getCasaList()) {
			System.out.println("A casa com morada em " + iCasa.getMorada() + " tem valor de custo de "
					+ iCasa.getPrecoCusto() + " e valor de venda de " + iCasa.getPrecoVenda());
		}

		System.out.println("O lucro previsto para a venda das " + banco1.getCasaList().size() + " casas é de "
				+ banco1.getLucroPrevisto() + "\n");

		String moradaRemover = casa2.getMorada();

		banco1.removeCasa(moradaRemover);

		System.out.println("Depois de remover uma das casas ficamos com duas casas:");
		for (Casa iCasa : banco1.getCasaList()) {
			System.out.println(iCasa.getMorada());
		}

	}
}
