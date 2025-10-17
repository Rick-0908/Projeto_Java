package Atividades_Listas_Senai.Do_While;

import java.util.Random;
import java.util.Scanner;



public class _16_Controle_de_Qualidade_por_Amostra_Amostragem_10_100 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        char leitura;
        char resp;
        int contadorA = 0, contadorR = 0;

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();

        do {

            for (int i = 0; i < 10; i++){ //Laço for usado para fazer a contagem e randomização da qualidade
                leitura = rand.nextBoolean() ? 'A' : 'R';//Usado uma condição Random em boleana para ser True ou False e implementado
                                                        //Uma condição tinerária com A e R para ser aleatoriazada com o random a cada contagem
                System.out.println("Qualidade estado: " +leitura); // aqui mostra o random aleatorizado com A e R
                if (leitura == 'A'){ //se for identificado A ele entra neste IF e e somado em uma variavel
                    contadorA++; //variavel que soma
                } else {//caso não seja logo vai para o else e logo em seguida é somado
                    contadorR++;//varivel que soma
                }
            }
            System.out.println("Deseja encerrar (s/n)?");
            resp = sc.nextLine().charAt(0);
        }while (resp != 's');
        System.out.println("Total de APROVADOS: " +contadorA); //Aqui mostra o total de APROVADOS logo o A
        System.out.println("Total de REPROVADOS: " +contadorR);//Aqui mostra o total de REPROVADOS logo o R
    }
}
