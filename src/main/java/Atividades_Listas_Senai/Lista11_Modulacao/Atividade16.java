package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Random;
import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        String alfanumerico,resp;
        do {
            System.out.println("==========================================================================");
            System.out.println("Insira o código da peça");
            System.out.println("==========================================================================");
            alfanumerico = sc.nextLine();
            if (alfanumerico.length() == 5) {}
            String resultado = verificacaoDefeitos(rand);
            System.out.println("==========================================================================");
            System.out.println("O código: " + alfanumerico + " foi encontrado e seu estado é: " +resultado);
            System.out.println("Deseja fazer novamente ?");
            System.out.println("==========================================================================");
            resp = sc.nextLine();
        }while (resp.equalsIgnoreCase("Sim"));
        System.out.println("==========================================================================");
        System.out.println("Sistema encerrando...");
        System.out.println("==========================================================================");
        sc.close();
    }
    public static String verificacaoDefeitos(Random rand) {
        String [] qualidade = {"visível (nível alto)","microscópico (nível médio)", "ausente (nível baixo)"};
        int verificacao = rand.nextInt(qualidade.length);
        return qualidade[verificacao];
    }
}
