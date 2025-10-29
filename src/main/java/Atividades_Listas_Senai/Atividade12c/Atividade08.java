package Atividades_Listas_Senai.Atividade12c;

import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = sc.nextDouble();

        double valorParcela = valorCompra / 3;

        System.out.println("Valor de cada parcela (3x): R$ " + valorParcela);

        sc.close();
    }
}
