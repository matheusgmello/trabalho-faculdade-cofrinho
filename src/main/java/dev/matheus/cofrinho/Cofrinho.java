package dev.matheus.cofrinho;

import dev.matheus.moeda.Moeda;

import java.util.ArrayList;

// clase principal responsavel por gerenciar o cofrinho em si
// usa uma coleção para armazenar as moedas e permite adicionar, remover e calcular valores.
public class Cofrinho {
    private ArrayList<Moeda> listaMoedas;

    public Cofrinho() {
        listaMoedas = new ArrayList<>();
    }

    // adiciona uma moeda ao cofrinho.
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
        System.out.println(moeda.info() + " adicionada ao cofrinho.");
    }

    // remove uma moeda do cofrinho o ID informado.
    public void removerPorIndice(int indice) {
        if (indice >= 0 && indice < listaMoedas.size()) {
            Moeda moedaRemovida = listaMoedas.remove(indice);
            System.out.println(moedaRemovida.info() + " removida do cofrinho.");
        } else {
            System.out.println("Índice inválido. Operação cancelada.");
        }
    }

    // mostra todas as moedas armazenadas no cofrinho.
    public void listagemMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
        } else {
            System.out.println("Moedas no cofrinho:");
            for (Moeda moeda : listaMoedas) {
                System.out.println("- " + moeda.info());
            }
        }
    }

    public void listarComIndices() {
        if (listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
        } else {
            System.out.println("Moedas no cofrinho:");
            for (int i = 0; i < listaMoedas.size(); i++) {
                System.out.println(i + ". " + listaMoedas.get(i).info());
            }
        }
    }

    // calcula o valor total das moedas no cofrinho, convertido para Reais.
    public double totalConvertido() {
        double total = 0.0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();
        }
        return total;
    }
}
