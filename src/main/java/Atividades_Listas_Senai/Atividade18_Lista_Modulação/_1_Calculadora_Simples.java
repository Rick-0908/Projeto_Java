package Atividades_Listas_Senai.Atividade18_Lista_Modulação;

import java.util.Scanner;

public class _1_Calculadora_Simples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta;
        do {
            double n1, n2;
            System.out.println("Digite o seu 1 número: ");
            n1 = sc.nextDouble();
            System.out.println("Digite o seu 2 número: ");
            n2 = sc.nextDouble();
            sc.nextLine();
            System.out.println("Deseja fazer qual tipo de operação ?\n(Adição/Subtração/Divisão ou Multiplicação)");
            String resp = sc.nextLine();
            if (resp.equalsIgnoreCase("Adição") || resp.equalsIgnoreCase("Adicao")) {
                System.out.println(calculadoraAdicao(n1, n2));
            } else if (resp.equalsIgnoreCase("Subtração") || resp.equalsIgnoreCase("Subtracao")) {
                System.out.println(calculadoraSubtracao(n1, n2));
            } else if (resp.equalsIgnoreCase("Divisão") || resp.equalsIgnoreCase("Divisao")) {
                System.out.println(calculadoraDivisao(n1, n2));
            } else if (resp.equalsIgnoreCase("Multiplicação") || resp.equalsIgnoreCase("Multiplicacao")) {
                System.out.println(calculadoraMultiplicacao(n1, n2));
            } else {
                System.out.println("Digite uma operação correta!!!");
            }
            System.out.println("Deseja fazer novamente (Sim/Não) ?");
            resposta = sc.nextLine();
        } while (resposta.equalsIgnoreCase("Sim"));
        System.out.println("Sistema encerrando...");
        sc.close();
    }

    public static String calculadoraAdicao(double n1, double n2) {
        String msg;
        double resultado = n1 + n2;
        msg = "A soma deu: " + resultado;
        return msg;
    }

    public static String calculadoraSubtracao(double n1, double n2) {
        String msg;
        double resultado = n1 - n2;
        msg = "A subtração deu: " + resultado;
        return msg;
    }

    public static String calculadoraDivisao(double n1, double n2) {
        String msg;
        if (n2 == 0) {
            msg = "Não pode ser dividido por 0";
        } else {
            double resultado = n1 / n2;
            msg = "A divisão deu: " + resultado;
        }
        return msg;
    }

    public static String calculadoraMultiplicacao(double n1, double n2) {
        String msg;
        double resultado = n1 * n2;
        msg = "A multiplicação foi: " + resultado;
        return msg;
    }
}