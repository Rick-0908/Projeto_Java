package Atividades_Listas_Senai.Praticas.IMC;

import java.util.Random;
import java.util.Scanner;

public class estruturasCondicionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        do {

            char resp ;

            System.out.println("Aperte ENTER para começar");
            sc.nextLine();
            double peso, altura;
            System.out.println("Boas Vindas ao sistema IMC !!!");
            System.out.println("Digite seu peso ");
            peso = sc.nextDouble();
            System.out.println("Digite sua altura ");
            altura = sc.nextDouble();
            System.out.println("Certo, deseja fazer o calculo de imc ? ");
            String resp01 = sc.nextLine();
            if (resp01.equals("Sim") || resp01.equalsIgnoreCase("sim")|| resp01.equalsIgnoreCase("s")){

            }
        }while (true);
    }
}