package Atv19_Vetores;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double[] notas= new double[5];
        double soma=0;

        for (int i=0; i<=4; i++) {
            System.out.println("Digite a nota:");
            notas[i]= sc.nextDouble();
            soma+= notas[i];
        }

        double media= soma/5;
        System.out.println("A média é: "+media);
        sc.close();
    }
}
