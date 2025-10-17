package Atividades_Listas_Senai.For_Pratice;

import java.util.Random;
import java.util.Scanner;

public class _8_Controle_de_Manutencao_Preventiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        int soma = 0;
        int media;

        for (int tempo = 1; tempo < 13; tempo++) {
            int maq = rand.nextInt(500);
            System.out.println("No mês: " + tempo + " teve uma produção de: " + maq + " horas operadas");
            soma += maq;
        }
        System.out.println("O total de horas operadas foram: " + soma);
        media = soma / 12;
        System.out.println("A média de horas operadas foram: " + media);
    }
}
