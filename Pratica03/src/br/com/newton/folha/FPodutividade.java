package br.com.newton.folha;

public class FPodutividade extends Funcionario{

	private int unidadesProduzidas;
	private double valorPorUnidade;
	    
	public FPodutividade(String nome, String matricula, double salarioFixo, double valorPorUnidade) {
		super(nome, matricula, salarioFixo);
	    this.valorPorUnidade = valorPorUnidade;
	}
	    
	public int getUnidadesProduzidas() {
	     return unidadesProduzidas;
	}
	    
	public void setUnidadesProduzidas(int unidadesProduzidas) {
	    this.unidadesProduzidas = unidadesProduzidas;
	}
	    
	public double getValorPorUnidade() {
		return valorPorUnidade;
	}
	    
	public void setValorPorUnidade(double valorPorUnidade) {
		this.valorPorUnidade = valorPorUnidade;
	}
	    
	public double calcularProventos() {
		return super.calcularProventos() + unidadesProduzidas * valorPorUnidade;
	}
	
}
