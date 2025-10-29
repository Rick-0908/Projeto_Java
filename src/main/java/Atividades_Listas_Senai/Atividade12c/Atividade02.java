package Atividades_Listas_Senai.Atividade12c;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas: ");
        double horas = sc.nextDouble();

        double minutos = horas * 60;

        System.out.println(horas + " horas equivalem a " + minutos + " minutos.");

    }
}
