package Atividades_Listas_Senai.Atividade12c;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do depósito: R$ ");
        double deposito = sc.nextDouble();

        System.out.print("Digite a taxa de juros mensal (%): ");
        double taxaJuros = sc.nextDouble();

        double rendimento = deposito * (taxaJuros / 100);

        System.out.println("Rendimento após um mês: R$ " + rendimento);

        sc.close();
    }
}
