package Atividades_Listas_Senai.Atividade12c;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade em anos: ");
        int idade = scanner.nextInt();

        int diasVividos = idade * 365;

        System.out.println("Você já viveu aproximadamente " + diasVividos + " dias.");

        scanner.close();
    }
}
