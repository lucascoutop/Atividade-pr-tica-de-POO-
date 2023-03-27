package br.com.newton.carnaval;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Camarote extends Ingresso{
	private double adicional;
	  private String localizacao;

	  public Camarote(double valor, double adicional, String localizacao) {
	    super(valor);
	    this.adicional = adicional;
	    this.localizacao = localizacao;
	  }

	  public void imprimeValor() {
	    double valorTotal = getValor() + adicional;
	    String mensagem = "Ingresso Camarote: R$" + valorTotal + "\nLocalização: " + localizacao;
	    JOptionPane.showMessageDialog(null, mensagem);
	  }
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    String[] opcoes = { "Ingresso Normal", "Ingresso VIP", "Ingresso Camarote" };
	    int escolha = JOptionPane.showOptionDialog(null, "Escolha o tipo de ingresso:", "Ingressos",
	        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

	    switch (escolha) {
	      case 0:
	        Normal ingressoNormal = new Normal(50.0);
	        ingressoNormal.imprimeValor();
	        break;
	      case 1:
	        Vip ingressoVIP = new Vip(100.0, 50.0);
	        ingressoVIP.imprimeValor();
	        break;
	      case 2:
	        JOptionPane.showMessageDialog(null, "Informe a localização do camarote:");
	        String localizacao = scanner.nextLine();

	        JOptionPane.showMessageDialog(null, "Informe o valor do ingresso:");
	        double valor = scanner.nextDouble();

	        JOptionPane.showMessageDialog(null, "Informe o valor adicional do camarote:");
	        double adicional = scanner.nextDouble();

	        Camarote ingressoCamarote = new Camarote(valor, adicional, localizacao);
	        ingressoCamarote.imprimeValor();
	        break;
	      default:
	        JOptionPane.showMessageDialog(null, "Opção inválida");
	        break;
	    }
	    scanner.close();
	  }
}
