package Atividades_Listas_Senai.ATIVIDADE_11_JAVA;

import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nível de óleo (%): ");
        double nivelOleo = sc.nextDouble();

        if (nivelOleo < 30) {
            System.out.println("Adicionar óleo.");
        } else {
            System.out.println("Nível adequado.");
        }

        sc.close();
    }
}
