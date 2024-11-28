package dev.matheus.moeda;

public class Euro extends Moeda {
    private static final double TAXA_CONVERSAO = 6.0; // Taxa de conversão para Reais

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public double converter() {
        return this.valor * TAXA_CONVERSAO;
    }

    @Override
    public String info() {
        return "Euro - Valor: €" + this.valor;
    }
}