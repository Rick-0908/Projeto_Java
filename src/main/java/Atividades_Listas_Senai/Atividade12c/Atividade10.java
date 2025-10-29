package Atividades_Listas_Senai.Atividade12c;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura (em metros): ");
        double altura = sc.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("Peso ideal: " + pesoIdeal + " kg");

        sc.close();
    }
}
