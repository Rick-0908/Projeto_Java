package Atividades_Listas_Senai.Atividade18_Lista_Modulação;

import java.util.Scanner;

public class _4_Calculadora_de_Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        String msg, resp;
        System.out.println("Digite um número inteiro: ");
        n1 = sc.nextInt();
        sc.nextLine();
        if (n1 == -1) {
            System.out.println("Não pode ser número negativo");
            sc.close();
        } else {
            calculadoraFatorial(n1);
        }
    }

    public static void calculadoraFatorial(int n1) {
        int resultado = 1;
        for (int i = 1; i <= n1; i++) {
            resultado *= i;
        }
        System.out.println("O fatorial de" + n1 + " é: " + resultado);
    }
}
