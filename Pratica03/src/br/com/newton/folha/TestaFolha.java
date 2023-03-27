package br.com.newton.folha;

import javax.swing.JOptionPane;

public class TestaFolha {
	public static void main(String[] args) {
        // Entrada de dados
        String nome = JOptionPane.showInputDialog("Nome do funcionário:");
        double salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Salário fixo:"));
        int tipoProvento = Integer.parseInt(JOptionPane.showInputDialog("Tipo de provento (1=salário fixo, 2=comissão, 3=produtividade):"));

        // Criação do objeto Funcionario
        Funcionario funcionario = new Funcionario(nome, null,salarioFixo);

        // Processamento dos dados
        switch (tipoProvento) {
            case 2:
                double comissao = Double.parseDouble(JOptionPane.showInputDialog("Comissão:"));
                funcionario.setComissao(comissao);
                break;
            case 3:
                double valorUnidade = Double.parseDouble(JOptionPane.showInputDialog("Valor por unidade produzida:"));
                int qtdUnidades = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de unidades produzidas:"));
                break;
        }

        // Saída de dados
        String mensagem = "Proventos do funcionário " + funcionario.getNome() + ": R$" + funcionario.calcularProventos();
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
