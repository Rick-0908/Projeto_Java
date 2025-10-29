package Atividades_Listas_Senai.ATIVIDADE_11_JAVA;

import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de material disponível: ");
        double material = sc.nextDouble();

        if (material > 0) {
            System.out.println("Impressão iniciada.");
        } else {
            System.out.println("Sem material disponível.");
        }

        sc.close();
    }
}
