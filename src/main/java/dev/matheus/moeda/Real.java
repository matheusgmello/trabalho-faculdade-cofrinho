package dev.matheus.moeda;

public class Real extends Moeda {

    public Real(double valor) {
        super(valor);
    }

    @Override
    public double converter() {
        return this.valor;
    }

    @Override
    public String info() {
        return "Real - Valor: R$" + this.valor;
    }
}