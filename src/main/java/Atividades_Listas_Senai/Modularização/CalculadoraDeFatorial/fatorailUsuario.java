package Atividades_Listas_Senai.Modularização.CalculadoraDeFatorial;

import java.util.Scanner;

public class fatorailUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculadoraFatorial fatorial = new CalculadoraFatorial();

        System.out.println("Digite o seu número para saber o fatorial");
        fatorial.numeroUsuario= sc.nextInt();

        int resultado = fatorial.fatorialCalculo();
        System.out.println("O seu fatorial é: " + resultado);

    }
}
