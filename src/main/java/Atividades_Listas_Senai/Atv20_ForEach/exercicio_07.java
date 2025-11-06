package Atividades_Listas_Senai.Atv20_ForEach;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] produtos= new String[3];
        double[] precos= new double[3];

        for (int i=0; i<3; i++) {
            System.out.println("Digite o nome do produto:");
            produtos[i]= sc.nextLine();
            System.out.println("Digite o preço do produto:");
            precos[i]= sc.nextDouble();
            sc.nextLine();
        }

        Produto(produtos, precos);

    }

    public static void Produto (String[] nome, double[] preco) {
        int i=0;

        for (double indice : preco){
            if (indice>50){
                System.out.println(nome[i]+" R$ "+ preco[i] +" (caro)");
                i++;
            } else
                System.out.println(nome[i]+" R$ "+ preco[i]);
        }

    }
}
