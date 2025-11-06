package Atividades_Listas_Senai.Atv20_ForEach;

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somaDestaque = 0,somaTreino = 0;
        System.out.println("Quantos pontos você deseja calcular ?");
        int pontuacaoUsuario = sc.nextInt();
        int [] pontos = new int[pontuacaoUsuario];
        for (int i = 0; i < pontuacaoUsuario; i++) {
            System.out.println("Digite sua pontuação: ");
            pontos[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int ponto :  pontos) {
            if(ponto >= 100){
                System.out.println(ponto+ " Destaque");
                somaDestaque ++;
            }else
                System.out.println(ponto + " Precisa treinar");
            somaTreino ++;
        }
        System.out.println("O total de Destaque: " +somaDestaque + " \nO total de Treino: " +somaTreino);
    }
}
