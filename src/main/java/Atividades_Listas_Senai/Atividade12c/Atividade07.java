package Atividades_Listas_Senai.Atividade12c;

import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de km percorridos: ");
        double km = sc.nextDouble();

        System.out.print("Digite a quantidade de litros consumidos: ");
        double litros = sc.nextDouble();

        double consumoMedio = km / litros;

        System.out.println("Consumo médio: " + consumoMedio + " km/l");

        sc.close();
    }
}
