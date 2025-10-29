package Atividades_Listas_Senai.ATIVIDADE_11_JAVA;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade em estoque: ");
        int estoque = sc.nextInt();

        if (estoque < 20) {
            System.out.println("Reabastecer imediatamente.");
        } else {
            System.out.println("Estoque suficiente.");
        }

        sc.close();
    }
}
