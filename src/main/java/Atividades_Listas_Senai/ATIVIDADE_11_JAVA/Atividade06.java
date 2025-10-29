package Atividades_Listas_Senai.ATIVIDADE_11_JAVA;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite a produção do turno: ");
        int producao = sc.nextInt();

        if (producao >= 1000) {
            System.out.println("Meta atingida.");
        } else {
            System.out.println("Produção abaixo da meta.");
        }

        sc.close();
    }
}
