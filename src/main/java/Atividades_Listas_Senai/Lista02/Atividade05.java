package Atividades_Listas_Senai.Lista02;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, digite o seu sálario para receber o calculo de 10% de acressimo: ");
        double salario = sc.nextDouble();

        double aumento = (salario/100)*10;
        double resultado = salario + aumento;

        System.out.println("O seu aumento é de: " + resultado );
    }
}
