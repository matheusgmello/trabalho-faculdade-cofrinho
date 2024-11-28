package dev.matheus.moeda;

public abstract class Moeda {
    protected double valor; // Valor da moeda

    public Moeda(double valor) {
        this.valor = valor;
    }

    // Método abstrato para converter o valor da moeda para Reais
    public abstract double converter();

    // Método abstrato para retornar informações da moeda
    public abstract String info();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}