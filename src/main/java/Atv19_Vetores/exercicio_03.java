package Atv19_Vetores;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int numeros[]=new int[8];
        int posi=0, nega=0, zero=0;

        for (int i=0 ; i<=7 ; i++) {
            System.out.println("Digite um número");
            numeros[i]= sc.nextInt();

            if (numeros[i]>0) {
                posi++;
            }
            else if (numeros[i]<0) {
                nega++;

            }
            else
                zero++;
        }
        System.out.println("O total de números negativos é "+nega+", o de positivos é "+posi+" e o total de zeros é "+zero);
    }
}
