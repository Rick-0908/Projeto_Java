package Atividades_Listas_Senai.Atv20_ForEach;

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] temperatura = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("Digite a temperatura: ");
            temperatura [i] = sc.nextInt();
            sc.nextLine();
        }

        for (int temp : temperatura){
            if (temp >= 35){
                System.out.println(temp+"ºC (Alerta)");
            }else
                System.out.println(temp+"ºC (Normal)");
        }
        sc.close();
    }
}
