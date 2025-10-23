package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Random;
import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("==========================================================================");
        System.out.println("Aperte ENTER para começar");
        System.out.println("==========================================================================");
        sc.nextLine();
        String resp;
        int velocidade;
        do {
            velocidade = rand.nextInt(100);
            String resultado = calculadoraVe(velocidade);
            System.out.println("==========================================================================");
            System.out.println("A velocidade atual é: " + velocidade + " \n" + resultado);
            System.out.println("Deseja fazer novamente ?");
            System.out.println("==========================================================================");
            resp = sc.nextLine();
        }while (resp.equalsIgnoreCase("Sim"));
        System.out.println("==========================================================================");
        System.out.println("Sistema encerrando...");
        System.out.println("==========================================================================");
        sc.close();
    }
    public static String calculadoraVe(int distancia) {
        String msg;
        if (distancia >= 0 && distancia <= 20) {
            msg = "Velocidade modo lenta";
        }else if (distancia >= 20 && distancia <= 60) {
            msg = "Velocidade modo média";
        }else if (distancia >= 60 && distancia <= 100) {
            msg = "Velocidade modo alto";
        }else if (distancia < 0) {
            msg = "Velocidade não pode ser -0";
        }else if (distancia == 0) {
            msg = "Esteira parada";
        }else {
            msg = "Digite uma velocidade correta";
        }
        return msg;
    }
}
