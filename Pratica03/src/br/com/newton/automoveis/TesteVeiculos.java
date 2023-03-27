package br.com.newton.automoveis;

import javax.swing.JOptionPane;

public class TesteVeiculos {
	public static void main(String[] args) {
		//instanciando um objeto da classe Onibus
		String placaOnibus = JOptionPane.showInputDialog("Informe a placa do ônibus:");
		int anoOnibus = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do ônibus:"));
		int assentosOnibus = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de assentos:"));
		Onibus onibus = new Onibus(placaOnibus, anoOnibus, assentosOnibus);
		
		//executando o método ExibirDados() da classe Onibus
		JOptionPane.showMessageDialog(null, onibus.ExibibirDados());
		
		// Instanciando um objeto da classe Caminhao
        String placaCaminhao = JOptionPane.showInputDialog("Informe a placa do caminhão:");
        int anoCaminhao = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do caminhão:"));
        int eixosCaminhao = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de eixos do caminhão:"));
        Caminhao caminhao = new Caminhao(placaCaminhao, anoCaminhao, eixosCaminhao);

        // Executando o método exibirDados() da classe Caminhao
        JOptionPane.showMessageDialog(null, caminhao.exibirDados());
	}
}
