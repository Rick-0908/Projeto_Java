package Atividades_Listas_Senai.ATIVIDADE_11_JAVA;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso da peça (kg): ");
        double peso = sc.nextDouble();

        if (peso >= 5) {
            System.out.println("Peça pesada.");
        } else {
            System.out.println("Peça leve.");
        }

        sc.close();
    }
}
