package Atividades_Listas_Senai.Atividade12c;

import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a base maior do trapézio: ");
        double baseMaior = sc.nextDouble();

        System.out.print("Digite a base menor do trapézio: ");
        double baseMenor = sc.nextDouble();

        System.out.print("Digite a altura do trapézio: ");
        double altura = sc.nextDouble();

        double area = ((baseMaior + baseMenor) * altura) / 2;

        System.out.println("Área do trapézio: " + area);

        sc.close();
    }
}
