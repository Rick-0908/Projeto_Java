package Atividades_Listas_Senai.Atv20_ForEach;

import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[20];
        int count = 0;
        int opcao;

        do {

            System.out.println("\n=== MENU DE CADASTRO ===");
            System.out.println("1 - Cadastrar nomes");
            System.out.println("2 - Listar todos os nomes");
            System.out.println("3 - Listar nomes que começam com uma letra");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                if (count < nomes.length) {
                    System.out.print("Digite o nome a ser cadastrado: ");
                    String nome = scanner.nextLine();
                    nomes[count] = nome;
                    count++;
                    System.out.println("Nome cadastrado com sucesso!");
                } else {
                    System.out.println("Limite máximo de cadastros atingido!");
                }

            } else if (opcao == 2) {

                System.out.println("\n=== LISTA DE TODOS OS NOMES ===");
                if (count == 0) {
                    System.out.println("Nenhum nome cadastrado ainda.");
                } else {
                    for (String nome : nomes) {
                        if (nome != null) {
                            System.out.println("- " + nome);
                        }
                    }
                }

            } else if (opcao == 3) {

                System.out.print("Digite a letra inicial para filtrar: ");
                String letra = scanner.nextLine();

                System.out.println("\n=== NOMES QUE COMEÇAM COM '" + letra.toUpperCase() + "' ===");
                boolean encontrou = false;

                for (String nome : nomes) {
                    if (nome != null && nome.toUpperCase().startsWith(letra.toUpperCase())) {
                        System.out.println("- " + nome);
                        encontrou = true;
                    }
                }

                if (!encontrou) {
                    System.out.println("Nenhum nome encontrado com essa letra inicial.");
                }

            } else if (opcao == 0) {

                System.out.println("Saindo do sistema...");

            } else {

                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}