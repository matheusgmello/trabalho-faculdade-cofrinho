package dev.matheus.moeda;

public abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    // metodo abstrato para converter o valor da moeda para Reais
    public abstract double converter();

    // metodo abstrato para retornar infos da moeda
    public abstract String info();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}