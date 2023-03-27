package br.com.newton.automoveis;

import javax.swing.JOptionPane;

public class Onibus extends Veiculo{
	
	private int assentos;
	
	public Onibus(String placa, int ano, int assentos) {
		super(placa, ano);
		this.assentos = assentos;
	}
	public void exibirDados() {
        super.ExibibirDados(); // invoca o método exibirDados() da superclasse Veiculo
        JOptionPane.showMessageDialog(null, "Assentos: " + assentos, "Dados do Ônibus", JOptionPane.INFORMATION_MESSAGE);
    }
}
