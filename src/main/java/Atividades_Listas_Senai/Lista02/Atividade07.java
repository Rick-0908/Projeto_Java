package Atividades_Listas_Senai.Lista02;

import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos dias deseja converter ?: ");
        int dias = sc.nextInt();

        int resultado = dias * 24;

        System.out.println("A sua conversão em horas é: " + resultado);
    }
}
