package Atividades_Listas_Senai.Modularização.ConversorDeMoeda;

import java.util.Scanner;

public class moedaUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConversorMoeda moeda = new ConversorMoeda();


        System.out.println("Digite a sua quantidade de moeda em Real: R$");
        moeda.moedaUsuario = sc.nextInt();

        sc.nextLine();

        System.out.println("Qual moeda você quer converter ?\n1- Dólar\n2- Euro");
        String respUsuario = sc.nextLine();


        if (respUsuario.equalsIgnoreCase("Dólar") || respUsuario.equalsIgnoreCase("1") || respUsuario.equalsIgnoreCase("Dolar")) {
            System.out.printf("A conversão deu: U$%.2f%n", moeda.ConversorMoedaDolar());
        } else if (respUsuario.equalsIgnoreCase("Euro") || respUsuario.equalsIgnoreCase("2")) {
            System.out.printf("A conversão deu: €%.2f%n", moeda.ConversorMoedaEuro());
        } else {
            System.out.println("Digite uma opção válida !!!");
        }
    }
}
