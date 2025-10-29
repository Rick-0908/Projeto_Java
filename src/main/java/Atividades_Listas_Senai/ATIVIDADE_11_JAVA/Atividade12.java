package Atividades_Listas_Senai.ATIVIDADE_11_JAVA;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a eficiência de produção (%): ");
        double eficiencia = sc.nextDouble();

        if (eficiencia >= 85) {
            System.out.println("Eficiência aceitável.");
        } else {
            System.out.println("Manutenção recomendada.");
        }

        sc.close();
    }
}
