package Atividades_Listas_Senai.Do_While;

import java.util.Scanner;

public class _20_Inventario_Cíclico_AS_RS {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        int pratelerias,soma = 0;
        char resp;
        do {
            System.out.println("Informa quantas prateleiras quer verificar: ");
            pratelerias = sc.nextInt();

            for (int i = 1;i <= pratelerias; i++){//laço for utilizado para fazer a contagem de prateleiras
                System.out.println("Prateleira: " +i + " verificada com sucesso");
                soma = i;//variavel que armazena apenas a contagem das prateleiras
            }
            System.out.println("Deseja fazer novamente uma verificação  ?");
            resp = sc.next().charAt(0);
        }while (resp != 'n');
        System.out.println("Sistema encerrado");
        System.out.println("Total verificado: " +soma); //mostra o total de prateleiras verificadas
    }
}
