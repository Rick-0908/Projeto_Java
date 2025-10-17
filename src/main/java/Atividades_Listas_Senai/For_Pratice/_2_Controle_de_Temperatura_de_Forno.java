package Atividades_Listas_Senai.For_Pratice;

import java.util.Random;
import java.util.Scanner;

public class _2_Controle_de_Temperatura_de_Forno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        double soma = 0;


        for (int hora = 0; hora <= 12; hora++) {
            System.out.println("Hora atual: " + hora);
            System.out.println("média de temperaturas: " + soma / 60);
            for (int min = 0; min <= 60; min++) {
                int temp = rand.nextInt(400);
                System.out.println("No minuto " + min + ", A temperatura foi: " + temp);

                soma += temp;
            }
        }
    }
}
