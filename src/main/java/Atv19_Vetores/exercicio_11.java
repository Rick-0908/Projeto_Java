package Atv19_Vetores;

import java.util.Scanner;

public class exercicio_11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas idades quer digitar");
        int quant= sc.nextInt();

        int[] idades = new int[quant];
        int soma=0;
        for (int i=0; i<quant; i++){
            System.out.println("Digite a "+(i+1)+"º idade");
            idades[i] = sc.nextInt();
            soma+=idades[i];
        }

        double media= (double) soma/quant;
        System.out.printf("A média das idades é: %.1f%n",media);
        sc.close();
    }
}
