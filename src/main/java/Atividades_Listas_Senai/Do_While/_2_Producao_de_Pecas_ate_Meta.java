package Atividades_Listas_Senai.Do_While;

import java.util.Locale;
import java.util.Scanner;

public class _2_Producao_de_Pecas_ate_Meta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Uma "célula CNC" pode se referir a uma célula de trabalho automatizada para usinagem
        char resp;
        int pecas,ciclos = 0,soma = 0;
        do {
            System.out.println("Digite quantas peças está no ciclo");
            pecas = sc.nextInt();
            soma += pecas;
            ciclos++;


        }while (soma < 120);
        System.out.println("Peças total adicionadas: " +soma);
        System.out.println("Total de ciclos: " +ciclos);

    }
}
