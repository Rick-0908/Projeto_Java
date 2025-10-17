package Atividades_Listas_Senai.Do_While;

import java.util.Locale;
import java.util.Scanner;

public class _1_Leitura_de_Sensores_de_Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int temperatura;
        char resp;
        do {
            System.out.println("Digite a temeperatura atual do forno");
            temperatura = sc.nextInt();
        }while (temperatura < 800 || temperatura > 1200);
        System.out.println("Temperatura valida: " +temperatura);
    }
}
