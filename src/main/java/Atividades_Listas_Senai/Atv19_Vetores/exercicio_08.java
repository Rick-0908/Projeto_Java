package Atividades_Listas_Senai.Atv19_Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio_08 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros= new int[6];
        String[] imparPar= new String[6];

        for (int i=0; i<6; i++) {
            System.out.println("Digite o "+(i+1)+"º número");
            numeros[i] = sc.nextInt();
            if (numeros[i]%2==0) {
                imparPar[i] = "Par";
            } else
                imparPar[i] = "Ímpar";
        }

        System.out.println("Números: "+ Arrays.toString(numeros));
        System.out.println("Verificação de pares e ímpares: "+Arrays.toString(imparPar));
        sc.close();
    }
}
