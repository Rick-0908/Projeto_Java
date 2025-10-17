package Atividades_Listas_Senai.Do_While;

import java.util.Scanner;

public class _5_Lote_de_Impressao_3D_Peso_Maximo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();

        int peso,soma = 0,ciclos = 0;
        do {

            System.out.println("informe o peso atual: ");
            peso = sc.nextInt();
            soma += peso;
            ciclos ++;

        }while (soma < 500 );
        System.out.println("Peso maximo atingido de 500");
        System.out.println("Peso total colocado: " +soma);
        System.out.println("Ciclos feitos: " +ciclos);
    }
}
