package Atividades_Listas_Senai.Atv19_Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio_10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros= new int[5];
        int[] numerosInvertidos= new int[5];


        for (int i=0, u=4; i<5; i++, u--) {
            System.out.println("Digite um número:");
            numeros[i] = sc.nextInt();
            numerosInvertidos[u]= numeros[i];
        }

        System.out.println("Números: "+ Arrays.toString(numeros));
        System.out.println("Número invertidos: "+ Arrays.toString(numerosInvertidos));
        sc.close();
    }
}
