package Atividades_Listas_Senai.ATIVIDADE_11_JAVA;

import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a porcentagem de peças aprovadas (%): ");
        double aprovadas = sc.nextDouble();

        if (aprovadas < 90) {
            System.out.println("Qualidade abaixo do padrão.");
        } else {
            System.out.println("Qualidade aceitável.");
        }

        sc.close();
    }
}
