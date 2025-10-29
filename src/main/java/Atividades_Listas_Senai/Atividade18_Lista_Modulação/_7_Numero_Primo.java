package Atividades_Listas_Senai.Atividade18_Lista_Modulação;

import java.util.Scanner;

public class _7_Numero_Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        System.out.println("Digite o seu numero para saber se é primo: ");
        n1 = sc.nextInt();
        if (verificadorPrimo(n1)){
            System.out.println("Seu número: " +n1 + " é primo");
        }
        else{
            System.out.println("Não é primo");
        }
    }

    public static boolean verificadorPrimo(int n1) {
        if (n1 < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n1); i++) {
                if (n1 % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
