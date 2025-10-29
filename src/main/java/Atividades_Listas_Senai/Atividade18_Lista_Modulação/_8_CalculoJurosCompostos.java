package Atividades_Listas_Senai.Atividade18_Lista_Modulação;

import java.util.Scanner;

public class _8_CalculoJurosCompostos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double inv = 0;
        do {
            System.out.println("Digite o valor do investimento:");
            inv = sc.nextDouble();

            if (inv <= 0) {
                System.out.println("Digite um valor válido");
            }
        } while (inv < 1);

        System.out.println("Digite a porcentagem dos juros:");
        double porcent = sc.nextDouble();

        System.out.println("Digite o tempo (em anos) da aplicação");
        int t = sc.nextInt();

        System.out.println("O valor final do investimento é: R$ " + String.format("%.2f", CalculadoraJurosCompostos(inv, porcent, t)));
        sc.close();
    }

    public static double CalculadoraJurosCompostos(double capital, double porcent, int tempo) {
        double montante = capital;
        porcent /= 100;

        while (tempo > 0) {
            double juros = montante * porcent;
            montante += juros;
            tempo--;
        }
        return montante;
    }
}