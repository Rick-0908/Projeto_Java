package Atividades_Listas_Senai.Lista02;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu 1 número para saber o real: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite seu 2 número para saber o real; ");
        double n2 = sc.nextDouble();

        double soma = (n1 + n2) * 2;

        System.out.println("Seu resultado é; " + soma);
    }
}
