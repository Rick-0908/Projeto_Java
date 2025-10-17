package Atividades_Listas_Senai.While_Pratice;

import java.util.Scanner;

public class While05 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //Utilização de sensores de uma maquina, se a pressão maxima for detectada
        //Parar o funcionamento maquinario

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        int pressao = 0;
        while (pressao <= 120) { //O loop está definido em 0, e vai seguir até completar 120 logo precisa de somar até chegar a 120
            System.out.println("A pressão atual está em: " +pressao + " PSI");
            pressao += 10; //calculo para somar a pressao de 10 em 10 logo, 10 + 10 + 10 + 10 + 10...
        }
        System.out.println("Sistema encerrado pois chegou a 120 PSI ");
        System.out.println("Funcionamento da maquina interrompido");
    }
}
