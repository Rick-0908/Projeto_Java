package Atividades_Listas_Senai.Do_While;

import java.util.Scanner;

public class _12_Conferencia_de_Paletes_WMS {
    static void main() {
        Scanner sc = new Scanner(System.in);

        /*WMS é a sigla para Warehouse Management System (Sistema de Gerenciamento de Armazém),
        um software que otimiza e automatiza as operações de um armazém ou centro de distribuição,
         desde o recebimento de mercadorias até a expedição.*/
        System.out.println("Aperte ENTER para começar");
        sc.nextLine();

        int palete, contador = 0;
        do {
            System.out.println("Digite o númedo do palete \n Lembrando que para encerrar o processo digite (-1)");
            palete = sc.nextInt(); // está apenas lendo os paletes e logo armazenando eles
            contador++; // está contando os paletes conferidos

        }while (palete != -1); // caso digite -1 ele encerra o sistema
        System.out.println("Sistema encerrado");
        System.out.println("Contagem de paletes: " +contador);
    }
}
