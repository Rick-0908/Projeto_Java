package Atividades_Listas_Senai.Atv20_ForEach;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Digite quantas notas gostaria de digitar:");
        int n= sc.nextInt();

        double[] notas= new double[n];

        for (int i=0; i<n; i++){
            do {
                System.out.println("Digite a nota");
                notas[i]= sc.nextDouble();

                if (notas[i]<0 || notas[i]>100) {
                    System.out.println("Digite uma nota válida");
                }
            } while (notas[i]<0 || notas[i]>100);
        }

        for (double indice : notas) {
            if (indice>=60) {
                System.out.println(indice+"-> Aprovado");
            }
            else
                System.out.println(indice+"-> Reforço");
        }
        sc.close();
    }
}
