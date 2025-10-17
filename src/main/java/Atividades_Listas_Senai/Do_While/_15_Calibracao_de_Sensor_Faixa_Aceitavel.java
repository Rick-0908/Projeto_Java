package Atividades_Listas_Senai.Do_While;

import java.util.Locale;
import java.util.Scanner;

public class _15_Calibracao_de_Sensor_Faixa_Aceitavel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();

        double calibracao;
        do {
            System.out.println("Digite a calibração: ");
            calibracao = sc.nextDouble();

            if (calibracao < 4.0 || calibracao > 20.0) { // caso digite uma calibração fora dos padrões entra neste if e informa a msg
                System.out.println("Calibração fora do recomendado digite a recomendada");
            } else {
                System.out.println("Calibragem OK: " + calibracao); // caso esteja dentro dos padrões vai para o else
            }

        } while (calibracao < 4.0 || calibracao > 20.0); // caso o else esteja concluido ele vai para fora do while e encerra o sistema

        sc.close();
    }
}