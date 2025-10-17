package Atividades_Listas_Senai.While_Pratice;

import java.util.Scanner;

public class While03 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //Uma maquina produz 50 unidades por hora
        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        int maq = 0;
        int prod = 50;
        int hora = 0;
        int soma = 0;

        while (hora <= 8) {
            maq += 1;
            System.out.println("A maquina: " + maq + " Produziu: " + prod + " Produtos");
            hora += 1;
            soma += prod;
        }
        System.out.println("A produção total foi: " + soma);
    }
}
