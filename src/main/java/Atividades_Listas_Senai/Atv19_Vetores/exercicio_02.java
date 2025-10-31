package Atividades_Listas_Senai.Atv19_Vetores;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] numeros=new int[10];
        int soma=0;

        for (int i=0 ; i<=9 ; i++) {
            System.out.println("Digite o número");
            numeros[i]=sc.nextInt();

            soma+=numeros[i];
        }
        System.out.println("A soma é: "+soma);
    }
}
