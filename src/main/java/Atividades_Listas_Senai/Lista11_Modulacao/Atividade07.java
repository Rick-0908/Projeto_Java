package Atividades_Listas_Senai.Lista11_Modulacao;

import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("Aperte ENTER para começar ");
        System.out.println("==================================================");
        sc.nextLine();
        int peso;
        String resp01;
        do {
            System.out.println("==================================================");
            System.out.println("Digite o peso atual da caixa");
            System.out.println("==================================================");
            peso = sc.nextInt();
            System.out.println("==================================================");
            String resultado = calculadora(peso);
            System.out.println("O peso da caixa é: " + peso + "Kg |" + resultado);
            System.out.println("==================================================");
            sc.nextLine();
            System.out.println("==================================================");
            System.out.println("Deseja refazer o calculo ?");
            System.out.println("==================================================");
            resp01 = sc.nextLine();
        } while (resp01.equalsIgnoreCase("Sim"));
        System.out.println("==================================================");
        System.out.println("Sistema encerrando...");
        System.out.println("==================================================");
        sc.close();
    }

    public static String calculadora(int caixaPeso) {
        String mensagem;
        if (caixaPeso >= 0 && caixaPeso <= 10) {
            mensagem = "Caixa com peso leve";
        } else if (caixaPeso > 10 && caixaPeso <= 30) {
            mensagem = "Caixa com peso médio";
        } else if (caixaPeso > 30 && caixaPeso <= 60) {
            mensagem = "Caixa com peso pesado";
        } else if (caixaPeso > 60 && caixaPeso <= 90) {
            mensagem = "Caixa com peso muito pesado";
        } else if (caixaPeso > 90) {
            mensagem = "Caixa com sobrepeso,não há como carregar";
        } else {
            mensagem = "Não existe com caixa peso 0 ou menor que 0, digite corratemente o valor";
        }
        return mensagem;
    }
}
