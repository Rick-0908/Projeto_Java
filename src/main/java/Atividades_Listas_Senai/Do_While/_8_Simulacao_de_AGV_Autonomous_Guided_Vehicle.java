package Atividades_Listas_Senai.Do_While;

import java.util.Scanner;

public class _8_Simulacao_de_AGV_Autonomous_Guided_Vehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*AGV significa "Automated Guided Vehicle" (Veículo Guiado Automaticamente),
        um tipo de robô móvel autônomo que transporta materiais em ambientes industriais e logísticos,
        como fábricas e armazéns*/

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();

        int caixas,soma = 0,viagens = 0;
        do {
            System.out.println("Digite quantas caixas foi recebidas");
            caixas = sc.nextInt();
            soma += caixas;
            viagens ++;
        }while (soma < 50);
        System.out.println("Sistema encerrado");
        System.out.println("Total de caixas recebidas: " +soma);
        System.out.println("Total de viagens feitas " +viagens);
    }
}
