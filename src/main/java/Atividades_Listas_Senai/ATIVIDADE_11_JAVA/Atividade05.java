package Atividades_Listas_Senai.ATIVIDADE_11_JAVA;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a velocidade do veículo (km/h): ");
        double velocidade = sc.nextDouble();

        if (velocidade > 120) {
            System.out.println("Reduzir velocidade imediatamente!");
        } else {
            System.out.println("Velocidade dentro do limite.");
        }

        sc.close();
    }
}
