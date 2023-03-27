package br.com.newton.carnaval;

import javax.swing.JOptionPane;

public class Normal extends Ingresso{
	
	public Normal(double valor) {
	    super(valor);
	}

	public void imprimeValor() {
		String mensagem = "Ingresso Normal: R$" + getValor();
	    JOptionPane.showMessageDialog(null, mensagem);
	}

}
