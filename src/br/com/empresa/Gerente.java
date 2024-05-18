package br.com.empresa;

public class    Gerente extends Funcionario {

    public Gerente(String nome, double valorHora, int horasTrabalhadas) {
        super(nome, valorHora, horasTrabalhadas);
    }

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        return salarioBase * 1.05; // 5% de bonificação
    }
}
