package Atividades_Listas_Senai.Atv20_ForEach;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("quantos preços você deseja digitar?");
        int n=sc.nextInt();

        double [] preco=new double[n];

        for (int i=0 ; i<n ; i++) {

            System.out.println("Digite o precinho");
            preco[i]=sc.nextDouble();
        }

        int soma=0, posicao=1;

        for (double abc : preco) {
            System.out.println("preço "+posicao+": "+abc);
            soma+=abc;
            posicao++;
        }
        double media=(double) soma/n;
        System.out.println("média de preços: "+media);


    }
}
