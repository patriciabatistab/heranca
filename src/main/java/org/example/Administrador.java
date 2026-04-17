package org.example;

public class Administrador extends Empregado{
    private double ajudaDeCustos;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCustos) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCustos = ajudaDeCustos;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCustos;
    }

    public double getAjudaDeCustos() {
        return ajudaDeCustos;
    }

    public void setAjudaDeCustos(double ajudaDeCustos) {
        this.ajudaDeCustos = ajudaDeCustos;
    }
}
