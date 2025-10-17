package Atividades_Listas_Senai.Lista02;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celcius C: ");
        double temp = sc.nextDouble();

        double F = (temp * 9/5) + 32;

        System.out.println("A conversão em Farenheint foi: "+F);
    }
}
