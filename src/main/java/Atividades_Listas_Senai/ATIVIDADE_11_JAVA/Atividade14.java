package Atividades_Listas_Senai.ATIVIDADE_11_JAVA;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de peças montadas: ");
        int pecasMontadas = sc.nextInt();

        if (pecasMontadas == 0) {
            System.out.println("Erro: Verificar robô.");
        } else {
            System.out.println("Montagem em andamento.");
        }

        sc.close();
    }
}
