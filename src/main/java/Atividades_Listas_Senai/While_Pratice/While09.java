package Atividades_Listas_Senai.While_Pratice;

import java.util.Scanner;

public class While09 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aperte ENTER para comerçar");
        sc.nextLine();
        int hora = 1;
        double cons = 1000;
        while (hora <= 5) {
            double percent = cons * 0.1;
            cons += percent;
            hora ++;
        }
        System.out.println("A energia consumida em 5 horas foi de " + cons +" whatts");
    }
}
