package br.com.newton.folha;

public class Funcionario {
	private String nome;
	private String matricula;
	private double salarioFixo;
	private double comissao;
	private double valorUnidade;
	
	
	    
	public double getComissao() {
		return comissao;
	}

	public double getValorUnidade() {
		return valorUnidade;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public void setValorUnidade(double valorUnidade) {
		this.valorUnidade = valorUnidade;
	}

	public Funcionario(String nome, String matricula, double salarioFixo) {
		this.nome = nome;
	    this.matricula = matricula;
	    this.salarioFixo = salarioFixo;
	}
	    
	public String getNome() {
	    return nome;
	}
	    
	public void setNome(String nome) {
	    this.nome = nome;
	}
	    
	public String getMatricula() {
	    return matricula;
	}
	    
	public void setCpf(String matricula) {
	    this.matricula = matricula;
	}
	    
	public double getSalarioFixo() {
	    return salarioFixo;
	}
	    
	public void setSalarioFixo(double salarioFixo) {
	    this.salarioFixo = salarioFixo;
	}
	    
	public double calcularProventos() {
	    return salarioFixo;
	}

	
	
	
}
