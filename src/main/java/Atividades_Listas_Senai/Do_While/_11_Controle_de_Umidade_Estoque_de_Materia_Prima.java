package Atividades_Listas_Senai.Do_While;

import java.util.Scanner;

public class _11_Controle_de_Umidade_Estoque_de_Materia_Prima {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aperte ENTER para começar");
        sc.nextLine();
        int temperatura; // intervalo é 30 , 55
        int porcentagem;
        int soma = 0;
        int contador = 0;

        do {
            System.out.println("Digite a temperatura: ");
            temperatura = sc.nextInt();

            if (temperatura <= 30 || temperatura >= 55) { //IF declarado caso a temperatura que o usuario inserir for invalida vem para ca
                System.out.println("Digite novamente a temperatura está fora dos padrões");
            } else {
                System.out.println("A porcentagem recebida é: " +temperatura + "%"); // caso esteja nos padrões ela venha para cá
            }

        } while (temperatura <= 30 || temperatura >= 55); // caso acerte a temperatura recomendada ele pula para o while fecha o programa
        sc.close();
    }
}
