package Atividades_Listas_Senai.Do_While;

import java.util.Scanner;

public class _10_OEE_Simplificado {
    static void main() {
        Scanner sc = new Scanner(System.in);

        /*OEE, ou Eficiência Geral do Equipamento (Overall Equipment Effectiveness),
        é um indicador de desempenho que mede a eficácia com que uma máquina ou processo de fabricação está sendo utilizado. */

        System.out.println("Aperte ENTER para começar o sistema");
        sc.nextLine();
        int ciclos = 0, paradas = 0, somaC = 0, somaP = 0;
        double disponibilidade = 0;
        char resp;
        do {
            System.out.println("Quantos ciclos desejas ?");
            ciclos = sc.nextInt();
            System.out.println("Quantas paradas ?");
            paradas = sc.nextInt();

            if (ciclos > 0) { //IF para os ciclos
                System.out.println("Ciclo iniciado e contando...");
                ciclos++; // está adicionando 1 a variavel ciclos
                somaC += ciclos; //está fazendo a soma dos ciclos e adicionando a uma variavel
            }
            if (paradas >= 0) { //IF para as paradas, pois se for igual a 0, terá a disponibilidade no final ainda
                System.out.println("Parada efetuada...");
                paradas++; // somando as paradas e sendo armazenada na variavel
                somaP += paradas; // somando as paradas na variavel soma e armazenando as mesmas
            }
            System.out.println("Deseja continuar a contagem (s/n) ?");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
        disponibilidade = (double) ciclos / (ciclos + paradas); // calculo para saber a disponibilidade, pegar o total de ciclos e colocar entre parenteses e dividilo pelas paradas
        System.out.printf("A disponibilidade é: %.2f\n", disponibilidade);
    }
}
