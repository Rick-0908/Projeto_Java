package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Scanner;
import java.util.Random;

public class Atividade01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String resp001;
        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        do {
            System.out.println("=======================================");
            System.out.println("Deseja fazer o robô andar ?");
            System.out.println("=======================================");
            String resp01 = sc.nextLine();
            if (resp01.equalsIgnoreCase("Sim")) {
                System.out.println("=======================================");
                System.out.println("Qual direção ? (Frontal/Direita ou Esquerda)");
                System.out.println("=======================================");
                String direcaos = direcoes(rand);
                System.out.println("==================================================");
                System.out.println("A direção escolhida pelo robo foi: " + direcaos);
                System.out.println("==================================================");
            }
            System.out.println("=======================================");
            System.out.println("Deseja andar novamente ?");
            System.out.println("=======================================");
            resp001 = sc.nextLine();
        }while (resp001.equalsIgnoreCase("Sim"));
        System.out.println("=======================================");
        System.out.println("Sistema encerrado");
        System.out.println("=======================================");
        sc.close();
    }
    //Sempre que for modular dentro da MAIN, deixar dentro dela e prestar atenção na identação
    public static String direcoes(Random random) { //Ao utilizar o Random,tem que declarar dentro dos ()
        String[] direcao = {"Frontal", "Direita", "Esquerda"};
        int index = random.nextInt(direcao.length);
        return direcao[index];
    }
}