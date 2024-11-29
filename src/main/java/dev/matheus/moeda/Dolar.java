package dev.matheus.moeda;

public class Dolar extends Moeda {
    private static final double TAXA_CONVERSAO = 6.0; // Taxa atual para conversão para Reais

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public double converter() {
        return this.valor * TAXA_CONVERSAO;
    }

    @Override
    public String info() {
        return "Dólar - Valor: $" + this.valor;
    }
}