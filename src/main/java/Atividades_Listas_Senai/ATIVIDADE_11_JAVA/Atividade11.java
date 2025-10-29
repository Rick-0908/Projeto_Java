package Atividades_Listas_Senai.ATIVIDADE_11_JAVA;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Detectou operador? (1-Sim / 0-Não): ");
        int operador = sc.nextInt();

        if (operador == 1) {
            System.out.println("Pausar linha de produção.");
        } else {
            System.out.println("Linha operando normalmente.");
        }

        sc.close();
    }
}
