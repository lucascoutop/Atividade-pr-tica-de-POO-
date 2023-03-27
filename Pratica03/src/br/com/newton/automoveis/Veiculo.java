package br.com.newton.automoveis;

import javax.swing.JOptionPane;

public class Veiculo {
	
	private String placa = "";
	private int ano = 0;
	
	public void ExibibirDados() {
		String dados = "Placa: " + this.placa + "\n" + "Ano: " + this.placa;
		JOptionPane.showMessageDialog(null, dados, "Dados do Veículo:", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public Veiculo() {
	}
	
	public Veiculo(String placa, int ano) {
		super();
		this.placa = placa;
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public int getAno() {
		return ano;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
}
