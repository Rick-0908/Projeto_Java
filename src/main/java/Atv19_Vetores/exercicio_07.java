package Atv19_Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio_07 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor= new int[5];

        for (int i=-0; i<5;  i++) {
            System.out.println("Digite um número");
            vetor[i]= sc.nextInt();
        }

        System.out.println("Números digitados: "+ Arrays.toString(vetor));
        sc.close();
    }
}
