package Atividades_Listas_Senai.Atividade12c;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double mediaPonderada = (nota1 * 3 + nota2 * 2) / 5;

        System.out.println("Média ponderada: " + mediaPonderada);

        sc.close();
    }
}
