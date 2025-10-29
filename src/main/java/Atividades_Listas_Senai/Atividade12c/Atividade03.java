package Atividades_Listas_Senai.Atividade12c;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do produto: R$ ");
        double preco = sc.nextDouble();

        double desconto = preco * 0.15;
        double precoComDesconto = preco - desconto;

        System.out.println("Valor com 15% de desconto: R$ " + precoComDesconto);

        sc.close();
    }
}
