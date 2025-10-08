package Atividade_Lista_08;

import java.util.Locale;
import java.util.Scanner;

public class For01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite quantas peças deseja montar");
        int n1 = sc.nextInt();

        for ( n1 = n1; n1<11; n1++ ){
            System.out.println(n1);
        }

    }
}
