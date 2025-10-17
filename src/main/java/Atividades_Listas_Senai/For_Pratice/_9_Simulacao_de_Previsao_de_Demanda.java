package Atividades_Listas_Senai.For_Pratice;

import java.util.Random;
import java.util.Scanner;

public class _9_Simulacao_de_Previsao_de_Demanda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();

        int soma = 0;
        int media;

        for (int produto = 0; produto < 12; produto++) {
            int quantidade = rand.nextInt(300);
            System.out.println("No mês: " + produto + " tem uma demande de: " + quantidade);
            soma += quantidade;
        }
        System.out.println("O total de produtos em 12 meses é: " + soma);
        media = soma/12;
        System.out.println("A média total destes produtos é: " + media);
    }
}
