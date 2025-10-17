package Atividades_Listas_Senai.Do_While;

import java.util.Scanner;

public class _7_Consumo_de_Energia_por_Turno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aperte ENTER para começar o sistema");
        sc.nextLine();
        int kWh , soma = 0,media = 0;
        do {
            System.out.println("Digite o consumo de kWh, o sistema vai parar até o digito ser 0");
            kWh = sc.nextInt();
            soma += kWh;
            media = soma / 2;
        }while (kWh != 0);
        System.out.println("sistema encerrado");
        System.out.println("A média de kWh é: " +media);
        System.out.println("O total de kWh é: " +soma);
    }
}
