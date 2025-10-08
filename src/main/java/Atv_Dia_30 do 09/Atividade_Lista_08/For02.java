package Atividade_Lista_08;

import java.util.Locale;
import java.util.Scanner;

public class For02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de sensor que deseja verificar: \n (Possuimos 5 sensores)");
        int n1 = sc.nextInt();

        for (n1 = n1; n1 < 5; n1++){
            System.out.println("Sensor: " + n1 + " Verificado com sucesso");
        }
    }
}
