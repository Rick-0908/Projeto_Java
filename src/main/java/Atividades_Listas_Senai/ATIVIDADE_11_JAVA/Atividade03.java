package Atividades_Listas_Senai.ATIVIDADE_11_JAVA;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nível de energia do robô (%): ");
        double energia = sc.nextDouble();

        if (energia >= 50) {
            System.out.println("Robô iniciando pintura.");
        } else {
            System.out.println("Energia insuficiente. Recarregar.");
        }

        sc.close();
    }
}
