package Atividades_Listas_Senai.ATIVIDADE_11_JAVA;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura da máquina (°C): ");
        double temperatura = sc.nextDouble();

        if (temperatura > 80) {
            System.out.println("Alerta: Máquina desligada por superaquecimento!");
        } else {
            System.out.println("Máquina operando normalmente.");
        }

        sc.close();
    }
}
