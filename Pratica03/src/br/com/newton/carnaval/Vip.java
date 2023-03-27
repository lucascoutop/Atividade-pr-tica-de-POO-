package br.com.newton.carnaval;

import javax.swing.JOptionPane;

public class Vip extends Ingresso {
	
	private double adicional;
	
	public Vip(double valor, double adicional) {
		super(valor);
		this.adicional = adicional;
	}
	
	public void imprimeValor() {
	    double valorTotal = getValor() + adicional;
	    String mensagem = "Ingresso VIP: R$" + valorTotal;
	    JOptionPane.showMessageDialog(null, mensagem);
	}

}
