package Atv19_Vetores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class exercicio_09 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n= new int[10];
        List divisiveis= new ArrayList();

        for (int i=0; i<10; i++) {
            System.out.println("Digite um número:");
            n[i]= sc.nextInt();

            if (n[i]%3==0) {
                divisiveis.add(n[i]);
            }
        }
        System.out.println("Os números digitados que são divisíveis por 3 são: "+ Arrays.toString(divisiveis.toArray()));
        sc.close();
    }
}
