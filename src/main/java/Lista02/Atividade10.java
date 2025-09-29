package Lista02;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu 1 número real: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite o seu 2 número real: ");
        double n2 = sc.nextDouble();
        System.out.println("Digite o seu 3 número real: ");
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.println("A sua média aritmetica é: " + media);
    }
}
