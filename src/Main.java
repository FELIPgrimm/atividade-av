package br.com.empresa;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Guilherme", 50, 160);
        Lider lider = new Lider("Alecxandre", 75, 160);
        Gerente gerente = new Gerente("Felipe", 120, 160);

        System.out.println("Salário do Funcionário: " + funcionario.calcularSalario());
        System.out.println("Salário do Líder: " + lider.calcularSalario());
        System.out.println("Salário do Gerente: " + gerente.calcularSalario());
    }
}
