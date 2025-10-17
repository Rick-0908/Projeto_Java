package Desafios_Senai.Desafio.Desafio01;

import java.util.Scanner;


public class _5_Padrao_de_Piramide_Dinamica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 ;
        System.out.println("Digite seu número para fazermos uma piramide númerica: ");
        n1 = sc.nextInt();

        for (int i = 1; i <= n1; i++) {
            // Repete o número 'i' na linha 'i' vezes
            for (int j = 1; j <= i; j++) {
                System.out.print(i);//está printando o número do usuario com o "i" para fazer a linha
            }                       //número com a piramide
            System.out.println(); // ele está pulando para a proxima linha
        }
        System.out.println();//termina ao alcançar o número do usuario.
    }
}
