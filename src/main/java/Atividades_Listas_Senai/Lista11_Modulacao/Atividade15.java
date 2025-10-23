package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Random;
import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("==========================================================================");
        System.out.println("Aperte ENTER para começar");
        System.out.println("==========================================================================");
        sc.nextLine();
        int vibracao, temperatura;
        String resp;
        do {
            vibracao = rand.nextInt(120);
            temperatura = rand.nextInt(120);
            String resultado = calculadoraVibra(vibracao, temperatura);
            System.out.println("==========================================================================");
            System.out.println("A vibração está em: " + vibracao + " e a temperatura está em: " + temperatura + "°C \n" + resultado);
            System.out.println("Deseja fazer novamente ?");
            System.out.println("==========================================================================");
            resp = sc.nextLine();
        } while (resp.equalsIgnoreCase("Sim"));
        System.out.println("==========================================================================");
        System.out.println("Sistema encerrando...");
        System.out.println("==========================================================================");
        sc.close();
    }

    public static String calculadoraVibra(int quantidade, int temperatura) {
        String msg;
        if (quantidade > 90 && temperatura > 80) {
            msg = "Maquina sendo desligada por emergencia em vibração e temperatura";
        } else if (quantidade < 90 && temperatura > 80) {
            msg = "Maquina sendo desligada por emergencia em temperatura";
        } else if (quantidade > 90 && temperatura < 80) {
            msg = "Maquina sendo desligada por emergencia em vibrações";
        } else if (quantidade < 90 && temperatura < 80) {
            msg = "Maquina em perfeito estado";
        } else {
            msg = "Maquina se encontra em 0";
        }
        return msg;
    }
}
