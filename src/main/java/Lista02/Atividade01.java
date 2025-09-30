package Lista02;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu 1 número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o seu 2 número: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;

        System.out.println("Seu resultado é: " + soma);

    }
}
