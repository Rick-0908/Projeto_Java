package Atv19_Vetores;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] numeros= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Digite qual numero gostaria de saber se se encontra no vetor");
        int n= sc.nextInt();

        boolean verif= false;
        for (int i=0; i<10; i++) {
            if (n==numeros[i]) {
                verif=true;
                break;
            }
        }

        if (verif==true){
            System.out.println("Número encontrado");
        } else
            System.out.println("Número não encontrado");

        sc.close();
    }
}
