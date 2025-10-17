package Atividades_Listas_Senai.Do_While;

import java.util.Scanner;

public class _18_Balanceamento_de_Linha_Takt_Time {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
     /*Takt time é o ritmo de produção necessário para atender à demanda do cliente,
      sendo calculado pela divisão do tempo disponível para produção pela demanda do mercado.*/


        double takt, tempo, tempo2, tempo3, soma = 0, media = 0;
        char resp;
        do {
            System.out.println("Digite  tempo 1: ");
            tempo = sc.nextDouble();
            System.out.println("Digite tempo 2: ");
            tempo2 = sc.nextDouble();
            System.out.println("Digite tempo 3: ");
            tempo3 = sc.nextDouble();

            media = (tempo + tempo2 + tempo3) / 3; //calculo feito para saber a media dos tempos

            System.out.println("Agora informe o TAKT");
            takt = sc.nextDouble(); //aqui será informado o TAKT
            if (media <= takt) { //aqui o TAKT entrará no if com a media para saber se está dentro dos padrões
                System.out.println("✓ Balanceamento OK! Média está dentro do TAKT.");
            } else {
                System.out.println("✗ Balanceamento precisa de ajuste! Média acima do TAKT.");
            }

            System.out.println("Deseja fazer outra media ?");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
        System.out.println("Sistema encerrado");
        sc.close();
    }
}
