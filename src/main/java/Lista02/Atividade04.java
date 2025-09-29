package Lista02;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base do seu triangulo: ");
        double base = sc.nextDouble();
        System.out.println("Digite a altura do seu triangulo; ");
        double alt = sc.nextDouble();

        double area = (base * alt) / 2;

        System.out.println("A sua área é: " + area);
    }
}
