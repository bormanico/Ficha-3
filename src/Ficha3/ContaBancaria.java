package Ficha3;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContaBancaria {
	private String titular;
	private double saldo;
	private LocalDate dataAbertura;

	public ContaBancaria(String aTitular) {
		titular = aTitular;
		saldo = 0.0;
		dataAbertura = LocalDate.now();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public String getTitular() {
		return titular;
	}

	public void getInformacao() {
		DecimalFormat dec = new DecimalFormat("#0.00");

		System.out.println("Titular: " + titular + " Saldo: €" + dec.format(saldo) + " Data Abertura: "
				+ dataAbertura.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n");
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void levantar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			System.out.println("O valor é superior ao saldo!");
		}
	}
}
