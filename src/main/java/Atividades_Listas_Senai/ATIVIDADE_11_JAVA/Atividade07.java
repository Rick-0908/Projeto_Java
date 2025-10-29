package Atividades_Listas_Senai.ATIVIDADE_11_JAVA;

import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de defeitos: ");
        int defeitos = sc.nextInt();

        if (defeitos > 5) {
            System.out.println("Lote reprovado.");
        } else {
            System.out.println("Lote aprovado.");
        }

        sc.close();
    }
}
