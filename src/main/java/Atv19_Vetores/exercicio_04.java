package Atv19_Vetores;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        int soma = 0;
        int[] numero = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite seu número");
            numero[i] = sc.nextInt();
            if (i == 0) {
                maior = numero[i];
                menor = numero[i];
            } else {
                if (numero[i] > maior) {
                    maior = numero[i];
                }
                if (numero[i] < menor) {
                    menor = numero[i];
                }
            }
        }

        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor numero é: " + menor);
        System.out.println("A soma dos números é: " + soma); // Adicione esta linha
    }
}  