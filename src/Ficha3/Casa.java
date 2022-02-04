package Ficha3;

public class Casa {
	private String morada;
	private double precoCusto;
	private double precoVenda;

	public Casa() {
	}

	public Casa(String morada) {
		this.morada = morada;
	}

	public double getMargemLucro() {
		return (precoVenda - precoCusto);
	}

	public double getPercentMargemLucro() {
		return ((precoVenda - precoCusto) / precoCusto) * 100;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

}
