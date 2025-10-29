package Atividades_Listas_Senai.Problemas_Reais;

import java.util.Locale;
import java.util.Scanner;

public class Problema02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("=== TERMÔMETRO INTELIGENTE ===");
        System.out.print("Digite a temperatura atual do ambiente (°C): ");
        double temperatura = sc.nextDouble();

        String acaoRecomendada;

        if (temperatura < 18) {
            acaoRecomendada = "Ligar o aquecedor";
        } else if (temperatura <= 25) {
            acaoRecomendada = "Manter a temperatura atual";
        } else {
            acaoRecomendada = "Ligar o ar condicionado";
        }

        System.out.println("\n--- RESULTADO ---");
        System.out.printf("Temperatura: %.1f°C%n", temperatura);
        System.out.println("Ação recomendada: \"" + acaoRecomendada + "\"");

        sc.close();
    }
}