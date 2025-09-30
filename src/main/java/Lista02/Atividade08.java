package Lista02;

import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu 1 número inteiro: ");
        int n1 = sc.nextInt();
        System.out.println("Digite seu 2 número inteiro: ");
        int n2 = sc.nextInt();
        int div = n1 / n2;
        System.out.println("Seu resultado inteiro deu: " +div);

        double div2 = (double)div/2;
        System.out.println("A divisão de resto foi: "+div2);

    }
}