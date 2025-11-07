package Atividades_Listas_Senai.Modularização.NumeroPrimo;

import java.util.Scanner;

public class numeroUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VerificadorPrimo verificar = new VerificadorPrimo();

        System.out.println("Digite seu número para saber se é primo: ");
        verificar.numeroPrimoUsuario = sc.nextInt();

        System.out.println("Seu número é: " + verificar.verificarPrimo());
    }
}
