package Atividades_Listas_Senai.ATIVIDADE_11_JAVA;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a energia captada (kWh): ");
        double energiaCaptada = sc.nextDouble();

        if (energiaCaptada < 200) {
            System.out.println("Acionar energia auxiliar.");
        } else {
            System.out.println("Energia solar suficiente.");
        }

        sc.close();
    }
}
