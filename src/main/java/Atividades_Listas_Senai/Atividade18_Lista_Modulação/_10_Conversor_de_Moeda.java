package Atividades_Listas_Senai.Atividade18_Lista_Modulação;

import java.util.Scanner;

public class _10_Conversor_de_Moeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        String resp, respIF;

        do {
            System.out.println("Insira seu valor:");
            valor = sc.nextDouble();

            System.out.println("Deseja convertê-lo (Sim/Não)?");
            resp = sc.next();

        } while (!resp.equalsIgnoreCase("Sim"));

        System.out.println("O seu valor é em qual moeda (Real, Dólar ou Euro)?");
        respIF = sc.next();

        if (respIF.equalsIgnoreCase("Real")) {
            System.out.println("Deseja converter para qual das 2 moedas (Dólar ou Euro)?");
            String resp01 = sc.next();
            if (resp01.equalsIgnoreCase("Dólar") || resp01.equalsIgnoreCase("Dolar")) {
                double resultado = conversorMoedas("Real", "Dolar", valor);
                System.out.printf("R$ %.2f = US$ %.2f\n", valor, resultado);
            } else if (resp01.equalsIgnoreCase("Euro")) {
                double resultado = conversorMoedas("Real", "Euro", valor);
                System.out.printf("R$ %.2f = € %.2f\n", valor, resultado);
            } else {
                System.out.println("Digite uma das opções");
            }

        } else if (respIF.equalsIgnoreCase("Dólar") || respIF.equalsIgnoreCase("Dolar")) {
            System.out.println("Deseja converter para qual das 2 moedas (Real ou Euro)?");
            String resp02 = sc.next();
            if (resp02.equalsIgnoreCase("Real")) {
                double resultado = conversorMoedas("Dolar", "Real", valor);
                System.out.printf("US$ %.2f = R$ %.2f\n", valor, resultado);
            } else if (resp02.equalsIgnoreCase("Euro")) {
                double resultado = conversorMoedas("Dolar", "Euro", valor);
                System.out.printf("US$ %.2f = € %.2f\n", valor, resultado);
            } else {
                System.out.println("Digite uma opção válida");
            }

        } else if (respIF.equalsIgnoreCase("Euro")) {
            System.out.println("Deseja converter para qual das 2 moedas (Dólar ou Real)?");
            String resp03 = sc.next();
            if (resp03.equalsIgnoreCase("Real")) {
                double resultado = conversorMoedas("Euro", "Real", valor);
                System.out.printf("€ %.2f = R$ %.2f\n", valor, resultado);
            } else if (resp03.equalsIgnoreCase("Dolar") || resp03.equalsIgnoreCase("Dólar")) {
                double resultado = conversorMoedas("Euro", "Dolar", valor);
                System.out.printf("€ %.2f = US$ %.2f\n", valor, resultado);
            } else {
                System.out.println("Digite uma resposta válida");
            }
        }

        sc.close();
    }

    public static double conversorMoedas(String moedaOrigem, String moedaDestino, double valor) {
        double dolar = 5.45;
        double euro = 6.15;

        // Converte tudo para real primeiramente
        double valorReal;

        if (moedaOrigem.equalsIgnoreCase("Real")) {
            valorReal = valor;
        } else if (moedaOrigem.equalsIgnoreCase("Dolar") || moedaOrigem.equalsIgnoreCase("Dólar")) {
            valorReal = valor * dolar;
        } else if (moedaOrigem.equalsIgnoreCase("Euro")) {
            valorReal = valor * euro;
        } else {
            System.out.println("Moeda não suportada");
            return 0;
        }

        // Convertendo para moeda destino
        if (moedaDestino.equalsIgnoreCase("Real")) {
            return valorReal;
        } else if (moedaDestino.equalsIgnoreCase("Dolar") || moedaDestino.equalsIgnoreCase("Dólar")) {
            return valorReal / dolar;
        } else if (moedaDestino.equalsIgnoreCase("Euro")) {
            return valorReal / euro;
        } else {
            System.out.println("Moeda destino não suportada");
            return 0;
        }
    }
}