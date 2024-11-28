package dev.matheus.cofrinho;

import dev.matheus.moeda.Moeda;

import java.util.ArrayList;

// Clase principal responsavel por gerenciar o cofrinho em si
// Usa uma coleção para armazenar as moedas e permite adicionar, remover e calcular valores.
public class Cofrinho {
    private ArrayList<Moeda> listaMoedas;

    public Cofrinho() {
        listaMoedas = new ArrayList<>();
    }

    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
        System.out.println(moeda.info() + " adicionada ao cofrinho.");
    }

    public void removerPorIndice(int indice) {
        if (indice >= 0 && indice < listaMoedas.size()) {
            Moeda moedaRemovida = listaMoedas.remove(indice);
            System.out.println(moedaRemovida.info() + " removida do cofrinho.");
        } else {
            System.out.println("Índice inválido. Operação cancelada.");
        }
    }

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

    public double totalConvertido() {
        double total = 0.0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();
        }
        return total;
    }
}