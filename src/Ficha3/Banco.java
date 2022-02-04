package Ficha3;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nomeBanco;
	private List<ContaBancaria> contaBancariaList;
	private List<Casa> casaList;

	public Banco(String nome) {
		this.setNomeBanco(nome);
		contaBancariaList = new ArrayList<ContaBancaria>(100);
		casaList = new ArrayList<Casa>(100);
	}

	public List<ContaBancaria> getContaBancariaList() {
		return contaBancariaList;
	}

	// em vez de setter receber array e fazer append ao que existe
	public void setContaBancariaList(List<ContaBancaria> contaBancariaList) {
		this.contaBancariaList = contaBancariaList;
	}

	public void criaConta(ContaBancaria aConta) {
		contaBancariaList.add(aConta);
	}

	public ContaBancaria getConta(String titular) {

		for (ContaBancaria iContaBancaria : contaBancariaList) {
			if (iContaBancaria.getTitular() == titular) {

				return iContaBancaria;
			}

		}
		return null;
	}

	public void addCasa(Casa aCasa) {
		casaList.add(aCasa);
	}

	public void removeCasa(String aMorada) {
		for (Casa iCasa : casaList) {
			if (iCasa.getMorada() == aMorada) {
				casaList.remove(iCasa);
			}
		}
	}

	public double getLucroPrevisto() {
		double margemLucroSum = 0;

		for (Casa iCasa : casaList) {
			margemLucroSum += iCasa.getMargemLucro();
		}

		return margemLucroSum;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public List<Casa> getCasaList() {
		return casaList;
	}

	public void setCasaList(List<Casa> casaList) {
		this.casaList = casaList;
	}

}
