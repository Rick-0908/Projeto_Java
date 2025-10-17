package Atividades_Listas_Senai.For_Pratice;

import java.util.Random;
import java.util.Scanner;

public class _3_Analise_de_Producao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        int dias = 30;
        int soma = 0;
        int media;
        for (int i = 0; i < dias; i++){
            int prod = rand.nextInt(750);
            System.out.println("No dia: " + i + " teve um total de: " + prod + " de material");
            soma += prod;
        }
        media = soma/30;
        System.out.println("A médial de material é: " +media);
    }
}
