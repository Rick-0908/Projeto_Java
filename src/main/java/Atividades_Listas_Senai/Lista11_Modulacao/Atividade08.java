package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Random;
import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String resp01;
        System.out.println("==================================================");
        System.out.println("Aperte ENTER para começar");
        System.out.println("==================================================");
        sc.nextLine();

        do {
            int material = rand.nextInt(100);
            String resultado = calcuMat(material);
            System.out.println("==================================================");
            System.out.println("A porcentagem analisada foi: " + material + "% " + resultado);
            System.out.println("Deseja refazer novamente a analise ?");
            System.out.println("==================================================");
            resp01 = sc.nextLine();
        }while (resp01.equalsIgnoreCase("Sim"));
        System.out.println("==================================================");
        System.out.println("Sistema encerrando...");
        System.out.println("==================================================");
        sc.close();
    }

    public static String calcuMat(int probabilidade) {
        String mensagem;
        if (probabilidade == 0) {
            mensagem = "Material esgotado";
        } else if (probabilidade <= 20) {
            mensagem = "Material precisando ser trocado";
        } else {
            mensagem = "Digite uma quantidade válida";
        }
        return mensagem;
    }
}
