package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================================================");
        System.out.println("Aperte ENTER para começar");
        System.out.println("=====================================================================");
        sc.nextLine();
        int classi;
        String resp;
        do {
            System.out.println("=====================================================================");
            System.out.println("Qual a classificação do pH");
            System.out.println("=====================================================================");
            classi = sc.nextInt();
            String resultado = calculatorPh(classi);
            System.out.println("=====================================================================");
            System.out.println("O pH inserido é: " + classi + " " + resultado);
            System.out.println("Deseja fazer novamente (Sim/Não)?");
            System.out.println("=====================================================================");
            sc.nextLine();
            resp = sc.nextLine();
        } while (resp.equalsIgnoreCase("Sim"));
        System.out.println("=====================================================================");
        System.out.println("Sistema encerrando...");
        System.out.println("=====================================================================");
        sc.close();
    }

    public static String calculatorPh(int pH) {
        String msg;
        if (pH < 7) {
            msg = "Ácido";
        } else if (pH > 7 && pH < 14 ) {
            msg = "Básico";
        } else if (pH == 7) {
            msg = "Neutro";
        }else {
            msg = "Digite um pH dentro dos padrões";
        }
        return msg;
    }
}
