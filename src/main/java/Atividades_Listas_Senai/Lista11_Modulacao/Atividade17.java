package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Random;
import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("==========================================================================");
        System.out.println("Aperte ENTER para começar");
        System.out.println("==========================================================================");
        sc.nextLine();
        String resp;
        do {
            System.out.println("==========================================================================");
            System.out.println(vericacaoRobos(rand));
            System.out.println("Deseja fazer novamente ? (Sim/Não)");
            System.out.println("==========================================================================");
            sc.nextLine();
            resp = sc.nextLine();
        }while(resp.equalsIgnoreCase("Sim"));
        System.out.println("==========================================================================");
        System.out.println("Sistema encerrando...");
        System.out.println("==========================================================================");
        sc.close();
    }
    public static String vericacaoRobos(Random rand) {
        String msg;
        boolean roboA = rand.nextBoolean();
        boolean roboB = rand.nextBoolean();
        if(roboA && roboB){
            msg = "Ambos robos acionados";
        } else if(roboA){
            msg = "Robo A acionado";
        }else if (roboB){
            msg = "Robo B acionado";
        }else {
            msg = "Linha parada";
        }
        return msg;
    }
}
