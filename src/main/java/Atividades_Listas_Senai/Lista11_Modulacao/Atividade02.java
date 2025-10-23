package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Random;
import java.util.Scanner;

public class Atividade02 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String resp,codigo;

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();

        do {
            System.out.println("=======================================");
            System.out.println("Deseja saber o estado da peça atual ?");
            System.out.println("=======================================");
            String resp01 = sc.nextLine();
            if (resp01.equalsIgnoreCase("Sim")){
                System.out.println("=======================================");
                System.out.println("Insira o código da peça");
                System.out.println("=======================================");
                codigo = sc.nextLine();
                if (codigo.length() == 8){
                    System.out.println("=========================================");
                    System.out.println("Codigo da peça encontrado: " +codigo);
                    System.out.println("Estado atual: " +estado(rand));
                    System.out.println("=========================================");
                }else {
                    System.out.println("=========================================");
                    System.out.println("Digite o código corretamente");
                    System.out.println("=========================================");
                }
            }
            System.out.println("=======================================");
            System.out.println("Deseja fazer novamente ?");
            System.out.println("=======================================");
            resp = sc.nextLine();
        }while (resp.equalsIgnoreCase("Sim"));

        System.out.println("Sistema encerrado");
        sc.close();
    }
    public static String estado(Random random){
        String [] estados = {"Aprovado","Reprovado","Retrabalho","Análise Manual"};
        int index = random.nextInt(estados.length);
        return estados [index];
    }
}
