package Atividades_Listas_Senai.Exemplos_Codigos;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana: (1 a 7)");
        int x = sc.nextInt();
        String dia;
        if (x == 1) {
            dia = "Domingo";
        } else if (x == 2) {
            dia = "Segunda-Feira";
        } else if (x == 3) {
            dia = "Terca-Feira";
        } else if (x == 4) {
            dia = "Quarta-Feira";
        } else if (x == 5) {
            dia = "Quinta-Feira";
        } else if (x == 6) {
            dia = "Sexta-Feira";
        } else if (x == 7) {
            dia = "Sábado";
        } else
            System.out.println("Digite um número valido");
    }
}
