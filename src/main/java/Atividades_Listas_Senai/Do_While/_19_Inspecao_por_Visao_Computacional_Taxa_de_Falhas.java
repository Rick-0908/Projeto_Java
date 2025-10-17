package Atividades_Listas_Senai.Do_While;

import java.util.Scanner;

public class _19_Inspecao_por_Visao_Computacional_Taxa_de_Falhas {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();

        double ciclo01,ciclo02,falhas01,falhas02, porcentagemC = 0, porcentagemF = 0,porcentagem = 0,soma = 0;
        char resp;
        do {
            System.out.println("Digite o total de peças produzidas no 1 ciclo: ");
            ciclo01 = sc.nextDouble();
            System.out.println("Digite as falhas: ");
            falhas01 = sc.nextDouble();
            System.out.println("Digite o total de peças produzidas no 2 ciclo: ");
            ciclo02 = sc.nextDouble();
            System.out.println("Digite as falhas: ");
            falhas02 = sc.nextDouble();
            porcentagemC = (falhas01 / ciclo01) * 100 ; //calculo para saber a porcentagem das peças juntamente com as falhas
            porcentagemF = (falhas02 / ciclo02) * 100;

            soma = porcentagemC + porcentagemF / 2; //aqui outro calculo mas para saber a porcentagem final dos ciclos, logo 2 ciclos

            if (soma <= 2){
                System.out.printf("Taxa final: %.0f%%\n " , soma); //aqui mostrando a taxa final se estiver correta
                System.out.println("Okay");
            }else{
                System.out.printf("Faça novamente taxa muito alta de defeito %.0f%%\n" , soma);//caso esteja com muita porcentagem venha para cá
            }
            System.out.println("Deseja fazer novamente (s/n) ?");
            resp = sc.next().charAt(0);
        }while (resp != 'n');
        System.out.println("sistema encerrado");
        sc.close();
    }
}
