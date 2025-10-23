package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Random;
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("==================================================");
        System.out.println("Aperte ENTER para começar");
        System.out.println("==================================================");
        sc.nextLine();
        String resp;
        int temperatura;
        do {
            temperatura = rand.nextInt(60);
            String resultado = calculadoraTemp(temperatura);
            System.out.println("===========================================================================");
            System.out.println("A temperatura atual é: " + temperatura + "°C " + resultado);
            System.out.println("===========================================================================");
            System.out.println("==================================================");
            System.out.println("Deseja refazer a ánalise de temperatura ?");
            System.out.println("==================================================");
            resp = sc.nextLine();
        } while (resp.equalsIgnoreCase("Sim"));
        System.out.println("==================================================");
        System.out.println("Sistema encerrando...");
        System.out.println("==================================================");
        sc.close();
    }

    public static String calculadoraTemp(int celsius) {
        String mensagem;
        if (celsius < 0) {
            mensagem = "Alerta de congelamento !!!";
        } else if (celsius > 0 && celsius <= 40) {
            mensagem = " Temperatura ambiente";
        } else if (celsius > 40 && celsius <= 90) {
            mensagem = " Temperatura em alerta de superaquecimento !!!";
        } else {
            mensagem = "Temperatura muito acima do recomendado ou abaixo !!!";
        }
        return mensagem;
    }
}
