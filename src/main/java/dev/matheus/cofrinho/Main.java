package dev.matheus.cofrinho;

import dev.matheus.moeda.Dolar;
import dev.matheus.moeda.Euro;
import dev.matheus.moeda.Real;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Menu Cofrinho ===");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total convertido");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual moeda deseja adicionar? (Informe o número 1, 2 ou 3)");
                    System.out.println("1. Dólar\n2. Euro\n3. Real");
                    int tipoMoeda = scanner.nextInt();
                    System.out.print("Informe o valor: ");
                    double valor = scanner.nextDouble();

                    switch (tipoMoeda) {
                        case 1 -> cofrinho.adicionar(new Dolar(valor));
                        case 2 -> cofrinho.adicionar(new Euro(valor));
                        case 3 -> cofrinho.adicionar(new Real(valor));
                        default -> System.out.println("Opção inválida.");
                    }
                    break;
                case 2:
                    if (cofrinho.totalConvertido() == 0) {
                        System.out.println("O cofrinho está vazio. Não há moedas para remover.");
                    } else {
                        cofrinho.listarComIndices();
                        System.out.print("Informe o índice da moeda que deseja remover: ");
                        int indice = scanner.nextInt();
                        cofrinho.removerPorIndice(indice);
                    }
                    break;
                case 3:
                    cofrinho.listagemMoedas();
                    break;
                case 4:
                    System.out.println("Total em Reais: R$ " + cofrinho.totalConvertido());
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}