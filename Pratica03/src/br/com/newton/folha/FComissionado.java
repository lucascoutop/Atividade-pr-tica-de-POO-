package br.com.newton.folha;

public class FComissionado extends Funcionario{
	private double vendas;
    private double taxaComissao;
    
    public FComissionado(String nome, String matricula, double salarioFixo, double taxaComissao) {
        super(nome, matricula, salarioFixo);
        this.taxaComissao = taxaComissao;
    }
    
    public double getVendas() {
        return vendas;
    }
    
    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
    
    public double getTaxaComissao() {
        return taxaComissao;
    }
    
    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
    
    public double calcularProventos() {
        return super.calcularProventos() + vendas * taxaComissao;
    }
}
