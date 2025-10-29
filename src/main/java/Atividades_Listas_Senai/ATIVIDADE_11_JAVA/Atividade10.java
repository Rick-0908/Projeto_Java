package Atividades_Listas_Senai.ATIVIDADE_11_JAVA;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso total das caixas (kg): ");
        double pesoTotal = sc.nextDouble();

        if (pesoTotal > 500) {
            System.out.println("Capacidade excedida.");
        } else {
            System.out.println("Peso dentro do limite.");
        }

        sc.close();
    }
}
