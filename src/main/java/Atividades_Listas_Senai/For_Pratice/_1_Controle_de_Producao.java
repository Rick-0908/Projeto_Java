package Atividades_Listas_Senai.For_Pratice;

import java.util.Random;
import java.util.Scanner;

public class _1_Controle_de_Producao {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();

        double soma = 0;
        double media;

        for (double i = 0; i < 100 ; i ++){
            double efic = rand.nextInt(101);
            System.out.println("A eficiência da maquina está: " +efic);
            i++;
            soma += efic;
        }
        media = soma/100;
        System.out.println("A media é: " + media + " %");
    }
}
