package Lista02;

import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua Idade: ");
        int idade = sc.nextInt();

        int calc = idade * 12;

        System.out.println("Sua idade em meses é: " + calc + "Meses");
    }
}
